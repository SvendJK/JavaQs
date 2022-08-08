package com.qa.ClassMembers;

public class MainStatic {
    public static void mainStatic(String[] args) {
        System.out.println(CustomerStatic.getNumberOfPeople());   // output: 0    No objects instantiated

        CustomerStatic firstCustomer = new CustomerStatic("Arnold","Rimmer");
        CustomerStatic secondCustomer = new CustomerStatic("David","Lister");

        System.out.println(firstCustomer.getFirstName());   // output: Arnold
        System.out.println(secondCustomer.getFirstName());  // output: David

        System.out.println(firstCustomer.getNumberOfPeople());  // output: 2
        System.out.println(secondCustomer.getNumberOfPeople()); // output: 2
        System.out.println(CustomerStatic.getNumberOfPeople());       // output: 2
    }
}