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

import java.util.List;

/**
 * handler for User info and credentials
 */
public interface UserManager extends XMLPresentable<UserManager> {
  /**
   * get the users
   * @return
   */
  public List<User> getUsers();

  /**
   * add the given user
   * @param user
   */
  public void add(User user);
  
  /**
   * get a user by the given id
   * @param id
   * @return the user
   */
  public User getById(String id);
  
  /**
   * return the Crypt interface for this manager
   * @return
   */
  public Crypt getCrypt();
  
}
