# Voll Med API

API backend para gerenciamento de operações de uma clínica médica, desenvolvida com Java e Spring Boot. O projeto aborda construção de APIs REST, validação, persistência relacional, paginação e migrações de banco de dados.

## Visão geral

A API organiza operações relacionadas a médicos e pacientes, aplicando regras de validação e persistência. É um projeto de prática de desenvolvimento backend e de conceitos comuns em sistemas de gestão.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA e Hibernate
- MySQL
- Flyway
- Maven
- Postman

Confira a versão do Java e as dependências no arquivo de build do repositório.

## Funcionalidades

- Cadastro, consulta, atualização e inativação de médicos
- Operações de cadastro e manutenção de pacientes
- Validação de dados de entrada
- Paginação e ordenação de consultas
- Persistência relacional
- Controle de alterações do schema com Flyway

## Pré-requisitos

- JDK compatível com a configuração do projeto
- Maven
- MySQL
- Cliente HTTP, como Postman (opcional)

## Instalação e execução

```bash
git clone https://github.com/GabrielVanderlinde/vollmed-api.git
cd vollmed-api
```

Configure a conexão com o MySQL conforme a configuração da aplicação. Use variáveis de ambiente para credenciais e mantenha segredos fora do controle de versão. Exemplo de configuração conceitual:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Defina essas variáveis no ambiente local e execute:

```bash
mvn clean package
mvn spring-boot:run
```

## Endpoints principais

Os mapeamentos abaixo devem ser conferidos nos controllers para confirmar rotas, parâmetros e payloads da versão atual.

### Médicos

| Método | Operação |
| --- | --- |
| `POST` | Cadastrar médico |
| `GET` | Listar médicos |
| `PUT` | Atualizar dados de médico |
| `DELETE` | Inativar médico por identificador |

### Pacientes

A implementação inclui operações para cadastro, consulta, atualização e inativação de pacientes. Consulte os controllers para as rotas e contratos completos.

## Banco de dados e migrações

O Flyway gerencia as migrações do banco de dados. Ao iniciar a aplicação, confirme que as credenciais e o banco configurado estão acessíveis para que as migrações possam ser aplicadas corretamente.

## Testes e validação

Execute a suíte de testes, quando configurada, com:

```bash
mvn test
```

Utilize o Postman ou outra ferramenta HTTP para validar os fluxos da API e os códigos de resposta.

## Autor

**Gabriel Vanderlinde** · [GitHub](https://github.com/GabrielVanderlinde)

---

Projeto de estudo voltado à construção de APIs backend com Java, Spring Boot e persistência relacional.
