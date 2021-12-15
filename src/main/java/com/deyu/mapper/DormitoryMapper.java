package com.deyu.mapper;

import com.deyu.pojo.Dormitory;
import com.deyu.pojo.Dormitory_view;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@Repository
public interface DormitoryMapper {
    //添加寝室信息
    int addDormitory(Dormitory dormitory);
    //修改寝室信息
    int updateDormitory(Dormitory dormitory);
    //删除寝室信息
    int deleteDormitory(@Param("dormitoryid")int dormitoryid);
    //查看寝室信息
    List<Dormitory_view> selectDormitory(@Param("page")int page,@Param("limit")int limit,@Param("Keyword")String Keyword);
    //关键字查询
    List<Dormitory_view> queryDormirory();
    //查看编辑
    List<Dormitory_view> queryDormitoryinfo(@Param("dormitoryid")int dormitoryid);
    List<Dormitory_view> queryDormitoryinfoid(@Param("apatmentinfo")String apartmentinfo);
    List<Dormitory_view> queryDormitoryin(@Param("dormintoryinfo")String dormintoryinfo);
}
