package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Systemlog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemlogService {
    //系统操作日志
    List<Systemlog> querySystemlog(@Param("page")int page, @Param("limit")int limit, @Param("Keyword") String Keyword);
    //记录系统操作日志
    JSON addSystemlog(System system);
}
