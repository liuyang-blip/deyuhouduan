package com.deyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Operation {
  private int operationid;
  private String operationinfo;

  public Operation(int operationid, String operationinfo) {
    this.operationid = operationid;
    this.operationinfo = operationinfo;
  }

  public int getOperationid() {
    return operationid;
  }

  public void setOperationid(int operationid) {
    this.operationid = operationid;
  }

  public String getOperationinfo() {
    return operationinfo;
  }

  public void setOperationinfo(String operationinfo) {
    this.operationinfo = operationinfo;
  }

  @Override
  public String toString() {
    return "Operation{" +
            "operationid=" + operationid +
            ", operationinfo='" + operationinfo + '\'' +
            '}';
  }
}
