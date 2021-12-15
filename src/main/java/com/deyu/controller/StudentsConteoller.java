package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Major;
import com.deyu.pojo.Stu_view;
import com.deyu.pojo.Students;
import com.deyu.service.StudentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("StudentsController")
public class StudentsConteoller {
    @Autowired
    private StudentsServiceImpl studentsService;

    /**
     * 添加学生
     * @param students
     * @return
     */
    @PostMapping("/addStudentsInfo")
    @ResponseBody
    @CrossOrigin
    public JSON addStudentsInfo(Students students){
        return studentsService.addStudentsInfo(students);
    }

    /**
     * 更改学生信息
     * @param students
     * @return
     */
    @PostMapping("/updateStudentsInfo")
    @ResponseBody
    @CrossOrigin
    public JSON updateStudentsInfo(Students students){
        return studentsService.updateStudentsInfo(students);
    }

    /**
     * 删除学生信息
     * @param s_id
     * @return
     */
    @PostMapping("/deleteStudentsInfo")
    @ResponseBody
    @CrossOrigin
    public JSON deleteStudentsInfo(String s_id){
        return studentsService.deleteStudentsInfo(s_id);
    }

    /**
     * 查找学生
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/selectStudentsInfo")
    @ResponseBody
    @CrossOrigin
    public JSON selectStudentsInfo(@RequestParam("page")int page, @RequestParam("limit")int limit, HttpSession session){
        JSONObject json = new JSONObject();
        int page1 =page -1;
        int page2 =page1*limit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("count",studentsService.selectStudentsInfo(0,100000,null,null).size());
        json.put("data",studentsService.selectStudentsInfo(page2,limit,null,null));
        return json;
    }
    //关键字查询
    @GetMapping("/selectWhereStudent")
    @ResponseBody
    @CrossOrigin
    public JSON selectWhereStudent(@RequestParam("page")int page, @RequestParam("limit")int limit,@RequestParam("Keyword")String Keyword){
        JSONObject json = new JSONObject();
        int page1 =page -1;
        int page2 =page1*limit;
        json.put("code",0);
        json.put("msg","查询成功");
        json.put("count",studentsService.selectStudentsInfo(0,100000,Keyword,null).size());
        json.put("data",studentsService.selectStudentsInfo(page2,limit,Keyword,null));
        return json;
    }
    //查看编辑
    @GetMapping("/queryStudent")
    @ResponseBody
    @CrossOrigin
    public Stu_view queryStudent(String s_id){
        return studentsService.queryStudent(s_id);
    }
    //修改学生学分
    @GetMapping("/ChangeStudentScore")
    @ResponseBody
    @CrossOrigin
    public JSON ChangeStudentScore(int id){
        return studentsService.ChangeStudentScore(id);
    }
    //查看学生学分
    @GetMapping("/selectStudentScore")
    @ResponseBody
    @CrossOrigin
    public List<Stu_view> selectStudentScore(String s_id,String s_porid){
        return studentsService.selectStudentScore(s_id,s_porid);
    }
    //根据身份证查看学生是否存在
    @GetMapping("/queryStudentproid")
    @ResponseBody
    @CrossOrigin
    public Stu_view queryStudentproid(String s_porid){
        return studentsService.queryStudentproid(s_porid);
    }
}
