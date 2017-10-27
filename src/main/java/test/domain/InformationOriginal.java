package test.domain;

import java.util.Date;

public class InformationOriginal {
    private Integer id;

    private String identity;

    private String educationLevel;

    private String originWorkplace;

    private String originDuties;

    private String orginDutiesLevel;

    private String originProfessional;

    private String originProfessionalLevel;

    private String treatment;

    private Date timeWork;

    private Date timeRetirement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel == null ? null : educationLevel.trim();
    }

    public String getOriginWorkplace() {
        return originWorkplace;
    }

    public void setOriginWorkplace(String originWorkplace) {
        this.originWorkplace = originWorkplace == null ? null : originWorkplace.trim();
    }

    public String getOriginDuties() {
        return originDuties;
    }

    public void setOriginDuties(String originDuties) {
        this.originDuties = originDuties == null ? null : originDuties.trim();
    }

    public String getOrginDutiesLevel() {
        return orginDutiesLevel;
    }

    public void setOrginDutiesLevel(String orginDutiesLevel) {
        this.orginDutiesLevel = orginDutiesLevel == null ? null : orginDutiesLevel.trim();
    }

    public String getOriginProfessional() {
        return originProfessional;
    }

    public void setOriginProfessional(String originProfessional) {
        this.originProfessional = originProfessional == null ? null : originProfessional.trim();
    }

    public String getOriginProfessionalLevel() {
        return originProfessionalLevel;
    }

    public void setOriginProfessionalLevel(String originProfessionalLevel) {
        this.originProfessionalLevel = originProfessionalLevel == null ? null : originProfessionalLevel.trim();
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment == null ? null : treatment.trim();
    }

    public Date getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(Date timeWork) {
        this.timeWork = timeWork;
    }

    public Date getTimeRetirement() {
        return timeRetirement;
    }

    public void setTimeRetirement(Date timeRetirement) {
        this.timeRetirement = timeRetirement;
    }
}