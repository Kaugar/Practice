package com.greenfoxacademy.warehouse.repositories;

import com.greenfoxacademy.warehouse.models.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepo extends CrudRepository<Warehouse, Long> {

  @Query ("select distinct c.itemName from Warehouse c")
  List<String> findDistinctByItemName();

  @Query("select distinct c.size from Warehouse c")
  List<String> findDistinctBySize();

  List<Warehouse> findByItemNameAndSize(String name, String size);

  List<Warehouse> findByUnitPriceGreaterThan(Float price);
  List<Warehouse> findByUnitPriceIs(Float price);
  List<Warehouse> findByUnitPriceLessThan(Float price);

}
