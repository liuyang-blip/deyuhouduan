package com.deyu.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Quanxian {
    private int code;
    private int xianzhi;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getXianzhi() {
        return xianzhi;
    }

    public void setXianzhi(int xianzhi) {
        this.xianzhi = xianzhi;
    }

    public Quanxian() {
    }

    @Override
    public String toString() {
        return "Quanxian{" +
                "code=" + code +
                ", xianzhi=" + xianzhi +
                '}';
    }
}
