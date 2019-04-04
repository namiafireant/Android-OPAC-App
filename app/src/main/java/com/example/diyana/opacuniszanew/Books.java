package com.example.diyana.opacuniszanew;

public class Books {

    private String bIsbnNum, bCallNum, bAuthor, bTitle, bEdition, bImprint, bDescription, bNotes, bBiblio, bSubject, bOtherAuthor, bEntryTitle, bId, bStatus;

    public Books(String b_id, String b_isbn_num, String b_call_num, String b_author, String b_title, String b_edition, String b_imprint, String b_description, String b_notes, String b_biblio, String b_subject, String b_other_author, String b_entry_title, String b_status ){
        bId = b_id;
        bIsbnNum = b_isbn_num;
        bCallNum = b_call_num;
        bAuthor = b_author;
        bTitle = b_title;
        bEdition = b_edition;
        bImprint = b_imprint;
        bDescription = b_description;
        bNotes = b_notes;
        bBiblio = b_biblio;
        bSubject = b_subject;
        bOtherAuthor = b_other_author;
        bEntryTitle = b_entry_title;
        bStatus = b_status;
    }

    public String getbIsbnNum() {
        return bIsbnNum;
    }

    public void setbIsbnNum(String bIsbnNum) {
        this.bIsbnNum = bIsbnNum;
    }

    public String getbCallNum() {
        return bCallNum;
    }

    public void setbCallNum(String bCallNum) {
        this.bCallNum = bCallNum;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbEdition() {
        return bEdition;
    }

    public void setbEdition(String bEdition) {
        this.bEdition = bEdition;
    }

    public String getbImprint() {
        return bImprint;
    }

    public void setbImprint(String bImprint) {
        this.bImprint = bImprint;
    }

    public String getbDescription() {
        return bDescription;
    }

    public void setbDescription(String bDescription) {
        this.bDescription = bDescription;
    }

    public String getbNotes() {
        return bNotes;
    }

    public void setbNotes(String bNotes) {
        this.bNotes = bNotes;
    }

    public String getbBiblio() {
        return bBiblio;
    }

    public void setbBiblio(String bBiblio) {
        this.bBiblio = bBiblio;
    }

    public String getbSubject() {
        return bSubject;
    }

    public void setbSubject(String bSubject) {
        this.bSubject = bSubject;
    }

    public String getbOtherAuthor() {
        return bOtherAuthor;
    }

    public void setbOtherAuthor(String bOtherAuthor) {
        this.bOtherAuthor = bOtherAuthor;
    }

    public String getbEntryTitle() {
        return bEntryTitle;
    }

    public void setbEntryTitle(String bEntryTitle) {
        this.bEntryTitle = bEntryTitle;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }
}
