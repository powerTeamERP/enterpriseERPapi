package com.itmuch.pojo;

import java.util.Date;

public class Orderdinnerconfig {
    private String configid;

    private Date starttime;

    private Date endtime;

    public String getConfigid() {
        return configid;
    }

    public void setConfigid(String configid) {
        this.configid = configid == null ? null : configid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}