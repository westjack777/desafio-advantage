package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
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
	public void digitoUmUsuarioValido(String username) throws InterruptedException {
		Thread.sleep(2000);
		basePg.criarNovaConta();
		System.out.println("estou aqui..");
//		basePg.inserirUsername(username);
		System.out.println("agora estou aqui..");
	}

	@E("digito uma senha valida {string}")
	public void digitoUmaSenhaValida(String password) {
		basePg.inserirPassword(password);
	}

	@E("clico em sign-in")
	public void clicoEmSignIn() {
	}

	@Entao("sou redirecionado para a tela inicial")
	public void souRedirecionadoParaATelaInicial() {
	}

	@E("verifico se meu usuario eh exibido no topo da pagina")
	public void verificoSeMeuUsuarioEhExibidoNoTopoDaPagina() {
	}

}
