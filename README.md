# Person-api

[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=person-api&uri=https%3A%2F%2Fraw.githubusercontent.com%2FUellingtonDamasceno%2Fperson-api%2Fmain%2Fsrc%2Fmain%2Fresources%2Finsomnia.json)

---

Um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com Spring Boot.

## Pré-requisitos

- Java 11 ou versões superiores.
- Maven 3.6.3 ou versões superiores.
- Git

## Intalação

Para executar o projeto no terminal, digite o seguinte comando:

    mvn spring-boot:run

Após executar o comando acima, basta abrir o seguinte endereço e visualizar a execução do projeto:

    http://localhost:8080/api/v1/people

## Rotas

| URL            | Método | Descrição                                   | Request Stream                            | Response Stream    | Status Code Returned |
| -------------- | :----: | ------------------------------------------- | ----------------------------------------- | ------------------ | :------------------: |
| `/people`      |  GET   | Todas as pessoas cadastradas no sistema.    | n/a                                       | Coleção de pessoas |       200/404        |
| `/people/{id}` |  GET   | Pega uma pessoa especifica                  | n/a                                       | Pessoa             |       200/404        |
| `/people`      |  POST  | Cria um novo registro de pessoa no sistema. | JSON de uma pessoa sem o id especificado. | 201/404            |
| `/people/{id}` |  PUT   | Atualiza uma pessoa do sistema              | Pessoa                                    | n/a                |       200/404        |
| `/people/{id}` | DELETE | Deleta uma pessoa                           | n/a                                       | n/a                |       204/404        |

## Tecnologias utilizadas

- [Spring Initialzr](https://start.spring.io)
- [Spring boot](https://spring.io)
- [Lombok](https://projectlombok.org)
- [MapStruct](https://mapstruct.org)
