package com.example.simpleproject;

public class Transport {
    private String toyota;
    private String bmw;
    private String jeep;

    public Transport(String toyota, String bmw, String jeep) {
        this.toyota = toyota;
        this.bmw = bmw;
        this.jeep = jeep;
    }

    public String getToyota() {
        return toyota;
    }

    public void setToyota(String toyota) {
        this.toyota = toyota;
    }

    public String getBmw() {
        return bmw;
    }

    public void setBmw(String bmw) {
        this.bmw = bmw;
    }

    public String getJeep() {
        return jeep;
    }

    public void setJeep(String jeep) {
        this.jeep = jeep;
    }
}
