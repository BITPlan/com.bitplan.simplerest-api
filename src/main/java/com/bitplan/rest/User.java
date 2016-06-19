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
