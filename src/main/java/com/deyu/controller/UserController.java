package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.User;
import com.deyu.pojo.User_view;
import com.deyu.service.UserServiceImpl;
import com.deyu.util.aLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 添加用户
     * @param user 实体类
     * @return
     */
    @aLog("添加用户")
    @GetMapping("/addUser")
    @ResponseBody
    @CrossOrigin
    public JSON addUser(User user){
        return userService.addUser(user);
    }
    /**
     *个人信息查看
     * @param u_id
     * @return
     */
    @PostMapping("/queryUserInfo")
    @ResponseBody
    @CrossOrigin
    public User_view queryUserInfo(int u_id){
        return userService.queryUserInfo(u_id);
    }
    /**
     * 保存个人信息
     * @param user
     * @return
     */
    @PostMapping("/saveUserInfo")
    @ResponseBody
    @CrossOrigin
    public JSON saveUserInfo(User user){
        return userService.saveUserInfo(user);
    }
    /**
     * 验证密码
     * @param user
     * @return
     */
    @PostMapping("/verifyUserPwd")
    @ResponseBody
    @CrossOrigin
    public JSON verifyUserPwd(User user){
        return  userService.verifyUserPwd(user);
    }
    /**
     * 修改密码
     * @param user
     * @return
     */
    @PostMapping("/updateUserPwd")
    @ResponseBody
    @CrossOrigin
    public JSON updateUserPwd(User user, String pwd1, String pwd2){
        return userService.updateUserPwd(user,pwd1,pwd2);
    }

    /**
     * 删除用户
     * @param u_id
     * @return
     */
    @PostMapping("/deleteUser")
    @ResponseBody
    @CrossOrigin
    public JSON deleteUser(int u_id){
        return userService.deleteUser(u_id);
    }

    /**
     * 查看用户
     * @param page
     * @param limit
     * @return
     */
    @PostMapping("/queryUser")
    @ResponseBody
    @CrossOrigin
    public JSON queryUser(@RequestParam("page")int page, @RequestParam("limit")int limit){
        JSONObject json = new JSONObject();
        int page1 = page-1;
        int page2 = page1*limit;
        json.put("code",0);
        json.put("msg","");
        json.put("count",userService.queryUser(0, 100000).size());
        json.put("data",userService.queryUser(page2, limit));
        return json;
    }
}
