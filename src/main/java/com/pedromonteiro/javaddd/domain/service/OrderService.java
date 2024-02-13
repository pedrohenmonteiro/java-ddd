package com.pedromonteiro.javaddd.domain.service;

import java.util.List;
import java.util.UUID;

import com.pedromonteiro.javaddd.domain.entity.Customer;
import com.pedromonteiro.javaddd.domain.entity.Order;
import com.pedromonteiro.javaddd.domain.entity.OrderItem;

public class OrderService {

    public static Order placeOrder(Customer customer, List<OrderItem> items) {
        if (items.isEmpty()) throw new Error("Order must have at least one item");

        var order = new Order(UUID.randomUUID().toString(), customer.getId(), items);
        customer.addRewardPoints(order.getTotal() / 2);
        return order;
    }
    
    public static Double total(List<Order> orders) {
        var total = 0.0;
        for(var order : orders) {
            total += order.getTotal(); 
        }
        return total;
    }
}
