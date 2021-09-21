#language: pt
Funcionalidade: Fazer cadastro e login no Advantage Online Shopping

Contexto:
Dado que estou na pagina inicial da Advatage Shopping
Quando clico no menu users

Esquema do Cenario: Deve efetuar um cadastro no site
E seleciono CREATE NEW ACCOUNT
Entao sou redirecionado para a pagina de registro
E Preencho os campos obrigatorios <username> <email> <password> <confirma_password>
E aceito as condicoes de uso
E clico em REGISTER
Entao sou redirecionado para a pagina inicial


Exemplos:
	| username | email      | password | confirma_password |
	|   4   | extendido |   8   |   3     |
