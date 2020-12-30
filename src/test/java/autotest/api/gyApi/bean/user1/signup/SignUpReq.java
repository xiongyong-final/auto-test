package autotest.api.gyApi.bean.user1.signup;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 16:33
 **/
public class SignUpReq {


  /**
   * phone : 13912345678
   * pwd : zy123456
   * rePwd : zy123456
   * userName : zy123456
   */

  private String phone;
  private String pwd;
  private String rePwd;
  private String userName;

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getRePwd() {
    return rePwd;
  }

  public void setRePwd(String rePwd) {
    this.rePwd = rePwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
