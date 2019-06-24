package com.mmk.common.web;

import java.util.HashMap;
import java.util.Map;

public class ResultData implements java.io.Serializable {

  /**
   * 默认生成的序列号
   */
  private static final long serialVersionUID = 1L;
  /**
   * 是否成功
   */
  private boolean success = false;



  /**
   * 更复杂的业务状态码，根据业务需要进行定义
   */
  private String statusCode;

  /**
   * 业务或者操作信息信息
   */
  private String msg = "";



  private Map<String, Object> data = new HashMap<>(32);

  public ResultData() {}

  public ResultData(boolean success, String msg) {
    this.success = success;
    this.msg = msg;
  }

  public ResultData(boolean success, String msg, Map<String, Object> data) {
    this.success = success;
    this.msg = msg;
    this.data = data;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  public void addData(String key, Object value) {
    this.data.put(key, value);
  }

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

}