package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.pojo.Dictionaries;
import com.dyhc.sdglgroundconnection.pojo.Scenicspot;
import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import com.dyhc.sdglgroundconnection.service.DictionariesService;
import com.dyhc.sdglgroundconnection.utils.ReponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典 控制层
 **/
@RestController
@RequestMapping("Dictionaries")
public class DictionariesController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(DictionariesController.class);

    @Autowired
    private DictionariesService dictionariesService;

    /**
     * 获取所有的景点等级
     * @return
     */
    @RequestMapping("listDictionaries")
    public ReponseResult listDictionaries(Integer dictionariesId){
        try {
            PageInfo<Dictionaries> pageInfo=dictionariesService.listDictionaries();
            ReponseResult<List> data=ReponseResult.ok(pageInfo.getList(),"获取所有的景点等级成功");
            return  data;
        }catch (Exception e){
            ReponseResult<List> data=ReponseResult.err("获取所有的景点等级失败");
            e.printStackTrace();
            return  data;
        }
    }



    /**
     * 获取所有的车辆类型
     * @return
     */
    @RequestMapping("listVehicletype")
    public ReponseResult listVehicletype(Integer dictionariesId){
        try {
            List<VehicleType> list=dictionariesService.listVehicletype();
            ReponseResult<List> data=ReponseResult.ok(list,"获取所有的车辆类型成功");
            return  data;
        }catch (Exception e){
            ReponseResult<List> data=ReponseResult.err("获取车辆类型失败");
            e.printStackTrace();
            return  data;
        }
    }

    /**
     * 获取餐馆类型
     * @return
     */
    @RequestMapping("selectByDictionariesId")
    public ReponseResult selectByDictionariesId(Integer dictionariesId){
        try {
            Dictionaries dictionaries=dictionariesService.selectByDictionariesId(dictionariesId);
            ReponseResult<Object> data=ReponseResult.ok(dictionaries,"获取餐馆类型成功");
            return  data;
        }catch (Exception e){
            ReponseResult<List> data=ReponseResult.err("获取餐馆类型失败");
            e.printStackTrace();
            return  data;
        }
    }
}
