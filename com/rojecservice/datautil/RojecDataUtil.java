package com.rojecservice.datautil;

import com.rojecservice.database.RojecDatabase;
import com.rojecservice.database.RojecDataItem;
import com.rojecservice.dto.ServiceTunnel;
import com.rojecservice.dto.Request;
import com.rojecservice.dto.Option;



public class RojecDataUtil implements DataUtil {

  private static RojecDatabase db = new RojecDatabase();

  @Override
  public Boolean createDataItem(Request request) {

    //TODO: add logging for this
    // System.out.println(request.getOption().getMessage());
    // db.processRequest(request);
    return true;
  }

  @Override
  public Boolean readDataItem(ServiceTunnel tunnel) {

    db.processRequest(tunnel);

    return true;
  }

  @Override
  public Boolean updateDataItem(Request request) {
    return true;
  }

  @Override
  public Boolean deleteDataItem(Request request) {
    // return db.processRequest(request);
    return true;
  }

  public Boolean showAllDataItems(Request request) {
    // return db.processRequest(request);
    return true;
  }
}
