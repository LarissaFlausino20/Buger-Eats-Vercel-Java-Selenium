package cadastrarPage;

import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class CadastrarPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Test

	public void preencherDadosPessoais() {
		metodos.escrever(el.nome, "Thoxuik");
		metodos.escrever(el.cpf, "99513914003");
		metodos.escrever(el.email, "lien3232@uorak.com");
		metodos.escrever(el.whatsapp, "11 999998989");

	}

	public void preencherDadosEndereco() {
		metodos.escrever(el.cep, "27281-440");
		metodos.clicar(el.btnBuscarCep);
		metodos.escrever(el.numero, "370");
		metodos.escrever(el.complemento, "Casa");

	}

	public void selecionarMetodoEntrega() throws InterruptedException {
		metodos.clicar(el.moto);

	}
}
