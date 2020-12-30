package autotest.api.gyApi.testCase.user1;

import autotest.api.gyApi.bean.user.login.LoginReq;
import autotest.api.gyApi.bean.user.login.LoginResp;
import autotest.api.gyApi.bean.user.signUp.SignUpReq;
import autotest.api.gyApi.bean.user.signUp.SignUpResp;
import autotest.api.gyApi.bean.user1.lock.LockReq;
import autotest.api.gyApi.bean.user1.lock.LockResp;
import com.alibaba.fastjson.JSON;
import autotest.api.common.BaseApi;
import autotest.tools.JdbcTools;
import autotest.tools.PinYinTools;
import autotest.tools.RandomTool;
import io.qameta.allure.Allure;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-11-25 16:35
 **/
public class Usertest  extends BaseApi {
  @Test
  public void SignupTest(){
    SignUpReq signUpReq=new SignUpReq();
    String Phone= RandomTool.getTel();
    String UserName= PinYinTools.toFirstChar(RandomTool.getChineseName())+RandomTool.randomInt(1000,9999);
    signUpReq.setPhone(Phone);
    signUpReq.setPwd("zy123456");
    signUpReq.setRePwd("zy123456");
    signUpReq.setUserName(UserName);
    Allure.addAttachment("请求报文",JSON.toJSONString(signUpReq));
    SignUpResp signUpResp=(SignUpResp) httpTools.sendHttpJsonAPI(baseUrl+"/user/signup",signUpReq,SignUpResp.class);
    Allure.addAttachment("响应报文",JSON.toJSONString(signUpResp));
    Assert.assertEquals(signUpResp.getRespBase().getRespCode(),"0000");

  }


@Test
  public void LoginTest() {
    LoginReq loginReq=new LoginReq();
    loginReq.setUserName("zy123456");
    loginReq.setPwd("zy123456");
    Allure.addAttachment("请求报文", JSON.toJSONString(loginReq));
    LoginResp loginResp=(LoginResp) httpTools.sendHttpJsonAPI(baseUrl+"/user/login",loginReq,LoginResp.class);
    Allure.addAttachment("响应报文", JSON.toJSONString(loginResp));
    Assert.assertEquals(loginResp.getRespCode(),"0000");

  }


  @Test
  public void SignupAndLogin() {
    SignUpReq signUpReq=new SignUpReq();
    String Phone= RandomTool.getTel();
    String UserName= PinYinTools.toFirstChar(RandomTool.getChineseName())+RandomTool.randomInt(1000,9999);
    signUpReq.setPhone(Phone);
    signUpReq.setPwd("zy123456");
    signUpReq.setRePwd("zy123456");
    signUpReq.setUserName(UserName);
    Allure.addAttachment("请求报文",JSON.toJSONString(signUpReq));
    SignUpResp signUpResp=(SignUpResp) httpTools.sendHttpJsonAPI(baseUrl+"/user/signup",signUpReq,SignUpResp.class);
    Allure.addAttachment("响应报文",JSON.toJSONString(signUpResp));
    Assert.assertEquals(signUpResp.getRespBase().getRespCode(),"0000");

    LoginReq loginReq=new LoginReq();
    loginReq.setUserName(UserName);
    loginReq.setPwd("zy123456");
    Allure.addAttachment("请求报文", JSON.toJSONString(loginReq));
    LoginResp loginResp=(LoginResp) httpTools.sendHttpJsonAPI(baseUrl+"/user/login",loginReq,LoginResp.class);
    Allure.addAttachment("响应报文", JSON.toJSONString(loginResp));
    Assert.assertEquals(loginResp.getRespCode(),"0000");

  }
@Test
  public void LockTest() {
    String sql="select t.user_name,t.pwd from t_user_user t where t.status=1 limit 0,1";
    JdbcTools jdbcTools=new JdbcTools();
    Map result=jdbcTools.getRecord(sql);
    String user_name=(String)result.get("user_name");
    String pwd=(String)result.get("pwd");
    System.out.println("用户名"+user_name);
    System.out.println("密码"+pwd);
    System.out.println();
    LockReq lockReq=new LockReq();
    lockReq.setUserName(user_name);
    Allure.addAttachment("请求报文",JSON.toJSONString(lockReq));
    LockResp lockResp=(LockResp)httpTools.sendHttpJsonAPI(baseUrl+"/user/lock",lockReq,LockResp.class);
    Allure.addAttachment("请求报文",JSON.toJSONString(lockResp));
    Assert.assertEquals(lockResp.getRespCode(),"9999");

  }

}
