package com.pedromonteiro.javaddd.domain.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.pedromonteiro.javaddd.domain.valueObjects.Address;

public class CustomerTest {
    
@Test
void mustThrowError_when_idIsEmpty() {
    var error = assertThrows(Error.class, () -> new Customer("", "John"));
    assertEquals("Id is required", error.getMessage());
   
}

@Test
void mustThrowError_when_NameisEmpty() {
   var error = assertThrows(Error.class, () -> new Customer("32", ""));
    assertEquals("Name is required", error.getMessage());
   
}

@Test
void mustThrowError_when_ActivateACustomerAndAddressIsNul() {
    var customer = new Customer("123", "John");
   var error = assertThrows(Error.class, () -> customer.active());
   assertEquals("Address is mandatory to activate a customer", error.getMessage());
   
}

@Test
void mustChangeName() {
    var customer = new Customer("123", "John");
    customer.changeName("Peter");

    assertEquals("Peter", customer.getName());
}


@Test
void mustActivateCustomer() {
    var customer = new Customer("123", "Pedro");
    var address = new Address("rua", 1, "939934-93", "São Paulo");
    customer.setAddress(address);

    customer.active();

    assertEquals(true, customer.isActive());
}

@Test
void mustDeactivateCustomer() {
    var customer = new Customer("123", "Pedro");

    customer.deactive();
    assertEquals(false, customer.isActive());
}



}