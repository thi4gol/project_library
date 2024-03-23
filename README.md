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
