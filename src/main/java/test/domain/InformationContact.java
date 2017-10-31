package test.domain;

public class InformationContact {
    private Integer id;

    private String homeAddress;

    private String phoneHome;

    private String phoneOwn;

    private String phoneChildren;

    private String phoneOther;

    private String email;

    private String wechat;

    private String qq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome == null ? null : phoneHome.trim();
    }

    public String getPhoneOwn() {
        return phoneOwn;
    }

    public void setPhoneOwn(String phoneOwn) {
        this.phoneOwn = phoneOwn == null ? null : phoneOwn.trim();
    }

    public String getPhoneChildren() {
        return phoneChildren;
    }

    public void setPhoneChildren(String phoneChildren) {
        this.phoneChildren = phoneChildren == null ? null : phoneChildren.trim();
    }

    public String getPhoneOther() {
        return phoneOther;
    }

    public void setPhoneOther(String phoneOther) {
        this.phoneOther = phoneOther == null ? null : phoneOther.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }
}