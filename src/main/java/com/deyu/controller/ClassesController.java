package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Class_View;
import com.deyu.pojo.Classes;
import com.deyu.service.ClassesServiceImpl;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ClassesController")
public class ClassesController {
    @Autowired
    private ClassesServiceImpl classesService;
    @GetMapping("/queryAll")
    @ResponseBody
    @CrossOrigin
    public List<Class_View> queryAll(){
        return classesService.selectWhereClass();
    }
    @GetMapping("/addClasses")
    @ResponseBody
    @CrossOrigin
    public JSON addClasses(Classes classes){
        return  classesService.addClasses(classes);
    }
    @PostMapping("/deleteClasses")
    @ResponseBody
    @CrossOrigin
    public  JSON deleteClasses(int classes){
        return classesService.deleteClasses(classes);
    }
    @PostMapping("/updataClasses")
    @ResponseBody
    @CrossOrigin
    public  JSON updataClasses(Classes classes){
        return classesService.updataClasses(classes);
    }
    //查找班级
    @PostMapping("/selectClasses")
    @ResponseBody
    @CrossOrigin
    public JSON selectClasses(@Param("page")int page, @Param("limit")int limit){
        JSONObject json = new JSONObject();
        int page1 = page -1;
        int page2 = page1*limit;
        json.put("code",0);
        json.put("msg","");
        json.put("count",classesService.selectClasses(0,10000,null).size());
        json.put("data",classesService.selectClasses(page2,limit,null));
        return json;
    }
    //关键字查找班级
    @GetMapping("/selectWhereClass")
    @ResponseBody
    @CrossOrigin
    public JSON selectWhereClass(@RequestParam("page")int page, @RequestParam("limit")int limit,@RequestParam("Keyword")String Keyword){
        JSONObject json = new JSONObject();
        int page1 = page -1;
        int page2 = page1*limit;
        json.put("code",0);
        json.put("msg","");
        json.put("count",classesService.selectClasses(0,10000,Keyword).size());
        json.put("data",classesService.selectClasses(page2,limit,Keyword));
        return json;
    }
    //通过学院查找班级
    @GetMapping("/selectCollegeClass")
    @ResponseBody
    @CrossOrigin
    public List queryClassCollege(int collegeid){
        return classesService.selectCollegeClass(collegeid);
    }
    //查看/编辑
    @GetMapping("/queryClassinfo")
    @ResponseBody
    @CrossOrigin
    public List queryClassinfo(int classes){
        return classesService.queryClassinfo(classes);
    };


}
