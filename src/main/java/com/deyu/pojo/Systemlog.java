package com.deyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Systemlog {
  private int id;
  private String datetime;
  private String ip;
  private String info;
  private String state;
  private String username;

  public Systemlog(int id, String datetime, String ip, String info, String state, String username) {
    this.id = id;
    this.datetime = datetime;
    this.ip = ip;
    this.info = info;
    this.state = state;
    this.username = username;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "Systemlog{" +
            "id=" + id +
            ", datetime='" + datetime + '\'' +
            ", ip='" + ip + '\'' +
            ", info='" + info + '\'' +
            ", state='" + state + '\'' +
            ", username='" + username + '\'' +
            '}';
  }
}
