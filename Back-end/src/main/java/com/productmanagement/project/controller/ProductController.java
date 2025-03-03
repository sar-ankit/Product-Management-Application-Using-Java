package com.productmanagement.project.controller;


import com.productmanagement.project.model.Product;
import com.productmanagement.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product)       //@RequestBody is use to convert json formate to java formate
    {
   return  new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);


    }
    @GetMapping("/")
    public ResponseEntity<?> getAllProduct()
    {
        return  new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }
    public  ResponseEntity<?> getProductById(@PathVariable Integer id)
    {
        return  new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);

    }
    @GetMapping("/DeleteProduct/{id}")
    public  ResponseEntity<?> deleteProduct(@PathVariable Integer id)
    {

        return  new ResponseEntity<>( productService.deleteProduct(id), HttpStatus.OK);


    }
    @PostMapping("/editProduct")
    public  ResponseEntity<?> editProduct(@RequestBody Product product)
    {
        return  new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

}

