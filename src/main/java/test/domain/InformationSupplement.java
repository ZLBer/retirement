package test.domain;

import java.util.Date;

public class InformationSupplement {
    private Integer id;

    private String spouse;

    private String statusChildren;

    private Date timeDeath;

    private String statusOther;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse == null ? null : spouse.trim();
    }

    public String getStatusChildren() {
        return statusChildren;
    }

    public void setStatusChildren(String statusChildren) {
        this.statusChildren = statusChildren == null ? null : statusChildren.trim();
    }

    public Date getTimeDeath() {
        return timeDeath;
    }

    public void setTimeDeath(Date timeDeath) {
        this.timeDeath = timeDeath;
    }

    public String getStatusOther() {
        return statusOther;
    }

    public void setStatusOther(String statusOther) {
        this.statusOther = statusOther == null ? null : statusOther.trim();
    }
}