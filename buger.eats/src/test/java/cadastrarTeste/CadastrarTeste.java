package cadastrarTeste;

import cadastrarPage.CadastrarPage;
import elementos.Elementos;
import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;


public class CadastrarTeste {

	Elementos el = new Elementos();
	Metodos metodos = new Metodos();
	CadastrarPage cadPage = new CadastrarPage();

	@Given("que esteja no formulario")
	public void queEstejaNoFormulario() {
		Executa.abrirNavegador(true);

	}

	@Given("preencho os dados")
	public void preenchoOsDados() {
		cadPage.preencherDadosPessoais();

	}

	@Given("preencho o endereco")
	public void preenchoOEndereO() {
		cadPage.preencherDadosEndereco();

	}

	@Given("preencho o metodo de entrega")
	public void preenchoOMetodoDeEntrega() throws InterruptedException {
		cadPage.selecionarMetodoEntrega();

	}

	@Given("incluo a cnh")
	public void incluoACnh() throws InterruptedException {
		//cadPage.anexarCnh();
		metodos.clicar(el.anexarCnh);
		Thread.sleep(1000);
		metodos.upload("C:\\Users\\laris\\Downloads\\rg.jpg", 0);
	}

	@When("enviar formulario")
	public void enviarFormulario() {
		metodos.clicar(el.btnCadastrar);

	}

	@Then("formulario enviado com sucesso")
	public void formularioEnviadoComSucesso() {
		metodos.clicar(el.btnFechar);

	}

}
