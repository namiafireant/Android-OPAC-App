package com.example.diyana.opacuniszanew;

public class Accession {

    private String aCallNum, aCampus, aLocation, aSmd, aCategory, aDueDate, aDueTime,aId, aStatus, aBookId;

    public Accession(String a_id, String a_call_num, String a_campus, String a_location, String a_smd, String a_category, String a_status, String a_due_date, String a_due_time, String a_book_id){
        aId = a_id;
        aCallNum = a_call_num;
        aCampus = a_campus;
        aLocation = a_location;
        aSmd = a_smd;
        aCategory = a_category;
        aStatus = a_status;
        aDueDate = a_due_date;
        aDueTime = a_due_time;
        aBookId = a_book_id;
    }

    public String getaCallNum() {
        return aCallNum;
    }

    public void setaCallNum(String aCallNum) {
        this.aCallNum = aCallNum;
    }

    public String getaCampus() {
        return aCampus;
    }

    public void setaCampus(String aCampus) {
        this.aCampus = aCampus;
    }

    public String getaLocation() {
        return aLocation;
    }

    public void setaLocation(String aLocation) {
        this.aLocation = aLocation;
    }

    public String getaSmd() {
        return aSmd;
    }

    public void setaSmd(String aSmd) {
        this.aSmd = aSmd;
    }

    public String getaCategory() {
        return aCategory;
    }

    public void setaCategory(String aCategory) {
        this.aCategory = aCategory;
    }

    public String getaDueDate() {
        return aDueDate;
    }

    public void setaDueDate(String aDueDate) {
        this.aDueDate = aDueDate;
    }

    public String getaDueTime() {
        return aDueTime;
    }

    public void setaDueTime(String aDueTime) {
        this.aDueTime = aDueTime;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaStatus() {
        switch (aStatus){
            case "1":
                aStatus = "Accessible";
                break;
            case "2":
                aStatus = "Lost";
                break;
            case "3":
                aStatus = "Sorting";
                break;
        }
        return aStatus;
    }

    public void setaStatus(String aStatus) {
        this.aStatus = aStatus;
    }

    public String getaBookId() {
        return aBookId;
    }

    public void setaBookId(String aBookId) {
        this.aBookId = aBookId;
    }
}
