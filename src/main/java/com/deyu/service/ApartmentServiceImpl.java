package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.ApartmentMapper;
import com.deyu.pojo.Apartment;
import com.deyu.pojo.Apartment_view;
import org.apache.ibatis.javassist.compiler.ast.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class ApartmentServiceImpl implements ApartmentService{

    @Autowired
    private ApartmentMapper apartmentMapper;

    @Override
    public JSON addApartment(Apartment apartment) {
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=apartmentMapper.addApartment(apartment);
            if(code ==1){
                json.put("msg","添加公寓信息成功");
                json.put("code",1);
            }else{
                json.put("msg","添加公寓信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    @Override
    public JSON deleteApartment(int apartmentid) {
        JSONObject json=new JSONObject();
        try {
            int code=0;
            code=apartmentMapper.deleteApartment(apartmentid);

            if(code ==1){
                json.put("msg","删除公寓信息成功");
                json.put("code",1);
            }else{
                json.put("msg","删除公寓信息失败");
                json.put("code",0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","数据接口异常，请稍后重试");
            json.put("code",-1);
        }
        return json;
    }

    @Override
    public JSON updateApartment(Apartment apartment) {
        JSONObject json = new JSONObject();
       try {
           if (apartmentMapper.updateApartment(apartment)==1){
               json.put("msg","修改公寓信息成功");
               json.put("Code",1);
           }else{
               json.put("msg","修改公寓信息失败");
               json.put("Code",0);
           }
       }catch (Exception e){
           e.printStackTrace();
           json.put("msg","数据接口异常，请稍后重试");
           json.put("code",-1);
       }
        return json;
    }

    @Override
    public List<Apartment_view> selectApartment(int page, int limit, String Keyword) {
        return apartmentMapper.selectApartment(page, limit, Keyword);
    }

    @Override
    public List<Apartment_view> queryApartment(int apartmentid) {
        return apartmentMapper.queryApartment(apartmentid);
    }

    @Override
    public List<Apartment_view> queryApartmentinfo(String apartmentinfo) {
        return apartmentMapper.queryApartmentinfo(apartmentinfo);
    }

    @Override
    public List<Apartment_view> selectwhereApartment() {
        return apartmentMapper.selectwhereApartment();
    }


}
