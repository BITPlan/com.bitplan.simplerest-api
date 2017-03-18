/**
 * Copyright (c) 2016-2017 BITPlan GmbH
 *
 * http://www.bitplan.com
 *
 * This file is part of the Opensource project at:
 * https://github.com/BITPlan/com.bitplan.simplerest-api
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bitplan.datatypes;


import java.util.Date;
/**
 * Null Value Handling
 * @author wf
 *
 */
public interface ValueDisplay {
  /**
   * format a timestamp
   * @param ts
   * @return
   */
  public String formatTimeStamp(Date ts) ;
  
  /**
   * return a null Value representation
   * @param value
   * @return
   */
  public String nullValue(Object value);
  
  /**
   * return a String representation from a nullValue representation (replace with null)
   * @param value
   * @return
   */
  String fromNullValue(String value);
  
  /**
   * set the default NullValueRepresentation
   * @param nullValueRepresentation
   * @return
   */
  public void setNullValueRepresentation(String nullValueRepresentation);
  
  /**
   * get the default NullValueRepresentation
   * @return
   */
  public String getNullValueRepresentation();

}
