package test.domain;

import java.util.Date;

public class InformationPolitics {
    private Integer id;

    private String politicsStatus;

    private Date joinpartyTime;

    private Date conversionTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public Date getJoinpartyTime() {
        return joinpartyTime;
    }

    public void setJoinpartyTime(Date joinpartyTime) {
        this.joinpartyTime = joinpartyTime;
    }

    public Date getConversionTime() {
        return conversionTime;
    }

    public void setConversionTime(Date conversionTime) {
        this.conversionTime = conversionTime;
    }
}