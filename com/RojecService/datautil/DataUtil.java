package com.RojecService.datautil;

import com.RojecService.dto.Request;

public interface DataUtil {

  Boolean createDataItem(Request request);
  Boolean readDataItem(Request request);
  Boolean updateDataItem(Request request);
  Boolean deleteDataItem(Request request);
}
