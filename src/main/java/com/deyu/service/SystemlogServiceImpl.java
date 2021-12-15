package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.deyu.mapper.SystemlogMapper;
import com.deyu.pojo.Systemlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemlogServiceImpl implements SystemlogService{
    @Autowired
    private SystemlogMapper systemlogMapper;
    //系统操作日志
    @Override
    public List<Systemlog> querySystemlog(int page, int limit, String Keyword) {
        return systemlogMapper.querySystemlog(page, limit, Keyword);
    }
    //记录系统操作日志
    @Override
    public JSON addSystemlog(System system) {
        JSONObject json = new JSONObject();
       try {
           int code=0;
           code=systemlogMapper.addSystemlog(system);
           if (code==1){
               json.put("msg","记录成功");
               json.put("code",1);
           }else {
               json.put("msg","记录失败");
               json.put("code",0);
           }
       }catch (Exception e){
           e.printStackTrace();
           json.put("msg","数据接口异常,请稍后再试");
           json.put("code",-1);
       }
        return json;
    }
}
