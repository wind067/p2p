package com.zking.p2p.model;

public class UsrInfo {
    private Long ufid;

    private Long urid;

    private String ufrealname;

    private String ufidnumber;

    private String ufphonenumber;

    private String ufbirthday;

    private Float ufincomegrade;

    private String ufmarriage;

    private String ufkidcount;

    private String ufeducationbackground;

    private String ufhousecondition;

    public UsrInfo(Long ufid, Long urid, String ufrealname, String ufidnumber, String ufphonenumber, String ufbirthday, Float ufincomegrade, String ufmarriage, String ufkidcount, String ufeducationbackground, String ufhousecondition) {
        this.ufid = ufid;
        this.urid = urid;
        this.ufrealname = ufrealname;
        this.ufidnumber = ufidnumber;
        this.ufphonenumber = ufphonenumber;
        this.ufbirthday = ufbirthday;
        this.ufincomegrade = ufincomegrade;
        this.ufmarriage = ufmarriage;
        this.ufkidcount = ufkidcount;
        this.ufeducationbackground = ufeducationbackground;
        this.ufhousecondition = ufhousecondition;
    }

    public UsrInfo() {
        super();
    }

    public Long getUfid() {
        return ufid;
    }

    public void setUfid(Long ufid) {
        this.ufid = ufid;
    }

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }

    public String getUfrealname() {
        return ufrealname;
    }

    public void setUfrealname(String ufrealname) {
        this.ufrealname = ufrealname;
    }

    public String getUfidnumber() {
        return ufidnumber;
    }

    public void setUfidnumber(String ufidnumber) {
        this.ufidnumber = ufidnumber;
    }

    public String getUfphonenumber() {
        return ufphonenumber;
    }

    public void setUfphonenumber(String ufphonenumber) {
        this.ufphonenumber = ufphonenumber;
    }

    public String getUfbirthday() {
        return ufbirthday;
    }

    public void setUfbirthday(String ufbirthday) {
        this.ufbirthday = ufbirthday;
    }

    public Float getUfincomegrade() {
        return ufincomegrade;
    }

    public void setUfincomegrade(Float ufincomegrade) {
        this.ufincomegrade = ufincomegrade;
    }

    public String getUfmarriage() {
        return ufmarriage;
    }

    public void setUfmarriage(String ufmarriage) {
        this.ufmarriage = ufmarriage;
    }

    public String getUfkidcount() {
        return ufkidcount;
    }

    public void setUfkidcount(String ufkidcount) {
        this.ufkidcount = ufkidcount;
    }

    public String getUfeducationbackground() {
        return ufeducationbackground;
    }

    public void setUfeducationbackground(String ufeducationbackground) {
        this.ufeducationbackground = ufeducationbackground;
    }

    public String getUfhousecondition() {
        return ufhousecondition;
    }

    public void setUfhousecondition(String ufhousecondition) {
        this.ufhousecondition = ufhousecondition;
    }
}