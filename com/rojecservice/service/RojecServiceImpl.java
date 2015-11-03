package com.rojecservice.service;

import com.rojecservice.datautil.RojecDataUtil;
import com.rojecservice.dto.ServiceTunnel;
import com.rojecservice.dto.Request;
import com.rojecservice.dto.Option;
import static com.rojecservice.constants.Constants.*;

import javax.jws.WebService;
import java.util.HashMap;



@WebService(endpointInterface=SERVICE_ENDPOINT_INTERFACE)
public class RojecServiceImpl implements RojecService {

  private static RojecDataUtil util = new RojecDataUtil();

  @Override
  public void process(ServiceTunnel tunnel) {


    switch(tunnel.getChoice()) {

      case 1:
        util.createDataItem(new Request(new Option(tunnel.getChoice(),
                                                   tunnel.getMessage(),
                                                   tunnel.getName(),
                                                   tunnel.getCity(),
                                                   tunnel.getState())));
        break;


      // the tunnel should come into here to be set back with return
      // data - the idea is that the flow is both ways.
      // if a channel is open for "addData", the needed fields should
      // be set on the client side, then pulled on the service side, then
      // a return value should be set - design the tunnel with this in mind.
      case 2:
        util.showAllDataItems(new Request(new Option(tunnel.getChoice())));
        break;

      // add fields to the tunnel and option to get what info is needed
      // the used fields will be dependent on the choice

      // case 3:
      //   util.editDataItem(new Request(new Option(tunnel.getChoice())));
      //   break;

      case 4:
        util.deleteDataItem(new Request(new Option(tunnel.getChoice(),
                                                   tunnel.getId())));
        break;

      default:
        break;
    }
  }
}
