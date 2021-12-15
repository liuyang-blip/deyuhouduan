package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.User;
import com.deyu.pojo.User_view;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
    //登录
    JSON login(User user, HttpSession session);

    //个人查看
    User_view queryUserInfo(int u_id);
    //个人信息保存
    JSON saveUserInfo(User user);
    //修改密码验证
    JSON verifyUserPwd(User user);
    //修改密码
    JSON updateUserPwd(User user);
    //修改密码/重复输入
    JSON updateUserPwd(User user, String pwd1, String pwd2);
    //添加用户
    JSON  addUser(User user);
    //删除用户
    JSON deleteUser(int u_id);
    //查看用户
    List<User_view> queryUser(int page, int limit);


}
