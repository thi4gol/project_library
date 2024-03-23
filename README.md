# Microsserviços para Biblioteca de Livros

Este é um projeto de microsserviços desenvolvido em Java 17 utilizando Spring Boot e MongoDB como banco de dados. O objetivo é criar dois microsserviços para uma biblioteca de livros: um para venda de livros e outro para compra. Os microsserviços se comunicam através de um gateway e de um servidor de descoberta (discovery server).

## Estrutura do Projeto

O projeto está dividido em vários pacotes, incluindo `controller`, `model`, `repository`, `service`, `shared` e `util`. Cada microsserviço (venda de livros e compra de livros) segue uma estrutura semelhante, com controladores, modelos, serviços, repositórios e outras classes semelhantes.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Cloud
- MongoDB
- Maven

## Como Executar

Para executar o projeto, siga estas etapas:

1. Certifique-se de ter o Java 17 instalado em seu sistema.
2. Certifique-se de ter o MongoDB instalado e em execução.
3. Clone este repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
4. Navegue até o diretório do microsserviço de venda de livros: `cd library`
5. Execute o microsserviço de venda de livros: `mvn spring-boot:run`
6. Navegue até o diretório do microsserviço de compra de livros: `cd register`
7. Execute o microsserviço de compra de livros: `mvn spring-boot:run`
8. Os microsserviços estarão disponíveis nos seguintes endpoints:
   - Microsserviço de venda de livros: `http://localhost:porta/books`
   - Microsserviço de compra de livros: `http://localhost:porta/users`

Certifique-se de configurar corretamente o gateway e o servidor de descoberta para que os microsserviços possam se comunicar adequadamente.

## Contribuindo

Se você quiser contribuir para este projeto, siga estas etapas:

1. Faça um fork do projeto
2. Crie sua branch de recurso (`git checkout -b feature/NovoRecurso`)
3. Faça commit de suas alterações (`git commit -am 'Adicionar NovoRecurso'`)
4. Faça push para a branch (`git push origin feature/NovoRecurso`)
5. Abra um pull request

## Autores

- Thiago Siqueira (@thi4gol)

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
