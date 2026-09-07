package com.Validator.project.models;

import lombok.Data;


public class PhoneResponse {
    private boolean valid;
    private String country;
    private String numberType;
    private String formattedNumber;

    public PhoneResponse(boolean valid, String country,
                         String numberType, String formattedNumber) {
        this.valid = valid;
        this.country = country;
        this.numberType = numberType;
        this.formattedNumber = formattedNumber;
    }
    public boolean isValid() { return valid; }
    public void setValid(boolean valid) {
        this.valid = valid;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumberType() {
        return numberType;
    }

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    public void setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
    }
}


