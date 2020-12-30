package autotest.api.certTest.bean;

/**
 * @program: gy-auto-test
 * @description:
 * @author: guoya
 * @create: 2018-12-01 14:51
 **/
public class CertBean {
  private String Name;
  private String Cert;
  private String province;
  private String City;
  private int Year;
  private int Month;
  private int Day;
  private int age;
  private String sex;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getCert() {
    return Cert;
  }

  public void setCert(String cert) {
    Cert = cert;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public int getYear() {
    return Year;
  }

  public void setYear(int year) {
    Year = year;
  }

  public int getMonth() {
    return Month;
  }

  public void setMonth(int month) {
    Month = month;
  }

  public int getDay() {
    return Day;
  }

  public void setDay(int day) {
    Day = day;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
