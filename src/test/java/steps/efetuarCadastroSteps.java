package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import utils.Constants;

public class efetuarCadastroSteps {

	private WebDriver driver;
	BasePage basePg = new BasePage(driver);

	@Before
	public void setup() {
		basePg.iniciarBrowser();
		basePg.acessarAdvantageShopping();
	}

	@After
	public void tearDown() {
//		basePg.encerraBrowser();
	}

	@Dado("que estou na pagina inicial da Advantage Shopping")
	public void queEstouNaPaginaInicialDaAdvantageShopping() {
		Assert.assertEquals(Constants.URL_HOME, basePg.getCurrentURL());
	}

	@Quando("clico no menu users")
	public void clicoNoMenuUsers() {
		basePg.clicarNoMenuUser();
	}

	@Quando("clico em criar nova conta")
	public void clicoEmCriarNovaConta() throws InterruptedException {
		Thread.sleep(2000);
		basePg.criarNovaConta();
	}

	@Entao("sou redirecionado para a pagina de registro")
	public void souRedirecionadoParaAPaginaDeRegistro() {
		Assert.assertEquals(Constants.URL_CADASTRO, basePg.getCurrentURL());
	}

	@Entao("preencho os campos obrigatorios {string}{string}{string}{string}")
	public void preenchoOsCamposObrigatorios(String nome, String email, String senha,
			String confirmaSenha) {
			basePg.preencherCadastroSimples(nome, email, senha, confirmaSenha);
		}
	
	@Entao("preencho todos os campos {string}{string}{string}{string} {string}{string}{string}{string}{string}{string}{string}")
	public void preenchoTodosOsCampos(String username, String email, String senha,
			String confirmaSenha, String nome, String sobrenome, String telefone, String cidade, String endereco, String estado,
			String cep) {
		basePg.preencherCadastroCompleto(username, email, senha, confirmaSenha, nome, sobrenome, telefone, cidade, endereco, estado, cep);
	}
	
	@Entao("aceito as condicoes de uso")
	public void aceitoAsCondicoesDeUso()  {
		basePg.aceitarTermos();
	}

	@Entao("clico em registrar")
	public void clicoEmRegistrar() {
		basePg.efetuarCadastro();
	}

	@Entao("sou redirecionado para a area logada")
	public void souRedirecionadoParaAAreaLogada() throws Exception {
		basePg.validarCadastro();
		Assert.assertEquals(Constants.URL_HOME,basePg.getCurrentURL());
	}
	
	@Entao("verifico a mensagem de usuario ja existente")
	public void verificoAMensagemDeUsuarioJaExistente() {
		Assert.assertEquals(Constants.MSG_USUARIO_EXISTENTE, basePg.validarRepetido());
		
	}

}
