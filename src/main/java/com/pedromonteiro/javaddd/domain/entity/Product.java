package com.pedromonteiro.javaddd.domain.entity;

public class Product {
    
    private String id;
    private String name;
    private Double price;

    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.validate();
    }

     private boolean validate() {
        if (this.id.length() == 0) throw new Error("Id is required");
        if (this.name.length() == 0) throw new Error("Name is required");
        if (this.price < 0) throw new Error("Price must be greater than zero");
        return true;
    }

    public void changeName(String name) {
        this.name = name;
        this.validate();
    }

    public void changePrice(Double price) {
        this.price = price;
        this.validate();
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    

    
}
