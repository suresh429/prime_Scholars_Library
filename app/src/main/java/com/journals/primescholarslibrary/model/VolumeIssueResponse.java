package com.journals.primescholarslibrary.model;

import java.util.List;

public class VolumeIssueResponse {


    /**
     * status : true
     * vol_issue : 6
     * vol_issue_details : [{"sno":"64219","title":"An Account of Epiphytic Orchids of Nainital in Relation to Their\r\nHost Specificity","author_names":"Jyoti and L. M. Tewari","abstractlink":"an-account-of-epiphytic-orchids-of-nainital-in-relation-to-theirrnhost-specificity-64219.html","pdflink":"https://www.eresearchco.com/articles/an-account-of-epiphytic-orchids-of-nainital-in-relation-to-theirhost-specificity.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"1","lpage_num":"4","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"},{"sno":"64223","title":"Antimicrobial Examination of Mucilage Obtained from Fruits of Tilkor\r\n[Mamoradica monadelpha]: A Potential Medicinal Plant","author_names":"Panshu Pratik\r\nand Md. Athar Shadique","abstractlink":"antimicrobial-examination-of-mucilage-obtained-from-fruits-of-tilkorrnmamoradica-monadelpha-a-potential-medicinal-plant-64223.html","pdflink":"https://www.eresearchco.com/articles/antimicrobial-examination-of-mucilage-obtained-from-fruits-of-tilkormamoradica-monadelpha-a-potential-medicinal-plant.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"5","lpage_num":"9","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"},{"sno":"64230","title":"African Swine Fever: An Emerging Viral Disease in India ","author_names":"Atul Kabra, Mohammad Mukim, Kamal Uddin\r\n, Ruchika Kabra\r\nand Rajiv Kukkar","abstractlink":"african-swine-fever-an-emerging-viral-disease-in-india-a-review-64230.html","pdflink":"https://www.eresearchco.com/articles/african-swine-fever-an-emerging-viral-disease-in-india--a-review.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"10","lpage_num":"18","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Review"},{"sno":"64235","title":"An Assessment of Improved Production Technology of Rapeseed Mustard under Rain-fed Agro-ecosystem in Hamirpur District of Himachal\r\nPradesh, India","author_names":"Hem Chander and Gulshan Kumar","abstractlink":"an-assessment-of-improved-production-technology-of-rapeseed-mustard-under-rainfed-agroecosystem-in-hamirpur-district-of--64235.html","pdflink":"https://www.eresearchco.com/articles/an-assessment-of-improved-production-technology-of-rapeseed-mustard-under-rainfed-agroecosystem-in-hamirpur-district-of-.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"19","lpage_num":"23","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"},{"sno":"64237","title":"Species Diversity of Lichens in Bhoranj Block of Hamirpur District,\r\nHimachal Pradesh","author_names":"Hem Chander, Ankita Sharma, Priyanka and Varsha Katoch","abstractlink":"species-diversity-of-lichens-in-bhoranj-block-of-hamirpur-districtrnhimachal-pradesh-64237.html","pdflink":"https://www.eresearchco.com/articles/species-diversity-of-lichens-in-bhoranj-block-of-hamirpur-districthimachal-pradesh.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"24","lpage_num":"27","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"},{"sno":"64242","title":"Thermal Stability and Structural Analysis of Terbium Caprylate","author_names":"Kamal Kishore\r\n, Manpreet Singh\r\n, Nandita Thakur\r\n, S. K. Upadhyaya\r\nand Yogesh Kumar Walia","abstractlink":"thermal-stability-and-structural-analysis-of-terbium-caprylate-64242.html","pdflink":"https://www.eresearchco.com/articles/thermal-stability-and-structural-analysis-of-terbium-caprylate.pdf","fulltextlink":null,"sup_file":"","journal":"jbcc","year":"2020","spage_num":"28","lpage_num":"34","art_img":null,"doi_num":"","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"}]
     */

    private boolean status;
    private int vol_issue;
    /**
     * sno : 64219
     * title : An Account of Epiphytic Orchids of Nainital in Relation to Their
     Host Specificity
     * author_names : Jyoti and L. M. Tewari
     * abstractlink : an-account-of-epiphytic-orchids-of-nainital-in-relation-to-theirrnhost-specificity-64219.html
     * pdflink : https://www.eresearchco.com/articles/an-account-of-epiphytic-orchids-of-nainital-in-relation-to-theirhost-specificity.pdf
     * fulltextlink : null
     * sup_file :
     * journal : jbcc
     * year : 2020
     * spage_num : 1
     * lpage_num : 4
     * art_img : null
     * doi_num :
     * doi_stat : 0
     * old_omics_id : 0
     * art_type : Research Article
     */

    private List<VolIssueDetailsBean> vol_issue_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVol_issue() {
        return vol_issue;
    }

    public void setVol_issue(int vol_issue) {
        this.vol_issue = vol_issue;
    }

    public List<VolIssueDetailsBean> getVol_issue_details() {
        return vol_issue_details;
    }

    public void setVol_issue_details(List<VolIssueDetailsBean> vol_issue_details) {
        this.vol_issue_details = vol_issue_details;
    }

    public static class VolIssueDetailsBean {
        private String sno;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String journal;
        private String year;
        private String spage_num;
        private String lpage_num;
        private String art_img;
        private String doi_num;
        private String doi_stat;
        private String old_omics_id;
        private String art_type;

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

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
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

        public String getArt_img() {
            return art_img;
        }

        public void setArt_img(String art_img) {
            this.art_img = art_img;
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
    }
}
