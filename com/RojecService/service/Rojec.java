package com.RojecService.service;

import javax.xml.ws.Endpoint;

public class Rojec {
  public static void main(String ... args) {
    Endpoint.publish("http://localhost:8888/rojec", new RojecServiceImpl());
  }
}
