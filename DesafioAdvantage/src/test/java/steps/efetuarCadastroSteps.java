package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;

public class efetuarCadastroSteps {

	private WebDriver driver;
	BasePage basePg = new BasePage(driver);

	@Before
	public void setup() {
		basePg.iniciarBrowser();
	}

	@After
	public void tearDown() {
//		basePg.encerraBrowser();
	}

	@Dado("que estou na pagina inicial da Advantage Shopping")
	public void queEstouNaPaginaInicialDaAdvantageShopping() {
		basePg.acessarAdvantageShopping();

	}

	@Quando("clico no menu users")
	public void clicoNoMenuUsers()  {
		basePg.clicarNoMenuUser();

	}

	@Quando("seleciono CREATE NEW ACCOUNT")
	public void selecionoCREATENEWACCOUNT() throws InterruptedException {
		Thread.sleep(2000);
		basePg.criarNovaConta();
	}

	@Entao("sou redirecionado para a pagina de registro")
	public void souRedirecionadoParaAPaginaDeRegistro() {
	}

	@Entao("Preencho os campos obrigatorios {string}{string}{string}{string}")
	public void preenchoOsCamposObrigatorios(String nome, String email, String senha, String confirmaSenha) {
		basePg.preencherCadastro(nome,email,senha,confirmaSenha);
	}

	@Entao("aceito as condicoes de uso")
	public void aceitoAsCondicoesDeUso() {
		basePg.aceiterTermos();
	}

	@Entao("clico em REGISTER")
	public void clicoEmREGISTER() {
		basePg.efetuarCadastro();
	}

	@Entao("sou redirecionado para a pagina inicial")
	public void souRedirecionadoParaAPaginaInicial() {
	}

}
