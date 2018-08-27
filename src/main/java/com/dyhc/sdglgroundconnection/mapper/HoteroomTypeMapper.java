package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.HoteroomType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度酒店房间类型
 **/
@Mapper
@Component
public interface HoteroomTypeMapper extends CommonMapper<HoteroomType>{


    /**
     * 微信小程序之获取行程内容
     * @param dispatchId
     * @param weight
     * @return
     */
    HoteroomType getHoteroomTypeById(@Param("dispatchId") Integer dispatchId,@Param("weight") Integer weight)throws Exception;
}
