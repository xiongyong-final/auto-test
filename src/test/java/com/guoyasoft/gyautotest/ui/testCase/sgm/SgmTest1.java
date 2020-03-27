package com.guoyasoft.gyautotest.ui.testCase.sgm;

import com.guoyasoft.gyautotest.tools.RandomTool;
import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SgmTest1  extends BaseUI {

    @Test
    public void test1() {
        int a=(int)(Math.random()*1000000+1);
        driver.get("https://msc-qa.ssp.saic-gm.com");
        addScreenshot2Allure("经销商登录");
        sleep(1);
        driver.findElement(By.xpath("//input[@id=\"j_username\"]")).sendKeys("apptest22");
        driver.findElement(By.xpath("//input[@id=\"j_password\"]")).sendKeys("Pass1234");
        sleep(1);
        driver.findElement(By.xpath("//button[@id=\"J_sidebar_login\"]")).click();//点击登录
        sleep(1);
        driver.findElement(By.xpath("//table[@class=\"table table-bordered table-striped\" ]//tbody/tr[3]/td[3]/div/button")).click();//点击索赔职位
        sleep(2);
        driver.findElement(By.xpath("//div[@class=\"templateCreation_body_basicInformation_content\"]/div[1]/div[2]/input")).sendKeys(""+a);//输入维修项目名称
        sleep(2);
        driver.findElement(By.xpath("//div[@class=\"templateCreation_body_basicInformation_content\"]/div[2]/div[2]/input")).sendKeys("123");//输入维修项目描述
        sleep(2);
        driver.findElement(By.xpath("//span[@class=\"ivu-checkbox\"]/input")).click();//勾选渠道
        sleep(2);
        driver.findElement(By.xpath("//div[@class=\"templateCreation_body_buttons\"]/button")).click();//点击保存
        sleep(2);
        driver.findElement(By.xpath("//div[@class=\"dialog-container-content\"]/div[2]/button[2]")).click();//点击确定
        sleep(2);
        driver.findElement(By.xpath("//input[@placeholder=\"维修项目名称\"]")).sendKeys(""+a);//查询新建商品
        sleep(2);
        driver.findElement(By.xpath("//div[@class=\"ivu-col ivu-col-span-12\"]/button[1]")).click();//点击删选
        sleep(2);
        //driver.findElement(By.xpath("//td[@class=\"ivu-table-column-8UkxQY ivu-table-column-center\"]/div/div/div/a[contains(text(),\"查看\")]")).click();
        driver.findElement(By.xpath("//a[@style=\"margin-right: 5px;\"][1]")).click();//点击查看按钮
        sleep(2);
        String code=driver.findElement(By.xpath("//*[contains(text(),\"维修项目名称\")]")).getText();//获取页面信息（维修项目名称）
        System.out.println(""+code);
        Assert.assertEquals(code.contains("维修项目名称:"+a),true);//判断是否与新建一致


        }



    }

