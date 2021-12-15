package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.ClassesMapper;
import com.deyu.pojo.Class_View;
import com.deyu.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;


    @Override
    public JSON addClasses(Classes classes) {
        JSONObject json = new JSONObject();
        try {
            int code = 0;
            code = classesMapper.addClasses(classes);
            if (code == 1) {
                json.put("code", 1);
                json.put("msg", "添加班级信息成功");
            } else {
                json.put("code", 0);
                json.put("msg", "添加班级信息失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            json.put("msg", "数据接口异常，请稍后重试");
            json.put("code", -1);
        }
        return json;
    }

    @Override
    public JSON deleteClasses(int classes) {
        JSONObject json = new JSONObject();
        try {
            int code = 0;
            code = classesMapper.deleteClasses(classes);
            if (code == 1) {
                json.put("code", 1);
                json.put("msg", "删除班级信息成功");
            } else {
                json.put("code", 0);
                json.put("msg", "删除班级信息失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            json.put("msg", "数据接口异常，请稍后重试");
            json.put("code", -1);
        }
        return json;
    }

    @Override
    public JSON updataClasses(Classes classes) {
        JSONObject json = new JSONObject();
        try {
            int code = 0;
            code = classesMapper.updataClasses(classes);
            if (code == 1) {
                json.put("code", 1);
                json.put("msg", "修改班级信息成功");
            } else {
                json.put("code", 0);
                json.put("msg", "修改班级信息失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            json.put("msg", "数据接口异常，请稍后重试");
            json.put("code", -1);
        }
        return json;
    }
    //查询班级
    @Override
    public List<Class_View> selectClasses(int page, int limit, String Keyword) {
        return classesMapper.selectClasses(page, limit, Keyword);
    }
    //查看编辑
    @Override
    public List<Class_View> queryClassinfo(int calsses) {
        return classesMapper.queryClassinfo(calsses);
    }
    //通过学院查找班级
    @Override
    public List<Class_View> selectCollegeClass(int collegeid) {
        return classesMapper.selectCollegeClass(collegeid);
    }
    //关键字查询
    @Override
    public List<Class_View> selectWhereClass() {
        return classesMapper.selectWhereClass();
    }
}


