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
package com.bitplan.jaxb;

import javax.xml.bind.JAXBException;

/**
 * generic Jaxb persistence interface converts T instances to xml or json
 * @author wf
 *
 */
public interface JaxbPersistenceApi<T> {
	/**
	 * get my factory
	 * @return the factory for T instances
	 */
	public JaxbFactoryApi<T> getFactory();
	
	/**
	 * convert me to json format
	 * @return - a json representation of me
	 * @throws JAXBException
	 */
	public String asJson() throws JAXBException;
	
	/**
	 * convert me to xml format
	 * @return - an xml representation of me
	 * @throws JAXBException
	 */
	public String asXML() throws JAXBException;
}
