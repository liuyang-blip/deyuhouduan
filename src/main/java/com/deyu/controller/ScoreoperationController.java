package com.deyu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.pojo.Score_view;
import com.deyu.pojo.Scoreoperation;
import com.deyu.pojo.User;
import com.deyu.pojo.Zlog_view;
import com.deyu.service.ScoreoperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ScoreoperationController")
@Controller
public class ScoreoperationController {
    @Autowired
    private ScoreoperationServiceImpl scoreoperationService;

    /**
     * 添加审核记录
     * @param scoreoperation
     * @param user
     * @return
     */
    @GetMapping("/addScoreoperation")
    @ResponseBody
    @CrossOrigin
    public JSON addScoreoperation(Scoreoperation scoreoperation, User user){
        return scoreoperationService.addScoreoperation(scoreoperation,user);
    }

    /**
     * 更改审核记录
     * @param scoreoperation
     * @return
     */
    @GetMapping("/updateScoreoperation")
    @ResponseBody
    @CrossOrigin
    public JSON updateScoreoperation(Scoreoperation scoreoperation){
        return scoreoperationService.updateScoreoperation(scoreoperation);
    }

    /**
     * 查看审核记录
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/selectScoreoperation")
    @ResponseBody
    @CrossOrigin
    public JSON selectScoreoperation(@RequestParam("page")int page,@RequestParam("limit")int limit){
        JSONObject json = new JSONObject();
        int page1=page-1;
        int page2=page1*limit;
        json.put("dode",0);
        json.put("msg","查询成功");
        json.put("data",scoreoperationService.selectScoreoperation(0,100000,null));
        json.put("count",scoreoperationService.selectScoreoperation(page,limit,null).size());
        return json;
    }

    /**
     * 关键字查询
     * @param page
     * @param limit
     * @param Keyword
     * @return
     */
    @GetMapping("/queryScoreoperation")
    @ResponseBody
    @CrossOrigin
    public JSON queryScoreoperation(@RequestParam("page")int page,@RequestParam("limit")int limit,@RequestParam("Keyword")String Keyword){
        JSONObject json = new JSONObject();
        int page1=page-1;
        int page2=page1*limit;
        json.put("dode",0);
        json.put("msg","查询成功");
        json.put("data",scoreoperationService.selectScoreoperation(0,100000,Keyword));
        json.put("count",scoreoperationService.selectScoreoperation(page,limit,Keyword).size());
        return json;
    }

    /**
     * 查看加减分
     * @param stuid
     * @param stuname
     * @return
     */
    @GetMapping("/selectScoreoperationinfo")
    @ResponseBody
    @CrossOrigin
    public List<Score_view> selectScoreoperationinfo(String stuid,String stuname){
        return scoreoperationService.selectScoreoperationinfo(stuid,stuname);
    }

    /**
     * 通过id查询
     * @param id
     * @return
     */
    @GetMapping("/queryScoreid")
    @ResponseBody
    @CrossOrigin
    public Score_view queryScoreid(int id){
        return scoreoperationService.queryScoreid(id);
    }

    /**
     * 查看审核日志
     * @param page
     * @param limit
     * @param Keyword
     * @return
     */
    @GetMapping("/selectScorezlog")
    @ResponseBody
    @CrossOrigin
    public List<Zlog_view> selectScorezlog(int page, int limit, String Keyword){
        return scoreoperationService.selectScorezlog(page, limit, Keyword);
    }
    @GetMapping("/queryScorezlog")
    @ResponseBody
    @CrossOrigin
    public List<Zlog_view> queryScorezlog(){
        return scoreoperationService.queryScorezlog();
    }
}
