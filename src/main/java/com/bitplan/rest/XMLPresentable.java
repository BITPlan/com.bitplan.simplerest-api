/**
 * Copyright (C) 2011-2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 *
 */

package com.bitplan.rest;


/**
 * XML presentable elements
 * @author wf
 *
 */
public interface XMLPresentable<T> {
	/**
	 * get my XML presentation
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String asXML() throws Exception;
	
}
