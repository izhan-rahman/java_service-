package com.alphabit.isbnscanner.helpers.common.token;

public class ClaimsDao {
    private String iat;
    private String sub;
    private String exp;
    private String plt;
    private String eid;
    private String unt;
    private String usr;

    public String getIat() { return iat; }
    public void setIat(String iat) { this.iat = iat; }
    public String getSub() { return sub; }
    public void setSub(String sub) { this.sub = sub; }
    public String getExp() { return exp; }
    public void setExp(String exp) { this.exp = exp; }
    public String getPlt() { return plt; }
    public void setPlt(String plt) { this.plt = plt; }
    public String getEid() { return eid; }
    public void setEid(String eid) { this.eid = eid; }
    public String getUnt() { return unt; }
    public void setUnt(String unt) { this.unt = unt; }
    public String getUsr() { return usr; }
    public void setUsr(String usr) { this.usr = usr; }
}
