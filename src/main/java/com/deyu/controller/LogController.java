package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Syslog;
import com.deyu.service.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogServiceImpl logService;

    @PostMapping("/select")
    @ResponseBody
    public JSON select(int page, int limit){
        return logService.selectLogInfo(page, limit);
    }
}
