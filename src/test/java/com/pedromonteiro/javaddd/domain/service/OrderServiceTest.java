package com.pedromonteiro.javaddd.domain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.pedromonteiro.javaddd.domain.entity.Customer;
import com.pedromonteiro.javaddd.domain.entity.Order;
import com.pedromonteiro.javaddd.domain.entity.OrderItem;

public class OrderServiceTest {

    @Test
    void mustPlaceAnOrder() {
        var customer = new Customer("c1", "Customer 1");
        var item1 = new OrderItem("i1", "p1", "Item 1", 10.0, 1);

        var order = OrderService.placeOrder(customer, new ArrayList<>(Arrays.asList(item1)));

        assertEquals(5, customer.getRewardsPoints());
        assertEquals(10, order.total());
    }
    
    @Test
    void mustCountTotalOfOrders() {
        var item = new OrderItem("i1", "p1", "Item 1", 100.0, 1);
        var item2 = new OrderItem("i2", "p2", "Item 2", 200.0, 2);

        var order = new Order("o1", "c1", new ArrayList<>(Arrays.asList(item)));
        var order2 = new Order("o2", "c2", new ArrayList<>(Arrays.asList(item2)));

        var total = OrderService.total(new ArrayList<>(Arrays.asList(order, order2)));

        assertEquals(500, total);
    }
}
