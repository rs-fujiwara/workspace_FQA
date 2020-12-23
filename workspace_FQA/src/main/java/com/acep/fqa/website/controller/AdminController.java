package com.acep.fqa.website.controller;

import com.acep.fqa.website.modal.Vo.ChildCategory;
import com.acep.fqa.website.modal.Vo.Contents;
import com.acep.fqa.website.modal.Vo.ExContents;
import com.acep.fqa.website.modal.Vo.ParentCategory;
import com.acep.fqa.website.service.*;
import com.acep.fqa.website.utils.Page;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController{

	@Resource
	private IAdminService adminService;
	@Resource
	private IContentsService contentsService;
	
	@RequestMapping(value = "/admin")
	public String login() {
		return "admin/login";
	}

	/**
	 * admin存在するか
	 * 
	 * @param adminName
	 * @return
	 */
	@RequestMapping("/isAdminExist")
	@ResponseBody
	public String adminIsExist(@Param("adminName") String adminName) {
		boolean b = adminService.adminIsExist(adminName);
		if (b) {
			return "true";
		} else {
			return "false";
		}
	}

	/**
	 * 管理者登録
	 * 
	 * @param adminName
	 * @param password
	 * @return
	 */
	@RequestMapping("/adminLogin")
	public String adminLogin(@Param("adminName") String adminName, @Param("password") String password,
			HttpServletRequest request) {
		boolean res = adminService.adminLogin(adminName, password);
		if (res == false) {
			return "adminLogin";
		}
		request.getSession().setAttribute("admin", "admin");
		return "admin/index";
	}

	/**
	 * FQA追加
	 * 
	 * @return
	 */
	@RequestMapping("/addFqaPage")
	public String addBookPage() {
		return "admin/addFqa";
	}

	/**
	 * ログアウト
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/adminLogOut")
	public String userLogOut(HttpServletRequest request) {
		request.getSession().invalidate();
		return "admin/login";
	}
	
	/**
	 * 二階層カテゴリの検索
	 * @param request
	 * @param parent_category_id
	 * @return
	 */
	@RequestMapping(value = "/selectChild", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ChildCategory> selectChild(HttpServletRequest request,@Param("parent_category_id") int parent_category_id) {
		System.out.println(parent_category_id);
		List<ChildCategory> childCategoryInfo = adminService.ChildCategoryInfo(parent_category_id);
		return childCategoryInfo;
	}
	/**
	 * FQA一覧の表示
	 */
	@GetMapping("/fqaList")
	public String getFqaList(Model model) {
		return this.getFqaList(1, model);
	}
	@GetMapping("fqaList/{pageNum}")
	public String getFqaList(@PathVariable int pageNum, Model model) {
		Page<Contents> page = contentsService.selectContentsByPageNum(pageNum,null);
		model.addAttribute("page", page);
		return ("admin/fqaList");
	}
	/**
	 * FQA個別編集の表示
	 */
	@GetMapping(value = "fqaData/{cid}")
	public String getFqaData(Model model, @PathVariable int cid) {
		Contents contents = contentsService.getContents(cid);
		List<ParentCategory> allParentCategory = adminService.getParentCategorys();
		List<ChildCategory> childCategoryInfo = adminService.ChildCategoryInfoForInitial(contents.getParentCategory());
		model.addAttribute("question", contents.getFqaQuestion());
		model.addAttribute("content", contents.getFqaContent());
		model.addAttribute("fqaCid", contents.getCid());
		model.addAttribute("delFlag", contents.getDelFlag());
		model.addAttribute("parentCategory", contents.getParentCategory());
		model.addAttribute("childCategory", contents.getChildCategory());
		model.addAttribute("allParentCategory",allParentCategory);
		model.addAttribute("childCategoryInfo",childCategoryInfo);
		return ("admin/fqaData");		
	}

	@PostMapping(value = "/updateFqaData")
	public String updateFqaData(Model model,ExContents exContent) {
		Integer i = exContent.getCid();
/*		if(exContent.getFqaContent().equals("")){
			exContent.setFqaContent("");
		}*/
		if(exContent.getChangeType().equals("fqaUp")) {
	       boolean res=adminService.updateFqaByCid(exContent);
	       return ("admin/fqaData");
		}else{
		   boolean res = adminService.delFqaByCid(i);
           return ("admin/fqaData");
		}
 	}
}
