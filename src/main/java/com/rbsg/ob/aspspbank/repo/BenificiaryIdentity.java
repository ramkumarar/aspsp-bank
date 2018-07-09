package com.rbsg.ob.aspspbank.repo;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BenificiaryIdentity implements Serializable {

    private String creditorAgentIdentification;
    private String creditorAccountIdentification;

    public BenificiaryIdentity(){

    }

    public BenificiaryIdentity(String creditorAgentIdentification, String creditorAccountIdentification) {
        this.creditorAccountIdentification=creditorAccountIdentification;
        this.creditorAgentIdentification=creditorAgentIdentification;
    }

    public String getCreditorAgentIdentification() {
        return creditorAgentIdentification;
    }

    public void setCreditorAgentIdentification(String creditorAgentIdentification) {
        this.creditorAgentIdentification = creditorAgentIdentification;
    }

    public String getCreditorAccountIdentification() {
        return creditorAccountIdentification;
    }

    public void setCreditorAccountIdentification(String creditorAccountIdentification) {
        this.creditorAccountIdentification = creditorAccountIdentification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BenificiaryIdentity that = (BenificiaryIdentity) o;

        if (!creditorAgentIdentification.equals(that.creditorAgentIdentification)) return false;
        return creditorAccountIdentification.equals(that.creditorAccountIdentification);
    }

    @Override
    public int hashCode() {
        int result = creditorAgentIdentification.hashCode();
        result = 31 * result + creditorAccountIdentification.hashCode();
        return result;
    }

}
