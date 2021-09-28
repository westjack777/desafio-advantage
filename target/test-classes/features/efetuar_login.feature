#language: pt

Funcionalidade: Fazer cadastro no Advantage Online Shopping

Como usuário desejo
deseje me cadastrar
para acessar o Advantage Shopping

Contexto:
Dado que estou na pagina inicial da Advantage Shopping
Quando clico no menu users
E clico em criar nova conta
Entao sou redirecionado para a pagina de registro

@cadastro @campos_obrigatorios
Cenario: Deve cadastrar um novo usuario preenchendo o cadastro básico
E preencho os campos obrigatorios "<nome>""<email>""<senha>""<confirmar_senha>"
E aceito as condicoes de uso
E clico em registrar
Entao sou redirecionado para a area logada

Exemplos:
|	nome				|	email							|senha			|	confirmar_senha		|
|	gumercindos	|	teste@teste.com		|Abcde@123	|	Abcde@123					|

@cadastro @todos_campos
Cenario: Deve cadastrar um novo usuario preenchendo o cadastro completo
E preencho todos os campos "<nome>""<sobrenome>""<telefone>""<pais>""<cidade>""<endereco>""<estado>""<cep>"
E aceito as condicoes de uso
E clico em registrar
Entao sou redirecionado para a area logada

Exemplos:
|	nome				|	sobrenome					|telefone			|	pais				|	cidade			|	endereco							|estado			|	cep					|
|	fulanoxpto	|	teste@teste.com		|Abcde@123		|	Abcde@123		|	Wesleyzb		|	teste@teste.com				|Abcde@123	|	Abcde@123		|


@cadastro @usuario_existente
Cenario: Não deve cadastrar um usuario que já esteja cadastrado
E preencho os campos obrigatorios "Wesley""teste@teste.com""Abcde@123""Abcde@123	"
E aceito as condicoes de uso
E clico em registrar
Entao verifico a mensagem de usuario ja existente