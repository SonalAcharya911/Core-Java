package com.xworkz.monsoon.dto;

public class LaboratoryDto {
    String expName;
    int expNo;
    String date;
    String observations;
    String result;

    public String getDate() {
        return date;
    }

    public int getExpNo() {
        return expNo;
    }

    public String getExpName() {
        return expName;
    }

    public String getObservations() {
        return observations;
    }

    public String getResult() {
        return result;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public void setExpNo(int expNo) {
        this.expNo = expNo;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
