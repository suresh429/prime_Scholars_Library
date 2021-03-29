package com.journals.primescholarslibrary.model;

import java.util.List;

public class CurrentIssueResponse {

    /**
     * currentissue_cnt : 5
     * status : true
     * message : Records Found
     * currentissue_details : [{"sno":"64251","title":"GC-MS, Analysis, Antimicrobial Examination and Antioxidant Properties\r\nof the Leaves of Tilkor [Momoradica monadelpha] in Different Solvents","author_names":"Panshu Pratik\r\nand Md. Athar Shadique","abstractlink":"gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesrnof-the-leaves-of-tilkor-momoradica-monadelpha-in-dif-64251.html","pdflink":"https://www.eresearchco.com/articles/gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesof-the-leaves-of-tilkor-momoradica-monadelpha-in-diffe.pdf","fulltextlink":null,"sup_file":"","spage_num":"1","lpage_num":"10","doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2"},{"sno":"64254","title":"Internet of Things (IoT) to Study the Wild Life: A Review","author_names":"Pawitar Dulari\r\n, Ajay Bhushan\r\n, Brijender Bhushan\r\nand Vivek C. Chandel","abstractlink":"internet-of-things-iot-to-study-the-wild-life-a-review-64254.html","pdflink":"https://www.eresearchco.com/articles/internet-of-things-iot-to-study-the-wild-life-a-review.pdf","fulltextlink":null,"sup_file":"","spage_num":"11","lpage_num":"15","doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Review","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2"},{"sno":"64258","title":"Synthesis of 3-Substituted benzyl-6-phenyl-1,2-dihydro-1,2,4,5-tetrazine\r\nand Assignment of Structural Formula","author_names":"Ram Vinay Thakur, Shabina Perween, A. K. L. Das, K. K. Jha, Panshu Pratik & S. R. Kumar","abstractlink":"synthesis-of-3substituted-benzyl6phenyl12dihydro1245tetrazinernand-assignment-of-structural-formula-64258.html","pdflink":"https://www.eresearchco.com/articles/synthesis-of-3substituted-benzyl6phenyl12dihydro1245tetrazineand-assignment-of-structural-formula.pdf","fulltextlink":null,"sup_file":"","spage_num":"16","lpage_num":"21","doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2"},{"sno":"64260","title":"Floristic Studies on Cryptogams of Sarkaghat region in Himachal\r\nPradesh, India","author_names":"Poonam and Hem Chander","abstractlink":"floristic-studies-on-cryptogams-of-sarkaghat-region-in-himachalrnpradesh-india-64260.html","pdflink":"https://www.eresearchco.com/articles/floristic-studies-on-cryptogams-of-sarkaghat-region-in-himachalpradesh-india.pdf","fulltextlink":null,"sup_file":"","spage_num":"22","lpage_num":"36","doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2"},{"sno":"64265","title":"Pathogenesis, Incidence and Severity of some Fungal Crop Diseases in Hamirpur region of Himachal Pradesh","author_names":"M. V. Sharmab and Hem Chander","abstractlink":"pathogenesis-incidence-and-severity-of-some-fungal-crop-diseases-in-hamirpur-region-of-himachal-pradesh-64265.html","pdflink":"https://www.eresearchco.com/articles/pathogenesis-incidence-and-severity-of-some-fungal-crop-diseases-in-hamirpur-region-of-himachal-pradesh.pdf","fulltextlink":null,"sup_file":"","spage_num":"27","lpage_num":"31","doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2"}]
     */

    private int currentissue_cnt;
    private boolean status;
    private String message;
    /**
     * sno : 64251
     * title : GC-MS, Analysis, Antimicrobial Examination and Antioxidant Properties
     of the Leaves of Tilkor [Momoradica monadelpha] in Different Solvents
     * author_names : Panshu Pratik
     and Md. Athar Shadique
     * abstractlink : gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesrnof-the-leaves-of-tilkor-momoradica-monadelpha-in-dif-64251.html
     * pdflink : https://www.eresearchco.com/articles/gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesof-the-leaves-of-tilkor-momoradica-monadelpha-in-diffe.pdf
     * fulltextlink : null
     * sup_file :
     * spage_num : 1
     * lpage_num : 10
     * doi_num :
     * doi_stat : 0
     * old_omics_id : 0
     * art_type : Research Article
     * vol_issue_name : Volume 6, Issue 2
     * vol : 6
     * issue : 2
     */

    private List<CurrentissueDetailsBean> currentissue_details;

    public int getCurrentissue_cnt() {
        return currentissue_cnt;
    }

    public void setCurrentissue_cnt(int currentissue_cnt) {
        this.currentissue_cnt = currentissue_cnt;
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

    public List<CurrentissueDetailsBean> getCurrentissue_details() {
        return currentissue_details;
    }

    public void setCurrentissue_details(List<CurrentissueDetailsBean> currentissue_details) {
        this.currentissue_details = currentissue_details;
    }

    public static class CurrentissueDetailsBean {
        private String sno;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String spage_num;
        private String lpage_num;
        private String doi_num;
        private String doi_stat;
        private String old_omics_id;
        private String art_type;
        private String vol_issue_name;
        private String vol;
        private String issue;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
        }

        public String getSpage_num() {
            return spage_num;
        }

        public void setSpage_num(String spage_num) {
            this.spage_num = spage_num;
        }

        public String getLpage_num() {
            return lpage_num;
        }

        public void setLpage_num(String lpage_num) {
            this.lpage_num = lpage_num;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getDoi_stat() {
            return doi_stat;
        }

        public void setDoi_stat(String doi_stat) {
            this.doi_stat = doi_stat;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
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
    }
}
