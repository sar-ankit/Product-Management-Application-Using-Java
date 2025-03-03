package com.productmanagement.project.service;

import com.productmanagement.project.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    public  Product getProductById(Integer id);
    public  String  deleteProduct(Integer id);
}
