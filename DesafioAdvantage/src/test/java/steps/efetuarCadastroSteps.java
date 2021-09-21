package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.InitialPage_PF;
import utils.BrowserFactory;

public class efetuarCadastroSteps {

	WebDriver driver = BrowserFactory.iniciarBrowser();
	BasePage pagBase = new BasePage(driver);
	InitialPage_PF pagInicial = new InitialPage_PF(driver);
	
	@Dado("que estou na pagina inicial da Advatage Shopping")
	public void queEstouNaPaginaInicialDaAdvatageShopping() {
		pagBase.acessarAdvantageShopping();

	}

	@Quando("clico no menu users")
	public void clicoNoMenuUsers() {
		pagBase.clicarNoMenuUser();
		
	}

	@Quando("seleciono CREATE NEW ACCOUNT")
	public void selecionoCREATENEWACCOUNT() throws InterruptedException {
		
		pagBase.criarNovaConta();
	}

	@Entao("sou redirecionado para a pagina de registro")
	public void souRedirecionadoParaAPaginaDeRegistro() {
	}

	@Entao("Preencho os campos obrigatorios {int} extendido {int} {int}")
	public void preenchoOsCamposObrigatoriosExtendido(Integer int1, Integer int2, Integer int3) {
	}

	@Entao("aceito as condicoes de uso")
	public void aceitoAsCondicoesDeUso() {
	}

	@Entao("clico em REGISTER")
	public void clicoEmREGISTER() {
	}

	@Entao("sou redirecionado para a pagina inicial")
	public void souRedirecionadoParaAPaginaInicial() {
	}

}
