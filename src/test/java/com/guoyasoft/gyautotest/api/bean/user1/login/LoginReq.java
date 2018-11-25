package com.guoyasoft.gyautotest.api.bean.user1.login;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 16:31
 **/
public class LoginReq {


  /**
   * pwd : zy123456
   * userName : zy123456
   */

  private String pwd;
  private String userName;

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
