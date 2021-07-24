<h2>Digital Innovation: Expert class - Desenvolvendo uma API de gerenciamento de cerveja com validação atraves de testes unitarios.</h2>

Pequeno sistema para o gerenciamento de estoque de cerveja  através de uma API REST, criada com o Spring Boot,

arquitetura REST, com testes unitarios efetuados com JUNIT e MOCKITO.

Durante o Desenvolvimento foram abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot atraves do https://start.spring.io
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de produto(cerveja) (Cadastro, leitura, atualização e remoção de cervejas de um sistema).
* Padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários em Java utilizando: JUnit, Mockito e Hamcrest.
* Desenvolvimento de testes unitários para validação de funcionalides  básicas: criação, listagem, consulta por nome e exclusão de cervejas.
* Metodologia TDD: apresentação e exemplo prático em 2 funcionaliades importantes: incremento e decremento do número de cervejas no estoque.
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/beer
```


Foram utlizadas as seguintes ferramentas para a execução do projeto desenvolvido. 

* Java 11 ou versões superiores.
*  https://start.spring.io para configurar o projeto e suas dependencias
* Depencias do spring-boot Utilizadas no projeto : h2Database, springfox-swagger-ui, springfox, maven-plugins,  beanvalidation-api, glassfish, hibernator-validator, mapstruct, lombok, spring-boot-devtools, spring-boot-maven-plugin, spring-boot-starter-actuator, spring-boot-starter-data-jpa, spring-boot-starter-test, spring-boot-starter-web. 
* Maven 3.6.3 ou versões superiores.
* SDKMan
* Intellj IDEA Community Edition. 
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem

Abaixo, seguem links para melhor compreensão do sistema.

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)





