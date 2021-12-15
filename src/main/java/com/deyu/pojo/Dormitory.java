package com.deyu.pojo;

public class Dormitory {
    private int dormitoryid;
    private int apartmentid;
    private String dormitoryinfo;


    public Dormitory(int dormitoryid, int apartmentid, String dormitoryinfo) {
        this.dormitoryid = dormitoryid;
        this.apartmentid = apartmentid;
        this.dormitoryinfo = dormitoryinfo;
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
        return "Dormitory{" +
                "dormitoryid=" + dormitoryid +
                ", apartmentid=" + apartmentid +
                ", dormitoryinfo='" + dormitoryinfo + '\'' +
                '}';
    }
}
