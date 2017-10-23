package test.domain;

public class Department {
    private Integer departmentId;

    private String departmentName;

    private Integer departmentCollege;

    private String other;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDepartmentCollege() {
        return departmentCollege;
    }

    public void setDepartmentCollege(Integer departmentCollege) {
        this.departmentCollege = departmentCollege;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}