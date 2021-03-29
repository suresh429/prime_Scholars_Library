package com.journals.primescholarslibrary.model;

import java.util.List;

public class JournalsListResponse {


    /**
     * journal_cnt : 2
     * status : true
     * message : Records Found
     * journal_details : [{"managejournal":"Asian Journal of Advanced Basic Sciences","journal":"ajabs"},{"managejournal":"Journal of Biological and chemical Chronicles","journal":"jbcc"}]
     */

    private int journal_cnt;
    private boolean status;
    private String message;
    /**
     * managejournal : Asian Journal of Advanced Basic Sciences
     * journal : ajabs
     */

    private List<JournalDetailsBean> journal_details;

    public int getJournal_cnt() {
        return journal_cnt;
    }

    public void setJournal_cnt(int journal_cnt) {
        this.journal_cnt = journal_cnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        private String managejournal;
        private String journal;

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }
    }
}
