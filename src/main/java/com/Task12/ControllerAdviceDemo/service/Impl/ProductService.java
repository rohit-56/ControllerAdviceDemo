package com.Task12.ControllerAdviceDemo.service.Impl;

import com.Task12.ControllerAdviceDemo.CustomExceptions.NoDataFoundException;
import com.Task12.ControllerAdviceDemo.models.Product;
import com.Task12.ControllerAdviceDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> list = productRepository.findAll();
        if (list.size() == 0) {
            throw new NoDataFoundException("No Product Exist");
        }
        return list;
    }

    public Product getById(int id) {
        Product product = null;
        product = productRepository.findById(id);
        return product;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

}
