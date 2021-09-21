package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialPage_PF {

	@CacheLookup
	@FindBy(xpath = "//a[@id='hrefUserIcon']//*[name()='svg']")
	WebElement menu_User;

	@CacheLookup
	@FindBy(id = "menuSearch")
	WebElement menu_Search;

	final WebDriver driver;

	public InitialPage_PF(WebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}

	public void clicarNoMenuUsuario() {
		
		menu_User.click();
	}

	public void clicarNoMenuPesquisa() {
		
		menu_Search.click();
	}

}
