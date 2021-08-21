package com.example.warehouse.entity;

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
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "WarehouseTransaction")
public class WarehouseTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "product_id")
  Product product;

  @ManyToOne
  @JoinColumn(name = "warehouse_id")
  Warehouse warehouse;

  @ManyToOne
  @JoinColumn(name = "shelf_id")
  Shelf shelf;

  @OneToOne
  @JoinColumn(name = "place_id")
  Place place;

  @Column(name = "arrival_date")
  LocalDate arrivalDate;

  @Column(name = "disposal_date")
  LocalDate disposalDate;
}
