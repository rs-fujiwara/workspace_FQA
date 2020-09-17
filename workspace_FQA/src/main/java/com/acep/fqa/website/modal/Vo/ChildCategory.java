package com.acep.fqa.website.modal.Vo;

import java.io.Serializable;

public class ChildCategory implements Serializable {
    private Integer childCategoryId;

    private String childCategoryName;

    private Integer parentCategoryId;

    private static final long serialVersionUID = 1L;

    public Integer getChildCategoryId() {
        return childCategoryId;
    }

    public void setChildCategoryId(Integer childCategoryId) {
        this.childCategoryId = childCategoryId;
    }

    public String getChildCategoryName() {
        return childCategoryName;
    }

    public void setChildCategoryName(String childCategoryName) {
        this.childCategoryName = childCategoryName == null ? null : childCategoryName.trim();
    }

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}