# Cadastro de veículos

Este projeto é uma aplicação Java que oferece operações CRUD (Create, Read, Update, Delete) para gerenciar informações de veículos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL 8
- Spring MVC

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **src/main/java/com/carros/api:** Pacote principal contendo os controladores da API.
   - `CarrosController.java`: Controlador responsável por gerenciar os endpoints relacionados aos carros.
   - `IndexController.java`: Index da API, onde retorna os registros de todos os carros.

- **src/main/resources:** Arquivos de configuração e recursos.

- **src/test:** Testes unitários.

## Configuração do Projeto

1. **Configuração do Banco de Dados:**
    - Foi utilizado o banco de dados MySQL 8 em localhost:3306, o script DML está na pasta "mysql".
    - Configure as propriedades do banco de dados no arquivo `application.properties`.

2. **Execução do Aplicativo:**
    - Execute a classe principal `CarrosApplication.java` para iniciar o servidor.

## Endpoints da API

- **GET /api/v1/carros:** Retorna todos os veículos.
- **GET /api/v1/carros/{id}:** Retorna os detalhes de um veículo específico.
- **POST /api/v1/carros:** Adiciona um novo veículo.
- **PUT /api/v1/carros/{id}:** Atualiza os dados de um veículo.
- **DELETE /api/v1/carros/{id}:** Exclui um veículo.

## Testes Unitários

O projeto inclui testes unitários para garantir a robustez do código. Execute os testes usando sua ferramenta de construção preferida.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar pull requests.

## Autor

Brian Souza
