# 🎫 Ticket Management System

Um sistema de gerenciamento de tickets desenvolvido com Spring Boot e PostgreSQL.

## 📹 Inspiração

Este projeto foi inspirado no vídeo: [https://www.youtube.com/watch?v=g4y0yADhsJA](https://www.youtube.com/watch?v=g4y0yADhsJA)

## 🚀 Tecnologias Utilizadas

- **Java 25**
- **Spring Boot 3.5.6**
- **Spring Data JPA**
- **PostgreSQL**
- **Docker & Docker Compose**
- **Maven**

## 📋 Funcionalidades

- ✅ CRUD completo de tickets
- ✅ API RESTful
- ✅ Conexão com banco PostgreSQL
- ✅ Containerização com Docker
- ✅ Monitoramento com Spring Boot Actuator

## 🏗️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/br/com/viniccius/
│   │   ├── controller/     # Controllers REST
│   │   ├── model/          # Entidades JPA
│   │   ├── repository/     # Repositórios
│   │   ├── service/        # Lógica de negócio
│   │   └── web/           # Classe principal
│   └── resources/
│       └── application.yml # Configurações
├── docker-compose.yml     # PostgreSQL container
└── pom.xml               # Dependências Maven
```

## 🐳 Como Executar

### 1. Iniciar o banco de dados PostgreSQL

```bash
docker-compose up -d
```

### 2. Executar a aplicação

```bash
./mvnw spring-boot:run
```

### 3. Acessar a aplicação

- **API Base**: http://localhost:8080/
- **Tickets**: http://localhost:8080/ticket
- **Health Check**: http://localhost:8080/actuator/health

## 📊 Endpoints da API

| Método | Endpoint  | Descrição               |
| ------ | --------- | ----------------------- |
| GET    | `/`       | Hello World             |
| GET    | `/api`    | Status da API           |
| GET    | `/ticket` | Listar todos os tickets |
| POST   | `/ticket` | Criar novo ticket       |

## 📝 Modelo de Dados

```json
{
  "id": "UUID",
  "title": "string",
  "description": "string",
  "status": "string",
  "priority": "string",
  "createdAt": "date",
  "updatedAt": "date",
  "archived": "boolean"
}
```

## 🗄️ Configuração do Banco

O projeto utiliza PostgreSQL com as seguintes configurações:

- **Host**: localhost:5432
- **Database**: mydb
- **Username**: user
- **Password**: password

## 🧪 Exemplo de Uso

### Criar um ticket

```bash
curl -X POST http://localhost:8080/ticket \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Bug no sistema",
    "description": "Erro ao fazer login",
    "status": "open",
    "priority": "High"
  }'
```

### Listar tickets

```bash
curl http://localhost:8080/ticket
```

## 👨‍💻 Autor

**Viniccius**

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
