package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.TemplateHotelMapper;
import com.dyhc.sdglgroundconnection.pojo.TemplateHotel;
import com.dyhc.sdglgroundconnection.service.TemplateHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板酒店业务实现
 **/
@Service
public class TemplateHotelServiceImpl implements TemplateHotelService {

    @Autowired
    private TemplateHotelMapper templateHotelMapper;

}
