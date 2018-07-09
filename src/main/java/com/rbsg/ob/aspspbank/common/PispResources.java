package com.rbsg.ob.aspspbank.common;

public enum PispResources {
    PAYMENT_INITIATION("payments"),
    PAYMENT_SUBMISSION("payment-submissions");

    PispResources(String resourceName) {
        this.resourceName=resourceName;
    }

    @Override
    public String toString() {
        return String.valueOf(resourceName);
    }

    private String resourceName;
}
