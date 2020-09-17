package com.acep.fqa.website.modal.Vo;

import java.io.Serializable;

public class Contents implements Serializable {
    private Integer cid;

    private String fqaQuestion;

    private Integer parentCategory;

    private Integer childCategory;

    private String fqaContent;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFqaQuestion() {
        return fqaQuestion;
    }

    public void setFqaQuestion(String fqaQuestion) {
        this.fqaQuestion = fqaQuestion == null ? null : fqaQuestion.trim();
    }

    public Integer getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Integer parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Integer getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(Integer childCategory) {
        this.childCategory = childCategory;
    }

    public String getFqaContent() {
        return fqaContent;
    }

    public void setFqaContent(String fqaContent) {
        this.fqaContent = fqaContent == null ? null : fqaContent.trim();
    }
}