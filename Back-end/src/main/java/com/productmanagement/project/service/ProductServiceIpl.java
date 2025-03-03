package com.productmanagement.project.service;

import com.productmanagement.project.model.Product;
import com.productmanagement.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceIpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    public ProductServiceIpl() {
        super();
    }


    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productRepo.findById(id).get();
        if(product != null){
            productRepo.delete(product);
            return "Product Delete Sucessfully";
        }
        return  "Somthening on server";

    }
}
