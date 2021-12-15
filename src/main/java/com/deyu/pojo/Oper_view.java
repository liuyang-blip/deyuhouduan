package com.deyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Oper_view {
  private int id;
  private String opname;
  private int score;
  private String datetime;
  private String ip;
  private String jurisdictioninfo;
  private String userinfo;
  private String majorinfo;
  private String teacherinfo;
  private String classinfo;
  private String scoresecinfo;
  private String c_classinfo;
  private String collegeinfo;
  private String operationinfo;
  private String s_id;
  private String s_name;
  private String s_class;
  private String s_sex;
  private String username;
  private String u_name;
  private int college_0;
  private String info;
  private String othername;
  private String othertime;
  private String scoreinfo;
  private String testinfo;

  public Oper_view(int id, String opname, int score, String datetime, String ip, String jurisdictioninfo, String userinfo, String majorinfo, String teacherinfo, String classinfo, String scoresecinfo, String c_classinfo, String collegeinfo, String operationinfo, String s_id, String s_name, String s_class, String s_sex, String username, String u_name, int college_0, String info, String othername, String othertime, String scoreinfo, String testinfo) {
    this.id = id;
    this.opname = opname;
    this.score = score;
    this.datetime = datetime;
    this.ip = ip;
    this.jurisdictioninfo = jurisdictioninfo;
    this.userinfo = userinfo;
    this.majorinfo = majorinfo;
    this.teacherinfo = teacherinfo;
    this.classinfo = classinfo;
    this.scoresecinfo = scoresecinfo;
    this.c_classinfo = c_classinfo;
    this.collegeinfo = collegeinfo;
    this.operationinfo = operationinfo;
    this.s_id = s_id;
    this.s_name = s_name;
    this.s_class = s_class;
    this.s_sex = s_sex;
    this.username = username;
    this.u_name = u_name;
    this.college_0 = college_0;
    this.info = info;
    this.othername = othername;
    this.othertime = othertime;
    this.scoreinfo = scoreinfo;
    this.testinfo = testinfo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOpname() {
    return opname;
  }

  public void setOpname(String opname) {
    this.opname = opname;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getJurisdictioninfo() {
    return jurisdictioninfo;
  }

  public void setJurisdictioninfo(String jurisdictioninfo) {
    this.jurisdictioninfo = jurisdictioninfo;
  }

  public String getUserinfo() {
    return userinfo;
  }

  public void setUserinfo(String userinfo) {
    this.userinfo = userinfo;
  }

  public String getMajorinfo() {
    return majorinfo;
  }

  public void setMajorinfo(String majorinfo) {
    this.majorinfo = majorinfo;
  }

  public String getTeacherinfo() {
    return teacherinfo;
  }

  public void setTeacherinfo(String teacherinfo) {
    this.teacherinfo = teacherinfo;
  }

  public String getClassinfo() {
    return classinfo;
  }

  public void setClassinfo(String classinfo) {
    this.classinfo = classinfo;
  }

  public String getScoresecinfo() {
    return scoresecinfo;
  }

  public void setScoresecinfo(String scoresecinfo) {
    this.scoresecinfo = scoresecinfo;
  }

  public String getC_classinfo() {
    return c_classinfo;
  }

  public void setC_classinfo(String c_classinfo) {
    this.c_classinfo = c_classinfo;
  }

  public String getCollegeinfo() {
    return collegeinfo;
  }

  public void setCollegeinfo(String collegeinfo) {
    this.collegeinfo = collegeinfo;
  }

  public String getOperationinfo() {
    return operationinfo;
  }

  public void setOperationinfo(String operationinfo) {
    this.operationinfo = operationinfo;
  }

  public String getS_id() {
    return s_id;
  }

  public void setS_id(String s_id) {
    this.s_id = s_id;
  }

  public String getS_name() {
    return s_name;
  }

  public void setS_name(String s_name) {
    this.s_name = s_name;
  }

  public String getS_class() {
    return s_class;
  }

  public void setS_class(String s_class) {
    this.s_class = s_class;
  }

  public String getS_sex() {
    return s_sex;
  }

  public void setS_sex(String s_sex) {
    this.s_sex = s_sex;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getU_name() {
    return u_name;
  }

  public void setU_name(String u_name) {
    this.u_name = u_name;
  }

  public int getCollege_0() {
    return college_0;
  }

  public void setCollege_0(int college_0) {
    this.college_0 = college_0;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getOthername() {
    return othername;
  }

  public void setOthername(String othername) {
    this.othername = othername;
  }

  public String getOthertime() {
    return othertime;
  }

  public void setOthertime(String othertime) {
    this.othertime = othertime;
  }

  public String getScoreinfo() {
    return scoreinfo;
  }

  public void setScoreinfo(String scoreinfo) {
    this.scoreinfo = scoreinfo;
  }

  public String getTestinfo() {
    return testinfo;
  }

  public void setTestinfo(String testinfo) {
    this.testinfo = testinfo;
  }

  @Override
  public String toString() {
    return "Oper_view{" +
            "id=" + id +
            ", opname='" + opname + '\'' +
            ", score=" + score +
            ", datetime='" + datetime + '\'' +
            ", ip='" + ip + '\'' +
            ", jurisdictioninfo='" + jurisdictioninfo + '\'' +
            ", userinfo='" + userinfo + '\'' +
            ", majorinfo='" + majorinfo + '\'' +
            ", teacherinfo='" + teacherinfo + '\'' +
            ", classinfo='" + classinfo + '\'' +
            ", scoresecinfo='" + scoresecinfo + '\'' +
            ", c_classinfo='" + c_classinfo + '\'' +
            ", collegeinfo='" + collegeinfo + '\'' +
            ", operationinfo='" + operationinfo + '\'' +
            ", s_id='" + s_id + '\'' +
            ", s_name='" + s_name + '\'' +
            ", s_class='" + s_class + '\'' +
            ", s_sex='" + s_sex + '\'' +
            ", username='" + username + '\'' +
            ", u_name='" + u_name + '\'' +
            ", college_0=" + college_0 +
            ", info='" + info + '\'' +
            ", othername='" + othername + '\'' +
            ", othertime='" + othertime + '\'' +
            ", scoreinfo='" + scoreinfo + '\'' +
            ", testinfo='" + testinfo + '\'' +
            '}';
  }
}
