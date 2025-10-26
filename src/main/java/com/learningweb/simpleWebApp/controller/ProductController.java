package com.learningweb.simpleWebApp.controller;

import com.learningweb.simpleWebApp.model.Product;
import com.learningweb.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    public Product getProductById(int prodId){
        return service.getProductById(prodId);
    }

}
