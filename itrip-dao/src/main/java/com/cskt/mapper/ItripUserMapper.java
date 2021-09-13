package com.cskt.mapper;

import com.cskt.pojo.ItripUser;

/**
 * @Entity com.cskt.pojo.ItripUser
 */
public interface ItripUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ItripUser record);

    int insertSelective(ItripUser record);

    ItripUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripUser record);

    int updateByPrimaryKey(ItripUser record);

}




