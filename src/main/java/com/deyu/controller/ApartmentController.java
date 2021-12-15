package com.deyu.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Apartment;
import com.deyu.pojo.Apartment_view;
import com.deyu.service.ApartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ApartmentController")
public class ApartmentController {

    @Autowired
private ApartmentServiceImpl apartmentService;
    @GetMapping("/queryApartment1")
    @ResponseBody
    @CrossOrigin
    public List queryApartment1(){
        return apartmentService.selectwhereApartment();
    };

    @PostMapping("/addApartment")
    @ResponseBody
    @CrossOrigin
    public JSON addApartment(Apartment apartment){
        return apartmentService.addApartment(apartment);
    }

    @PostMapping("/deleteApartment")
    @ResponseBody
    @CrossOrigin
    public JSON deleteApartment(int apartmentid){
        return apartmentService.deleteApartment(apartmentid);
    }

    @PostMapping("/updateApartment")
    @ResponseBody
    @CrossOrigin
    public JSON updateUser(Apartment apartment){
        return apartmentService.updateApartment(apartment);
    }

    @PostMapping ("/selectApartment")
    @ResponseBody
    @CrossOrigin
    public JSON selectApartment(@RequestParam("page")int page, @RequestParam("limit")int limit){
        JSONObject json = new JSONObject();
        int page1 =page -1;
        int page2 =page1*limit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("count",apartmentService.selectApartment(0,100000,null).size());
        json.put("data",apartmentService.selectApartment(page2,limit,null));
        return json;
    }
    //关键字查询
    @PostMapping ("/selectwhereApartment")
    @ResponseBody
    @CrossOrigin
    public JSON selectwhereApartment(@RequestParam("page")int page,@RequestParam("limit")int limit,@RequestParam("Keyword")String Keyword){
         JSONObject json = new JSONObject();
         int page1 = page-1;
         int page2 = page*limit;
         json.put("code",0);
         json.put("msg","");
         json.put("count",apartmentService.selectApartment(0,100000,Keyword).size());
         json.put("data",apartmentService.selectApartment(page, limit,Keyword));
         return json;
    }
    //查看/编辑
    @PostMapping("/queryApartment")
    @ResponseBody
    @CrossOrigin
    public List<Apartment_view> queryApartment(int apartmentid){
        return apartmentService.queryApartment(apartmentid);
    }
    @PostMapping("/queryApartmentinfoid")
    @ResponseBody
    @CrossOrigin
    public List<Apartment_view> queryApartmentinfo(String apartmentinfo){
        return apartmentService.queryApartmentinfo(apartmentinfo);
    }
}
