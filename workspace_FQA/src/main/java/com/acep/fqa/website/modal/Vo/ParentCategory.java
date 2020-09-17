package com.acep.fqa.website.modal.Vo;

import java.io.Serializable;

public class ParentCategory implements Serializable {
    private Integer parentCategoryId;

    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName == null ? null : parentCategoryName.trim();
    }
}