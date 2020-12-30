package autotest.ui.testCase.dealer;

import autotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DealerTest extends BaseUI {
    @Test
    public void Test1(){
        driver.get("https://msc-qa.dms.saic-gm.com");
        addScreenshot2Allure("经销商登录");
        driver.findElement(By.xpath("//input[@placeholder=\"用户名\"]")).sendKeys("dh66lu");
        driver.findElement(By.xpath("//input[@placeholder=\"密码\"]")).sendKeys("Pass1234");
        driver.findElement(By.xpath("//input[@placeholder=\"验证码\"]")).sendKeys("Pass1234");
        sleep(1);
        driver.findElement(By.xpath("//input[@class=\"easyui-linkbutton c8 l-btn l-btn-small\"]")).click();
        sleep(1);



    }

}
