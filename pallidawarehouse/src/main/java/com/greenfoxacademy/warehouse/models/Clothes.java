package com.greenfoxacademy.warehouse.models;

import java.util.List;

public class Clothes {

  private String status;
  private List<Warehouse> clothes;

  public Clothes(String status, List<Warehouse> clothes) {
    this.status = status;
    this.clothes = clothes;
  }

  public Clothes() {
  }

  public Clothes(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<Warehouse> getClothes() {
    return clothes;
  }

  public void setClothes(List<Warehouse> clothes) {
    this.clothes = clothes;
  }
}
