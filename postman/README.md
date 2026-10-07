# Postman Collections - API Voll Med

## Estrutura de Pastas

```
postman/
└── postman/
    ├── collections/
    │   └── medvoll_api/
    │       ├── Medicos/
    │       │   ├── Pre-definicoes/          # 5 médicos prontos para cadastro
    │       │   ├── Cadastro de Médicos.request.yaml
    │       │   ├── Listagem de Médicos.request.yaml
    │       │   ├── Listagem de Médicos - Ordenada.request.yaml
    │       │   ├── Listagem Personalizada - Paginação.request.yaml
    │       │   ├── Atualizar Médicos.request.yaml
    │       │   └── Excluir Médico.request.yaml
    │       └── Pacientes/
    │           ├── Pre-definicoes/          # 5 pacientes prontos para cadastro
    │           └── Cadastro de Pacientes.request.yaml
    └── environments/
        └── Clinica.environment.yaml         # Configuração da URL base
```

## Configuração de Ambiente

O arquivo `Clinica.environment.yaml` está configurado com:
- **URL base**: `http://localhost:8080`

## Pré-definições

### Médicos (5 cadastros prontos)

1. **Dr. Carlos Ferreira** - Ortopedia (Blumenau/SC)
2. **Dra. Ana Silva** - Cardiologia (São Paulo/SP)
3. **Dr. Roberto Santos** - Dermatologia (Rio de Janeiro/RJ)
4. **Dra. Mariana Costa** - Pediatria (Belo Horizonte/MG)
5. **Dr. Pedro Oliveira** - Ginecologia (Porto Alegre/RS)

### Pacientes (5 cadastros prontos)

1. **Júlia Vasconcellos** (Blumenau/SC)
2. **João Pedro** (São Paulo/SP)
3. **Maria Fernanda** (Rio de Janeiro/RJ)
4. **Lucas Gabriel** (Belo Horizonte/MG)
5. **Beatriz Ramos** (Porto Alegre/RS)

## Como Usar

1. Importe a coleção no Postman
2. Selecione o ambiente "Clinica"
3. Execute as requisições de pré-definição para popular o banco de dados
4. Use as outras requisições para testar os endpoints

