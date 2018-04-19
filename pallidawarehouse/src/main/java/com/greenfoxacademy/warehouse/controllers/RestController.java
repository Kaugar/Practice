package com.greenfoxacademy.warehouse.controllers;

import com.greenfoxacademy.warehouse.models.Clothes;
import com.greenfoxacademy.warehouse.models.Warehouse;
import com.greenfoxacademy.warehouse.repositories.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  @Autowired
  WarehouseRepo warehouseRepo;

  @GetMapping(value = "/warehouse/query")
  public Clothes json (@RequestParam(value = "price", required = false) float price,
                        @RequestParam(value = "type", required = false) String type) {
    if (type.equals("lower")) {
      return new Clothes("ok", warehouseRepo.findByUnitPriceLessThan(price));
    } else if (type.equals("higher")) {
      return new Clothes("ok", warehouseRepo.findByUnitPriceGreaterThan(price));
    } else if (type.equals("equal")) {
      return new Clothes("ok", warehouseRepo.findByUnitPriceIs(price));
    } else {
      return new Clothes("error");
    }
  }
}
