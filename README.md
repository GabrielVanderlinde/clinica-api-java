# Voll.med API

API REST desenvolvida em Java 17 com Spring Boot 4 para gerenciamento de medicos e pacientes de uma clinica medica.

## Tecnologias

* Java 17
* Spring Boot 4
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Flyway
* Bean Validation
* Lombok
* Maven
* Postman

## Funcionalidades

* Cadastro de medicos
* Listagem de medicos
* Atualizacao de dados de medicos
* Inativacao de medicos
* Cadastro de pacientes
* Listagem de pacientes
* Atualizacao de dados de pacientes
* Inativacao de pacientes
* Validacao dos dados recebidos
* Paginacao e ordenacao
* Persistencia dos dados em MySQL
* Versionamento do banco com Flyway

## Estrutura

```text
api/src/
├── main/
│   ├── java/
│   │   └── med/voll/api/
│   │       ├── controller/
│   │       ├── medico/
│   │       ├── paciente/
│   │       └── endereco/
│   └── resources/
│       ├── db/
│       │   └── migration/
│       └── application.properties
└── test/
```

### Fluxo da aplicacao

```text
Cliente
   ↓
Controller
   ↓
DTO
   ↓
Entity
   ↓
Repository
   ↓
MySQL
```

## Banco de dados

O projeto utiliza MySQL com Docker.

Configure as credenciais no arquivo:

```text
api/src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost/vollmed_api
spring.datasource.username=root
spring.datasource.password=root
```

As alteracoes na estrutura do banco sao controladas pelo Flyway atraves das migrations.

## Como executar

### 1. Clone o projeto

```bash
git clone <URL_DO_REPOSITORIO>
cd clinica-api-java
```

### 2. Inicie o banco de dados com Docker

```bash
docker compose up -d
```

### 3. Execute a aplicacao

Linux/macOS:

```bash
cd api
./mvnw spring-boot:run
```

Windows:

```bash
cd api
mvnw.cmd spring-boot:run
```

A API sera executada, por padrao, em:

```text
http://localhost:8080
```

## Endpoints

### Medicos

| Metodo | Endpoint        | Descricao           |
| ------ | --------------- | ------------------- |
| POST   | `/medicos`      | Cadastrar medico   |
| GET    | `/medicos`      | Listar medicos     |
| PUT    | `/medicos`      | Atualizar medico   |
| DELETE | `/medicos/{id}` | Inativar medico    |

### Pacientes

| Metodo | Endpoint        | Descricao            |
| ------ | --------------- | -------------------- |
| POST   | `/pacientes`    | Cadastrar paciente   |
| GET    | `/pacientes`    | Listar pacientes     |
| PUT    | `/pacientes`    | Atualizar paciente   |
| DELETE | `/pacientes/{id}` | Inativar paciente  |

### Exemplo de cadastro de medico

```http
POST /medicos
Content-Type: application/json
```

```json
{
  "nome": "Joao da Silva",
  "email": "joao@email.com",
  "crm": "123456",
  "telefone": "47999999999",
  "especialidade": "ORTOPEDIA",
  "endereco": {
    "logradouro": "Rua das Flores",
    "bairro": "Centro",
    "cep": "89000000",
    "cidade": "Blumenau",
    "uf": "SC",
    "numero": "100",
    "complemento": "Sala 2"
  }
}
```

### Exemplo de cadastro de paciente

```http
POST /pacientes
Content-Type: application/json
```

```json
{
  "nome": "Maria Silva",
  "email": "maria@email.com",
  "cpf": "123.456.789-00",
  "telefone": "47999999999",
  "endereco": {
    "logradouro": "Rua das Flores",
    "bairro": "Centro",
    "cep": "89000000",
    "cidade": "Blumenau",
    "uf": "SC",
    "numero": "100",
    "complemento": "Apto 101"
  }
}
```

## Paginacao e ordenacao

A listagem de medicos e pacientes suporta paginacao e ordenacao utilizando os parametros da API.

Exemplo:

```text
GET /medicos?page=0&size=10&sort=nome
GET /pacientes?page=0&size=10&sort=nome
```

## Validacao

Os dados recebidos pela API sao validados utilizando Bean Validation e @Valid.

Exemplos de validacoes:

* campos obrigatorios;
* formato de e-mail;
* formato de CPF;
* tamanho dos campos;
* dados de endereco;
* informacoes do medico e paciente.

## Testes

Os endpoints podem ser testados utilizando os arquivos de requisicoes Postman disponiveis na pasta `postman/`:

* 5 pre-definicoes de cadastro para medicos
* 5 pre-definicoes de cadastro para pacientes
* Requisicoes CRUD completas para medicos e pacientes
* Documentacao em `postman/BATCH_CADASTROS.md`

Para importar a colecao no Postman, utilize o arquivo `postman/medvoll_api_collection.json`.

## Migracoes de Banco

* V1: Cria tabela medicos
* V2: Adiciona telefone em medicos
* V3: Cria tabela pacientes
* V4: Adiciona coluna ativo em medicos
* V5: Adiciona coluna ativo em pacientes

## Objetivo do projeto

Projeto desenvolvido para estudo de Spring Boot 4, criacao de APIs REST, persistencia com JPA/Hibernate, validacao de dados, migrations com Flyway e integracao com MySQL.
