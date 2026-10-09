# Voll Med API

API backend para gerenciamento de operações de uma clínica médica, desenvolvida com Java e Spring Boot. O projeto trabalha conceitos de APIs REST, validação, persistência relacional e migrações de banco de dados.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA e Hibernate
- MySQL
- Flyway
- Maven
- Postman

## Funcionalidades

- Cadastro e consulta de médicos
- Atualização e inativação de médicos
- Cadastro, consulta e atualização de pacientes
- Inativação de pacientes
- Validação de dados
- Paginação e ordenação
- Persistência em MySQL
- Migrações de banco com Flyway

## Como executar

### Pré-requisitos

- JDK 21 ou superior
- Maven
- MySQL
- Docker (opcional)

Clone o repositório:

```bash
git clone https://github.com/GabrielVanderlinde/vollmed-api.git
cd vollmed-api
```

Configure as variáveis e a conexão com o banco conforme `src/main/resources/application.properties`. Não utilize nem publique credenciais reais no repositório.

Execute a aplicação:

```bash
mvn clean install
mvn spring-boot:run
```

## Endpoints principais

### Médicos

| Método | Rota | Operação |
| --- | --- | --- |
| POST | `/medicos` | Cadastrar médico |
| GET | `/medicos` | Listar médicos |
| PUT | `/medicos` | Atualizar médico |
| DELETE | `/medicos/{id}` | Inativar médico |

### Pacientes

As operações de pacientes incluem cadastro, consulta, atualização e inativação. Consulte os controllers para detalhes das rotas e parâmetros da versão atual.

## Objetivo

Projeto de estudo para aprofundar conhecimentos em desenvolvimento backend, regras de negócio, validação e persistência com Spring.

## Autor

Gabriel Vanderlinde