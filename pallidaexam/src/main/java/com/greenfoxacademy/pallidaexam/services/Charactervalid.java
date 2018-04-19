package com.greenfoxacademy.pallidaexam.services;

import org.springframework.stereotype.Service;

@Service
public class Charactervalid {

  public boolean validateSearch(String search) {
    return search.matches("^[-a-zA-Z0-9._]+");
  }
}
