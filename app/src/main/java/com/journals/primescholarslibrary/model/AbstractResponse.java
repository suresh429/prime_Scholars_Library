package com.journals.primescholarslibrary.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AbstractResponse {


    /**
     * status : true
     * abstract : 1
     * abstract_details : [{"sno":"64251","journal":"jbcc","title":"GC-MS, Analysis, Antimicrobial Examination and Antioxidant Properties\r\nof the Leaves of Tilkor [Momoradica monadelpha] in Different Solvents","author_names":"Panshu Pratik\r\nand Md. Athar Shadique","keywords":"Tilkor; Momoradica monadelpha; GC-MS analysis; methanol; n-hexane; ethyl acetate and antimicrobial examination.","abstract":"<p>Phytochemical analysis of n-hexane, ethyl acetate and methanol extracts of the leaves of Tilkor was carried out. These extracts exhibited satisfactory inhibitory activities against bacteria and fungi strains, which include; Staphylococcus aureus, Escherichia coli, Bacillus subtilis, Pseudomonas aeruginosa, Salmonella typhii, Klebsiella pneumoniae, Candida albicans, Aspergillus niger, Penicillium notatum and Rhizopus stolonifer. Methanol extract of Tilkor possesses antioxidant activity by scavenging DPPH free radical with IC50 of 187.58 &mu;g/mL, using DPPH antioxidant assay. GC-MS analysis of n-hexane, ethyl acetate and methanol extracts of the plant principally revealed the presence of phytol, ethyl hexadecanoate and clionasterol with their corresponding percentage abundance of 57.76%, 18.34% and 9.78%, respectively.<\/p>","doi_num":"","abstractlink":"gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesrnof-the-leaves-of-tilkor-momoradica-monadelpha-in-dif-64251.html","pdflink":"https://www.eresearchco.com/articles/gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesof-the-leaves-of-tilkor-momoradica-monadelpha-in-diffe.pdf","fulltextlink":null,"year":"2020","spage_num":"1","lpage_num":"10","pub_date":"2020-07-09","rec_date":"0000-00-00","date":"2021-03-09","old_omics_id":"0","domain_name":"https://www.eresearchco.com/","issue_id":"10282","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2","iss_type":"0","vol_issue_url":null}]
     */

    private boolean status;
    @SerializedName("abstract")
    private int abstractX;
    /**
     * sno : 64251
     * journal : jbcc
     * title : GC-MS, Analysis, Antimicrobial Examination and Antioxidant Properties
     of the Leaves of Tilkor [Momoradica monadelpha] in Different Solvents
     * author_names : Panshu Pratik
     and Md. Athar Shadique
     * keywords : Tilkor; Momoradica monadelpha; GC-MS analysis; methanol; n-hexane; ethyl acetate and antimicrobial examination.
     * abstract : <p>Phytochemical analysis of n-hexane, ethyl acetate and methanol extracts of the leaves of Tilkor was carried out. These extracts exhibited satisfactory inhibitory activities against bacteria and fungi strains, which include; Staphylococcus aureus, Escherichia coli, Bacillus subtilis, Pseudomonas aeruginosa, Salmonella typhii, Klebsiella pneumoniae, Candida albicans, Aspergillus niger, Penicillium notatum and Rhizopus stolonifer. Methanol extract of Tilkor possesses antioxidant activity by scavenging DPPH free radical with IC50 of 187.58 &mu;g/mL, using DPPH antioxidant assay. GC-MS analysis of n-hexane, ethyl acetate and methanol extracts of the plant principally revealed the presence of phytol, ethyl hexadecanoate and clionasterol with their corresponding percentage abundance of 57.76%, 18.34% and 9.78%, respectively.</p>
     * doi_num :
     * abstractlink : gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesrnof-the-leaves-of-tilkor-momoradica-monadelpha-in-dif-64251.html
     * pdflink : https://www.eresearchco.com/articles/gcms-analysis-antimicrobial-examination-and-antioxidant-propertiesof-the-leaves-of-tilkor-momoradica-monadelpha-in-diffe.pdf
     * fulltextlink : null
     * year : 2020
     * spage_num : 1
     * lpage_num : 10
     * pub_date : 2020-07-09
     * rec_date : 0000-00-00
     * date : 2021-03-09
     * old_omics_id : 0
     * domain_name : https://www.eresearchco.com/
     * issue_id : 10282
     * vol_issue_name : Volume 6, Issue 2
     * vol : 6
     * issue : 2
     * iss_type : 0
     * vol_issue_url : null
     */

    private List<AbstractDetailsBean> abstract_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(int abstractX) {
        this.abstractX = abstractX;
    }

    public List<AbstractDetailsBean> getAbstract_details() {
        return abstract_details;
    }

    public void setAbstract_details(List<AbstractDetailsBean> abstract_details) {
        this.abstract_details = abstract_details;
    }

    public static class AbstractDetailsBean {
        private String sno;
        private String journal;
        private String title;
        private String author_names;
        private String keywords;
        @SerializedName("abstract")
        private String abstractX;
        private String doi_num;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String year;
        private String spage_num;
        private String lpage_num;
        private String pub_date;
        private String rec_date;
        private String date;
        private String old_omics_id;
        private String domain_name;
        private String issue_id;
        private String vol_issue_name;
        private String vol;
        private String issue;
        private String iss_type;
        private String vol_issue_url;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
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

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
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

        public String getPub_date() {
            return pub_date;
        }

        public void setPub_date(String pub_date) {
            this.pub_date = pub_date;
        }

        public String getRec_date() {
            return rec_date;
        }

        public void setRec_date(String rec_date) {
            this.rec_date = rec_date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getDomain_name() {
            return domain_name;
        }

        public void setDomain_name(String domain_name) {
            this.domain_name = domain_name;
        }

        public String getIssue_id() {
            return issue_id;
        }

        public void setIssue_id(String issue_id) {
            this.issue_id = issue_id;
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
    }
}
