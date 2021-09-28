package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_PF {

	@FindBy(xpath = "//a[@id='hrefUserIcon']//*[name()='svg']")
	private WebElement icn_menuUser;

	@FindBy(id = "menuSearch")
	private WebElement icn_menuSearch;

	@SuppressWarnings("unused")
	private WebDriver driver;

	public LandingPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clicarNoMenuUsuario() {
		icn_menuUser.click();
	}

	public void clicarNoMenuPesquisa(WebDriver driver) {
		icn_menuSearch.click();
	}

}
