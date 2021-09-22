package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_PF {

	@FindBy(xpath = "//a[@id='hrefUserIcon']//*[name()='svg']")
	private WebElement menu_User;

	@FindBy(id = "menuSearch")
	private WebElement menu_Search;

	public LandingPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebDriver driver;

	public void clicarNoMenuUsuario() {
		menu_User.click();
	}

	public void clicarNoMenuPesquisa(WebDriver driver) {
		menu_Search.click();
	}

}
