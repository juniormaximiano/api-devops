<div align="center">

<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
<img src="https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white"/>

# 🚀 API DevOps — Faculdade

> Projeto desenvolvido para a disciplina de **DevOps**, focado na implementação de uma esteira de CI/CD, testes automatizados e containerização.

</div>

---

## 🛠 Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| ☕ **Java 17** (Amazon Corretto) | Linguagem principal da aplicação |
| 🌱 **Spring Boot 3.x** | Framework web |
| 📦 **Maven** | Gerenciador de dependências |
| 🧪 **JUnit 5** | Suite de testes unitários |
| 🐳 **Docker** | Containerização |
| ⚙️ **GitHub Actions** | Automação de Pipeline |

---

## ✅ Testes Unitários

A aplicação possui testes automatizados que garantem a integridade das funcionalidades principais. O Pipeline está configurado para **interromper o deploy caso algum teste falhe**.

**O que é testado:**

- 🟢 Disponibilidade do endpoint de Health Check (`/status`)
- ⏱️ Validação de tempo de atividade (Uptime) da aplicação
- 📋 Integridade dos retornos em formato JSON
- ❌ Tratamento de erros para rotas inexistentes (404)

```bash
# Para rodar os testes localmente:
mvn test
```

---

## 🔄 Pipeline CI/CD

O fluxo de automação via **GitHub Actions** realiza:

```
┌─────────────────────────────────────────────────────────────┐
│                                                             │
│   📋 Verificação   →   🧪 Testes   →   📦 Build   →   🔔  │
│      de Código           JUnit          Artefato     Alerta │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

- **📋 Verificação de Código** — Garante que o projeto compila corretamente
- **🧪 Execução de Testes** — Roda a suite de JUnit antes de qualquer passo
- **📦 Build** — Gera o artefato final apenas se os testes passarem
- **🔔 Alertas** — Notificação em tempo real via Webhook para o Discord

---

## 🐳 Docker

Para rodar a aplicação em um ambiente isolado via container:

```bash
# 1. Construir a imagem
docker build -t api-devops-image .
```

```bash
# 2. Rodar o container (mapeando a porta 8080)
docker run -d -p 8080:8080 --name api-container api-devops-image
```

---

<div align="center">

*Feito com disposição para a disciplina de DevOps*

</div>