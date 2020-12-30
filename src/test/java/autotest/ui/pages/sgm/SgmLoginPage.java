package autotest.ui.pages.sgm;

import autotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SgmLoginPage extends BaseUI {

    @FindBy(xpath = "//input[@id=\"j_username\"]")
    private WebElement loginNameInput;//用户名

    @FindBy(xpath = "//input[@id=\"j_password\"]")
    private WebElement passwordInput;//密码

    @FindBy(xpath = "//button[@id=\"J_sidebar_login\"]")
    private WebElement loginBtn;//登录按钮

    public void accLogin(String userName,String password){
        sendKeys(loginNameInput, userName);
        sendKeys(passwordInput, password);
        click(loginBtn);

    }

    @FindBy(xpath = "//button[@id=\"ignore\"]")
    private WebElement lgnore;//忽略信息不完整
    public void sizeLgnore(){click(lgnore);}



    //选择岗位 索赔
    @FindBy(xpath = "//table[@class=\"table table-bordered table-striped\" ]//tbody/tr[3]/td[3]/div/button")
    private WebElement sizeBtn;

    public void sizeLogin(){
        click(sizeBtn);
    }

    @FindBy(xpath = "//table[@class=\"table table-bordered table-striped\"]//tr[7]//button")
    private WebElement sgmYunwei;//运维专员岗位
    public void sizeLoginYunwei(){click(sgmYunwei);}

}
