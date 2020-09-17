package com.acep.fqa.website.utils;

import java.util.List;

/**
 * ページ送り機能
 * @author sha
 * @Date 
 * @param <T>
 */
public class Page<T> {
    private List<T> list;//T型対象リスト
    private int pageNum; //ページの番号
    private int pageSize;//1ページ項目数
    private int pageCount;//総ページ数

    public List<T> getList() {
        return list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
