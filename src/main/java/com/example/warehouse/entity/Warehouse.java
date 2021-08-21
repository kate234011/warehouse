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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Warehouse")
public class Warehouse {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "name")
  String name;

  @Column(name = "description")
  String description;

  @Column(name = "address")
  String address;  // todo для теста адрес запишем в строку.
                    // Но по хорошему формирование адреса нужно вынести в отдельный справочник

  @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  List<Row> rows = new ArrayList<>();

}
