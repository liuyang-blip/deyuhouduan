package com.deyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Qxinfo {
  private int jurisdiction;
  private String jurisdictioninfo;

  public Qxinfo(int jurisdiction, String jurisdictioninfo) {
    this.jurisdiction = jurisdiction;
    this.jurisdictioninfo = jurisdictioninfo;
  }

  public int getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(int jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public String getJurisdictioninfo() {
    return jurisdictioninfo;
  }

  public void setJurisdictioninfo(String jurisdictioninfo) {
    this.jurisdictioninfo = jurisdictioninfo;
  }

  @Override
  public String toString() {
    return "Qxinfo{" +
            "jurisdiction=" + jurisdiction +
            ", jurisdictioninfo='" + jurisdictioninfo + '\'' +
            '}';
  }
}
