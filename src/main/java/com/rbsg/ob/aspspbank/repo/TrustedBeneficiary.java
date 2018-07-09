package com.rbsg.ob.aspspbank.repo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TrustedBeneficiary {
    @EmbeddedId
    private BenificiaryIdentity benificiaryIdentity;
    private String creditorName;

    public TrustedBeneficiary(){

    }

    public TrustedBeneficiary(BenificiaryIdentity benificiaryIdentity, String creditorName) {
        this.benificiaryIdentity = benificiaryIdentity;
        this.creditorName = creditorName;

    }


    public BenificiaryIdentity getBenificiaryIdentity() {
        return benificiaryIdentity;
    }

    public void setBenificiaryIdentity(BenificiaryIdentity benificiaryIdentity) {
        this.benificiaryIdentity = benificiaryIdentity;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    @Override
    public String toString() {
        return String.format(
                "TrustedBeneficiary[benificiaryIdentity='%s', creditorName='%s']",
                 benificiaryIdentity,creditorName);
    }

}
