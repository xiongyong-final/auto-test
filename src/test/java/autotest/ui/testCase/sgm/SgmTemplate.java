package autotest.ui.testCase.sgm;

import autotest.ui.pages.sgm.SgmLoginPage;
import autotest.ui.common.BaseUI;
import autotest.ui.pages.sgm.SgmTemplatePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SgmTemplate  extends BaseUI {

    @Test
    public void CreateNewTemplate(){

        int name=(int)(Math.random()*1000000+1);
        driver.get("https://msc-qa.ssp.saic-gm.com");
        SgmLoginPage sgmLoginPage= PageFactory.initElements(driver,SgmLoginPage.class);
        sgmLoginPage.accLogin("apptest11","Pass1234");
        sleep(1);
        sgmLoginPage.sizeLgnore();
        sleep(1);
        sgmLoginPage.sizeLoginYunwei();
        sleep(1);

        SgmTemplatePage sgmTemplatePage=PageFactory.initElements(driver,SgmTemplatePage.class);
        sgmTemplatePage.clickHomePage();
        sleep(1);
        sgmTemplatePage.clickTempManagement();
        sgmTemplatePage.clickCreateTemp();
        sleep(1);
        sgmTemplatePage.sendTempName("测试"+name);
        sleep(1);
        sgmTemplatePage.clickaddAttr();
        sgmTemplatePage.sendaddDisplayname("测试27");
        sleep(1);
        driver.findElement(By.xpath("//li[@class=\"ivu-select-item\" and contains(text(),\"测试27\")]")).click();
        //sgmTemplatePage.setDisplayname();
        sleep(1);

        sgmTemplatePage.clickaddAttrValue();
        sleep(1);
        sgmTemplatePage.clickaddAttrValue1();
        sgmTemplatePage.sendAttrValueName("1");
        sgmTemplatePage.sendattrValuedisplayName("一");
        sleep(1);
        sgmTemplatePage.clickattrValuesave();
        sleep(1);
        sgmTemplatePage.clicktempsave();
        String tempcode=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/span[1]")).getText();
        sgmTemplatePage.sendTempCode(tempcode);
        sgmTemplatePage.clickTempQuery();
        sleep(2);
        String tempname=driver.findElement(By.xpath("//div[@class=\"ivu-tooltip-rel\"]/div")).getText();
        System.out.println(""+tempname);
        Assert.assertEquals(tempname,"测试"+name);
        sgmTemplatePage.clicktempUpdate();






    }
}
