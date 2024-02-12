package com.pedromonteiro.javaddd.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class OrderTest {
    
@Test
void mustThrowError_when_idIsEmpty() {
   var error = assertThrows(Error.class, () -> new Order("", "123", new ArrayList<>()));
   assertEquals(error.getMessage(), "Id is required");
    
}

@Test
void mustThrowError_when_customerIdIsEmpty() {
   var error = assertThrows(Error.class, () -> new Order("123", "", new ArrayList<>()));
    assertEquals(error.getMessage(), "customerId is required");
    
}

@Test
void mustThrowError_when_itemsListIsEmpty() {
   var error = assertThrows(Error.class, () -> new Order("123", "321", new ArrayList<>()));
     assertEquals(error.getMessage(), "Items are required");
   
}

@Test
void mustCalculateTotal() {
    var item = new OrderItem("123", "item1", 100.0);
    var item2 = new OrderItem("123", "item2", 200.0);

    var order = new Order("o1", "c1", new ArrayList<>(Arrays.asList(item)));

    assertEquals(order.total(), 100.0);

    var order2 = new Order("o2", "c1", new ArrayList<>(Arrays.asList(item,item2)));

    assertEquals(order2.total(), 300.0);

 }
}