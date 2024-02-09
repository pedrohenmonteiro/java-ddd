package com.pedromonteiro.javaddd.domain.valueObjects;

public class Address {
    
    private String street;
    private int number;
    private String zipcode;
    private String city;


    public Address(String street, int number, String zipcode, String city) {
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
        this.validate();
    }


    private void validate() {
        if (this.street.length() == 0) throw new Error("Street is required");
        if (this.city.length() == 0) throw new Error("City is required");
        if (this.zipcode.length() == 0) throw new Error("Zipcode is required");
        if (this.number == 0) throw new Error("Number is required");
        
    }
    
    
}
