package com.guoyasoft.gyautotest.ui.pages.sgm;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SgmCreatePage extends BaseUI {




    @FindBy(xpath = "//div[@class=\"templateCreation_body_basicInformation_content\"]/div[1]/div[2]/input")
    private WebElement packageName;//维修项目名称


    @FindBy(xpath = "//div[@class=\"templateCreation_body_basicInformation_content\"]/div[2]/div[2]/input")
    private WebElement packageDesc;//维修项目描述

    public void  sendNameDesc(String name,String desc){
        sendKeys(packageName,name);
        sendKeys(packageDesc,desc);
    }

    @FindBy(xpath = "//span[@class=\"ivu-checkbox\"]/input")
    private WebElement confirmChannel;//渠道按钮
    public void  chan(){
        click(confirmChannel);
    }


    @FindBy(xpath = "//div[@class=\"templateCreation_body_buttons\"]/button")
    private WebElement saveBtn;//保存按钮
    public void  save(){
        click(saveBtn);

    }

    @FindBy(xpath = "//div[@class=\"dialog-container-content\"]/div[2]/button[2]")
    private WebElement confirmBtn;//保存后的确认按钮
    public void confirm(){
        click(confirmBtn);
    }


    @FindBy(xpath = "//input[@placeholder=\"请输入0或10的整数倍\"]")
    private  WebElement gongshi;//工时按钮
    public void inputgongshi(String time){
        sendKeys(gongshi,time);
    }

    @FindBy(xpath = "//input[@placeholder=\"维修项目名称\"]")
    private WebElement sendname;//管理页面的维修项目名称
    public void inputname(String name){
        sendKeys(sendname,name);
    }

    @FindBy(xpath = "//div[@class=\"ivu-col ivu-col-span-12\"]/button[1]")
    private WebElement search;//筛选按钮
    public void search1(){
        click(search);
    }

    @FindBy(xpath = "//a[@style=\"margin-right: 5px;\"][1]")
    private WebElement show;//查看按钮
    public void show(){
        click(show);
    }

    @FindBy(xpath = "//button[@class=\"addAccessoriesBtn ivu-btn ivu-btn-primary\"]")
    private WebElement addSku;//添加配件按钮
    public void addsku(){
        click(addSku);
    }

    @FindBy(xpath = "//input[@id=\"externalCode\"]")
    private WebElement inputexternalCode;//配件代码输入框
    public  void  inputExternalCode(String code){
        sendKeys(inputexternalCode,code);
    }

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement codesubmit;//搜索按钮
    public void externalCodeSubmit(){
        click(codesubmit);
    }

    @FindBy(xpath = "//th[@class=\"ivu-table-column-RUQeIR ivu-table-column-center\"]/div/label//input")
    private WebElement externinput;//配件选择框
    public void  externInput(){
        click(externinput);
    }

    @FindBy(xpath = "//button[@class=\"btn disabled\"]")
    private  WebElement addbtn;//配件添加按钮
    public void addBtn(){
        click(addbtn);
    }



}
