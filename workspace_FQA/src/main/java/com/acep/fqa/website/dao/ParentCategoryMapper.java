package com.acep.fqa.website.dao;

import com.acep.fqa.website.modal.Vo.ParentCategory;
import com.acep.fqa.website.modal.Vo.ParentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentCategoryMapper {
    int countByExample(ParentCategoryExample example);

    int deleteByExample(ParentCategoryExample example);

    int deleteByPrimaryKey(Integer parentCategoryId);

    int insert(ParentCategory record);

    int insertSelective(ParentCategory record);

    List<ParentCategory> selectByExample(ParentCategoryExample example);

    ParentCategory selectByPrimaryKey(Integer parentCategoryId);

    int updateByExampleSelective(@Param("record") ParentCategory record, @Param("example") ParentCategoryExample example);

    int updateByExample(@Param("record") ParentCategory record, @Param("example") ParentCategoryExample example);

    int updateByPrimaryKeySelective(ParentCategory record);

    int updateByPrimaryKey(ParentCategory record);

}