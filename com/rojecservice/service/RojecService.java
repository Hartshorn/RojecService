package com.rojecservice.service;

import com.rojecservice.dto.Request;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface RojecService {


  @WebMethod
  void showAllDataItems();

  @WebMethod
  void addNewItem(Request request);
}
