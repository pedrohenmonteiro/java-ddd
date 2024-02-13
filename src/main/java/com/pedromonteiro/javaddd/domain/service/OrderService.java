package com.pedromonteiro.javaddd.domain.service;

import java.util.List;

import com.pedromonteiro.javaddd.domain.entity.Order;

public class OrderService {
    
    public static Double total(List<Order> orders) {
        var total = 0.0;
        for(var order : orders) {
            total += order.getTotal(); 
        }
        return total;
    }
}
