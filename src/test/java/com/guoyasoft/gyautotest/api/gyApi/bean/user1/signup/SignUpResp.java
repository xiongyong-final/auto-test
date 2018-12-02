package com.guoyasoft.gyautotest.api.gyApi.bean.user1.signup;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 16:34
 **/
public class SignUpResp {


  /**
   * respBase : {"respCode":"0000","respDesc":"注册成功；用户ID:16632"}
   * userName : zy123456
   * accoutId : 16676
   * cstId : 25987
   * userId : 16632
   */

  private RespBaseBean respBase;
  private String userName;
  private int accoutId;
  private int cstId;
  private int userId;

  public RespBaseBean getRespBase() {
    return respBase;
  }

  public void setRespBase(RespBaseBean respBase) {
    this.respBase = respBase;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getAccoutId() {
    return accoutId;
  }

  public void setAccoutId(int accoutId) {
    this.accoutId = accoutId;
  }

  public int getCstId() {
    return cstId;
  }

  public void setCstId(int cstId) {
    this.cstId = cstId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public static class RespBaseBean {

    /**
     * respCode : 0000
     * respDesc : 注册成功；用户ID:16632
     */

    private String respCode;
    private String respDesc;

    public String getRespCode() {
      return respCode;
    }

    public void setRespCode(String respCode) {
      this.respCode = respCode;
    }

    public String getRespDesc() {
      return respDesc;
    }

    public void setRespDesc(String respDesc) {
      this.respDesc = respDesc;
    }
  }
}
