package com.guoyasoft.gyautotest.ui.testCase.lianxi;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LianxiTest extends BaseUI {


    @Test
    public void  lianxi1(){
        driver.get("https://yulegh.github.io/vue-element-test/index.html");
        addScreenshot2Allure("首页");
        snapshot((TakesScreenshot) driver,"selenium/lianxi/首页.jpg");
        sleep(1);
        driver.findElement(By.xpath("//div[@class=\"el-submenu__title\"and contains(text(),\"组件\")]")).click();
        waiting(driver.findElement(By.xpath("//div[@class=\"el-submenu__title\"and contains(text(),\"组件\")]")));
        addScreenshot2Allure("组件");

        sleep(1);
        driver.findElement(By.xpath("//li[@role=\"menuitem\" and contains(text(),\"双向绑定\")]")).click();
        addScreenshot2Allure("绑定");
        sleep(1);
        WebElement a=driver.findElement(By.xpath("//iframe[@src=\"component/demoDataBindTwoWay.html\"]"));
        driver.switchTo().frame(a);
        driver.findElement(By.xpath("//input[@id=\"val1\"]")).sendKeys("1111");
        addScreenshot2Allure("shuru");
        sleep(1);
        driver.findElement(By.xpath("//div[@id=\"app\"]/button")).click();
        addScreenshot2Allure("dianji");
        sleep(1);
       driver.switchTo().alert().accept();
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("//div[@class=\"el-submenu__title\" and contains(text(),\"Table\")]")).click();
       addScreenshot2Allure("tiaozhuan");
       sleep(1);




    }
}
