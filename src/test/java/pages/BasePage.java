package pages;

import org.openqa.selenium.By;
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
	LoggedPage_PF loggedPg;

	private String CurrentURL;

	public void iniciarBrowser() {
		driver = BrowserFactory.iniciarBrowser();

	}

	public void encerraBrowser() {
		driver.quit();
	}

	public void acessarAdvantageShopping() {
		driver.get("http://advantageonlineshopping.com/#/");
		CurrentURL = driver.getCurrentUrl();
	}

	public void clicarNoMenuUser() {

		landingPg = new LandingPage_PF(driver);
		landingPg.clicarNoMenuUsuario();

	}

	public void criarNovaConta() {
		loginPg = new LoginPage_PF(driver);
		loginPg.newAccount();
		setCurrentURL(driver.getCurrentUrl());

	}

	public void preencherCadastroSimples(String nome, String email, String pass, String confirmPass) {
		newAccountPg = new NewAccountPage_PF(driver);
		newAccountPg.preencherUsernameCadastro(nome);
		newAccountPg.preencherEmailCadastro(email);
		newAccountPg.preencherPasswordCadastro(pass, confirmPass);
	}

	public void preencherCadastroCompleto(String username, String email, String pass, String confirmPass, String nome,
			String sobrenome, String telefone, String cidade, String endereco, String estado, String CEP) {
		newAccountPg = new NewAccountPage_PF(driver);
		newAccountPg.preencherUsernameCadastro(username);
		newAccountPg.preencherEmailCadastro(email);
		newAccountPg.preencherPasswordCadastro(pass, confirmPass);
		newAccountPg.preencherNomeCadastro(nome);
		newAccountPg.preencherSobrenomeCadastro(sobrenome);
		newAccountPg.preencherTelefoneCadastro(telefone);
		newAccountPg.selecionarPais();
		newAccountPg.preencherCidadeCadastro(cidade);
		newAccountPg.preencherEnderecoCadastro(endereco);
		newAccountPg.preencherEstadoCadastro(estado);
		newAccountPg.preencherCEPCadastro(CEP);

	}

	public void aceitarTermos() {
		newAccountPg.concordarTermos();
	}

	public void efetuarCadastro() {
		newAccountPg.registrar();
	}

	public void validarCadastro() {
		loggedPg = new LoggedPage_PF(driver);
		loggedPg.getUsername();
		setCurrentURL(driver.getCurrentUrl());

	}

	public String validarRepetido() {
		String jaExistente = newAccountPg.usuarioExistente();
		return jaExistente;

	}

	public String getCurrentURL() {
		return CurrentURL;
	}

	public void setCurrentURL(String currentURL) {
		CurrentURL = currentURL;
	}
	
	public void inserirUsername(String user) {
		driver.findElement(By.name("username")).sendKeys(user);
	}
	
	public void inserirPassword(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	public void clickSignIn ()  {
		driver.findElement(By.xpath("//*[@id='sign_in_btnundefined']")).click();
	}
	
	public String checkUsername() {
		String username = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")).getText();
		return username;
	}

}
