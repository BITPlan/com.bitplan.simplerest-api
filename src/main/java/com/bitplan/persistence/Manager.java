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

import java.io.File;
import java.util.List;

import com.bitplan.jaxb.JaxbPersistenceApi;

/**
 * Manager interface based on XML persistence
 * @author wf
 *
 * @param <MT>
 * @param <T>
 */
public interface Manager<MT,T> extends JaxbPersistenceApi<MT> { 
  public String getXmlPath();
  public void setXmlPath(String path);
  public void setXmlFile(File xmlFile);
  public File getXmlFile();
  public void saveAsXML(File xmlFile) throws Exception;
  public void save() throws Exception;
  // sort my elements
  public void sort();
  // get my elements
  public List<T> getElements();
}
