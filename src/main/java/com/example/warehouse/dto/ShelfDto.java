package com.example.warehouse.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShelfDto {

  private Long id;

  private String name;

  private Long row;

  private List<PlaceDto> places = new ArrayList<>();

}
