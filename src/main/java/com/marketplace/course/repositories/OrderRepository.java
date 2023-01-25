package com.marketplace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
