package com.productmanagement.project.repository;

import com.productmanagement.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
