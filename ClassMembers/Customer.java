package com.qa.ClassMembers;

public class Customer {
    private String firstName;
    private String surname;

    public Customer(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
    }
}