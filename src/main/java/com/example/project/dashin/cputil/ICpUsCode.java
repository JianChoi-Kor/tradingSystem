package com.example.project.dashin.cputil;

import com4j.*;

/**
 * ICpUsCode �������̽�
 */
@IID("{E1698433-8C49-4075-BDF8-0C0A23C61A2A}")
public interface ICpUsCode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method GetUsCodeList
   * </p>
   * @param ustype Mandatory USTYPE parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  Object getUsCodeList(
    USTYPE ustype);


  /**
   * <p>
   * method GetNameByUsCode
   * </p>
   * @param bstrUsCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String getNameByUsCode(
    String bstrUsCode);


  // Properties:
}
