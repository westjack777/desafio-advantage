package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoggedPage_PF {

	@FindBy(how = How.XPATH, using = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement btn_username;

	@SuppressWarnings("unused")
	private WebDriver driver;

	public LoggedPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getUsername() {
		String username = btn_username.getText();
		return username;
	}
	
	
}
