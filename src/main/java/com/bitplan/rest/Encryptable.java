/**
 * Copyright (C) 2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.rest;

import javax.xml.bind.annotation.XmlTransient;

/**
 * i am encryptable using the given Crypt interface 
 * @author wf
 */
@XmlTransient
public interface Encryptable {
  /**
   * security measure
   * @param crypt
   */
  public void encrypt(Crypt crypt);
  
  /**
   * decrypt me with the given crypt interface
   * @param crypt
   */
  public void deCrypt(Crypt crypt);
}
