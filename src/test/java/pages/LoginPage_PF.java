package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_PF {
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement txt_username;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	private WebElement txt_password;
	
	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement btn_signIn;
	
	@FindBy(how = How.LINK_TEXT , using = "CREATE NEW ACCOUNT")
	private WebElement lnk_newAccount;

	private WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void preencherUsername (String arg) {
		txt_username.sendKeys(arg);
	}
	
	public void preencherPassword (String arg) {
		txt_username.sendKeys(arg);
	}
	
	public void signIn () {
		btn_signIn.click();
	}
	
	public void newAccount () {
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(lnk_newAccount));
		lnk_newAccount.click();
	}
	
}
