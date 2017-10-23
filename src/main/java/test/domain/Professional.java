package test.domain;

public class Professional {
    private Integer id;

    private String professionalName;

    private Integer professionalNum;

    private String other;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName == null ? null : professionalName.trim();
    }

    public Integer getProfessionalNum() {
        return professionalNum;
    }

    public void setProfessionalNum(Integer professionalNum) {
        this.professionalNum = professionalNum;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}