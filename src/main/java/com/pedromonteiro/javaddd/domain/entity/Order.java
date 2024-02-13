package com.pedromonteiro.javaddd.domain.entity;

import java.util.ArrayList;
import java.util.List;

//Aggregate root

public class Order {
    
    private String id;
    private String customerId;
    private Double total;
    private List<OrderItem> items = new ArrayList<>();


    public Order(String id, String customerId, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.items = items;
        this.total = this.total();
        this.validate();
    }


    public Double total() {
        var count = 0.0;
        for (var item : this.items) {
            count += item.getPrice();
        }
        return count;
    }

    private boolean validate() {
        if (this.id.length() == 0) throw new Error("Id is required");
        if (this.customerId.length() == 0) throw new Error("customerId is required");
        if (this.getItems().isEmpty()) throw new Error("Items are required");
        if (this.items.stream().anyMatch(item -> item.getQuantity() <= 0)) throw new Error("Quantity must be greater than zero");
        return true;
    }

    public String getId() {
        return id;
    }


    public String getCustomerId() {
        return customerId;
    }


    public Double getTotal() {
        return total;
    }


    public List<OrderItem> getItems() {
        return items;
    }

    
} 