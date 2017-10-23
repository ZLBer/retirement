package test.domain;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Integer teacherDepartment;

    private String teacherTel;

    private String teacherProfessional;

    private Integer teacherSnumber;

    private String other;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherDepartment() {
        return teacherDepartment;
    }

    public void setTeacherDepartment(Integer teacherDepartment) {
        this.teacherDepartment = teacherDepartment;
    }

    public String getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel == null ? null : teacherTel.trim();
    }

    public String getTeacherProfessional() {
        return teacherProfessional;
    }

    public void setTeacherProfessional(String teacherProfessional) {
        this.teacherProfessional = teacherProfessional == null ? null : teacherProfessional.trim();
    }

    public Integer getTeacherSnumber() {
        return teacherSnumber;
    }

    public void setTeacherSnumber(Integer teacherSnumber) {
        this.teacherSnumber = teacherSnumber;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}