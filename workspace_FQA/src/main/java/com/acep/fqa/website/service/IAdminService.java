package com.acep.fqa.website.service;

import java.util.List;

import com.acep.fqa.website.modal.Vo.ChildCategory;
import com.acep.fqa.website.modal.Vo.Contents;
import com.acep.fqa.website.modal.Vo.ParentCategory;

public interface IAdminService {

    /**
     * 管理者ユーザー存在するか
     * @param name
     * @return
     */
    public boolean adminIsExist(String name);
    
    /**
     * 管理者登録
     * @param name
     * @param password
     * @return
     */
    public boolean adminLogin(String name,String password);

    /**
     * 新規FQA
     * @param book
     * @return
     */
	boolean addContent(Contents content);

    /**
     * 親カテゴリー取得
     * @return
     */
    public List<ParentCategory> getParentCategorys();
    
    /**
     * 子カテゴリー取得
     * @return
     */
	public List<ChildCategory> getChildCategorys();
    

	boolean addParentCategorys(ParentCategory parentCategory);

	List<ChildCategory> ChildCategoryInfo(int parent_category_id);


}
