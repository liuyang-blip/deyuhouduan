package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.deyu.pojo.Score_view;
import com.deyu.pojo.Scoreoperation;
import com.deyu.pojo.User;
import com.deyu.pojo.Zlog_view;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreoperationService {
    //添加审核记录
    JSON addScoreoperation(Scoreoperation scoreoperation, User user);
    //更改审核记录
    JSON updateScoreoperation(Scoreoperation scoreoperation);
    //查看审核记录
    List<Score_view> selectScoreoperation(int page,int limit,String Keyword);
    //关键字查询
    List<Score_view> queryScoreoperation();
    //查看加减分记录
    List<Score_view> selectScoreoperationinfo(String stuid,String stuname);
    //通过id查询
    Score_view queryScoreid(int id);
    //查看学分操作日志
    List<Zlog_view> selectScorezlog(int page,int limit,String Keyword);
    //关键字查询
    List<Zlog_view> queryScorezlog();
}
