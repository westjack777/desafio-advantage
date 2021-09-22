package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	LandingPage_PF landPg;

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

		landPg = new LandingPage_PF(driver);
		landPg.clicarNoMenuUsuario();

	}

	public void criarNovaConta() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();

	}

}
