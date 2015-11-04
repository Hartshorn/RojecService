package com.rojecservice.datautil;

import com.rojecservice.dto.Request;
import com.rojecservice.dto.ServiceTunnel;

public interface DataUtil {

  Boolean createDataItem(Request request);
  Boolean readDataItem(ServiceTunnel tunnel);
  Boolean updateDataItem(Request request);
  Boolean deleteDataItem(Request request);
}
