package com.pedromonteiro.javaddd.domain.entity;

import java.math.BigInteger;

public class OrderItem {
   
    private String id;
    private String name;
    private Double price;
    
    public OrderItem(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    
}
