package com.rojecservice.service;

import com.rojecservice.datautil.RojecDataUtil;
import com.rojecservice.dto.Request;
import com.rojecservice.dto.Option;
import com.rojecservice.constants.Constants;

import javax.jws.WebService;



@WebService(endpointInterface="com.rojecservice.service.RojecService")
public class RojecServiceImpl implements RojecService {

  private static RojecDataUtil util = new RojecDataUtil();

  @Override
  public void showAllDataItems() {
    util.showAllDataItems();
  }

  @Override
  public void addNewItem(Request request) {
    util.createDataItem(request);
  }
}
