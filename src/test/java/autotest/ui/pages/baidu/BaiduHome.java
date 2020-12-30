package autotest.ui.pages.baidu;

import autotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class BaiduHome extends BaseUI {


	@FindBy(xpath = "//*[@id='su']")
	private WebElement search;
	public void ClickSearch(){click(search);}

	@FindBy(xpath = "//*[@id='kw']")
	private WebElement input;
	public void TextInput(String text){sendKeys(input,text);}

	@FindBy(xpath = "//div[@id='3001']//h3/a[1]")
	private WebElement apple;

	public void ClickApple(){
		click(apple);
	}

	public void contextClickApple(){
		Actions actions=new Actions(driver);
		actions.contextClick(apple).perform();
	}

}
