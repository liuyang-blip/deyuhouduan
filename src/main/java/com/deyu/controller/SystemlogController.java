package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.service.SystemlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/SystemlogController")
@Controller
public class SystemlogController {
    @Autowired
    private SystemlogServiceImpl systemlogService;

    /**
     * 添加记录
     * @param system
     * @return
     */
    @GetMapping("/addSystemlog")
    @ResponseBody
    @CrossOrigin
    public JSON addSystemlog(System system){
        return systemlogService.addSystemlog(system);
    }

    /**
     * 查看记录
     * @param page
     * @param limit
     * @param Keyword
     * @return
     */
    @GetMapping("/querySystemlog")
    @ResponseBody
    @CrossOrigin
    public JSON querySystemlog(@RequestParam("page")int page,@RequestParam("limt")int limit,@RequestParam("Keyword")String Keyword){
        JSONObject json = new JSONObject();
        int page1=page-1;
        int page2=page1*limit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("data",systemlogService.querySystemlog(0,100000,null));
        json.put("count",systemlogService.querySystemlog(page,limit,null).size());
        return json;
    }
}
