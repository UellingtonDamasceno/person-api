| URL          | Método | Descrição                                   | Request Stream                           | Response Stream    | Status Code Returned |
| ------------ | :----: | ------------------------------------------- | ---------------------------------------- | ------------------ | :------------------: |
| /people      |  GET   | Todas as pessoas cadastradas no sistema.    | n/a                                      | Coleção de pessoas |       200/404        |
| /people/{id} |  GET   | Pega uma pessoa especifica                  | n/a                                      | Pessoa             |       200/404        |
| /people      |  POST  | Cria um novo registro de pessoa no sistema. | JSON de uma pessoa sem o id especificado | 201/404            |
| /people/{id} |  PUT   | Atualiza uma pessoa do sistema              | Pessoa                                   | n/a                |       200/404        |
| /people/{id} | DELETE | Deleta uma pessoa                           | n/a                                      | n/a                |       200/404        |
