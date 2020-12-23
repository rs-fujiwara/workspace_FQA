package com.acep.fqa.website.modal.Vo;

@SuppressWarnings("serial")
public class ExContents extends Contents {

	private String changeType;

	private Integer cid;

    private String fqaQuestion;

    private Integer parentCategory;

    private Integer childCategory;

    private String fqaContent;
    
    private Integer delFlag;

//    private static final long serialVersionUID = 1L;

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
    
    public Integer getDelFlag() {
    		return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
    
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }
}