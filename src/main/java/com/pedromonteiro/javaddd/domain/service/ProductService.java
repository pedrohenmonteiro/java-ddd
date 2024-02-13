package com.pedromonteiro.javaddd.domain.service;

import java.util.List;

import com.pedromonteiro.javaddd.domain.entity.Product;

public class ProductService {
    
    public static List<Product> increasePrice(List<Product> products, int percentage) {
        products.forEach(product -> {
            product.changePrice(product.getPrice() * (percentage / 100 + 1));
        });
        return products;
    }
}
