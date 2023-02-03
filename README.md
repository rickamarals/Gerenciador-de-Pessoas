# Gerenciador-de-Pessoas
Avaliação Desenvolvedor Back-end Attornatus


Desafio Java

Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:

· Criar uma pessoa

· Editar uma pessoa

· Consultar uma pessoa

· Listar pessoas

· Criar endereço para pessoa

· Listar endereços da pessoa

· Poder informar qual endereço é o principal da pessoa

Uma Pessoa deve ter os seguintes campos:

· Nome

· Data de nascimento

· Endereço:

· Logradouro

· CEP

· Número

· Cidade

Requisitos

· Todas as respostas da API devem ser JSON

· Banco de dados H2

Diferencial

· Testes

· Clean Code

Será levado em avaliação

· Estrutura, arquitetura e organização do projeto

· Boas práticas de programação

· Alcance dos objetivos propostos.



## Qualidade de código

1. Durante a implementação de uma nova funcionalidade de software solicitada, quais critérios você avalia e implementa para garantia de qualidade de software?

	Para garantia de uma implementação de qualidade de software, é preciso seguir a linha da Engenharia de Software. A definição do ciclo de vida de desenvolvimento, analise de requisitos funcionais e não funcionais, levantamento dos casos de uso e testes. A partir dessa analise poderá ser implementado e testado

2. Em qual etapa da implementação você considera a qualidade de software?

	Considero a qualidade de software importante em todas as etapas da implementação. Tanto para garantir a possibilidade de teste e manutenção do código, quanto para garantir uma boa experiência ao usuário final.
  
  
  ## Ferramentas e Tecnologias utilizadas
  
  - IntelliJ - IDE;
- Java v. 11.0.12 -;
- Apache Maven - Gerenciamento de dependências e build;
- Spring Data JPA - Framework para acesso a dados com mapeamento objeto-relacional (ORM);
- Spring Boot v. 2.7.7 - Framework para desenvolvimento Back-End;
- Spring Web - Para criar aplicações web, incluindo RESTful, usando Spring MVC e Apache TomCat como container Web padrão;
- Lombok - Biblioteca Java para redução de código boilerplate e aumento de produtividade;
- H2 - SGBD;
- Insomnia - Plataforma para teste de endpoints da API.

## Configurações Banco de Dados

<table>
    <tr><td>Nome do Banco de Dados</td><td>pessoas_bd</td></tr>
    <tr><td>Driver Class</td><td>org.h2.Driver</td></tr>
    <tr><td>JDBC URL</td><td>jdbc:h2:mem:pessoasdb</td></tr>
    <tr><td>User Name</td><td>admin</td></tr>
    <tr><td>Password</td><td>123</td></tr>
    <tr><td>Server Port</td><td>8080</td></tr>
    <tr><td>Console Path</td><td>localhost:8080/h2-console</td></tr>
    <tr><td>Tabelas</td><td>tb_pessoa e tb_endereco</td></tr>
</table>
  
  
  ## API

### Adicionar Pessoa:
- Verbo HTTP: POST
- Endpoint: <code>localhost:8080/pessoa</code>
- Exemplo de Requisição:
```
{
	"pessoa": {
		"nome": "Ricardo",
		"dataNascimento": "25/10/2002",
		"enderecos": [
			{
				"logradouro": "Rua Miguel Roque",
				"cep": "02472060",
				"numero": 191,
				"cidade": "São Pualo",
				"enderecoPrincipal":true
			}
		]
	}
}
```

### Editar Pessoa:
- Verbo HTTP: POST
- Endpoint: <code>localhost:8080/pessoa</code>
- Exemplo de Requisição:
```
{
	"pessoa": {
	        "id": 1,
		"nome": "Ricardo de Souza",
		"dataNascimento": "25/10/2002",
		"enderecos": [
			{
				"logradouro": "Rua  Miguel Roque",
				"cep": "02472060",
				"numero": 191,
				"cidade": "São Paulo",
				"enderecoPrincipal":true
			}
		]
	}
}
```

