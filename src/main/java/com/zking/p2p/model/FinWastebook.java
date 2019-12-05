package com.zking.p2p.model;

public class FinWastebook {
    private Long fwid;

    private Long fwlid;

    private Long fwfsid;

    private Long fwfbid;

    public FinWastebook(Long fwid, Long fwlid, Long fwfsid, Long fwfbid) {
        this.fwid = fwid;
        this.fwlid = fwlid;
        this.fwfsid = fwfsid;
        this.fwfbid = fwfbid;
    }

    public FinWastebook() {
        super();
    }

    public Long getFwid() {
        return fwid;
    }

    public void setFwid(Long fwid) {
        this.fwid = fwid;
    }

    public Long getFwlid() {
        return fwlid;
    }

    public void setFwlid(Long fwlid) {
        this.fwlid = fwlid;
    }

    public Long getFwfsid() {
        return fwfsid;
    }

    public void setFwfsid(Long fwfsid) {
        this.fwfsid = fwfsid;
    }

    public Long getFwfbid() {
        return fwfbid;
    }

    public void setFwfbid(Long fwfbid) {
        this.fwfbid = fwfbid;
    }
}