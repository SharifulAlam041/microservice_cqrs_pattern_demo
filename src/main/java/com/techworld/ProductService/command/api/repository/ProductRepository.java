package com.techworld.ProductService.command.api.repository;

import com.techworld.ProductService.command.api.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

}