### Consultar uma Pessoa pelo ID:
- Verbo HTTP: GET
- Endpoint: <code>localhost:8080/pessoa/{id da pessoa}</code>
- Exemplo de Resposta:
```
{
	"id": 1,
		"nome": "Ricardo de Souza",
		"dataNascimento": "25/10/2002",
		"enderecos": [
			{
				"logradouro": "Rua  Miguel Roque",
				"cep": "02472060",
				"numero": 191,
				"cidade": "São Paulo",
				"enderecoPrincipal":true
		}
	]
}
```

### Listar Pessoas:
- Verbo HTTP: GET
- Endpoint: <code>localhost:8080/pessoas</code>
- Exemplo de Resposta:
```
[
	{
		"id": 1,
		"nome": "Ricardo de Souza",
		"dataNascimento": "25/10/2002",
		"enderecos": [
			{
				"logradouro": "Rua  Miguel Roque",
				"cep": "02472060",
				"numero": 191,
				"cidade": "São Paulo",
				"enderecoPrincipal":true
			}
		]
	},
	{
		"id": 2,
		"nome": "Pedro",
		"dataNascimento": "07/04/1998",
		"enderecos": []
	}
]
```

### Criar Endereço para Pessoa:
- Verbo HTTP: PUT
- Endpoint: <code>localhost:8080/endereco</code>
- Exemplo de Requisição:
```
{
	"pessoa": {
		"nome": "Pedro",
		"id": 2,
		"dataNascimento": "07/04/1998",
		"enderecos": [
			{
				"logradouro": "Avenida guaca",
				"cep": "58478264",
				"numero": 522,
				"cidade": "São Paulo",
				"enderecoPrincipal": true
			},
			{
				"logradouro": "Rua Timbiras",
				"cep": "12794634",
				"numero": 946,
				"cidade": "São Paulo",
				"enderecoPrincipal": false
			}
		]
	}
}
```

### Listar Endereços da Pessoa:
- Verbo HTTP: GET
- Endpoint: <code>localhost:8080/pessoa/{id da pessoa}/enderecos</code>
- Exemplo de Resposta:
```
[
	{
		"id": 3,
				"logradouro": "Avenida guaca",
				"cep": "58478264",
				"numero": 522,
				"cidade": "São Paulo",
		"enderecoPrincipal": true
	},
	{
		"id": 4,
	"logradouro": "Rua Timbiras",
				"cep": "12794634",
				"numero": 946,
				"cidade": "São Paulo",
	}
]
```

### Listar Endereço Principal da Pessoa:
- Verbo HTTP: GET
- Endpoint: <code>localhost:8080/pessoa/{id da pessoa}/enderecos/principal</code>
- Exemplo de Resposta:
```
[
	{
		"id": 3,
			"logradouro": "Avenida guaca",
				"cep": "58478264",
				"numero": 522,
				"cidade": "São Paulo",
		"enderecoPrincipal": true
	}
]





 Alguns prints do sistema

![image](https://user-images.githubusercontent.com/80012379/216491896-c43e9a0e-11e2-43d7-9d08-c8b4352c8389.png)
![image](https://user-images.githubusercontent.com/80012379/216491961-6ee96c73-ae5c-4175-89cb-8985b42b53f3.png)
![image](https://user-images.githubusercontent.com/80012379/216491968-9dd24fb9-9f31-41b8-920f-2ad3095550ff.png)
![image](https://user-images.githubusercontent.com/80012379/216491989-6806a4a3-e6a8-4925-b028-978f4d712b6e.png)
![image](https://user-images.githubusercontent.com/80012379/216492083-ea60e1dc-4dfd-46c1-835a-a899d79233b4.png)
![image](https://user-images.githubusercontent.com/80012379/216492125-cf1a23fe-b9eb-499a-a7f5-4403474438bc.png)
![image](https://user-images.githubusercontent.com/80012379/216492143-f4d50518-813f-4cc8-88cd-cd1c593f5398.png)
![image](https://user-images.githubusercontent.com/80012379/216492316-0fbae400-c76c-447d-8797-5a523928a5bd.png)

