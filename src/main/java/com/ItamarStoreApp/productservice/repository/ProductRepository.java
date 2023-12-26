package com.ItamarStoreApp.productservice.repository;

import com.ItamarStoreApp.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
