package com.cskt.mapper;

import com.cskt.pojo.ItripHotelExtendProperty;

/**
 * @Entity com.cskt.pojo.ItripHotelExtendProperty
 */
public interface ItripHotelExtendPropertyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelExtendProperty record);

    int insertSelective(ItripHotelExtendProperty record);

    ItripHotelExtendProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelExtendProperty record);

    int updateByPrimaryKey(ItripHotelExtendProperty record);

}




