package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage_PF {

	@FindBy(how = How.XPATH, using = "//input[@name='usernameRegisterPage']")
	private WebElement txt_usernameRegistration;

	@FindBy(how = How.XPATH, using = "//input[@name='emailRegisterPage']")
	private WebElement txt_emailRegistration;

	@FindBy(how = How.XPATH, using = "//input[@name='passwordRegisterPage']")
	private WebElement txt_passwordRegistration;

	@FindBy(how = How.XPATH, using = "//input[@name='confirm_passwordRegisterPage']")
	private WebElement txt_confirmPasswordRegistration;

	@FindBy(how = How.XPATH, using = "//input[@name='i_agree' and @type='checkbox']")
	private WebElement box_agree;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_register;

	@SuppressWarnings("unused")
	private WebDriver driver;

	public NewAccountPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void preencherUsernameCadastro(String arg) {
		txt_usernameRegistration.sendKeys(arg);
	}

	public void preencherEmailCadastro(String arg) {
		txt_emailRegistration.sendKeys(arg);
	}

	public void preencherPasswordCadastro(String arg, String arg1) {
		txt_passwordRegistration.sendKeys(arg);
		txt_confirmPasswordRegistration.sendKeys(arg1);
	}


	public void concordarTermos() {
		box_agree.click();
	}

	public void registrar() {
		btn_register.click();
	}

}
