package com.cskt.mapper;

import com.cskt.pojo.ItripComment;

/**
 * @Entity com.cskt.pojo.ItripComment
 */
public interface ItripCommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ItripComment record);

    int insertSelective(ItripComment record);

    ItripComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripComment record);

    int updateByPrimaryKey(ItripComment record);

}




