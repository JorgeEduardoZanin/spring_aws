# Projeto de Estudo AWS com Spring Boot e Angular

Este é um projeto básico para estudo dos principais serviços da AWS, composto por:

- **Backend:** Spring Boot  
  - Implantado no **Elastic Beanstalk**  
  - Conecta-se a um banco **MySQL** hospedado no **Amazon RDS**

- **Frontend:** Angular  
  - Build estático hospedado no **Amazon S3** (site estático)

## Serviços AWS Utilizados

| Serviço              | Descrição                                    |
|----------------------|----------------------------------------------|
| Amazon RDS (MySQL)   | Banco de dados relacional gerenciado         |
| Elastic Beanstalk    | Plataforma PaaS para deploy do Spring Boot   |
| Amazon S3            | Armazenamento estático para o frontend       |

> **Observação:**  
> Projeto simples criado apenas para explorar o fluxo de deploy e configuração dos serviços AWS.

---

> **Como adicionar a imagem acima:**  
> 1. Coloque seu arquivo de imagem em `docs/aws-diagram.png` (ou outro caminho de sua preferência).  
> 2. Use a sintaxe Markdown:
>    ```markdown
>    [Texto alternativo](docs/aws-diagram.png)
>    ```
