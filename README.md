[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=person-api&uri=https%3A%2F%2Fraw.githubusercontent.com%2FUellingtonDamasceno%2Fperson-api%2Fmain%2Fsrc%2Fmain%2Fresources%2Finsomnia.json)

| URL          | Método | Descrição                                   | Request Stream                           | Response Stream    | Status Code Returned |
| ------------ | :----: | ------------------------------------------- | ---------------------------------------- | ------------------ | :------------------: |
| /people      |  GET   | Todas as pessoas cadastradas no sistema.    | n/a                                      | Coleção de pessoas |       200/404        |
| /people/{id} |  GET   | Pega uma pessoa especifica                  | n/a                                      | Pessoa             |       200/404        |
| /people      |  POST  | Cria um novo registro de pessoa no sistema. | JSON de uma pessoa sem o id especificado | 201/404            |
| /people/{id} |  PUT   | Atualiza uma pessoa do sistema              | Pessoa                                   | n/a                |       200/404        |
| /people/{id} | DELETE | Deleta uma pessoa                           | n/a                                      | n/a                |       200/404        |
