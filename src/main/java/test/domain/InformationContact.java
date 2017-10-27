package test.domain;

public class InformationContact {
    private Integer id;

    private String homeAddress;

    private String phoneHome;

    private String phoneOwn;

    private String phoneChildren;

    private String phoneOther;

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
}