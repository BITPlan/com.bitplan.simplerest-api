package com.bitplan.rest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public interface Crypt {

  public abstract String encrypt(String property)
      throws GeneralSecurityException, UnsupportedEncodingException;

  public abstract String decrypt(String property)
      throws GeneralSecurityException, IOException;

}