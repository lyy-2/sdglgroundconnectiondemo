package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店
 **/
@Mapper
@Component
public interface HotelMapper extends CommonMapper<Hotel>{

    /**
     * 按编号查询景点
     * @param
     * @return
             */
    Hotel selectByHotelId(@Param("hotelId") Integer hotelId);
}
