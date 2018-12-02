package com.guoyasoft.gyautotest.api.certTest.bean;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.gyautotest.tools.CSVReader;
import com.guoyasoft.gyautotest.tools.JdbcTools;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-01 14:14
 **/
public class ParseCertsCsv {

  public String parseCerByCsv(String filePath) throws ParseException {
    CertsResp certsResp=new CertsResp();
   certsResp.setRespcode("0000");
   certsResp.setRespdesc("成功");
    int success=0;
    int fail=0;
    List<CertBean> list=new ArrayList<CertBean>();
try {
  Object[][] date = CSVReader.readCSV(filePath);
  System.out.println("数据条数" + date.length);
  for (int i = 0; i < date.length; i++) {
    try{
      Object[] item = date[i];
      String name = (String) item[0];
      String cert = (String) item[1];
      CertBean certBean = new CertBean();
      certBean.setName(name);
      String province = cert.substring(0, 2);
      String sql = "SELECT DISTINCT province_name FROM t_province_country_code WHERE province_code="
          + province;
      JdbcTools jdbcTools = new JdbcTools();
      Map map = jdbcTools.getRecord(sql);
      String provinceName = (String) map.get("province_name");
      certBean.setProvince(provinceName);
      String city = cert.substring(2, 6);
      String sql1 =
          "SELECT DISTINCT country_name FROM t_province_country_code WHERE province_code=" + province
              + " AND country_code=" + city + ";";
      Map map1 = jdbcTools.getRecord(sql1);
      String countryName = (String) map1.get("country_name");
      certBean.setCity(countryName);
      certBean.setCert(cert);
      int year = Integer.parseInt(cert.substring(6, 10));
      certBean.setYear(year);
      int month = Integer.parseInt(cert.substring(10, 12));
      certBean.setMonth(month);
      int day = Integer.parseInt(cert.substring(12, 14));
      certBean.setDay(day);
      int sex = Integer.parseInt(cert.substring(16, 17));
      if (sex % 2 != 0) {
        certBean.setSex("男");
      } else {
        certBean.setSex("女");
      }
      int age = ParseCertsCsv.getAgeByBirth(year + "-" + month + "-" + day);
      certBean.setAge(age);
      success++;
      list.add(certBean);
    }catch (Exception e){
      e.printStackTrace();
      fail++;
    }

  }
}catch(Exception e){
  e.printStackTrace();
  certsResp.setRespcode("0001");
  certsResp.setRespdesc("失败");
  }

certsResp.setSuccessctn(success);
certsResp.setFailctn(fail);

    certsResp.setCertBeans(list);
  String srt= JSON.toJSONString(certsResp,true);
   return srt;
  }
@Test
public void test() throws ParseException {
  ParseCertsCsv parseCertsCsv=new  ParseCertsCsv();
    String result=parseCertsCsv.parseCerByCsv("src\\test\\java\\com\\guoyasoft\\gyautotest\\api\\certTest\\bean\\certs.csv");
    System.out.println(result);
}

  public static int getAgeByBirth(String birthday) throws ParseException {
    // 格式化传入的时间
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date parse = format.parse(birthday);
    int age = 0;
    try {
      Calendar now = Calendar.getInstance();
      now.setTime(new Date()); // 当前时间

      Calendar birth = Calendar.getInstance();
      birth.setTime(parse); // 传入的时间

      //如果传入的时间，在当前时间的后面，返回0岁
      if (birth.after(now)) {
        age = 0;
      } else {
        age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
          age += 1;
        }
      }
      return age;
    } catch (Exception e) {
      return 0;
    }
  }

}
