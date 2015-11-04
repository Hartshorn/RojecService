package com.rojecservice.dto;

import com.rojecservice.database.RojecDataItem;


public class Option {

  private Integer choice;
  private Integer id;
  private String message;
  private String name;
  private String city;
  private String state;
  private RojecDataItem rojecDataItem;


  public Option() {}

  public Option(Integer choice) {
    this.choice = choice;
  }

  public Option(Integer choice,
                Integer id) {
    this.choice = choice;
    this.id = id;
  }

  public Option(Integer choice,
                String message,
                String name,
                String city,
                String state) {
    this.choice = choice;
    this.message = message;
    this.name = name;
    this.city = city;
    this.state = state;
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

  public RojecDataItem getRojecDataItem() {
    return this.rojecDataItem;
  }

  public void setRojecDataItem(RojecDataItem rdi) {
    this.rojecDataItem = rdi;
  }
}
