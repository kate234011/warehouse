package com.example.warehouse.controller;

import com.example.warehouse.dto.ProductDto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WarehouseService implements Controller {

  @Override
  public ResponseEntity<List<ProductDto>> getProductInfo(String productId) {
    return null;
  }

  @Override
  public void addProduct(String product) {

  }

  @Override
  public void deleteProduct(String productId) {

  }

  @Override
  public void updateProductInfo(String productId) {

  }
}
