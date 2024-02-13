package com.pedromonteiro.javaddd.domain.entity;

public class OrderItem {
   
    private String id;
    private String productId;
    private String name;
    private Double price;
    private Integer quantity;

    

    public OrderItem(String id, String productId, String name, Double price, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }



    public String getId() {
        return id;
    }



    public String getProductId() {
        return productId;
    }



    public String getName() {
        return name;
    }



    public Double getPrice() {
        return this.price * this.quantity;
    }



    public Integer getQuantity() {
        return quantity;
    }

      
}
