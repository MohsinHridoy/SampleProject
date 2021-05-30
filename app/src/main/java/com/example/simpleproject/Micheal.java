package com.example.simpleproject;

public class Micheal {
    private String name;      //Encapsulation  variable in private but it used from other class by public get-set methhod

    private int car;
    private Transport transport;

    public Micheal(String name, int car, Transport transport) {
        this.name = name;
        this.car = car;
        this.transport = transport;
    }

    public String getName() {    ///get return  read only value
        return name;
    }

    public void setName(String name) {     ///set method used for write
        this.name = name;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
