package com.deyu.service;

import com.deyu.mapper.QxinfoMapper;
import com.deyu.pojo.Qxinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuanxianServiceImpl implements QuanxianService{
    @Autowired
    private QxinfoMapper qxinfoMapper;
    //获取权限
    @Override
    public List<Qxinfo> queryQxinfo() {
        return qxinfoMapper.queryQxinfo();
    }
    //获取权限id
    @Override
    public Qxinfo queryQxinfoid(String jurisdictioninfo) {
        return qxinfoMapper.queryQxinfoid(jurisdictioninfo);
    }
}
