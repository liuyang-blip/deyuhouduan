package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Quanxian;
import com.deyu.pojo.Stu_view;
import com.deyu.pojo.Students;
import com.deyu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsService {
    //添加学生
    JSON addStudentsInfo(Students students);
    //修改学生
    JSON updateStudentsInfo(Students students);
    //删除学生
    JSON deleteStudentsInfo(String s_id);
    //查找学生
    List<Stu_view> selectStudentsInfo(int limit, int page, String Keyword, User user);
    //关键字查询
    List<Stu_view> selectWhereStudent();
    //查看编辑
    Stu_view queryStudent(String s_id);
    //更改学生学分
    JSON ChangeStudentScore(int id);
    //查看学生学分
    List<Stu_view> selectStudentScore(String s_id,String s_proid);
    //按照身份证查看是否存在
    Stu_view queryStudentproid(String s_porid);
    //权限控制数据
    Quanxian quanxianif(User user);
}
