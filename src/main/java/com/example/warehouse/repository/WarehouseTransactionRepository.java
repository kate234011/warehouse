package com.example.warehouse.repository;

import com.example.warehouse.entity.WarehouseTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseTransactionRepository extends JpaRepository<WarehouseTransaction, Long> {

}
