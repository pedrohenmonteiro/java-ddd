package com.pedromonteiro.javaddd.domain.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductTest {
    
@Test
void mustThrowError_when_idIsEmpty() {
    var error = assertThrows(Error.class, () -> new Product("", "Product 1", 100.0));
    assertEquals(error.getMessage(), "Id is required");
   
}

@Test
void mustThrowError_when_nameIsEmpty() {
    var error = assertThrows(Error.class, () -> new Product("123", "", 100.0));
    assertEquals(error.getMessage(), "Name is required");
}

@Test
void mustThrowError_when_priceIsLessThanZero() {
    var error = assertThrows(Error.class, () -> new Product("123", "Product 1", -0.1));
    assertEquals(error.getMessage(), "Price must be greater than zero");
}


@Test
void mustChangeName() {
    var product = new Product("123", "Product 1", 10.1);    
    product.changeName("Product 2");
    assertEquals(product.getName(), "Product 2");

}

@Test
void mustChangePrice() {
    var product = new Product("123", "Product 1", 10.1);    
    product.changePrice(20.0);
    assertEquals(product.getPrice(), 20.0);

}


}

