@cadastro
Feature: Cadastrar entregadores
  Como usuario 
  Quero cadastrar um entregador
  Para possuir o cadastro
  
  Background: Acessar o formulario de cadastro 
     Given que esteja no formulario

  @cadastrar
  Scenario: Cadastrar entregador com moto
    And preencho os dados
    And preencho o endereco
    And preencho o metodo de entrega
    And incluo a cnh 
    When enviar formulario
    Then formulario enviado com sucesso
