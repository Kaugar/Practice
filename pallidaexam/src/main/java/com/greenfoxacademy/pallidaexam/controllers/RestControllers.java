package com.greenfoxacademy.pallidaexam.controllers;

import com.greenfoxacademy.pallidaexam.models.Data;
import com.greenfoxacademy.pallidaexam.repositories.LicencePlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllers {
  @Autowired
  LicencePlateRepo licencePlateRepo;

  @GetMapping (value = "api/search/{brand}")
  public Data brandapi(@PathVariable (value = "brand") String brand){
    if(licencePlateRepo.findByCarBrand(brand).size() == 0){
      return new Data("error");
    }else {
      return new Data(licencePlateRepo.findByCarBrand(brand), "ok");
    }
  }
}
