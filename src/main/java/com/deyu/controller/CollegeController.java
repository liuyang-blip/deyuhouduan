package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.College;
import com.deyu.service.CollegeServiceImpl;
import com.deyu.util.aLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/CollegeController")
public class CollegeController {

        @Autowired
        private CollegeServiceImpl collegeService;
        @GetMapping("/queryAll")
        @ResponseBody
        @CrossOrigin
        public List<College> queryAll(){
            return collegeService.queryAll();
        }

        //    添加学院
        @aLog("添加学院")
        @GetMapping("/addCollegeinfo")
        @ResponseBody
        @CrossOrigin
        public JSON addCollegeinfo(College college) {
            return collegeService.addCollegeinfo(college);
        }

        //    删除学院
        @GetMapping("/deleteCollegeInfo")
        @ResponseBody
        @CrossOrigin
        public JSON deleteCollegeInf(int collegeid) {
            return collegeService.deleteCollegeInfo(collegeid);
        }

        //        修改学院
        @GetMapping("/updateCollegeInfo")
        @ResponseBody
        @CrossOrigin
        public JSON updateCollegeInfo(College college) {
            return collegeService.updateCollegeInfo(college);
        }

        //        查询学院
        @GetMapping("/selectCollegeInfo")
        @ResponseBody
        @CrossOrigin
        public JSON selectCollegeInfo(@RequestParam("page") int page, @RequestParam("limit") int limit) {
            JSONObject json = new JSONObject();
            int page1 = page-1;
            int page2 = page * limit;
            json.put("code",0);
            json.put("msg", "查找成功");
            json.put("count",collegeService.selectCollegeInfo(page1, limit,null));
            json.put("data", collegeService.selectCollegeInfo(page2,limit,null));
            return json;
        }
    //        关键字查询
    @GetMapping("/selectWhereCollege")
    @ResponseBody
    @CrossOrigin
    public JSON selectWhereCollege(@RequestParam("page") int page, @RequestParam("limit") int limit,@RequestParam("Keyword")String Keyword) {
        JSONObject json = new JSONObject();
        int page1 = page-1;
        int page2 = page * limit;
        json.put("code",0);
        json.put("msg", "查找成功");
        json.put("count",collegeService.selectCollegeInfo(page1, limit,Keyword));
        json.put("data", collegeService.selectCollegeInfo(page2,limit,Keyword));
        return json;
    }
    }


