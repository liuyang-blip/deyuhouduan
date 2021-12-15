package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.College;
import com.deyu.pojo.U_Colle_View;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CollegeService {
    JSON addCollegeinfo(College college);
    JSON deleteCollegeInfo(int collegeid);
    JSON updateCollegeInfo(College college);
    List<U_Colle_View> selectCollegeInfo(int page, int limit, String Keyword);
    //关键字查询
    List<U_Colle_View> selectWhereCollege();
    List<College> queryAll();
}
