package com.example.warehouse.repository;


import com.example.warehouse.entity.Row;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RowRepository extends JpaRepository<Row, Long> {

}
