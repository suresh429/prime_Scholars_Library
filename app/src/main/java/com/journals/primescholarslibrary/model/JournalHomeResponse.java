package com.journals.primescholarslibrary.model;

public class JournalHomeResponse {


    /**
     * status : true
     * abt_journal : 1
     * abt_journal_details : <div class="row">
     <div class="imgjbcc col-lg-3"><img alt="jbcc-title" class="alignleft.size-full.wp-image-890 jbcc-img" height="270" src="https://www.eresearchco.com/assets/images/jbcc-flyer.jpg" width="255" /></div>

     <div class="col-lg-9 text-justify">
     <p>&lsquo;Journal of Biological and chemical Chronicles (J. Biol. Chem. Chron.)&rsquo; is an international, peer-reviewed, open access journal which started publication in 2015 and publishes from India on a firm E-RESEARCHCO. All the contents of E-RESEARCHCO are freely accessible online and are publicly archived.</p><br>

     <p>This &lsquo;Journal of Biological and chemical Chronicles (J. Biol. Chem. Chron.)&rsquo; encompasses all branches of Biology and Chemistry with its sub &ndash; disciplines like Pharmaceutical, Biological activities of Synthetic Drugs, Environmental Chemistry, Material Chemistry, Biochemistry, Polymer Chemistry, Petroleum Chemistry, and Agricultural Chemistry, et</p>

     </div>

     </div>
     */

    private boolean status;
    private int abt_journal;
    private String abt_journal_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbt_journal() {
        return abt_journal;
    }

    public void setAbt_journal(int abt_journal) {
        this.abt_journal = abt_journal;
    }

    public String getAbt_journal_details() {
        return abt_journal_details;
    }

    public void setAbt_journal_details(String abt_journal_details) {
        this.abt_journal_details = abt_journal_details;
    }
}
