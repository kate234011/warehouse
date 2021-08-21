package com.example.warehouse.controller;

import com.example.warehouse.dto.ProductDto;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("goods")
public interface Controller {

  @GetMapping(value = "getProduct", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation("Получить информацию о товаре на складе")
  @ResponseBody
  ResponseEntity<List<ProductDto>> getProductInfo(@RequestBody String productId);

  @PutMapping(value = "putProduct")
  @ApiOperation("Зарегистрировать покупку товара на складе")
  void addProduct(@RequestBody String product);

  @DeleteMapping(value = "deleteProduct")
  @ApiOperation("Удалить товар со склада")
  void deleteProduct(@RequestBody String productId);

  @PostMapping(value = "updateProduct")
  @ApiOperation("Изменить инфформацию о товаре")
  void updateProductInfo(@RequestBody String productId);

}
