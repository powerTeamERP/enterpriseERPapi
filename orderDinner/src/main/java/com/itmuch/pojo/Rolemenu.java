package com.itmuch.pojo;

public class Rolemenu {
    private String rolemenuid;

    private String roleid;

    private String menuid;

    public String getRolemenuid() {
        return rolemenuid;
    }

    public void setRolemenuid(String rolemenuid) {
        this.rolemenuid = rolemenuid == null ? null : rolemenuid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }
}