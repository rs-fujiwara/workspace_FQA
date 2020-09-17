package com.acep.fqa.website.controller;

import com.acep.fqa.website.modal.Vo.ChildCategory;
import com.acep.fqa.website.modal.Vo.Contents;
import com.acep.fqa.website.modal.Vo.ParentCategory;
import com.acep.fqa.website.service.IAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.annotation.Resource;
/**
 * FQA内容追加機能
 * @author sha
 *
 */
@Controller
public class ContentsController {
	
    @Resource
    private IAdminService adminService;

    
    /**
     * FQA新規登録
     * @param 
     * @return
     */
    @RequestMapping("/addFqa")
    @ResponseBody
    public String addContent(Contents content){
        boolean res=adminService.addContent(content);
        if(res){
            return "true";
        }
        return "false";
    }
    
    /**
     * 親カテゴリーを取得
     * @return
     */
    @RequestMapping("/findAllParentCategory")
    @ResponseBody
    public List<ParentCategory> findAllParentCategory(){
        return adminService.getParentCategorys();
    }

    /**
     * 子カテゴリーを取得
     * @return
     */
    @RequestMapping("/findAllChildCategory")
    @ResponseBody
    public List<ChildCategory> findAllChildCategory(){
        return adminService.getChildCategorys();
    }



}
