package com.journals.primescholarslibrary.model;

import java.util.List;

public class CategoryResponse {


    /**
     * status : true
     * journals_cnt : 2
     * journal_details : [{"flyerimg":null,"home_url":"https://www.ajabs.org/","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.ajabs.org/editorial-board.html","ci_url":"https://www.ajabs.org/current-issue.html","inst_url":"https://www.ajabs.org/authors-instructions.html","track_paper":"https://www.scholarscentral.org/submissions/asian-advanced-basic-sciences.html","journal":"ajabs","managejournal":"Asian Journal of Advanced Basic Sciences"},{"flyerimg":null,"home_url":"https://www.eresearchco.com/biological-chemical-chronicles.html","rel_keyword":"articles","journal_logo":null,"eb_url":"https://www.eresearchco.com/biological-chemical-chronicles/editorial-reviewer-board.html","ci_url":"https://www.eresearchco.com/biological-chemical-chronicles/current-issue.html","inst_url":"https://www.eresearchco.com/biological-chemical-chronicles/authors-instructions.html","track_paper":"https://www.scholarscentral.org/submissions/biological-chemical-chronicles.html","journal":"jbcc","managejournal":"Journal of Biological and chemical Chronicles"}]
     */

    private boolean status;
    private int journals_cnt;
    /**
     * flyerimg : null
     * home_url : https://www.ajabs.org/
     * rel_keyword : articles
     * journal_logo : null
     * eb_url : https://www.ajabs.org/editorial-board.html
     * ci_url : https://www.ajabs.org/current-issue.html
     * inst_url : https://www.ajabs.org/authors-instructions.html
     * track_paper : https://www.scholarscentral.org/submissions/asian-advanced-basic-sciences.html
     * journal : ajabs
     * managejournal : Asian Journal of Advanced Basic Sciences
     */

    private List<JournalDetailsBean> journal_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getJournals_cnt() {
        return journals_cnt;
    }

    public void setJournals_cnt(int journals_cnt) {
        this.journals_cnt = journals_cnt;
    }

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        private String flyerimg;
        private String home_url;
        private String rel_keyword;
        private String journal_logo;
        private String eb_url;
        private String ci_url;
        private String inst_url;
        private String track_paper;
        private String journal;
        private String managejournal;

        public String getFlyerimg() {
            return flyerimg;
        }

        public void setFlyerimg(String flyerimg) {
            this.flyerimg = flyerimg;
        }

        public String getHome_url() {
            return home_url;
        }

        public void setHome_url(String home_url) {
            this.home_url = home_url;
        }

        public String getRel_keyword() {
            return rel_keyword;
        }

        public void setRel_keyword(String rel_keyword) {
            this.rel_keyword = rel_keyword;
        }

        public String getJournal_logo() {
            return journal_logo;
        }

        public void setJournal_logo(String journal_logo) {
            this.journal_logo = journal_logo;
        }

        public String getEb_url() {
            return eb_url;
        }

        public void setEb_url(String eb_url) {
            this.eb_url = eb_url;
        }

        public String getCi_url() {
            return ci_url;
        }

        public void setCi_url(String ci_url) {
            this.ci_url = ci_url;
        }

        public String getInst_url() {
            return inst_url;
        }

        public void setInst_url(String inst_url) {
            this.inst_url = inst_url;
        }

        public String getTrack_paper() {
            return track_paper;
        }

        public void setTrack_paper(String track_paper) {
            this.track_paper = track_paper;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }
    }
}
