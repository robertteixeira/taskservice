🚀 Aprendizado Java Moderno
📍 FASE 0 — Fundamentos Estratégicos

Essa fase é 100% mentalidade e arquitetura.
Sem código ainda.

Se você dominar essa fase, as próximas vão fazer muito mais sentido.

🧠 1️⃣ O que é Arquitetura em Camadas?

Modelo clássico do Spring:

Controller → Service → Repository → Database

🔹 Controller

Recebe requisições HTTP.

🔹 Service

Contém regra de negócio.

🔹 Repository

Faz acesso ao banco.

🔹 Database

Persistência.

🎯 Por que isso existe?

Separação de responsabilidades.

Se amanhã mudar:

Banco → só mexe no repository

Regra → só mexe no service

API → só mexe no controller

Isso reduz acoplamento.

🧠 2️⃣ Monólito vs Microserviços
🏢 Monólito

Tudo dentro de uma aplicação:

[ API + Regra + Banco + Eventos ]

Vantagens:

Simples

Fácil de debugar

Fácil de testar

Desvantagens:

Escala tudo junto

Deploy único

Pode virar “big ball of mud”

🧩 Microserviços

Cada responsabilidade é um serviço independente:

task-service
notification-service
payment-service

Vantagens:

Escalabilidade independente

Deploy independente

Falhas isoladas

Desvantagens:

Mais complexo

Infraestrutura maior

Observabilidade mais difícil

🧠 3️⃣ Comunicação Síncrona vs Assíncrona
🔵 Síncrona (REST)
Service A → chama → Service B
Espera resposta.


Se B cair → A falha.

🟢 Assíncrona (RabbitMQ)
Service A → publica evento → Broker
Service B → consome depois


A não depende de B estar online.

Essa é a base de Event-Driven Architecture.

🧠 4️⃣ O que é Event-Driven Architecture?

Sistema reage a eventos.

Exemplo:

TASK_CREATED

TASK_UPDATED

TASK_DELETED

Você não chama outro serviço.
Você emite um evento.
Quem quiser escuta.

Isso reduz acoplamento.

🧠 5️⃣ O que é um Message Broker?

É um intermediário de mensagens.

No nosso caso será:

Exchange

Queue

Consumer

Ele:

Armazena

Distribui

Garante entrega

🧠 6️⃣ O que é Containerização?

Antes:

“Funciona na minha máquina.”

Depois:

“Funciona em qualquer máquina.”

Docker cria ambientes isolados e reproduzíveis.

🧠 7️⃣ O que são Virtual Threads (Java 21)?

Threads tradicionais:

Pesadas

Consomem memória

Virtual Threads:

Leves

Milhares por aplicação

Melhor uso de recursos

Ideal para aplicações IO-bound (como APIs REST).

🧠 8️⃣ Conceitos Cruciais que Você PRECISA Entender

Responda mentalmente:

O que acontece se o RabbitMQ cair?

E se salvar no banco mas falhar ao publicar evento?

Como evitar processamento duplicado?

Como escalar o consumer?

Como versionar eventos?

Se você não souber responder agora → ótimo.
Vamos aprender isso nas próximas fases.