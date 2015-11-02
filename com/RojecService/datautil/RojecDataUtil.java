package com.RojecService.datautil;

import com.RojecService.database.RojecDatabase;
import com.RojecService.dto.Request;
import com.RojecService.dto.Option;



public class RojecDataUtil implements DataUtil {

  private static RojecDatabase db = new RojecDatabase();

  @Override
  public Boolean createDataItem(Request request) {
    return true;
  }

  @Override
  public Boolean readDataItem(Request request) {
    return true;
  }

  @Override
  public Boolean updateDataItem(Request request) {
    return true;
  }

  @Override
  public Boolean deleteDataItem(Request request) {
    return true;
  }

  public Boolean showAllDataItems() {
    Request request = new Request();
    request.setOption(new Option(1));

    return db.processRequest(request);
  }
}
