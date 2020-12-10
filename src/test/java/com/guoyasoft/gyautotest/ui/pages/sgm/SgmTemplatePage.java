package com.guoyasoft.gyautotest.ui.pages.sgm;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SgmTemplatePage extends BaseUI {

    @FindBy(xpath = "//span[@class=\"fl\" and contains(text(),\"商品模板管理\")]")
    private WebElement HomePage;//商品模板管理框
    public void clickHomePage(){click(HomePage);}

    @FindBy(xpath = "//ul//li[1]//li[1]//a[@class=\"nav-link\" and contains(text(),\"模板管理\")]")
    private WebElement TempManagement;//模板管理
    public void clickTempManagement(){click(TempManagement);}


    @FindBy(xpath = "//ul//li[1]//li[2]//a[@class=\"nav-link\" and contains(text(),\"商品管理\")]")
    private WebElement SkuManagement;//商品管理
    public void clickSkuManagement(){click(SkuManagement);}

    @FindBy(xpath = "//ul//li[1]//li[3]//a[@class=\"nav-link\" and contains(text(),\"报表管理\")]")
    private WebElement ReportManagement;//报表管理
    public void clickReportManagement(){click(ReportManagement);}


    @FindBy(xpath = "//span[contains(text(),\"新增商品模板\")]")
    private WebElement CreateTemp;
    public void clickCreateTemp(){click(CreateTemp);}

    @FindBy(xpath = "//input[@placeholder=\"模版Code\"]")
    private WebElement TempCode;
    public void sendTempCode(String code){sendKeys(TempCode,code);}

    @FindBy(xpath = "//input[@placeholder=\"模版名称\"]")
    private WebElement TempName;
    public void sendTempName(String name){sendKeys(TempName, name);}

    @FindBy(xpath = "//span[(text()=\"筛选\")]")
    private WebElement TempQuery;
    public void clickTempQuery(){click(TempQuery);}

    @FindBy(xpath = "//span[(text()=\" 重置\")]")
    private WebElement TempReset;
    public void  clickTempReset(){click(TempReset);}

    @FindBy(xpath = "//span[(text()=\"添加\")]")
    private WebElement addAttr;//添加模板属性
    public void  clickaddAttr(){click(addAttr);}

    @FindBy(xpath = "//input[@class=\"ivu-select-input\"]")
    private WebElement addDisplayname;
    public void sendaddDisplayname(String name){sendKeys(addDisplayname,name);}


    @FindBy(xpath = "//li[@class=\"ivu-select-item ivu-select-item-selected ivu-select-item-focus\" and contains(text(),\"测试27\")]")
    private WebElement setDisplayname;//根据输入属性名称筛选已有的属性
    public void setDisplayname(){click(setDisplayname);}


    @FindBy(xpath = "//span[@class=\"ivu-select-selected-value\" and contains(text(),\"销售属性\")]")
    private WebElement chooseAttr;
    public void clickchooseAttr(){click(chooseAttr);}

    @FindBy(xpath = "//li[@class=\"ivu-select-item\" and contains(text(),\"spu属性\")]")
    private WebElement chooseSpu;
    public void clickchooseSpu(){click(chooseSpu);}

    @FindBy(xpath = "//span[(text()=\"保存\")]")
    private WebElement saveButton;
    public void clicksaveButton(){click(saveButton);}

    @FindBy(xpath = "//a[(text()=\"添加\")]")
    private WebElement addAttrValue;//属性页面的添加按钮
    public void clickaddAttrValue(){click(addAttrValue);}

    @FindBy(xpath = "//button[@class=\"btn fl\"]")
    private WebElement addAttrValue1;//属性值添加框的添加
    public void clickaddAttrValue1(){click(addAttrValue1);}

    @FindBy(xpath = "//tr[@class=\"ivu-table-row\"]/td[3]/div/div/input")
    public WebElement attrValueName;//属性值名称
    public void sendAttrValueName(String valuename){sendKeys(attrValueName,valuename);}
    public void getattrValueName(){getText(attrValueName);}




    @FindBy(xpath = "//tr[@class=\"ivu-table-row\"]/td[2]/div/div/input")
    private WebElement attrValuedisplayName;//属性值显示名称
    public void sendattrValuedisplayName(String displayname){sendKeys(attrValuedisplayName,displayname);}

    @FindBy(xpath = "//button[@class=\"btn\" and contains(text(),\"保存\")]")
    private WebElement attrValuesave;//属性值保存
    public void clickattrValuesave(){click(attrValuesave);}

    @FindBy(xpath = "//span[(text()=\"保存\")]")
    private WebElement tempsave;
    public void clicktempsave(){click(tempsave);}

    @FindBy(xpath = "//div/div/a[(text()=\"修改\")]")
    private WebElement tempUpdate;
    public void clicktempUpdate(){click(tempUpdate);}
























}
