package com.pedromonteiro.javaddd.domain.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.pedromonteiro.javaddd.domain.valueObjects.Address;

public class CustomerTest {
    
@Test
void mustThrowError_when_idIsEmpty() {
    assertThrows(Error.class, () -> new Customer("", "John"));
    
}


void mustThrowError_when_NameisEmpty() {
    assertThrows(Error.class, () -> new Customer("33", ""));
}

void mustThrowError_when_AddressIsUndefined() {
    assertThrows(Error.class, () -> new Customer("33", "John"));
}


void mustChangeName() {
    var customer = new Customer("123", "John");
    customer.changeName("Peter");

    assertEquals(customer.getName(), "Peter");
}


void mustActivateCustomer() {
    var customer = new Customer("123", "Pedro");
    var address = new Address("rua", 1, "939934-93", "São Paulo");
    customer.setAddress(address);

    customer.active();

    assertEquals(customer.isActive(), true);
}

void mustDeactivateCustomer() {
    var customer = new Customer("123", "Pedro");

    customer.deactive();
    assertEquals(customer.isActive(), false);
}



}