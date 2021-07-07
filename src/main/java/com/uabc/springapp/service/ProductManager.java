/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.springapp.service;

import com.uabc.springapp.domain.Product;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}
