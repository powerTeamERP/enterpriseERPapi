package com.itmuch.pojo;

import java.util.Date;

public class Orderdinnerbusiness {
    private String businessid;

    private String businessname;

    private String businessaddress;

    private String businessphone;

    private String businesspepole;

    private Date ctime;

    private String cuser;

    private Date utime;

    private String uuser;

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress == null ? null : businessaddress.trim();
    }

    public String getBusinessphone() {
        return businessphone;
    }

    public void setBusinessphone(String businessphone) {
        this.businessphone = businessphone == null ? null : businessphone.trim();
    }

    public String getBusinesspepole() {
        return businesspepole;
    }

    public void setBusinesspepole(String businesspepole) {
        this.businesspepole = businesspepole == null ? null : businesspepole.trim();
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
}