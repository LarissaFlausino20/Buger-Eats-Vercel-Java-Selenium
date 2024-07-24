package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// dados
	public By nome = By.xpath("//input[@name='name']");
	public By cpf = By.xpath("//input[@name='cpf']");
	public By email = By.xpath("//input[@name='email']");
	public By whatsapp = By.xpath("//input[@name='whatsapp']");

	// endereço
	public By cep = By.xpath("//input[@name='postalcode']");
	public By btnBuscarCep = By.xpath("//input[@type='button']");
	public By numero = By.xpath("//input[@name='address-number']");
	public By complemento = By.xpath("//input[@name='address-details']");

	// metodos de entrega
	public By moto = By.xpath("//span[text()='Moto']");
	public By bicicleta = By.xpath("//span[text()='Bicicleta']");
	public By vanCarro = By.xpath("//span[text()='Van/Carro']");

	// cnh
	public By anexarCnh = By.xpath("//p[text()='Foto da sua CNH']");

	// cadastre-se
	public By btnCadastrar = By.xpath("//button[@class='button-success']");

	// botao fechar
	public By btnFechar = By.xpath("/html/body/div[2]/div/div[6]/button[1]");

}
