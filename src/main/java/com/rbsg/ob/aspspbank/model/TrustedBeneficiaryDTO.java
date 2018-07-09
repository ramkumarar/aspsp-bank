package com.rbsg.ob.aspspbank.model;

public class TrustedBeneficiaryDTO {
    private String creditorAgentIdentification;
    private String creditorAccountIdentification;
    private String creditorName;

    public TrustedBeneficiaryDTO(String creditorName,String creditorAgentIdentification,String creditorAccountIdentification){
        this.creditorName=creditorName;
        this.creditorAccountIdentification=creditorAccountIdentification;
        this.creditorAgentIdentification=creditorAgentIdentification;
    }

    public String getCreditorAgentIdentification() {
        return creditorAgentIdentification;
    }

    public String getCreditorAccountIdentification() {
        return creditorAccountIdentification;
    }

    public String getCreditorName() {
        return creditorName;
    }
}
