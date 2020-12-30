package autotest.api.gyApi.bean.user1.lock;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 17:35
 **/
public class LockResp {

  /**
   * respCode : 9999
   * respDesc : 该用户不存在
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
