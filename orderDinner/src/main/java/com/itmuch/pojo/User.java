package com.itmuch.pojo;

import java.util.Date;

public class User {
    private String userid;

    private String loginid;

    private String password;

    private String attendancenum;

    private Date ctime;

    private String cuser;

    private Date utime;

    private String uuser;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAttendancenum() {
        return attendancenum;
    }

    public void setAttendancenum(String attendancenum) {
        this.attendancenum = attendancenum == null ? null : attendancenum.trim();
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