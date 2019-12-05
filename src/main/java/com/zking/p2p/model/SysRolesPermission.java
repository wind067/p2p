package com.zking.p2p.model;

public class SysRolesPermission {
    private Long srpid;

    private Long srpsrid;

    private Long srpspid;

    public SysRolesPermission(Long srpid, Long srpsrid, Long srpspid) {
        this.srpid = srpid;
        this.srpsrid = srpsrid;
        this.srpspid = srpspid;
    }

    public SysRolesPermission() {
        super();
    }

    public Long getSrpid() {
        return srpid;
    }

    public void setSrpid(Long srpid) {
        this.srpid = srpid;
    }

    public Long getSrpsrid() {
        return srpsrid;
    }

    public void setSrpsrid(Long srpsrid) {
        this.srpsrid = srpsrid;
    }

    public Long getSrpspid() {
        return srpspid;
    }

    public void setSrpspid(Long srpspid) {
        this.srpspid = srpspid;
    }
}