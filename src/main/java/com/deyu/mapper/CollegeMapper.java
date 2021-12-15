package com.deyu.mapper;

import com.deyu.pojo.College;
import com.deyu.pojo.U_Colle_View;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CollegeMapper {
    //添加学院
    int addCollegeinfo(College college);
    //删除学院
    int deleteCollegeInfo(@Param("collegeid")int collegeid);
    //修改学院
    int updateCollegeInfo(College college);
    //查询学院
    List<U_Colle_View> selectCollegeInfo(@Param("page")int page, @Param("limit")int limit,@Param("Keyword")String Keyword);
    //关键字查询
    List<U_Colle_View> selectWhereCollege();
    //查询全部
    List<College> queryAll();

}
