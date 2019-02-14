package com.guoyasoft.gyautotest.ui.testCase.jd;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test  extends BaseUI {

@Test
    public void test1(){
        driver.get("https://www.jd.com");
        addScreenshot2Allure("1");
        sleep(2);
        driver.findElement(By.xpath("//input[@id='key']")).sendKeys("手机");
        addScreenshot2Allure("2");
        sleep(2);
        driver.findElement(By.xpath("//div[@id='search']//button[@class='button']")).click();
        sleep(2);
    WebElement p=driver.findElement(By.xpath("//div[@class='p-price']//strong[@class='J_100002332162']"));
        String a=driver.findElement(By.xpath("//div[@class='p-price']//strong[@class='J_100002332162']")).getText();
        System.out.println("数据  "+a);
        double b=Double.parseDouble(a.substring(1));
        System.out.println("金额是  "+b);



    }
}
