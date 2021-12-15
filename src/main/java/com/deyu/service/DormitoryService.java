package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Dormitory;
import com.deyu.pojo.Dormitory_view;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormitoryService {
    //添加寝室信息
    JSON addDormitory(Dormitory dormitory);
    //修改寝室信息
    JSON updateDormitory(Dormitory dormitory);
    //删除寝室信息
    JSON deleteDormitory(int dormitoryid);
    //查看寝室信息
    List<Dormitory_view> selectDormitory(int page,int limit,String Keyword);
    //关键字查询
    List<Dormitory_view> queryDormirory();
    //查看编辑
    List<Dormitory_view> queryDormitoryinfo(int dormitoryid);
    List<Dormitory_view> queryDormitoryinfoid(String apartmentinfo);
    List<Dormitory_view> queryDormitoryin(String dormintoryinfo);
}
