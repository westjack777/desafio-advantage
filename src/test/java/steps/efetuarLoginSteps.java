package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.BasePage;
import utils.Constants;

public class efetuarLoginSteps {
	
	private WebDriver driver;
	BasePage basePg = new BasePage(driver);
	
	@Before
	public void setup() {
		basePg.iniciarBrowser();
		basePg.acessarAdvantageShopping();
	}

//	@After
//	public void tearDown() {
//		basePg.encerraBrowser();
//	}

	@Dado("que navego ate a pagina inicial da Advantage Shopping")
	public void queNavegoAteAPaginaInicialDaAdvantageShopping() {
		Assert.assertEquals(Constants.URL_HOME, basePg.getCurrentURL());
	}

	@E("clico no menu usuarios")
	public void clicoNoMenuUsuarios() {
		basePg.clicarNoMenuUser();
	}

	@E("digito um usuario valido {string}")
	public void digitoUmUsuarioValido(String username) {
		basePg.inserirUsername(username);
	}

	@E("digito uma senha valida {string}")
	public void digitoUmaSenhaValida(String password) {
		basePg.inserirPassword(password);
	}

	@E("clico em sign-in")
	public void clicoEmSignIn() {
		basePg.clickSignIn();
	}

	@E("verifico se o usuario eh exibido no topo da pagina {string}")
	public void verificoSeMeuUsuarioEhExibidoNoTopoDaPagina(String username) {
		Assert.assertEquals(username, basePg.checkUsername());
	}

}
