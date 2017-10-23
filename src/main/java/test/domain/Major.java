package test.domain;

public class Major {
    private Integer majorId;

    private String majorName;

    private Integer majorDepartment;

    private Integer majorCollege;

    private String other;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getMajorDepartment() {
        return majorDepartment;
    }

    public void setMajorDepartment(Integer majorDepartment) {
        this.majorDepartment = majorDepartment;
    }

    public Integer getMajorCollege() {
        return majorCollege;
    }

    public void setMajorCollege(Integer majorCollege) {
        this.majorCollege = majorCollege;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}