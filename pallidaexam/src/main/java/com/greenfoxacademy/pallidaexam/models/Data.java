package com.greenfoxacademy.pallidaexam.models;


import java.util.List;

public class Data {

  private String result;
  public List<Licence_plates> data;


  public Data(List<Licence_plates> data, String result) {
    this.data = data;
    this.result = result;
  }

  public Data(String result) {
    this.result = result;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Licence_plates> getData() {
    return data;
  }

  public void setData(List<Licence_plates> data) {
    this.data = data;
  }
}
