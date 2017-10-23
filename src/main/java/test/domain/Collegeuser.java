package test.domain;

public class Collegeuser {
    private Integer id;

    private String collegeName;

    private String collegePassword;

    private Integer collegeId;

    private String other;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegePassword() {
        return collegePassword;
    }

    public void setCollegePassword(String collegePassword) {
        this.collegePassword = collegePassword == null ? null : collegePassword.trim();
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}