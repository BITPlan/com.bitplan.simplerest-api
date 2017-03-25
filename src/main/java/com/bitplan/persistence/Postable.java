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
package com.bitplan.persistence;

import java.util.Map;

import com.bitplan.datatypes.TypeConverter;

/**
 * support posting the given type via a Web Interface by 
 * transferring the content to an from a key/value map
 * @author wf
 *
 * @param <T>
 */
public interface Postable<T> {
  /***
   * set my values from the given map -e.g. from the Form Parameters of a Web post action
   * @param map
   */
  public void fromMap(Map<String,String> map);
  
  /**
   * return my values as string map e.g. to put them as key/value pairs into a property file
   * @return the map
   */
  public Map<String,String> asMap();
  
  /**
   * set the type convert to be used e.g. to decide how string and null values are displayed
   * @param typeConverter
   */
  public void setTypeConverter(TypeConverter typeConverter);  
  
  /**
   * get the type converter in used e.g. the default type converter which uses ISO dates
   * and displays null values as empty strings
   * @return
   */
  public TypeConverter getTypeConverter();
}
