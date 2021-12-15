package com.deyu.mapper;

import com.deyu.pojo.Teacher;
import com.deyu.pojo.Teacher_view;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    //添加教师
    int addTeacherInfo(Teacher teacher);
    //修改教师信息
    int updateTeacherInfo(Teacher teacher);
    //删除教师信息
    int deleteTeacherInfo(@Param("teacherid")int teacherid);
    //查找教师信息
    List<Teacher_view> selectTeacherInfo(@Param("page")int page,@Param("limit")int limit,@Param("Keyword")String Keyword);
    //关键字查询
    List<Teacher_view> selectWhereTeacher();
    //通过学院查找教师
    List<Teacher_view> queryTeacher(@Param("collegeid") int collegeid);
    //名称转id
    List<Teacher_view> queryTeacherinfoid(@Param("teacherinfo") String teacherinfo);
    //查看编辑
    List<Teacher_view> selectTeacher(@Param("teacherid")int teacherid);
}
