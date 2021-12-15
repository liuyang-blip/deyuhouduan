package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.CollegeMapper;
import com.deyu.pojo.College;
import com.deyu.pojo.U_Colle_View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    public CollegeMapper collegeMapper;

    @Override
    public JSON addCollegeinfo(College college) {
        JSONObject json = new JSONObject();
       try{
           int code = collegeMapper.addCollegeinfo(college);
           if (code == 1) {
               json.put("msg", "添加学院信息成功");
               json.put("code", 1);
           } else {
               json.put("msg", "添加学院信息失败");
               json.put("code", 0);
           }
       }catch (Exception e){
           e.printStackTrace();
           json.put("msg", "数据接口异常,请稍后再试");
           json.put("code", -1);
       }
        return json;
    }

    @Override
    public JSON deleteCollegeInfo(int collegeid) {
        JSONObject json = new JSONObject();
        try{
            int code = collegeMapper.deleteCollegeInfo(collegeid);
            if (code == 1) {
                json.put("msg", "删除学院信息成功");
                json.put("code", 1);
            } else {
                json.put("msg", "删除学院信息失败");
                json.put("code", 0);
            }
        }catch(Exception e){
            e.printStackTrace();
            json.put("msg", "数据接口异常,请稍后再试");
            json.put("code", -1);
        }
        return json;
    }

    @Override
    public JSON updateCollegeInfo(College college) {
        JSONObject json = new JSONObject();
        try {
            int code = collegeMapper.updateCollegeInfo(college);
            if (code == 1) {
                json.put("msg", "修改学院信息成功");
                json.put("code", 1);
            } else {
                json.put("msg", "修改学院信息失败");
                json.put("code", 0);
            }
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg", "数据接口异常,请稍后再试");
            json.put("code", -1);
        }
        return json;
    }

    @Override
    public List<U_Colle_View> selectCollegeInfo(int page, int limit, String Keyword) {
        return collegeMapper.selectCollegeInfo(page, limit, Keyword);
    }

    @Override
    public List<U_Colle_View> selectWhereCollege() {
        return collegeMapper.selectWhereCollege();
    }

    @Override
    public List<College> queryAll() {
        return collegeMapper.queryAll();
    }

}
