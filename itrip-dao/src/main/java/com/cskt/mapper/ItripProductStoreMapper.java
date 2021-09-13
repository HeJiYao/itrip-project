package com.cskt.mapper;

import com.cskt.pojo.ItripProductStore;

/**
 * @Entity com.cskt.pojo.ItripProductStore
 */
public interface ItripProductStoreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ItripProductStore record);

    int insertSelective(ItripProductStore record);

    ItripProductStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripProductStore record);

    int updateByPrimaryKey(ItripProductStore record);

}




