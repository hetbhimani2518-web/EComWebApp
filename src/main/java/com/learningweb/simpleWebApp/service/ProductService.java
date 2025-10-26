package com.learningweb.simpleWebApp.service;

import com.learningweb.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> product = Arrays.asList(
            new Product(101 , "Iphone" , 90000),
            new Product(102 , "OnePlus" , 50000),
            new Product(103 , "Asus Laptop" , 80000)) ;

    public List<Product> getProducts(){
        return product;
    }


    public Product getProductById(int prodId) {
        return null;
    }
}
