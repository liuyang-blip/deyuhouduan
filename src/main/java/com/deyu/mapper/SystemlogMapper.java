package com.deyu.mapper;

import com.deyu.pojo.Syslog;
import com.deyu.pojo.Systemlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SystemlogMapper {
    //系统操作日志
    List<Systemlog> querySystemlog(@Param("page")int page, @Param("limit")int limit, @Param("Keyword") String Keyword);
    //记录系统操作日志
    int addSystemlog(System system);
}
