#language: pt

Funcionalidade: Fazer login no Advantage Online Shopping

como usuario desejo
deseje fazer login
para acessar o Advantage Shopping


Contexto:
Dado que navego ate a pagina inicial da Advantage Shopping
E clico no menu usuarios

@login
Cenario: Deve fazer login com dados validos
E digito um usuario valido "<username>"
E digito uma senha valida "<senha>"
E clico em sign-in
E verifico se o usuario eh exibido no topo da pagina "<username>"


Exemplos:
|	username			|	senha							|
|	Wesley				|	Abcde@123					|
