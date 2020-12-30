package autotest.api.certTest.bean;

import java.util.List;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-01 14:30
 **/
public class CertsResp {

  private String Respcode;
  private  String Respdesc;
  private  int Successctn;
  private  int Failctn;
  private  List<CertBean> certBeans;

  public String getRespcode() {
    return Respcode;
  }

  public void setRespcode(String respcode) {
    Respcode = respcode;
  }

  public String getRespdesc() {
    return Respdesc;
  }

  public void setRespdesc(String respdesc) {
    Respdesc = respdesc;
  }

  public int getSuccessctn() {
    return Successctn;
  }

  public void setSuccessctn(int successctn) {
    Successctn = successctn;
  }

  public int getFailctn() {
    return Failctn;
  }

  public void setFailctn(int failctn) {
    Failctn = failctn;
  }

  public List<CertBean> getCertBeans() {
    return certBeans;
  }

  public void setCertBeans(List<CertBean> certBeans) {
    this.certBeans = certBeans;
  }
}
