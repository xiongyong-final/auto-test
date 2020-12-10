package com.guoyasoft.gyautotest.ui.testCase.sgm;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.pages.sgm.SgmCreatePage;
import com.guoyasoft.gyautotest.ui.pages.sgm.SgmLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SgmTest2 extends BaseUI {

    @Test
    public void  accLogin(){
        int name=(int)(Math.random()*1000000+1);


        driver.get("https://msc-qa.ssp.saic-gm.com");
        SgmLoginPage sgmLoginPage= PageFactory.initElements(driver, SgmLoginPage.class);
        sgmLoginPage.accLogin("apptest22","Pass1234");
        sleep(1);
        sgmLoginPage.sizeLogin();
        sleep(1);

        SgmCreatePage sgmCreatePage=PageFactory.initElements(driver,SgmCreatePage.class);
        sgmCreatePage.sendNameDesc(""+name,""+name);
        sleep(1);
        sgmCreatePage.inputtime("100");
        sleep(1);
        //sgmCreatePage.chan();
        driver.findElement(By.xpath("//span[@class=\"ivu-checkbox\"]/input")).click();//勾选渠道
        sleep(1);
        sgmCreatePage.save();
        sleep(1);
        sgmCreatePage.confirm();
        sleep(1);

        sgmCreatePage.inputname(""+name);
        sleep(1);
        sgmCreatePage.search1();
        sleep(1);
        sgmCreatePage.show();
        sleep(1);
        //String a=sgmCreatePage.vaule();
        //Assert.assertEquals(a.contains("维修项目名称:"+a),true);
        //sleep(1);
        String code=driver.findElement(By.xpath("//*[contains(text(),\"维修项目名称\")]")).getText();//获取页面信息（维修项目名称）
        System.out.println(""+code);
        Assert.assertEquals(code.contains("维修项目名称:"+name),true);//判断是否与新建一致



    }

    //添加配件保存
    @Test
    public void creatTemp1(){
        int name=(int)(Math.random()*1000000+1);

        driver.get("https://msc-qa.ssp.saic-gm.com");
        SgmLoginPage sgmLoginPage= PageFactory.initElements(driver, SgmLoginPage.class);
        sgmLoginPage.accLogin("apptest22","Pass1234");
        sleep(1);
        sgmLoginPage.sizeLogin();
        sleep(1);
        SgmCreatePage sgmCreatePage=PageFactory.initElements(driver,SgmCreatePage.class);
        sgmCreatePage.sendNameDesc("测试"+name,"测试"+name);
        sgmCreatePage.addsku();
        sgmCreatePage.inputExternalCode("1");
        sgmCreatePage.externalCodeSubmit();
        sleep(2);
        sgmCreatePage.skuSelect();
        sleep(1);
        sgmCreatePage.skuaddBtn();
        sleep(1);
        sgmCreatePage.skucancelBtn();
        sleep(1);
        sgmCreatePage.inputtime("1000");
        sgmCreatePage.save();
        sleep(1);
        sgmCreatePage.confirm();
        sleep(1);
        sgmCreatePage.inputname("测试"+name);
        sgmCreatePage.search1();
        sgmCreatePage.show();
        sleep(2);
        String code=driver.findElement(By.xpath("//div[@class=\"app-body\"]/div[@class=\"main\"]/div/div[1]/div[@class=\"item\"]/div[4]/div[1]/span/label")).getText();//获取页面信息（维修项目名称）
        System.out.println("获取到的是："+code);
        Assert.assertEquals(code.contains(""+name),true);

    }

//添加分类和配件
    @Test
    public void creatTemp2(){
        int name=(int)(Math.random()*1000000+1);

        driver.get("https://msc-qa.ssp.saic-gm.com");
        SgmLoginPage sgmLoginPage= PageFactory.initElements(driver, SgmLoginPage.class);
        sgmLoginPage.accLogin("apptest22","Pass1234");
        sleep(1);
        sgmLoginPage.sizeLogin();
        sleep(1);
        SgmCreatePage sgmCreatePage=PageFactory.initElements(driver,SgmCreatePage.class);
        sgmCreatePage.sendNameDesc("测试"+name,"测试"+name);
        sgmCreatePage.addsku();
        sgmCreatePage.inputExternalCode("1");
        sgmCreatePage.externalCodeSubmit();
        sleep(2);
        sgmCreatePage.skuSelect();
        sleep(1);
        sgmCreatePage.skuaddBtn();
        sleep(1);
        sgmCreatePage.skucancelBtn();
        sleep(1);
        sgmCreatePage.addskutag();
        sgmCreatePage.addsku2();
        sgmCreatePage.inputExternalCode("1");
        sgmCreatePage.externalCodeSubmit();
        sleep(2);
        sgmCreatePage.skuSelect();
        sleep(1);
        sgmCreatePage.skuaddBtn();
        sleep(1);
        sgmCreatePage.skucancelBtn();
        sleep(1);
        sgmCreatePage.inputtime("1000");
        sgmCreatePage.save();
        sleep(1);


    }

}
