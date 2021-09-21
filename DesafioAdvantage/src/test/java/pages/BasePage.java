package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;
//	InitialPage_PF pagInicial = new InitialPage_PF(driver);

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarAdvantageShopping() {
		driver.get("http://advantageonlineshopping.com/#/");
	}

	public void clicarNoMenuUser() {

		driver.findElement(By.id("menuUser")).click();

	}

	public void criarNovaConta() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();

	}

}
