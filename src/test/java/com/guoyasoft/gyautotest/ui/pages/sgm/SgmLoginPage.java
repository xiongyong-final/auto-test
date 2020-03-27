package com.guoyasoft.gyautotest.ui.pages.sgm;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SgmLoginPage extends BaseUI {

    @FindBy(xpath = "//input[@id=\"j_username\"]")
    private WebElement loginNameInput;

    @FindBy(xpath = "//input[@id=\"j_password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id=\"J_sidebar_login\"]")
    private WebElement loginBtn;

    public void accLogin(String userName,String password){
        sendKeys(loginNameInput, userName);
        sendKeys(passwordInput, password);
        click(loginBtn);

    }


    @FindBy(xpath = "//table[@class=\"table table-bordered table-striped\" ]//tbody/tr[3]/td[3]/div/button")
    private WebElement sizeBtn;

    public void sizeLogin(){
        click(sizeBtn);
    }

}
