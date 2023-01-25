package com.marketplace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
