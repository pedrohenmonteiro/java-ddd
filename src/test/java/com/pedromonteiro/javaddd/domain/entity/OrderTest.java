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
   assertEquals("Id is required", error.getMessage());
    
}

@Test
void mustThrowError_when_customerIdIsEmpty() {
   var error = assertThrows(Error.class, () -> new Order("123", "", new ArrayList<>()));
    assertEquals("customerId is required", error.getMessage());
    
}

@Test
void mustThrowError_when_itemsListIsEmpty() {
   var error = assertThrows(Error.class, () -> new Order("123", "321", new ArrayList<>()));
     assertEquals("Items are required", error.getMessage());
   
}

@Test
void mustCalculateTotal() {
    var item = new OrderItem("123", "p1", "item1", 100.0, 2);
    var item2 = new OrderItem("123", "p2", "item2", 200.0, 2);

    var order = new Order("o1", "c1", new ArrayList<>(Arrays.asList(item)));

    assertEquals(200.0, order.total());

    var order2 = new Order("o2", "c1", new ArrayList<>(Arrays.asList(item,item2)));

    assertEquals(600.0, order2.total());

 }

@Test
void mustThrowError_when_itemQtdIsntGreaterThanZero() {
    
    var item = new OrderItem("123", "p1", "item1", 100.0, 0);
    
    var error = assertThrows(Error.class, () -> new Order("o1", "c1", new ArrayList<>(Arrays.asList(item))));
     assertEquals("Quantity must be greater than zero", error.getMessage());
  
}

}