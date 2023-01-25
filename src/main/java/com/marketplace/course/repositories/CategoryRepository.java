package com.marketplace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
