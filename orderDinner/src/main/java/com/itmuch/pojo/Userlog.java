package com.itmuch.pojo;

import java.util.Date;

public class Userlog {
    private String recordid;

    private String userid;

    private String ipaddress;

    private String inparam;

    private String outparam;

    private Date ctime;

    private String cuser;

    private Date utime;

    private String uuser;

    private String operation;

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public String getInparam() {
        return inparam;
    }

    public void setInparam(String inparam) {
        this.inparam = inparam == null ? null : inparam.trim();
    }

    public String getOutparam() {
        return outparam;
    }

    public void setOutparam(String outparam) {
        this.outparam = outparam == null ? null : outparam.trim();
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }
}