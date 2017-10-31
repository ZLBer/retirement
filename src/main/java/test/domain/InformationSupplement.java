package test.domain;

public class InformationSupplement {
    private Integer id;

    private String spouse;

    private String statusChildren;

    private String livingCondition;

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

    public String getLivingCondition() {
        return livingCondition;
    }

    public void setLivingCondition(String livingCondition) {
        this.livingCondition = livingCondition == null ? null : livingCondition.trim();
    }

    public String getStatusOther() {
        return statusOther;
    }

    public void setStatusOther(String statusOther) {
        this.statusOther = statusOther == null ? null : statusOther.trim();
    }
}