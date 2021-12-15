package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Teacher;
import com.deyu.pojo.Teacher_view;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {
    //添加教师信息
    JSON addTeacherInfo(Teacher teacher);
    //修改教师信息
    JSON updataTeacherInfo(Teacher teacher);
    //删除教师信息
    JSON deleteTeacherInfo(int teacherid);
    //查找教师信息
    List<Teacher_view> seleteTeacherInfo(int page, int limit,String Keyword);
    //关键字查询
    List<Teacher_view> selectWhereTeacher();
    //通过学院查找教师
    List<Teacher_view> queryTeacher(int collegeid);
    //插看编辑
    List<Teacher_view> selectTeacher(int teacherid);
}
