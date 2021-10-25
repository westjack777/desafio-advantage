package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(how = How.XPATH, using = "//*[@data-ng-show='!registerSuccess']")
	private WebElement userState;
	
	@FindBy(how = How.XPATH, using = "//input[@name='first_nameRegisterPage']")
	private WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='last_nameRegisterPage']")
	private WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='phone_numberRegisterPage']")
	private WebElement phone;

	@FindBy(how = How.XPATH, using = "//input[@name='cityRegisterPage']")
	private WebElement city;
	
	@FindBy(how = How.XPATH, using = "//input[@name='addressRegisterPage']")
	private WebElement address;
	
	@FindBy(how = How.XPATH, using = "//input[@name='state_/_province_/_regionRegisterPage']")
	private WebElement stateRegionProvince;
	
	@FindBy(how = How.XPATH, using = "//input[@name='postal_codeRegisterPage']")
	private WebElement postalCode;
	
	@FindBy(how = How.XPATH, using = "//select[@name='countryListboxRegisterPage']")
	private WebElement country;
	
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		box_agree.click();
		
	}

	public void registrar() {
		btn_register.click();
	}
	
	public void selecionarPais() {
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("Brazil");
	}
	
	public void preencherNomeCadastro(String arg) {
		firstName.sendKeys(arg);
	}
	
	public void preencherSobrenomeCadastro(String arg) {
		lastName.sendKeys(arg);
	}
	
	public void preencherCidadeCadastro(String arg) {
		city.sendKeys(arg);
	}
	
	public void preencherTelefoneCadastro(String arg) {
		phone.sendKeys(arg);
	}
	
	public void preencherEnderecoCadastro(String arg) {
		address.sendKeys(arg);
	}
	
	public void preencherEstadoCadastro(String arg) {
		stateRegionProvince.sendKeys(arg);
	}
	
	public void preencherCEPCadastro(String arg) {
		postalCode.sendKeys(arg);
	}
	
	
	public String usuarioExistente() {
		String msg = null;
		msg = driver.findElement(By.xpath("//*[contains(text(),'User name already exists')]")).getText();
		return msg;
	}

}
