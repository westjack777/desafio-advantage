#language: pt

Funcionalidade: Fazer login no Advantage Online Shopping

como usuário desejo
deseje fazer login
para acessar o Advantage Shopping


@login	
Contexto:
Dado que navego ate a pagina inicial da Advantage Shopping
E clico no menu usuarios

 @login_valido
Cenario: Deve fazer login com dados validos
E digito um usuario valido "<usuario>"
E digito uma senha valida "<senha>"
E clico em sign-in
Entao sou redirecionado para a tela inicial
E verifico se meu usuario eh exibido no topo da pagina


Exemplos:
|	usuario				|	senha							|
|	Wesley				|	Abcde@123					|
