package com.acep.fqa.website.controller;

import com.acep.fqa.website.modal.Vo.ChildCategory;
import com.acep.fqa.website.service.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

	@Resource
	private IAdminService adminService;

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

}
