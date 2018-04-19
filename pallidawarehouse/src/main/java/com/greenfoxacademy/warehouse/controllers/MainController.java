package com.greenfoxacademy.warehouse.controllers;

import com.greenfoxacademy.warehouse.repositories.WarehouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  WarehouseRepo warehouseRepo;

  @GetMapping (value = "/warehouse")
  public String homepage(Model model) {
    model.addAttribute("warehouses", warehouseRepo.findAll());
    model.addAttribute("itemnames", warehouseRepo.findDistinctByItemName());
    model.addAttribute("sizes", warehouseRepo.findDistinctBySize());
    return "index";
  }
  @PostMapping (value = "warehouse/summary")
  public String summary(@RequestParam (name = "itemnames")String itemname,
                        @RequestParam(name = "sizes")String size,
                        @RequestParam(name = "amount")int amount, Model model) {
    model.addAttribute("chosen", warehouseRepo.findByItemNameAndSize(itemname,size));
    model.addAttribute("amount", amount);
    return "summary";
  }
}
