package com.example.warehouse.repository;

import com.example.warehouse.entity.Product;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  Optional<Product> findByCode(String code);
}
