package com.pedromonteiro.javaddd.domain.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.pedromonteiro.javaddd.domain.valueObjects.Address;

public class CustomerTest {
    
@Test
void mustThrowError_when_idIsEmpty() {
    var error = assertThrows(Error.class, () -> new Customer("", "John"));
    assertEquals(error.getMessage(), "Id is required");
   
}

@Test
void mustThrowError_when_NameisEmpty() {
   var error = assertThrows(Error.class, () -> new Customer("32", ""));
    assertEquals(error.getMessage(), "Name is required");
   
}

@Test
void mustThrowError_when_ActivateACustomerAndAddressIsNul() {
    var customer = new Customer("123", "John");
   var error = assertThrows(Error.class, () -> customer.active());
   assertEquals(error.getMessage(), "Address is mandatory to activate a customer");
   
}

@Test
void mustChangeName() {
    var customer = new Customer("123", "John");
    customer.changeName("Peter");

    assertEquals(customer.getName(), "Peter");
}


@Test
void mustActivateCustomer() {
    var customer = new Customer("123", "Pedro");
    var address = new Address("rua", 1, "939934-93", "São Paulo");
    customer.setAddress(address);

    customer.active();

    assertEquals(customer.isActive(), true);
}

@Test
void mustDeactivateCustomer() {
    var customer = new Customer("123", "Pedro");

    customer.deactive();
    assertEquals(customer.isActive(), false);
}



}