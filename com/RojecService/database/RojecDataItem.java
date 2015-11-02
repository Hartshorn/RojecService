package com.RojecService.database;


public class RojecDataItem {

  private Integer id;
  private String name;
  private String city;
  private String state;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  @Override
  public String toString() {
    return this.id + ","
          + this.name + ","
          + this.city + ","
          + this.state;
  }
}
