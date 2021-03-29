package com.journals.primescholarslibrary.model;

import java.util.List;

public class ArchiveResponse {


    /**
     * archive_year_cnt : 6
     * status : true
     * message : Records Found
     * archive_years : [{"year":"2020","archive_details":[{"year":"2020","issue_id":"10279","journal":"jbcc","vol_issue_name":"Volume 6, Issue 1","vol":"6","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-6-issue-1-year-2020.html","date":"2021-03-09"},{"year":"2020","issue_id":"10282","journal":"jbcc","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-6-issue-2-year-2020.html","date":"2021-03-09"}]},{"year":"2019","archive_details":[{"year":"2019","issue_id":"10277","journal":"jbcc","vol_issue_name":"Volume 5, Issue 1","vol":"5","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-5-issue-1-year-2019.html","date":"2021-03-09"},{"year":"2019","issue_id":"10286","journal":"jbcc","vol_issue_name":"Volume 5, Issue 2","vol":"5","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-5-issue-2-year-2019.html","date":"2021-03-09"},{"year":"2019","issue_id":"10289","journal":"jbcc","vol_issue_name":"Volume 5, Issue 3","vol":"5","issue":"3","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-5-issue-3-year-2019.html","date":"2021-03-09"}]},{"year":"2018","archive_details":[{"year":"2018","issue_id":"10278","journal":"jbcc","vol_issue_name":"Volume 4, Issue 1","vol":"4","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-4-issue-1-year-2018.html","date":"2021-03-09"},{"year":"2018","issue_id":"10283","journal":"jbcc","vol_issue_name":"Volume 4, Issue 2","vol":"4","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-4-issue-2-year-2018.html","date":"2021-03-09"},{"year":"2018","issue_id":"10293","journal":"jbcc","vol_issue_name":"Volume 4, Issue 3","vol":"4","issue":"3","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-4-issue-3-year-2018.html","date":"2021-03-09"}]},{"year":"2017","archive_details":[{"year":"2017","issue_id":"10276","journal":"jbcc","vol_issue_name":"Volume 3, Issue 1","vol":"3","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-3-issue-1-year-2017.html","date":"2021-03-09"},{"year":"2017","issue_id":"10281","journal":"jbcc","vol_issue_name":"Volume 3, Issue 2","vol":"3","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-3-issue-2-year-2017.html","date":"2021-03-09"}]},{"year":"2016","archive_details":[{"year":"2016","issue_id":"10275","journal":"jbcc","vol_issue_name":"Volume 2, Issue 1","vol":"2","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-2-issue-1-year-2016.html","date":"2021-03-09"},{"year":"2016","issue_id":"10280","journal":"jbcc","vol_issue_name":"Volume 2, Issue 2","vol":"2","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-2-issue-2-year-2016.html","date":"2021-03-09"}]},{"year":"2015","archive_details":[{"year":"2015","issue_id":"10271","journal":"jbcc","vol_issue_name":"Volume 1, Issue 1","vol":"1","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-1-issue-1-year-2015.html","date":"2021-03-08"}]}]
     */

    private int archive_year_cnt;
    private boolean status;
    private String message;
    /**
     * year : 2020
     * archive_details : [{"year":"2020","issue_id":"10279","journal":"jbcc","vol_issue_name":"Volume 6, Issue 1","vol":"6","issue":"1","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-6-issue-1-year-2020.html","date":"2021-03-09"},{"year":"2020","issue_id":"10282","journal":"jbcc","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2","iss_type":"0","vol_issue_url":"https://www.eresearchco.com/archive/jbcc-volume-6-issue-2-year-2020.html","date":"2021-03-09"}]
     */

    private List<ArchiveYearsBean> archive_years;

    public int getArchive_year_cnt() {
        return archive_year_cnt;
    }

    public void setArchive_year_cnt(int archive_year_cnt) {
        this.archive_year_cnt = archive_year_cnt;
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

    public List<ArchiveYearsBean> getArchive_years() {
        return archive_years;
    }

    public void setArchive_years(List<ArchiveYearsBean> archive_years) {
        this.archive_years = archive_years;
    }

    public static class ArchiveYearsBean {
        private String year;
        /**
         * year : 2020
         * issue_id : 10279
         * journal : jbcc
         * vol_issue_name : Volume 6, Issue 1
         * vol : 6
         * issue : 1
         * iss_type : 0
         * vol_issue_url : https://www.eresearchco.com/archive/jbcc-volume-6-issue-1-year-2020.html
         * date : 2021-03-09
         */

        private List<ArchiveDetailsBean> archive_details;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchive_details() {
            return archive_details;
        }

        public void setArchive_details(List<ArchiveDetailsBean> archive_details) {
            this.archive_details = archive_details;
        }

        public static class ArchiveDetailsBean {
            private String year;
            private String issue_id;
            private String journal;
            private String vol_issue_name;
            private String vol;
            private String issue;
            private String iss_type;
            private String vol_issue_url;
            private String date;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getIssue_id() {
                return issue_id;
            }

            public void setIssue_id(String issue_id) {
                this.issue_id = issue_id;
            }

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
            }

            public String getVol_issue_name() {
                return vol_issue_name;
            }

            public void setVol_issue_name(String vol_issue_name) {
                this.vol_issue_name = vol_issue_name;
            }

            public String getVol() {
                return vol;
            }

            public void setVol(String vol) {
                this.vol = vol;
            }

            public String getIssue() {
                return issue;
            }

            public void setIssue(String issue) {
                this.issue = issue;
            }

            public String getIss_type() {
                return iss_type;
            }

            public void setIss_type(String iss_type) {
                this.iss_type = iss_type;
            }

            public String getVol_issue_url() {
                return vol_issue_url;
            }

            public void setVol_issue_url(String vol_issue_url) {
                this.vol_issue_url = vol_issue_url;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
