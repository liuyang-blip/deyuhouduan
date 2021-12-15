package com.deyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class System {
  private int id;
  private String info;
  private String time;

  public System(int id, String info, String time) {
    this.id = id;
    this.info = info;
    this.time = time;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "System{" +
            "id=" + id +
            ", info='" + info + '\'' +
            ", time='" + time + '\'' +
            '}';
  }
}
