package com.zking.p2p.model;

public class SysRoles {
    private Long srid;

    private String srname;

    private Integer sravailable;

    private String srdescription;

    public SysRoles(Long srid, String srname, Integer sravailable, String srdescription) {
        this.srid = srid;
        this.srname = srname;
        this.sravailable = sravailable;
        this.srdescription = srdescription;
    }

    public SysRoles() {
        super();
    }

    public Long getSrid() {
        return srid;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    public String getSrname() {
        return srname;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    public Integer getSravailable() {
        return sravailable;
    }

    public void setSravailable(Integer sravailable) {
        this.sravailable = sravailable;
    }

    public String getSrdescription() {
        return srdescription;
    }

    public void setSrdescription(String srdescription) {
        this.srdescription = srdescription;
    }
}