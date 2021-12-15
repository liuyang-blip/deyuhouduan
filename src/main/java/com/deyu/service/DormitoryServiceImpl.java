package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.DormitoryMapper;
import com.deyu.pojo.Dormitory;
import com.deyu.pojo.Dormitory_view;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DormitoryServiceImpl implements DormitoryService{
    @Autowired
    private DormitoryMapper dormitoryMapper;
    //添加寝室信息
    @Override
    public JSON addDormitory(Dormitory dormitory) {
        JSONObject json = new JSONObject();
        try {
            int code=0;
            code=dormitoryMapper.addDormitory(dormitory);
            if (code==1){
                json.put("msg","添加寝室信息成功");
                json.put("code",1);
            }else {
                json.put("msg","添加寝室信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常请稍后再试");
            json.put("code",-1);
        }
        return json;
    }
    //修改寝室信息
    @Override
    public JSON updateDormitory(Dormitory dormitory) {
        JSONObject json = new JSONObject();
        try {
            int code;
            code=dormitoryMapper.updateDormitory(dormitory);
            if (code==1){
                json.put("msg","修改寝室信息成功");
                json.put("code",1);
            }else {
                json.put("msg","修改寝室信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常请稍后再试");
            json.put("code",-1);
        }
        return json;
    }
    //删除寝室信息
    @Override
    public JSON deleteDormitory(int dormitoryid) {
        JSONObject json = new JSONObject();
        try {
            int code=0;
            code=dormitoryMapper.deleteDormitory(dormitoryid);
            if (code==1){
                json.put("msg","删除寝室信息成功");
                json.put("coed",1);
            }else {
                json.put("msg","删除寝室信息失败");
                json.put("coed",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常请稍后再试");
            json.put("coed",-1);
        }
        return json;
    }
    //查看寝室信息
    @Override
    public List<Dormitory_view> selectDormitory(int page, int limit, String Keyword) {
        return dormitoryMapper.selectDormitory(page, limit, Keyword);
    }
    //关键字查询
    @Override
    public List<Dormitory_view> queryDormirory() {
        return dormitoryMapper.queryDormirory();
    }
    //查看编辑
    @Override
    public List<Dormitory_view> queryDormitoryinfo(int dormitoryid) {
        return dormitoryMapper.queryDormitoryinfo(dormitoryid);
    }
    @Override
    public List<Dormitory_view> queryDormitoryinfoid(String apartmentinfo) {
        return dormitoryMapper.queryDormitoryinfoid(apartmentinfo);
    }
    @Override
    public List<Dormitory_view> queryDormitoryin(String dormintoryinfo) {
        return dormitoryMapper.queryDormitoryin(dormintoryinfo);
    }
}
