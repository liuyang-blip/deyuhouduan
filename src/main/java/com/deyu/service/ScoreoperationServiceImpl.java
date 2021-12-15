package com.deyu.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.deyu.mapper.ScoreoperationMapper;
import com.deyu.mapper.ScoresecMapper;
import com.deyu.mapper.StudentsMapper;
import com.deyu.pojo.*;
import com.deyu.util.Gettinginfor.GettingIp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.jar.JarEntry;
@Service
public class ScoreoperationServiceImpl implements ScoreoperationService{
    @Autowired
    private ScoreoperationMapper scoreoperationMapper;
    @Autowired
    private StudentsServiceImpl studentsService;
    @Autowired
    private StudentsMapper studentsMapper;
    //添加审核记录
    @Override
    public JSON addScoreoperation(Scoreoperation scoreoperation,User user) {
        int code=0;
        int code1=0;
        int code2=1;
        int score=0;
        JSONObject json = new JSONObject();
        if (user.getJurisdiction()==7||user.getJurisdiction()==10){
            scoreoperation.setInfo(null);
            scoreoperation.setInfo(null);
            scoreoperation.setOthername(null);
            scoreoperation.setOtherstate(null);
            scoreoperation.setOthertime(null);
            scoreoperation.setOpstate(2);
            scoreoperation.setShibie("0");
            code1 = 1;
        }else {
            Students students = new Students();
            scoreoperation.setInfo(null);
            scoreoperation.setOthername(scoreoperation.getOpname());
            scoreoperation.setOtherstate("1");
            scoreoperation.setOthertime(scoreoperation.getDatetime());
            scoreoperation.setShibie("1");
            scoreoperation.setOpstate(1);
            Stu_view stu_view=studentsService.queryStudent(scoreoperation.getStuid());
            if (scoreoperation.getOpscoreclass() == 1) {
                score = stu_view.getScore() + scoreoperation.getScore();
                if(score<=100&&score>=0){
                    stu_view.setScore(score);
                }else {
                    code2 = 0;
                }
            } else if (scoreoperation.getOpscoreclass() == 2) {
                score = stu_view.getScore() - scoreoperation.getScore();
                if(score<=100&&score>=0){
                    stu_view.setScore(score);
                }else {
                    code2 = 0;
                }
            }
            students.setS_id(stu_view.getS_id());
            students.setScore(stu_view.getScore());
            if(code2 == 1){
                code1 = studentsMapper.updateStudentsInfo(students);
            }else {
                json.put("msg", "学分已超出限制范围");
            }
        }
        if(code1==1){
            scoreoperation.setIp(GettingIp.getIpAddress());
            code = scoreoperationMapper.addScoreoperation(scoreoperation);
        }
        if (code == 1) {
            json.put("msg", "操作成功");
            json.put("code", 1);
        } else {
            if(code2 == 0){
                json.put("msg", "学分已超出限制范围");
            }else {
                json.put("msg", "操作失败");
            }
            json.put("code", 0);
        }
        return json;
    }

    //修改审核记录
    @Override
    public JSON updateScoreoperation(Scoreoperation scoreoperation) {
        JSONObject json = new JSONObject();
        JSONObject json2 = new JSONObject();
        int code=0;
        if ((int)json2.get("code")==1){
            scoreoperation.setOpstate(6);
            code=scoreoperationMapper.updateScoreoperation(scoreoperation);
            if (code==1){
                json.put("msg","操作成功");
                json.put("code",1);
            }else {
                json.put("msg","操作失败");
                json.put("code",0);
            }
        }else if ((int)json2.get("code")==2){
            json.put("msg","审核失败超过学分限制");
            json.put("code",0);
        }else if ((int)json2.get("code")==3){
            json.put("msg","审核失败");
            json.put("code",0);
        }
        return json;
    }
    //查看审核记录
    @Override
    public List<Score_view> selectScoreoperation(int page, int limit, String Keyword) {
        return scoreoperationMapper.selectScoreoperation(page, limit, Keyword);
    }
    //关键字查询
    @Override
    public List<Score_view> queryScoreoperation() {
        return scoreoperationMapper.queryScoreoperation();
    }
    //查看加减分记录
    @Override
    public List<Score_view> selectScoreoperationinfo(String stuid, String stuname) {
        return scoreoperationMapper.selectScoreoperationinfo(stuid,stuname);
    }
    //通过id查询
    @Override
    public Score_view queryScoreid(int id) {
        return scoreoperationMapper.queryScoreid(id);
    }
    //查看学分操作日志
    @Override
    public List<Zlog_view> selectScorezlog(int page, int limit, String Keyword) {
        return scoreoperationMapper.selectScorezlog(page, limit, Keyword);
    }
    //关键字查询
    @Override
    public List<Zlog_view> queryScorezlog() {
        return scoreoperationMapper.queryScorezlog();
    }
}
