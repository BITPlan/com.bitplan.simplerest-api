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

/**
 * Rest Server Interface (without Guice)
 * 
 * @author wf
 *
 */
public interface RestServer {

  /**
   * set the Guice Module to be used for dependency injection
   * 
   * @param pGuiceModule
   */
  public abstract Object getStarter();

  public abstract void setStarter(Object starter);

  /**
   * @return the settings
   */
  public abstract RestServerSettings getSettings();

  /**
   * @param settings
   *          the settings to set
   */
  public abstract void setSettings(RestServerSettings settings);

  /**
   * stop
   */
  public abstract void stop();

  /**
   * get the base url
   * 
   * @return
   */
  public abstract String getUrl();

  /**
   * start the WebServer
   * 
   * @see http
   *      ://jersey.576304.n2.nabble.com/Embedded-Grizzly-with-MVC-templates
   *      -td4189027.html for SSL security
   * 
   * @throws Exception
   */
  public abstract void startWebServer() throws Exception;

  /**
   * run the server thread
   */
  public abstract void run();

  /**
   * start server in separate thread
   * 
   * @param args
   */
  public RestServer startServer(String[] args);

  /**
   * check whether the given port is available
   * 
   * @param port
   * @return
   */
  public boolean isPortAvailable(int port);

  /**
   * create the Server
   * @throws Exception 
   */
  public void createServer() throws Exception;
  
  /**
   * if there was any exception get it
   * @return
   */
  public Throwable getException();
}