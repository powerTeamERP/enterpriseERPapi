package com.itmuch.pojo;

import java.util.Date;

public class Orderdinneropinion {
    private String opinionid;

    private String userid;

    private Date ctime;

    private String cuser;

    private Date utime;

    private String uuser;

    private String opinioncontent;

    public String getOpinionid() {
        return opinionid;
    }

    public void setOpinionid(String opinionid) {
        this.opinionid = opinionid == null ? null : opinionid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser == null ? null : cuser.trim();
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser == null ? null : uuser.trim();
    }

    public String getOpinioncontent() {
        return opinioncontent;
    }

    public void setOpinioncontent(String opinioncontent) {
        this.opinioncontent = opinioncontent == null ? null : opinioncontent.trim();
    }
}