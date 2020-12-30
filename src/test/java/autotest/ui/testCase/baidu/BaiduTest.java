package autotest.ui.testCase.baidu;

import autotest.ui.common.BaseUI;
import autotest.ui.pages.baidu.BaiduHome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class BaiduTest extends BaseUI {

    @Test
    public void testSearch(){
        driver.get("https://www.baidu.com");
        addScreenshot2Allure("百度首页");
        BaiduHome baiduHome= PageFactory.initElements(driver,BaiduHome.class);
        baiduHome.TextInput("苹果");
        sleep(1);
        pressEnterKey();
        //baiduHome.ClickSearch();
        sleep(1);
        String a=driver.findElement(By.xpath("//div[@id='3001']//h3")).getText();
        System.out.println("搜索结果"+a);//Apple - 中国官方
        Assert.assertEquals(a,"Apple - 中国官方");
        driver.findElement(By.xpath("//div[@id='3001']//h3/a[1]")).click();
        sleep(2);
        switchToNextWindow();
        sleep(2);
        String b=driver.getTitle();
        System.out.println(b);
        Assert.assertEquals(b,"Apple (中国大陆) - 官方网站");



    }

    @Test
    public void testSearch1(){
        driver.get("https://www.baidu.com");
        BaiduHome baiduHome= PageFactory.initElements(driver,BaiduHome.class);
        baiduHome.TextInput("苹果");
        sleep(1);
        baiduHome.ClickSearch();
        sleep(1);
        String a=driver.findElement(By.xpath("//div[@id='3001']//h3")).getText();
        System.out.println("搜索结果"+a);//Apple - 中国官方
        Assert.assertEquals(a,"Apple - 中国官方");
        driver.findElement(By.xpath("//div[@id='3001']//h3/a[1]")).click();
        sleep(2);

        /**String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for(String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {				//如果为 最先的窗口 权柄跳出
              continue;
           }
           driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
           System.out.println(driver.getCurrentUrl());     //打印是否为新窗口

           break;
         }
         */
        switchToNextWindow();
        String b=driver.getTitle();
        System.out.println(b);
        Assert.assertEquals(b,"Apple (中国大陆) - 官方网站");
        driver.findElement(By.xpath("//ul[@class='ac-gn-list']//a[@href='/iphone/']")).click();
        driver.findElement(By.xpath("//ul[@class='chapternav-items']//a[@href='/iphone-12-pro/']")).click();
        sleep(2);
        String c=driver.getCurrentUrl();
        Assert.assertEquals(c,"https://www.apple.com.cn/iphone-12-pro/");
        driver.findElement(By.xpath("//div[@class='ac-ln-actions']//a[@href='/cn/shop/goto/buy_iphone/iphone_12_pro']")).click();
        windowMax();

    }

    @Test
    public void testSearch2(){
        driver.get("https://www.baidu.com");
        addScreenshot2Allure("百度首页");
        BaiduHome baiduHome= PageFactory.initElements(driver,BaiduHome.class);
        baiduHome.TextInput("苹果");
        sleep(1);
        pressEnterKey();
        //baiduHome.ClickSearch();
        sleep(1);
        String a=driver.findElement(By.xpath("//div[@id='3001']//h3")).getText();
        System.out.println("搜索结果"+a);//Apple - 中国官方
        Assert.assertEquals(a,"Apple - 中国官方");
        //Actions actions=new Actions(driver);
        //actions.contextClick(driver.findElement(By.xpath("//div[@id='3001']//h3/a[1]"))).perform();
        baiduHome.contextClickApple();

        sleep(3);



    }

}
