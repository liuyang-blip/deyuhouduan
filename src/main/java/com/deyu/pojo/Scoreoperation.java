package com.deyu.pojo;

import java.util.Date;

public class Scoreoperation {
    private int id;
    private String stuid;
    private String stuname;
    private String stusex;
    private String stuclass;
    private int opcollege;
    private int opmajor;
    private int opteacher;
    private String opusername;
    private int opjurisdiction;
    private String opname;
    private int opclass;
    private int opclassinfo;
    private int opscoreclass;
    private int score;
    private int opstate;
    private int opscorefir;
    private int opscoresec;
    private Date datetime;
    private String ip;
    private String info;
    private String othername;
    private String otherstate;
    private Date othertime;
    private String shibie;

    public Scoreoperation(int id, String stuid, String stuname, String stusex, String stuclass, int opcollege, int opmajor, int opteacher, String opusername, int opjurisdiction, String opname, int opclass, int opclassinfo, int opscoreclass, int score, int opstate, int opscorefir, int opscoresec, Date datetime, String ip, String info, String othername, String otherstate, Date othertime, String shibie) {
        this.id = id;
        this.stuid = stuid;
        this.stuname = stuname;
        this.stusex = stusex;
        this.stuclass = stuclass;
        this.opcollege = opcollege;
        this.opmajor = opmajor;
        this.opteacher = opteacher;
        this.opusername = opusername;
        this.opjurisdiction = opjurisdiction;
        this.opname = opname;
        this.opclass = opclass;
        this.opclassinfo = opclassinfo;
        this.opscoreclass = opscoreclass;
        this.score = score;
        this.opstate = opstate;
        this.opscorefir = opscorefir;
        this.opscoresec = opscoresec;
        this.datetime = datetime;
        this.ip = ip;
        this.info = info;
        this.othername = othername;
        this.otherstate = otherstate;
        this.othertime = othertime;
        this.shibie = shibie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public int getOpcollege() {
        return opcollege;
    }

    public void setOpcollege(int opcollege) {
        this.opcollege = opcollege;
    }

    public int getOpmajor() {
        return opmajor;
    }

    public void setOpmajor(int opmajor) {
        this.opmajor = opmajor;
    }

    public int getOpteacher() {
        return opteacher;
    }

    public void setOpteacher(int opteacher) {
        this.opteacher = opteacher;
    }

    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername;
    }

    public int getOpjurisdiction() {
        return opjurisdiction;
    }

    public void setOpjurisdiction(int opjurisdiction) {
        this.opjurisdiction = opjurisdiction;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    public int getOpclass() {
        return opclass;
    }

    public void setOpclass(int opclass) {
        this.opclass = opclass;
    }

    public int getOpclassinfo() {
        return opclassinfo;
    }

    public void setOpclassinfo(int opclassinfo) {
        this.opclassinfo = opclassinfo;
    }

    public int getOpscoreclass() {
        return opscoreclass;
    }

    public void setOpscoreclass(int opscoreclass) {
        this.opscoreclass = opscoreclass;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getOpstate() {
        return opstate;
    }

    public void setOpstate(int opstate) {
        this.opstate = opstate;
    }

    public int getOpscorefir() {
        return opscorefir;
    }

    public void setOpscorefir(int opscorefir) {
        this.opscorefir = opscorefir;
    }

    public int getOpscoresec() {
        return opscoresec;
    }

    public void setOpscoresec(int opscoresec) {
        this.opscoresec = opscoresec;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datatime) {
        this.datetime = datatime;
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

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getOtherstate() {
        return otherstate;
    }

    public void setOtherstate(String otherstate) {
        this.otherstate = otherstate;
    }

    public Date getOthertime() {
        return othertime;
    }

    public void setOthertime(Date othertime) {
        this.othertime = othertime;
    }

    public String getShibie() {
        return shibie;
    }

    public void setShibie(String shibie) {
        this.shibie = shibie;
    }

    public Scoreoperation() {
        super();
    }
}
