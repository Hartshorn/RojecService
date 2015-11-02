package com.RojecService.dto;

import java.util.List;
import java.util.ArrayList;


public class Request {

  private Integer id;
  private List<String> errors = new ArrayList<>();
  private Option option;


  public Integer getId() {
    return this.id;
  }

  public List<String> getErrors() {
    return this.errors;
  }

  public boolean addError(String error) {
    return this.errors.add(error);
  }

  public Option getOption() {
    return this.option;
  }

  public void setOption(Option option) {
    this.option = option;
  }
}
