package com.greenfoxacademy.pallidaexam.controllers;

import com.greenfoxacademy.pallidaexam.repositories.LicencePlateRepo;
import com.greenfoxacademy.pallidaexam.services.Charactervalid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  LicencePlateRepo licencePlateRepo;
  @Autowired
  Charactervalid charactervalid;

  @GetMapping (value = "/")
  public String index(Model model) {
    model.addAttribute("plates", licencePlateRepo.findAll());
    return "index";
  }
  @GetMapping (value = "/search")
  public String results(Model model, @RequestParam(name = "q", required = false) String query) {
    if (query.equals("police")){
      model.addAttribute("plates", licencePlateRepo.findByPlateStartingWith("RB"));
      return "index";
    } else if (query.equals("diplomat")){
      model.addAttribute("plates", licencePlateRepo.findByPlateStartingWith("DT"));
      return "index";
    } else if(charactervalid.validateSearch(query) && query.length() < 8){
      model.addAttribute("plates", licencePlateRepo.findByPlateIgnoreCaseContaining(query));
      return "index";
    }
    return "errorpage";
  }

  @GetMapping (value = "/search/{brand}")
  public String searchBrand(Model model, @PathVariable(value = "brand") String brand) {
    model.addAttribute("plates", licencePlateRepo.findByCarBrand(brand));
    return "index";
  }
}
