package com.deyu.controller;

import com.deyu.pojo.Qxinfo;
import com.deyu.service.QuanxianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/QuanxianController")
@Controller
public class QuanxianController {
    @Autowired
    private QuanxianService quanxianService;
    //获取权限
    @GetMapping("/queryQxinfo")
    @ResponseBody
    @CrossOrigin
    public List<Qxinfo> queryQxinfo(){
        return quanxianService.queryQxinfo();
    }
    //获取权限id
    @GetMapping("/queryQxinfoid")
    @ResponseBody
    @CrossOrigin
    public Qxinfo queryQxinfoid(String jurisdictioninfo){
        return quanxianService.queryQxinfoid(jurisdictioninfo);
    }
}
