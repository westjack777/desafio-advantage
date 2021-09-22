package pages;

import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	LandingPage_PF landingPg;
	LoginPage_PF loginPg;
	NewAccountPage_PF newAccountPg;

	public void iniciarBrowser() {
		driver = BrowserFactory.iniciarBrowser();

	}

	public void encerraBrowser() {
		driver.quit();
	}

	public void acessarAdvantageShopping() {
		driver.get("http://advantageonlineshopping.com/#/");
	}

	public void clicarNoMenuUser() {

		landingPg = new LandingPage_PF(driver);
		landingPg.clicarNoMenuUsuario();

	}

	public void criarNovaConta() {
		loginPg = new LoginPage_PF(driver);
		loginPg.newAccount();
		
	}
	
	public void preencherCadastro(String nome,String email,String pass, String confirmPass) {
		newAccountPg = new NewAccountPage_PF(driver);
		newAccountPg.preencherUsernameCadastro(nome);
		newAccountPg.preencherEmailCadastro(email);
		newAccountPg.preencherPasswordCadastro(pass, confirmPass);
	}
	
	public void aceiterTermos() {
		newAccountPg.concordarTermos();
	}
	
	public void efetuarCadastro() {
		newAccountPg.registrar();
	}

}
