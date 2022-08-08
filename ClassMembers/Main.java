package com.qa.ClassMembers;

public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Arnold","Rimmer");
        Customer secondCustomer = new Customer("David","Lister");

        firstCustomer.setFirstName("Arnold J.");
        secondCustomer.setFirstName("Dave");

        System.out.println(firstCustomer.getFirstName());   // output: Arnold J.
        System.out.println(secondCustomer.getFirstName());  // output: Dave
    }
}
