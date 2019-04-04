package com.example.diyana.opacuniszanew;

public class Acquisition {

    private String acOrderDate,acVendor,acStatus, acId,acSets,acReceived, acCopies, acFeedback,acBookId;

    public Acquisition(){
    }

    public Acquisition (String ac_id, String ac_order_date, String ac_vendor, String ac_status, String ac_sets, String ac_received, String ac_copies, String ac_feedback, String ac_book_id){
        acId = ac_id;
        acOrderDate = ac_order_date;
        acVendor =ac_vendor;
        acStatus = ac_status;
        acSets = ac_sets;
        acReceived = ac_received;
        acCopies = ac_copies;
        acFeedback = ac_feedback;
        acBookId = ac_book_id;
    }

    public String getAcOrderDate() {
        return acOrderDate;
    }

    public void setAcOrderDate(String acOrderDate) {
        this.acOrderDate = acOrderDate;
    }

    public String getAcVendor() {
        return acVendor;
    }

    public void setAcVendor(String acVendor) {
        this.acVendor = acVendor;
    }

    public String getAcStatus() {
        return acStatus;
    }

    public void setAcStatus(String acStatus) {
        this.acStatus = acStatus;
    }

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId;
    }

    public String getAcSets() {
        return acSets;
    }

    public void setAcSets(String acSets) {
        this.acSets = acSets;
    }

    public String getAcReceived() {
        return acReceived;
    }

    public void setAcReceived(String acReceived) {
        this.acReceived = acReceived;
    }

    public String getAcCopies() {
        return acCopies;
    }

    public void setAcCopies(String acCopies) {
        this.acCopies = acCopies;
    }

    public String getAcFeedback() {
        switch (acFeedback){
            case "0":
                acFeedback = "No feedback";
                break;
            case "1":
                acFeedback = "Feedback";
                break;
        }
        return acFeedback;
    }

    public void setAcFeedback(String acFeedback) {
        this.acFeedback = acFeedback;
    }

    public String getAcBookId() {
        return acBookId;
    }

    public void setAcBookId(String acBookId) {
        this.acBookId = acBookId;
    }
}
