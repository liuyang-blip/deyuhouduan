package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Apartment;
import com.deyu.pojo.Apartment_view;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ApartmentService {
    JSON addApartment(Apartment apartment);
    JSON deleteApartment(int apartmentid);
    JSON updateApartment(Apartment apartment);
    List<Apartment_view> selectApartment(int page, int limit,String Keyword);
    //查看/编辑
    List<Apartment_view> queryApartment(int apartmentid);
    List<Apartment_view> queryApartmentinfo(String apartmentinfo);
    //关键字查询
    List<Apartment_view> selectwhereApartment();
}
