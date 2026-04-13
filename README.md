# API DevOps - Faculdade 🚀

Projeto desenvolvido para a disciplina de DevOps focado na implementação de uma esteira de CI/CD e containerização.

## 🛠 Tecnologias Utilizadas
* **Java 17** (Amazon Corretto)
* **Spring Boot 3.x**
* **Maven** (Gerenciador de dependências)
* **Docker** (Containerização)
* **GitHub Actions** (Automação de Pipeline)

## 🔄 Pipeline CI/CD
O projeto conta com um workflow automatizado que realiza:
1. **Build:** Compilação e verificação de integridade via Maven.
2. **Deploy (Simulado):** Estágio posterior ao build para validação da esteira.

## 🐳 Docker
Para rodar a aplicação via container, utilize os comandos:

```bash
# Construir a imagem
docker build -t api-devops-image .

# Rodar o container
docker run -d -p 8080:8080 --name api-container api-devops-image