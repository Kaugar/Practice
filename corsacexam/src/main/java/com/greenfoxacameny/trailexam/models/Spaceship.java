package com.greenfoxacameny.trailexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int max_capacity;
  private String planet;
  private int utilization;

  public Spaceship(int max_capacity, String planet, int utilization) {
    this.max_capacity = max_capacity;
    this.planet = planet;
    this.utilization = utilization;
  }

  public Spaceship() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getMax_capacity() {
    return max_capacity;
  }

  public void setMax_capacity(int max_capacity) {
    this.max_capacity = max_capacity;
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
  }

  public int getUtilization() {
    return utilization;
  }

  public void setUtilization(int utilization) {
    this.utilization = utilization;
  }

  public void emptySpaceship() {
    this.utilization = 0;
  }

  public void increaseUtilization(long passengers) {
    this.utilization += passengers;
  }
}
