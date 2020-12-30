package autotest.api.gyApi.bean.user1.login;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 16:33
 **/
public class LoginResp {

  /**
   * respCode : 0000
   * respDesc : 登录成功
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
