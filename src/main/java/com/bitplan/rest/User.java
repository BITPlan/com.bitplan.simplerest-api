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

import java.security.Principal;

/**
 * general user interface
 * @author wf
 *
 */
public interface User extends XMLPresentable<User>, Principal{
  
  /**
   * @return the id
   */
  public abstract String getId();

  /**
   * @param id the id to set
   */
  public abstract void setId(String id);
  
  /**
   * @return the name
   */
  public abstract String getName();

  /**
   * @param name the name to set
   */
  public abstract void setName(String name);

  /**
   * @return the firstname
   */
  public abstract String getFirstname();

  /**
   * @param firstname the firstname to set
   */
  public abstract void setFirstname(String firstname);

  /**
   * @return the email
   */
  public abstract String getEmail();

  /**
   * @param email the email to set
   */
  public abstract void setEmail(String email);

  /**
   * @return the encrypted password
   */
  public abstract String getPassword();

  /**
   * @param password the encrypted password to set
   */
  public abstract void setPassword(String password);

  /**
   * @return the comment
   */
  public abstract String getComment();

  /**
   * @param comment the comment to set
   */
  public abstract void setComment(String comment);
  
  /**
   * @return the role
   */
  public String getRole();

  /**
   * @param role the role to set
   */
  public void setRole(String role);
   
}
