package com.electricangels.evp.models;

public class Greeting {
    private String contentString;

    public Greeting(String contString) {
        this.contentString = contString;
    }

    public String getContentString() {
        return contentString;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }
}
