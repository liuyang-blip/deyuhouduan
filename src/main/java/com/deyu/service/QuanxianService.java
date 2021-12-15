package com.deyu.service;

import com.deyu.pojo.Qxinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuanxianService {
    //获取权限
    List<Qxinfo> queryQxinfo();
    //获取权限id
    Qxinfo queryQxinfoid(String jurisdictioninfo);
}
