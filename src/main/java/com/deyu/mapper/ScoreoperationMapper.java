package com.deyu.mapper;

import com.deyu.pojo.Score_view;
import com.deyu.pojo.Scoreoperation;
import com.deyu.pojo.User;
import com.deyu.pojo.Zlog_view;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@ResponseBody
public interface ScoreoperationMapper {
    //添加审核记录
    int addScoreoperation(Scoreoperation scoreoperation);
    //更改审核记录
    int updateScoreoperation(Scoreoperation scoreoperation);
    //查看审核记录
    List<Score_view> selectScoreoperation(@Param("page")int page,@Param("limit")int limit,@Param("Keyword")String Keyword);
    //关键字查询
    List<Score_view> queryScoreoperation();
    //查看加减分记录
    List<Score_view> selectScoreoperationinfo(@Param("stuid")String stuid,@Param("stuname")String stuname);
    //通过id查询
    Score_view queryScoreid(@Param("id")int id);
    //查看学分操作日志
    List<Zlog_view> selectScorezlog(@Param("page")int page,@Param("limit")int limit,@Param("Keyword")String Keyword);
    //关键字查询
    List<Zlog_view> queryScorezlog();
}
