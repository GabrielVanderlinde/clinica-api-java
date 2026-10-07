# Batch de Cadastros - Guia de Execução

## Ordem Recomendada de Execução

### 1. Iniciar o banco de dados
```bash
docker-compose up -d
```

### 2. Iniciar a aplicação
```bash
cd api
./mvnw spring-boot:run
```

### 3. Executar cadastros de médicos (em ordem)

Execute sequencialmente as requisições da pasta `Pre-definicoes/Medicos`:

1. ✅ Cadastrar Médico 1 - Dr. Carlos Ferreira
2. ✅ Cadastrar Médico 2 - Dra. Ana Silva
3. ✅ Cadastrar Médico 3 - Dr. Roberto Santos
4. ✅ Cadastrar Médico 4 - Dra. Mariana Costa
5. ✅ Cadastrar Médico 5 - Dr. Pedro Oliveira

### 4. Executar cadastros de pacientes (em ordem)

Execute sequencialmente as requisições da pasta `Pre-definicoes/Pacientes`:

1. ✅ Cadastrar Paciente 1 - Júlia Vasconcellos
2. ✅ Cadastrar Paciente 2 - João Pedro
3. ✅ Cadastrar Paciente 3 - Maria Fernanda
4. ✅ Cadastrar Paciente 4 - Lucas Gabriel
5. ✅ Cadastrar Paciente 5 - Beatriz Ramos

### 5. Testar outros endpoints

Após os cadastros, você pode testar:

- **Listagem de Médicos**: GET /medicos
- **Listagem de Médicos Ordenada**: GET /medicos?sort=nome,asc
- **Listagem Personalizada - Paginação**: GET /medicos?page=0&size=10
- **Atualizar Médico**: PUT /medicos (use ID 1-5)
- **Excluir Médico**: DELETE /medicos/{id} (use ID 1-5)
- **Listagem de Pacientes**: GET /pacientes

## IDs dos Cadastros

Após a execução, os IDs serão:
- Médicos: 1, 2, 3, 4, 5
- Pacientes: 1, 2, 3, 4, 5

## Dados Resumidos

### Médicos

| ID | Nome | Especialidade | Cidade | UF |
|----|------|---------------|--------|----|
| 1 | Dr. Carlos Ferreira | ORTOPEDIA | Blumenau | SC |
| 2 | Dra. Ana Silva | CARDIOLOGIA | São Paulo | SP |
| 3 | Dr. Roberto Santos | DERMATOLOGIA | Rio de Janeiro | RJ |
| 4 | Dra. Mariana Costa | PEDIATRIA | Belo Horizonte | MG |
| 5 | Dr. Pedro Oliveira | GINECOLOGIA | Porto Alegre | RS |

### Pacientes

| ID | Nome | Cidade | UF |
|----|------|--------|----|
| 1 | Júlia Vasconcellos | Blumenau | SC |
| 2 | João Pedro | São Paulo | SP |
| 3 | Maria Fernanda | Rio de Janeiro | RJ |
| 4 | Lucas Gabriel | Belo Horizonte | MG |
| 5 | Beatriz Ramos | Porto Alegre | RS |
