package com.galvanize;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getZip() {
        return this.zip;
    }

    @Override
    public String toString(){
        String result = String.format("%s, %s, %s %s", this.street, this.city, this.state, this.zip);
        return  result;
    }
}
