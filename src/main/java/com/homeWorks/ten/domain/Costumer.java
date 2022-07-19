package com.homeWorks.ten.domain;

import java.io.Serializable;

public class Costumer implements Serializable {
    private String fullName;
    private String service;
    private int amount;

    public Costumer() {
    }

    public Costumer(String fullName, String service, int amount) {
        this.fullName = fullName;
        this.service = service;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "fullName='" + fullName + '\'' +
                ", service='" + service + '\'' +
                ", amount=" + amount +
                '}';
    }
}
