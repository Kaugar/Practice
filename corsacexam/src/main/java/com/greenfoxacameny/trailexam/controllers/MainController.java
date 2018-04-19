package com.greenfoxacameny.trailexam.controllers;

import com.greenfoxacameny.trailexam.models.Spaceship;
import com.greenfoxacameny.trailexam.repositories.PlanetRepository;
import com.greenfoxacameny.trailexam.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  @Autowired
  PlanetRepository planetRepository;
  @Autowired
  SpaceshipRepository spaceshipRepository;

  @GetMapping (value = "/")
  public String planets(Model model) {
    model.addAttribute("planets", planetRepository.findAll());
    model.addAttribute("spaceship", spaceshipRepository.findById(1l));
    return "index";
  }
  @GetMapping (value = "/movehere/{id}")
  public String moveSpaceship(@PathVariable(value = "id") Long id) {
    String planetName = planetRepository.findById(id).get().getName();
    String spaceShipPlanet = spaceshipRepository.findById(1l).get().getPlanet();

    if (!spaceShipPlanet.equals(planetName)){
      spaceshipRepository.findById(1l).get().setPlanet(planetName);
      spaceshipRepository.save(spaceshipRepository.findById(1l).get());
    }
    return "redirect:/";
  }
  @GetMapping (value = "/toship/{id}")
  public String fillShip(@PathVariable(value = "id") Long id) {
    long populationOfPlanet = planetRepository.findById(id).get().getPopulation();
    int remainingPlaceOnTheSpaceship = spaceshipRepository.findById(1l).get().getMax_capacity() - spaceshipRepository.findById(1l).get().getUtilization();
    int maxCapacityOfShip = spaceshipRepository.findById(1l).get().getMax_capacity();
    if (maxCapacityOfShip > populationOfPlanet){
      spaceshipRepository.findById(1l).get().increaseUtilization(populationOfPlanet);
      planetRepository.findById(id).get().decreasePopulation(populationOfPlanet);
    } else if (remainingPlaceOnTheSpaceship > 0 && populationOfPlanet > 0){
      spaceshipRepository.findById(1l).get().increaseUtilization(remainingPlaceOnTheSpaceship);
      planetRepository.findById(id).get().decreasePopulation(remainingPlaceOnTheSpaceship);
    }
    planetRepository.save(planetRepository.findById(id).get());
    spaceshipRepository.save(spaceshipRepository.findById(1l).get());

    return "redirect:/";
  }

  @GetMapping (value = "/toplanet/{id}")
  public String fillPlanet(@PathVariable(value = "id") Long id) {
    if (spaceshipRepository.findById(1l).get().getUtilization() > 0){
      planetRepository.findById(id).get().increasePopulation(spaceshipRepository.findById(1l).get().getUtilization());
      spaceshipRepository.findById(1l).get().emptySpaceship();
    }
    planetRepository.save(planetRepository.findById(id).get());
    spaceshipRepository.save(spaceshipRepository.findById(1l).get());
    return "redirect:/";
  }
}
