package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Teacher;
import com.deyu.pojo.Teacher_view;
import com.deyu.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("TercherController")
@Controller
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    /**
     * 添加教师
     * @param teacher
     * @return
     */
    @GetMapping("addTeacher")
    @ResponseBody
    @CrossOrigin
    public JSON addTeacherInfo(Teacher teacher){
        return teacherService.addTeacherInfo(teacher);
    }

    /**
     * 更改教师信息
     * @param teacher
     * @return
     */
    @GetMapping("updataTeacher")
    @ResponseBody
    @CrossOrigin
    public JSON updataTeacherInfo(Teacher teacher){
        return teacherService.updataTeacherInfo(teacher);
    }

    /**
     * 删除教师信息
     * @param teacherid
     * @return
     */
    @GetMapping("deleteTeacher")
    @ResponseBody
    @CrossOrigin
    public JSON deleteTeacherInfo(int teacherid){
        return teacherService.deleteTeacherInfo(teacherid);
    }

    /**
     * 查找教师信息
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("selectTercher")
    @ResponseBody
    @CrossOrigin
    public JSON selectTeacherInfo(@RequestParam("page")int page, @RequestParam("limit")int limit){
        JSONObject json = new JSONObject();
        try {
            int page1 =page -1;
            int page2 =page1*limit;
            json.put("code",0);
            json.put("msg","查询教师信息成功");
            json.put("count",teacherService.seleteTeacherInfo(0,100000,null).size());
            json.put("data",teacherService.seleteTeacherInfo(page2,limit,null));
        }catch (Exception e){
            e.printStackTrace();
            json.put("code",-1);
            json.put("msg","数据接口异常,请稍后再试");
        }
        return json;
    }

    /**
     * 教师信息管理
     * @return
     */
    @GetMapping("selectWhereStudent")
    @ResponseBody
    @CrossOrigin
    public List<Teacher_view> selectWhereStudent(){

        return teacherService.selectWhereTeacher();
    }

    /**
     * 通过学院查找教师
     * @param collegeid
     * @return
     */
    @GetMapping("/queryTeacher")
    @ResponseBody
    @CrossOrigin
    public List<Teacher_view> queryTeacher(int collegeid){
        return teacherService.queryTeacher(collegeid);
    }

    /**
     * 查看编辑
     * @param teacherid
     * @return
     */
    @GetMapping("/selectTeacher")
    @ResponseBody
    @CrossOrigin
    public List<Teacher_view> selectTeacher(int teacherid){
        return teacherService.selectTeacher(teacherid);
    }

}
