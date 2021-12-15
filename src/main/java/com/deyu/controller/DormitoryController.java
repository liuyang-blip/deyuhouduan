package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Dormitory;
import com.deyu.pojo.Dormitory_view;
import com.deyu.service.DormitoryService;
import com.deyu.service.DormitoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/DormitoryContorller")
@Controller
public class DormitoryController {
    @Autowired
    private DormitoryServiceImpl dormitoryService;

    /**
     * 添加寝室信息
     * @param dormitory
     * @return
     */
    @GetMapping("/addDormitory")
    @ResponseBody
    @CrossOrigin
    public JSON addDormitory(Dormitory dormitory){
        return dormitoryService.addDormitory(dormitory);
    }

    /**
     * 修改寝室信息
     * @param dormitory
     * @return
     */
    @GetMapping("/updateDormitory")
    @ResponseBody
    @CrossOrigin
    public JSON updateDormitory(Dormitory dormitory){
        return dormitoryService.updateDormitory(dormitory);
    }

    /**
     * 删除寝室信息
     * @param dormitoryid
     * @return
     */
    @GetMapping("/deleteDormitory")
    @ResponseBody
    @CrossOrigin
    public JSON deleteDormitory(int dormitoryid){
        return dormitoryService.deleteDormitory(dormitoryid);
    }

    /**
     * 查看寝室信息
     * @param page
     * @param limtit
     * @return
     */
    @GetMapping("/selectDormitory")
    @ResponseBody
    @CrossOrigin
    public JSON selectDormitory(@RequestParam("page")int page,@RequestParam("limit")int limtit){
        JSONObject json = new JSONObject();
        int page1 =page -1;
        int page2 =page1*limtit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("count",dormitoryService.selectDormitory(0,100000,null).size());
        json.put("data",dormitoryService.selectDormitory(page2, limtit, null));
        return json;
    }

    /**
     * 关键字查询
     * @param page
     * @param limtit
     * @param Keyword
     * @return
     */
    @GetMapping("/queryDormirory")
    @ResponseBody
    @CrossOrigin
    public JSON queryDormirory(@RequestParam("page")int page,@RequestParam("limit")int limtit,@RequestParam("Keyword")String Keyword){
        JSONObject json = new JSONObject();
        int page1=page-1;
        int page2=page1*limtit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("count",dormitoryService.selectDormitory(0,100000,Keyword).size());
        json.put("data",dormitoryService.selectDormitory(page2, limtit, Keyword));
        return json;
    }
    //查看编辑
    @GetMapping("/queryDormitoryinfo")
    @ResponseBody
    @CrossOrigin
    public List<Dormitory_view> queryDormitoryinfo(int dormitoryid){
        return dormitoryService.queryDormitoryinfo(dormitoryid);
    }
    @GetMapping("/queryDormitoryinfoid")
    @ResponseBody
    @CrossOrigin
    public List<Dormitory_view> queryDormitoryinfoid(String apatmentinfo){
        return dormitoryService.queryDormitoryinfoid(apatmentinfo);
    }
    @GetMapping("/queryDormitoryin")
    @ResponseBody
    @CrossOrigin
    public List<Dormitory_view> queryDormitoryin(String dormintoryinfo){
        return dormitoryService.queryDormitoryin(dormintoryinfo);
    }
}
