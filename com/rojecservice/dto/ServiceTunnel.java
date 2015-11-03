package com.rojecservice.dto;


import java.util.List;


public class ServiceTunnel implements CommunicationProtocol {

  private Integer choice;
  private String message;
  private String name;
  private String city;
  private String state;
  private Integer id;
  private List<String> errors;



  @Override
  public List<String> getErrors() {
    return this.errors;
  }

  public Integer getChoice() {
    return this.choice;
  }

  public void setChoice(Integer choice) {
    this.choice = choice;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
