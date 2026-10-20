package com.deposit.model;

public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private String personalId;

    public Customer(long id, String firstName, String lastname, String personalid){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.personalId = personalid;
    }

    public long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalId() {
        return personalId;
    }
}
