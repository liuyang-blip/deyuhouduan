package com.deyu.pojo;

public class Dormitory_view {
    private String apartmentinfo;
    private int dormitoryid;
    private int apartmentid;
    private  String dormitoryinfo;

    public Dormitory_view(String apartmentinfo, int dormitoryid, int apartmentid, String dormitoryinfo) {
        this.apartmentinfo = apartmentinfo;
        this.dormitoryid = dormitoryid;
        this.apartmentid = apartmentid;
        this.dormitoryinfo = dormitoryinfo;
    }

    public Dormitory_view() {
    }

    public String getApartmentinfo() {
        return apartmentinfo;
    }

    public void setApartmentinfo(String apartmentinfo) {
        this.apartmentinfo = apartmentinfo;
    }

    public int getDormitoryid() {
        return dormitoryid;
    }

    public void setDormitoryid(int dormitoryid) {
        this.dormitoryid = dormitoryid;
    }

    public int getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(int apartmentid) {
        this.apartmentid = apartmentid;
    }

    public String getDormitoryinfo() {
        return dormitoryinfo;
    }

    public void setDormitoryinfo(String dormitoryinfo) {
        this.dormitoryinfo = dormitoryinfo;
    }

    @Override
    public String toString() {
        return "dormitory_view{" +
                "apartmentinfo='" + apartmentinfo + '\'' +
                ", dormitoryid=" + dormitoryid +
                ", apartmentid=" + apartmentid +
                ", dormitoryinfo='" + dormitoryinfo + '\'' +
                '}';
    }
}
