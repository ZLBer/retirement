package test.domain;

public class Subject {
    private Integer subjectId;

    private String subjectName;

    private Integer subjectTeacher;

    private Integer subjectNumber;

    private Integer subjectSnumber;

    private Integer subjectDepartment;

    private String other;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(Integer subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public Integer getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(Integer subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public Integer getSubjectSnumber() {
        return subjectSnumber;
    }

    public void setSubjectSnumber(Integer subjectSnumber) {
        this.subjectSnumber = subjectSnumber;
    }

    public Integer getSubjectDepartment() {
        return subjectDepartment;
    }

    public void setSubjectDepartment(Integer subjectDepartment) {
        this.subjectDepartment = subjectDepartment;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}