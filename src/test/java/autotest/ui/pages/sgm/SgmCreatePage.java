package autotest.ui.pages.sgm;

import autotest.ui.common.BaseUI;
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
    public void inputtime(String time){
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

        @FindBy(xpath = "//div[@class=\"templateCreation_body_accessoriesInformation\"]/div[2]/div/div[2]/button/span[(text()=\"添加配件\")]")
    private WebElement addSku;//添加配件按钮
    public void addsku(){ click(addSku); }

    @FindBy(xpath = "//div[@class=\"templateCreation_body_accessoriesInformation\"]/div[3]/div/div[2]/button/span[(text()=\"添加配件\")]")
    private WebElement addSku2;//分类2配件按钮
    public void addsku2(){ click(addSku2); }

    //div[@class="templateCreation_body_accessoriesInformation"]/div[3]/div/div[2]/button/span[(text()="添加配件")]

    @FindBy(xpath = "//span[(text()=\"添加配件分类\")]")
    private WebElement addSkutag;//添加配件分类按钮
    public void addskutag(){ click(addSkutag); }



    @FindBy(xpath = "//input[@class=\"externalCode\"]")
    private WebElement inputexternalCode;//创建页配件代码输入框
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

    @FindBy(xpath = "//button[(text()=\"添加\")]")
    private  WebElement skuaddbtn;//配件添加按钮
    public void skuaddBtn(){
        click(skuaddbtn);
    }

    @FindBy(xpath = "//button[(text()=\"取消\")]")
    private  WebElement skucancelbtn;//配件取消按钮
    public void skucancelBtn(){
        click(skucancelbtn);
    }

    @FindBy(xpath = "//div[@class=\"middle\"]//div[@class=\"ivu-table-wrapper\"]/div/div[@class=\"ivu-table-header\"]/table/thead/tr/th/div/label")
    private WebElement skuselect;//配件全选
    public void  skuSelect(){click(skuselect);}



}
