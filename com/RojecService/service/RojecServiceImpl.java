package com.RojecService.service;

import com.RojecService.datautil.RojecDataUtil;

import javax.jws.WebService;

@WebService(endpointInterface="com.RojecService.service.RojecService")
public class RojecServiceImpl implements RojecService {

  private static RojecDataUtil util = new RojecDataUtil();

  @Override
  public void showAllDataItems() {
    util.showAllDataItems();
  }

}
