package autotest.ui.testCase.taobao;

import autotest.ui.common.BaseUI;
import autotest.ui.pages.taobao.Home;
import autotest.ui.pages.taobao.Login;
import autotest.ui.pages.taobao.SearchResult;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TaobaoTest extends BaseUI {

  @Test
  public void login(){
    driver.get("https://www.taobao.com");
    snapshot((TakesScreenshot) driver, "taobao_home.jpg");

    Home home= PageFactory.initElements(driver, Home.class);
    home.toMyTaoBao();
    snapshot((TakesScreenshot) driver, "taobao_login_page.jpg");

    Login login= PageFactory.initElements(driver, Login.class);
    login.login();
    snapshot((TakesScreenshot) driver, "taobao_login_result.jpg");
  }

  @Test
  public void searchMi(){
    driver.get("https://www.taobao.com");

    Home home= PageFactory.initElements(driver, Home.class);
    home.search();
    snapshot((TakesScreenshot) driver, "taobao_searchMi_home.jpg");

    SearchResult searchResult= PageFactory.initElements(driver, SearchResult.class);
    searchResult.selectMI();
    snapshot((TakesScreenshot) driver, "taobao_searchMi_result.jpg");


  }


}
