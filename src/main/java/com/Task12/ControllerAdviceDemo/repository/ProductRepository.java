package com.Task12.ControllerAdviceDemo.repository;


import com.Task12.ControllerAdviceDemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findById(int id);

}
