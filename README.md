# 🚀 Task Service --- Aprendizado Java Moderno

Autor: Robert Teixeira
Objetivo: Evolução estruturada para Backend Engineer Sênior com foco em
arquitetura moderna, boas práticas e domínio profundo de Spring Boot.

------------------------------------------------------------------------

# 📌 Visão do Projeto

Este repositório faz parte de um plano estruturado de evolução técnica
em Java moderno utilizando:

-   Java 21+
-   Spring Boot 3+
-   Spring Data JPA
-   Maven
-   Arquitetura em microserviços
-   Clean Architecture
-   Boas práticas REST
-   Princípios de design profissional

O projeto evolui por fases progressivas, cada uma elevando o nível
técnico, arquitetural e estratégico.

------------------------------------------------------------------------

# 🏗️ Arquitetura Base

Estrutura adotada:

controller → service → repository → domain\
                        ↓\
                        dto\
                        mapper\
                        exception

Princípios aplicados:

-   Separação de responsabilidades\
-   Baixo acoplamento\
-   DTO para entrada e saída\
-   Service como camada de regra de negócio\
-   Repository como abstração de persistência\
-   Entidade como modelo de domínio\
-   Tratamento global de exceções

------------------------------------------------------------------------

# 🧠 ROADMAP COMPLETO DE APRENDIZADO

## 🟢 FASE 0 --- Arquitetura Antes do Código

Objetivo: Tomar decisões arquiteturais antes de implementar.

Decisões:

-   Microserviços desde o início\
-   Comunicação REST\
-   Banco local\
-   Build com Maven\
-   Uso de UUID\
-   Separação clara de camadas

------------------------------------------------------------------------

## 🟢 FASE 1 --- API REST Profissional

Objetivo: Criar endpoints com padrão profissional.

Endpoints:

-   POST /tasks\
-   GET /tasks\
-   GET /tasks/{id}\
-   PUT /tasks/{id}\
-   DELETE /tasks/{id}

Conceitos:

-   Interface + implementação no Service\
-   Uso de DTO\
-   Mapper dedicado\
-   Status HTTP corretos\
-   UUID como identificador

------------------------------------------------------------------------

## 🟢 FASE 2 --- JPA Profissional e Lifecycle

Objetivo: Entender gerenciamento de entidades.

Conceitos:

-   Estados da entidade (Managed, Detached, Removed)\
-   Dirty Checking\
-   @Transactional\
-   @PrePersist\
-   @PreUpdate

------------------------------------------------------------------------

## 🟢 FASE 3 --- Tratamento Global de Exceções

Objetivo: Padronizar respostas de erro.

Implementações:

-   @RestControllerAdvice\
-   Exception customizada\
-   ErrorResponse padronizado

------------------------------------------------------------------------

## 🟡 FASE 4 --- Validação e Robustez

Planejamento:

-   @Valid\
-   Bean Validation\
-   Tratamento de erros de validação

------------------------------------------------------------------------

## 🟡 FASE 5 --- Paginação e Performance

Planejamento:

-   Pageable\
-   Page`<T>`{=html}\
-   Ordenação\
-   Otimização de consultas

------------------------------------------------------------------------

## 🟡 FASE 6 --- Testes Automatizados

Planejamento:

-   Testes unitários (Mockito)\
-   Testes de integração\
-   @DataJpaTest\
-   Cobertura de código

------------------------------------------------------------------------

## 🟠 FASE 7 --- Observabilidade e Logging

Planejamento:

-   Logging estruturado\
-   Correlação de requisições\
-   Boas práticas de logs em produção

------------------------------------------------------------------------

## 🟠 FASE 8 --- Comunicação entre Microserviços

Planejamento:

-   Segundo microserviço\
-   Comunicação REST\
-   Tratamento de falhas\
-   Timeout e retry

------------------------------------------------------------------------

## 🔴 FASE 9 --- Evolução Arquitetural Avançada

Possíveis evoluções:

-   Arquitetura orientada a eventos\
-   RabbitMQ (conceitual)\
-   Outbox Pattern\
-   Idempotência\
-   Versionamento de API\
-   API Gateway

------------------------------------------------------------------------

# 🎯 Objetivo Final

✔ Pensar arquitetura antes do código\
✔ Escrever código limpo e desacoplado\
✔ Dominar JPA e transações\
✔ Construir APIs robustas\
✔ Desenvolver mentalidade de engenheiro backend

------------------------------------------------------------------------

Consistência \> Intensidade\
Arquitetura \> Código\
Entendimento \> Copiar e colar
