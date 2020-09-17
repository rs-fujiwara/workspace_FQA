package com.acep.fqa.website.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.acep.fqa.website.constant.WebConst;
import com.acep.fqa.website.dao.ContentsMapper;
import com.acep.fqa.website.modal.Vo.Contents;
import com.acep.fqa.website.service.IContentsService;
import com.acep.fqa.website.utils.Page;

/**
 * 
 * @author sha
 *
 */
@Service
public class ContentsService implements IContentsService {

	@Resource
	private ContentsMapper contentsMapper;

	/**
	 * ページ毎に内容取得
	 * 
	 */
	@Override
	public Page<Contents> selectContentsByPageNum(int pageNum) {
		Page<Contents> page = new Page<>();
		List<Contents> list = contentsMapper.selectByPageNum((pageNum - 1) * WebConst.Max_Page_count,
				WebConst.Max_Page_count);
		page.setPageSize(WebConst.Max_Page_count);
		page.setPageNum(pageNum);
		page.setList(list);
		int recordCount = contentsMapper.selectAllCount();
		int pageCount = recordCount / WebConst.Max_Page_count;
		if (pageCount % WebConst.Max_Page_count != 0) {
			pageCount++;
		}
		page.setPageCount(pageCount);
		return page;
	}
	
	@Override
	public Contents getContents(int cid) {
		Contents contents = contentsMapper.selectByPrimaryKey(cid);
		return contents;
	}
}
