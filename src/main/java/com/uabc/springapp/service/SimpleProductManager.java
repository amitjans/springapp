/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.springapp.service;

import com.uabc.springapp.domain.Product;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID = 1L;

    private List<Product> products;

    @Override
    public List<Product> getProducts() {
        return products; 
    }

    @Override
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }  
    }
	
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
