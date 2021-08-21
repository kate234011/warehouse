package com.example.warehouse.dto;

import com.example.warehouse.entity.Place;
import com.example.warehouse.entity.Product;
import com.example.warehouse.entity.Shelf;
import com.example.warehouse.entity.Warehouse;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseTransactionDto {

  private Long id;

  private Product product;

  private Warehouse warehouse;

  private Shelf shelf;

  private Place place;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDate arrivalDate;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDate disposalDate;
}
