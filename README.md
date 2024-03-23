**Aviso: Este README está escrito em Português**

# Microsserviços para Biblioteca de Livros

Este é um projeto de microsserviços desenvolvido em Java 17 utilizando Spring Boot e MongoDB como banco de dados. O objetivo é criar dois microsserviços para uma biblioteca de livros: um para venda de livros e outro para compra. Os microsserviços se comunicam através de um gateway e de um servidor de descoberta (discovery server).

## Sumário

- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar](#como-executar)
- [Endpoints](#endpoints)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Visão Geral

O projeto consiste em dois microsserviços distintos:

- **Microsserviço de Venda de Livros (`library`)**: Responsável por operações relacionadas à venda de livros, incluindo criação, leitura, atualização e exclusão de livros.
  
- **Microsserviço de Compra de Livros (`register`)**: Responsável por operações relacionadas à compra de livros, incluindo criação, leitura, atualização e exclusão de usuários.

Cada microsserviço possui sua própria estrutura de pacotes e funcionalidades, mas compartilham a mesma infraestrutura de comunicação via gateway e servidor de descoberta.

## Estrutura do Projeto

O projeto está dividido em vários pacotes, cada um com uma responsabilidade específica:

- `controller`: Contém os controladores responsáveis por lidar com as requisições HTTP.
- `model`: Contém as classes de modelo que representam os objetos de domínio.
- `repository`: Contém os repositórios responsáveis por acessar o banco de dados.
- `service`: Contém os serviços responsáveis pela lógica de negócios.
- `shared`: Contém classes compartilhadas entre diferentes partes do sistema.
- `util`: Contém classes utilitárias.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Cloud
- MongoDB
- Maven

## Como Executar

Para executar o projeto, siga estas etapas:

1. Clone este repositório:

    ```
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do microsserviço de venda de livros (`library`):

    ```
    cd library
    ```

3. Execute o microsserviço de venda de livros:

    ```
    mvn spring-boot:run
    ```

4. Navegue até o diretório do microsserviço de compra de livros (`register`):

    ```
    cd register
    ```

5. Execute o microsserviço de compra de livros:

    ```
    mvn spring-boot:run
    ```

Os microsserviços estarão disponíveis nos seguintes endpoints:

- Microsserviço de venda de livros: `http://localhost:porta/books`
- Microsserviço de compra de livros: `http://localhost:porta/users`

Certifique-se de configurar corretamente o gateway e o servidor de descoberta para que os microsserviços possam se comunicar adequadamente.

## Endpoints

A documentação dos endpoints pode ser encontrada nos próprios controladores dos microsserviços (`BookController` e `UserController`). Cada endpoint é responsável por uma operação específica, como criar, ler, atualizar ou excluir livros/usuários.

## Contribuindo

Se você quiser contribuir para este projeto, siga estas etapas:

1. Faça um fork do projeto
2. Crie sua branch de recurso (`git checkout -b feature/NovoRecurso`)
3. Faça commit de suas alterações (`git commit -am 'Adicionar NovoRecurso'`)
4. Faça push para a branch (`git push origin feature/NovoRecurso`)
5. Abra um pull request

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).

---

**Notice: This README is written in English**

# Microservices for Book Library

This is a microservices project developed in Java 17 using Spring Boot and MongoDB as the database. The goal is to create two microservices for a book library: one for book sales and another for registration. The microservices communicate through a gateway and a discovery server.

## Summary

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Overview

The project consists of two distinct microservices:

- **Book Sales Microservice (`library`)**: Responsible for operations related to book sales, including creation, reading, updating, and deletion of books.
  
- **User Registration Microservice (`register`)**: Responsible for operations related to user registration, including creation, reading, updating, and deletion of users.

Each microservice has its own package structure and functionality, but they share the same communication infrastructure via gateway and discovery server.

## Project Structure

The project is divided into several packages, each with a specific responsibility:

- `controller`: Contains the controllers responsible for handling HTTP requests.
- `model`: Contains the model classes representing domain objects.
- `repository`: Contains the repositories responsible for accessing the database.
- `service`: Contains the services responsible for business logic.
- `shared`: Contains shared classes between different parts of the system.
- `util`: Contains utility classes.

## Technologies Used

- Java 17
- Spring Boot
- Spring Cloud
- MongoDB
- Maven

## How to Run

To run the project, follow these steps:

1. Clone this repository:

    ```
    git clone https://github.com/your-user/your-repo.git
    ```

2. Navigate to the book sales microservice directory (`library`):

    ```
    cd library
    ```

3. Run the book sales microservice:

    ```
    mvn spring-boot:run
    ```

4. Navigate to the user registration microservice directory (`register`):

    ```
    cd register
    ```

5. Run the user registration microservice:

    ```
    mvn spring-boot:run
    ```

The microservices will be available at the following endpoints:

- Book sales microservice: `http://localhost:port/books`
- User registration microservice: `http://localhost:port/users`

Make sure to properly configure the gateway and discovery server so that the microservices can communicate properly.

## Endpoints

The documentation for the endpoints can be found in the microservices'
