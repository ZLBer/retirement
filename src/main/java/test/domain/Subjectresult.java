package test.domain;

import java.util.Date;

public class Subjectresult {
    private Integer resultId;

    private Integer resultStudent;

    private Integer resultSubject;

    private Date resultTime;

    private Integer resultState;

    private String other;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getResultStudent() {
        return resultStudent;
    }

    public void setResultStudent(Integer resultStudent) {
        this.resultStudent = resultStudent;
    }

    public Integer getResultSubject() {
        return resultSubject;
    }

    public void setResultSubject(Integer resultSubject) {
        this.resultSubject = resultSubject;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    public Integer getResultState() {
        return resultState;
    }

    public void setResultState(Integer resultState) {
        this.resultState = resultState;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}