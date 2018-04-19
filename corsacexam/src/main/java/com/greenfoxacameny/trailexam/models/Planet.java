package com.greenfoxacameny.trailexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planet {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private long population;

  public Planet(String name, int population) {
    this.name = name;
    this.population = population;
  }

  public Planet() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public void increasePopulation(long passengers){
    this.population += passengers;
  }

  public void decreasePopulation(long passengers){
    this.population -= passengers;
  }
}
