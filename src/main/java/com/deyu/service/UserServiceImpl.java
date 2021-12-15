package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.UserMapper;
import com.deyu.pojo.User;
import com.deyu.pojo.User_view;
import com.deyu.util.UtilTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    //登录
    @Override
    public JSON login(User user, HttpSession session) {
        JSONObject json = new JSONObject();
        user.setPassword(UtilTools.Encrypted_MD5(user.getPassword()));
        User login = userMapper.login(user);
        if (login != null){
            login.setPassword("");
            json.put("msg","登录成功");
            json.put("data",login);
            json.put("code",1);
            session.setAttribute("login_session",login);
        }else {
            json.put("msg","登录失败");
            json.put("data",null);
            json.put("code",0);
        }
        return json;
    }
    //个人信息-->查看/编辑--查看
    @Override
    public User_view queryUserInfo(int u_id) {
        return userMapper.queryUserInfo(u_id);
    }
    //个人信息---->保存
    @Override
    public JSON saveUserInfo(User user) {
        JSONObject json = new JSONObject();
        int code =0;
        code = userMapper.saveUserInfo(user);
        if (code ==1){
            json.put("code",1);
            json.put("msg","保存成功");
        }else {
            json.put("code",0);
            json.put("msg","保存失败");
        }
        return json;
    }
    //修改密码-----验证密码
    @Override
    public JSON verifyUserPwd(User user) {
        JSONObject json = new JSONObject();
        user.setPassword(UtilTools.Encrypted_MD5(user.getPassword()));
        if (userMapper.verifyUserPwd(user)!=null){
            json.put("msg","验证成功");
            json.put("code",1);
            System.out.println(json);
        }else {
            json.put("msg","验证失败");
            json.put("code",0);
        }
        return json;
    }

    @Override
    public JSON updateUserPwd(User user) {
        return null;
    }

    //修改密码-----输入新密码-----重复输入新密码
    @Override
    public JSON updateUserPwd(User user,String pwd1,String pwd2) {
        JSONObject json = new JSONObject();
        int code=0;
        if (!pwd1.isEmpty()){
            if (!pwd2.isEmpty()){
                if (pwd1.equals(pwd2)){
                    if (!user.getPassword().equals(pwd1)){
                        user.setPassword(UtilTools.Encrypted_MD5(pwd1));
                        code = userMapper.updateUserPwd(user);
                        if (code ==1){
                            json.put("msg","修改成功");
                            json.put("code",1);
                        }else {
                            json.put("msg","修改失败");
                            json.put("code",0);
                        }
                    }else {
                        json.put("msg","新密码与旧密码相同");
                        json.put("code",0);
                    }
                }else {
                    json.put("msg","两次密码不一样");
                    json.put("code",0);
                }
            }else {
                json.put("msg","再输入一次密码");
                json.put("code",0);
            }
        }else {
            json.put("msg","请输入新密码");
            json.put("code",0);
        }
        return json;
    }
    //添加用户
    @Override
    public JSON addUser(User user) {
        JSONObject json = new JSONObject();
        int code =0;
        code =userMapper.addUser(user);
        if (code ==1){
            json.put("msg","添加成功");
            json.put("code",1);
        }else {
            json.put("msg","添加失败");
            json.put("code",0);
        }
        return json;
    }
    //删除用户
    @Override
    public JSON deleteUser(int u_id) {
        JSONObject json = new JSONObject();
        int code =0;
        code =userMapper.deleteUser(u_id);
        if (code ==1){
            json.put("msg","删除成功");
            json.put("code",1);
        }else {
            json.put("msg","删除失败");
            json.put("code",0);
        }
        return json;
    }


    //查看用户
    @Override
    public List<User_view> queryUser(int page, int limit) {
        return userMapper.queryUser(page, limit);
    }


    }

