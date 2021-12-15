package com.deyu.mapper;

import com.deyu.pojo.Major_view;
import com.deyu.pojo.Stu_view;
import com.deyu.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentsMapper {
    //添加学生
    int addStudentsInfo(Students students);
    //修改学生
    int updateStudentsInfo(Students students);
    //删除学生
    int deleteStudentsInfo(@Param("s_id")String s_id);
    //查找学生
    List<Stu_view> selectStudentsInfo(@Param("limit")int limit,@Param("page")int page,@Param("Keyword")String Keyword);
    //关键字查询
    List<Stu_view> selectWhereStudent();
    //查看编辑
    Stu_view queryStudent(@Param("s_id")String s_id);
    //更改学生学分
    int ChangeStudentScore(@Param("id")int id);
    //查看学生学分
    List<Stu_view> selectStudentScore(@Param("s_id")String s_id,@Param("s_proid")String s_proid);
    //按照身份证查看是否存在
     Stu_view queryStudentproid(@Param("s_porid")String s_porid);
}
