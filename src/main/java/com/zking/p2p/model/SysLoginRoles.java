package com.zking.p2p.model;

public class SysLoginRoles {
    private Long slrid;

    private Long slrulid;

    private Long slsrid;

    public SysLoginRoles(Long slrid, Long slrulid, Long slsrid) {
        this.slrid = slrid;
        this.slrulid = slrulid;
        this.slsrid = slsrid;
    }

    public SysLoginRoles() {
        super();
    }

    public Long getSlrid() {
        return slrid;
    }

    public void setSlrid(Long slrid) {
        this.slrid = slrid;
    }

    public Long getSlrulid() {
        return slrulid;
    }

    public void setSlrulid(Long slrulid) {
        this.slrulid = slrulid;
    }

    public Long getSlsrid() {
        return slsrid;
    }

    public void setSlsrid(Long slsrid) {
        this.slsrid = slsrid;
    }
}