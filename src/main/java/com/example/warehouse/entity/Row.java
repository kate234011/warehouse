package com.example.warehouse.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Row")
public class Row {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "name")
  String name;

  @ManyToOne
  @JoinColumn(name = "warehouse_id")
  Warehouse warehouse;

  @OneToMany(mappedBy = "row", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  List<Shelf> shelfs = new ArrayList<>();

}
