package com.pedromonteiro.javaddd.domain.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.pedromonteiro.javaddd.domain.entity.Product;

    public class ProductServiceTest {

	@Test
	void mustChangeThePriceOfAllProducts() {
        var p1 = new Product("p1", "Product 1", 10.0);
        var p2 = new Product("p1", "Product 1", 20.0);
		var products = new ArrayList<>(Arrays.asList(p1, p2));

        ProductService.increasePrice(products, 100);
        assertEquals(20.0, p1.getPrice());
        assertEquals(40.0, p2.getPrice());

}

}
