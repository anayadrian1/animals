package edu.cnm.deepdive.animals.model;

import com.google.gson.annotations.Expose;

public class ApiKey {

  @Expose
  public String message;

  @Expose
  public String key;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
