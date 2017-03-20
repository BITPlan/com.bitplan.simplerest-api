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
package com.bitplan.rest;

import java.io.File;
import java.util.Map;


/**
 * settings for a Rest Server
 * @author wf
 *
 */
public interface RestServerSettings {

	/**
	 * @return the host
	 */
	public abstract String getHost();

	/**
	 * @param host the host to set
	 */
	public abstract void setHost(String host);

	/**
	 * @return the port
	 */
	public abstract int getPort();

	/**
	 * @param port the port to set
	 */
	public abstract void setPort(int port);
	
	/**
	 * @return the debug
	 */
	public boolean isDebug();

	/**
	 * @param debug the debug to set
	 */
	public void setDebug(boolean debug);
	
	/**
	 * getter for SSL usage
	 * @return true if https / SSL is used
	 */
	public boolean isSecure();
	
	/**
	 * set https / SSL usage
	 * @param pSecure true if SSL should be forced
	 */
	public void setSecure(boolean pSecure);

	/**
	 * @return the wantClientAuth
	 */
	public boolean isWantClientAuth();

	/**
	 * @param wantClientAuth the wantClientAuth to set
	 */
	public void setWantClientAuth(boolean wantClientAuth);

	/**
	 * @return the needClientAuth
	 */
	public boolean isNeedClientAuth();
	
	/**
	 * @param needClientAuth the needClientAuth to set
	 */
	public void setNeedClientAuth(boolean needClientAuth);
	
	/**
	 * @return the timeOut
	 */
	public abstract long getTimeOut();

	/**
	 * @param timeOut the timeOut to set
	 */
	public abstract void setTimeOut(long timeOut);
	
	 /**
   * @return the options
   */
  public String getOptions();
  
  /**
   * @param options the options to set
   */
  public void setOptions(String options);

	public abstract String getPackages();

	public abstract void setPackages(String packages);
	
	/**
	 * get the context Path
	 * @return the context path
	 */
	public String getContextPath();
	
	/**
	 * set the context path
	 * @param contextPath
	 * e.g. 
	 * /app - this will be preprended to all url'path 
	 * so /app/entity will call the path /entity 
	 */
	public void setContextPath(String contextPath);

	/**
	 * parse Command line arguments
	 * 
	 * @param args
	 */
	public abstract void parseArguments(String[] args);

	String[] getContainerRequestFilters();

	void setContainerRequestFilters(String[] containerRequestFilters);
	
	/**
	 * @return the persistence property file name
	 */
	public String getPersistencePropertyFileName();

	/**
	 * @param pName the persistence property file name to set
	 */
	public void setPersistencePropertyFileName(String pName);

	/**
	 * add a class path handler
   * @param documentRoot
	 * @param classpathPath
	 * @throws Exception 
	 */
	public abstract void addClassPathHandler(String documentRoot,String classpathPath) throws Exception;
	
	/**
	 * get the ClassPath Handlers
	 * @return
	 */
	public Map<String,String> getClassPathHandlers();

	/**
	 * read me from an XML File
	 * @param file
	 * @throws Exception
	 */
	public void fromXMLFile(File file) throws Exception;
	
	/**
	 * set a userManager - this will activate Basic Authentication
	 * @param userManager
	 */
	public void setUserManager(UserManager userManager);
	
	/**
	 * get the UserManager - if it is non null Basic Authentication is active
	 * @return the userManager
	 */
	public UserManager getUserManager();
}