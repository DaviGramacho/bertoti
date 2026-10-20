# 📂 Portfólio – Projetos Integradores (API)

Este portfólio reúne os Projetos Integradores (API) desenvolvidos ao longo do curso na Fatec, utilizando a metodologia ágil **Scrum**, com entregas divididas em sprints e acompanhamento de backlog. Em cada projeto são apresentados o contexto, a solução desenvolvida, as tecnologias utilizadas, minhas contribuições pessoais e as competências desenvolvidas.

## 📑 Índice

| Semestre | Projeto | Repositório |
|---|---|---|
| 1º | Calculadora em VisualG | [Aplicacao_Projeto_Integragor_Fatec](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec) |
| 2º | Gerenciador de Horários de Aula | [gerenciador-horario-aula](https://github.com/vp-p/gerenciador-horario-aula) |
| 3º | DataSkill | [DataSkill](https://github.com/DataTechApi/DataSkill) |

---

# 🧮 Projeto 1 – Calculadora em VisualG (1° Semestre)

## 📌 1. Introdução

O primeiro Projeto Integrador consistiu no desenvolvimento de uma **calculadora em VisualG (Portugol)** com interface de texto, capaz de realizar desde operações matemáticas básicas até cálculos mais elaborados, como fatorial, função de segundo grau, conversão de bases numéricas e juros.

O projeto foi desenvolvido pela equipe **The Buggers** e teve como foco principal o primeiro contato com a lógica de programação e com a metodologia ágil, organizando o trabalho em **3 sprints**.

## 📖 2.1 Contexto

- 🏷️ **Cliente:**
  Fatec – projeto acadêmico do 1° semestre de Banco de Dados.

- 🎯 **Objetivo:**
  Aplicar na prática os conceitos de algoritmos e lógica de programação aprendidos no semestre, além de introduzir o trabalho em equipe com Scrum, backlog e controle de versão.

### 🎯 2.2 Necessidade Identificada

- Construir um software funcional utilizando apenas os recursos de uma linguagem algorítmica (Portugol).
- Organizar as funcionalidades em um backlog priorizado e entregá-las de forma incremental.
- Garantir que o código fosse legível e organizado em procedimentos, facilitando a manutenção pela equipe.

### 💡 2.3 Solução Proposta pela Equipe

A equipe desenvolveu uma calculadora com menu em modo texto, oferecendo as seguintes operações:

* ➕ **Operações básicas** – soma, subtração, multiplicação e divisão, incluindo múltiplas operações em sequência.
* ❗ **Cálculo fatorial** de um número.
* 📐 **Função de segundo grau** (cálculo das raízes).
* 🔢 **Conversão de bases numéricas** – B10 ↔ B2, B2 ↔ B8 e B2 ↔ B16.
* 🔤 **Concatenação de duas strings**.
* 💰 **Juros simples e juros compostos**.

## 🧠 2.4 Tecnologias Utilizadas

| Categoria | Tecnologias |
|---|---|
| **Linguagem** | VisualG (Portugol) |
| **Gestão do Projeto** | ClickUp |
| **Controle de Versão** | Git · GitHub |

---
## 👨‍💻 3.0 Contribuições Pessoais

* Implementação da **função de multiplicação** entre as operações básicas da calculadora.

* Desenvolvimento da **função de concatenação de duas strings** (item 11 do backlog).

* **Organização e indentação dos procedimentos** do código, melhorando a legibilidade do algoritmo.

* Atualização da **documentação (README)** do repositório.

* Participação nas cerimônias da sprint (planejamento, review e retrospectiva) junto à equipe.

---
## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – primeira experiência dividindo tarefas e integrando o código de vários membros em um único projeto.

* 🗣️ **Comunicação** – alinhamento com a equipe durante as sprints e nas reuniões de review.

* ⏱️ **Organização e gestão de tempo** – cumprimento das entregas dentro do prazo de cada sprint.

* 📚 **Aprendizado contínuo** – adaptação rápida a uma nova forma de trabalho (Scrum) e a novas ferramentas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

* 🧩 **Lógica de programação** – uso de variáveis, estruturas condicionais, laços de repetição e procedimentos em Portugol.

* 🔢 **Algoritmos matemáticos** – implementação de operações aritméticas, fatorial, conversão de bases e cálculos financeiros.

* 🔧 **Controle de versão (Git e GitHub)** – primeiros commits, padronização de mensagens e colaboração em repositório compartilhado.

* 📋 **Metodologia ágil** – uso de backlog do produto, priorização de requisitos e organização das tarefas no ClickUp.

---

# 🗓️ Projeto 2 – Sistema de Gerenciamento de Horários Fatec (2° Semestre)

## 📌 1. Introdução

O segundo Projeto Integrador foi o **Sistema de Gerenciamento de Horários Fatec**, uma aplicação desktop que permite ao coordenador de curso **montar a grade horária**, definindo os horários de cada professor e disciplina e evitando conflitos de alocação.

O projeto foi desenvolvido pela equipe **SINAPSE**, na qual atuei como **Developer**, com o trabalho organizado em sprints (Kick-Off, Sprint 1, 2 e 3) e apresentação final na Feira de Soluções.

## 📖 2.1 Contexto do Cliente

- 🏷️ **Nome do cliente:**
  Fatec São José dos Campos – coordenação de cursos.

- 🏭 **Segmento de atuação:**
  Educação – instituição pública de ensino superior tecnológico.

### 🎯 2.2 Necessidade Identificada

A montagem da grade de aulas era feita de forma manual, o que gerava dificuldades como:

- Risco de **sobreposição de horários** (o mesmo professor alocado em duas disciplinas no mesmo horário).
- Necessidade de respeitar a **quantidade obrigatória de aulas semanais** de cada disciplina.
- Falta de um local centralizado para gerenciar **cursos, semestres, disciplinas e professores**.
- Dificuldade em considerar a **disponibilidade de cada professor** na hora de alocar as aulas.

### 💡 2.3 Solução Proposta pela Equipe

A equipe desenvolveu uma aplicação em Java com interface gráfica e banco de dados relacional, oferecendo:

* 🔐 **Login do coordenador** com e-mail e senha, incluindo fluxo de recuperação de senha.
* 📚 **Cadastro de cursos, semestres, disciplinas e professores**.
* 🗓️ **Grade horária em tabela**, facilitando a visualização e a distribuição das aulas.
* 🚫 **Validação de conflitos**, impedindo choques de horário entre aulas do mesmo professor.
* 👨‍🏫 **Disponibilidade dos professores**, permitindo filtrar dias e horários possíveis.
* 📤 **Exportação da grade** para Excel.

## 🧠 2.4 Tecnologias Utilizadas

| Categoria | Tecnologias |
|---|---|
| **Linguagem / Interface** | Java 11 · JavaFX (FXML + CSS) |
| **Banco de Dados** | MySQL (JDBC / padrão DAO) |
| **Build** | Maven |
| **Gestão do Projeto** | Jira · Slack |
| **Controle de Versão** | Git · GitHub |
| **IDE** | IntelliJ IDEA |

---
## 👨‍💻 3.0 Contribuições Pessoais

* Desenvolvimento da **tela de login** do sistema.

* Implementação do botão **"Esqueci minha senha"**, com redirecionamento para a tela de recuperação de senha.

* Participação no **CRUD de cursos**, incluindo a integração da branch `CrudCursos` à main.

* Alteração na **modelagem do banco de dados**, adicionando a coluna `Periodo` na tabela de cursos.

* **Correção de versionamento**: reversão de commits com problema e reaplicação das alterações de forma organizada.

---
## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – colaboração em um time maior, com papéis definidos de Product Owner, Scrum Master e Developers.

* 🗣️ **Comunicação** – uso de canais como Slack e reuniões semanais para alinhar tarefas e reportar impedimentos.

* 📌 **Responsabilidade e comprometimento** – cumprimento dos termos de permanência da equipe e dos prazos de cada sprint.

* 🧩 **Resolução de problemas** – identificação e correção de erros de versionamento sem comprometer o trabalho do restante do time.

## 🛠️ 4.1 Hard Skills Desenvolvidas

* ☕ **Java e Programação Orientada a Objetos** – criação de classes de domínio, controllers e organização do código em camadas.

* 🖥️ **Interfaces gráficas com JavaFX** – construção de telas com FXML e estilização com CSS.

* 🗃️ **Banco de Dados (MySQL)** – modelagem relacional, criação e alteração de tabelas e acesso aos dados via JDBC com o padrão DAO.

* 🧱 **Maven** – gerenciamento de dependências (JavaFX, conector MySQL, dotenv) e build do projeto.

* 🔧 **Git e GitHub** – trabalho com branches, merges, reversão de commits e padronização de mensagens.

* 📋 **Scrum com Jira** – organização do backlog em user stories, story points e acompanhamento das sprints.

---

# 🚀 Relatório do Projeto – API (3° Semestre)

---

## 📌 1. Introdução

O Projeto DataSkill é uma plataforma interna inspirada no modelo do LinkedIn, desenvolvida para permitir que os colaboradores da empresa **registrem suas competências técnicas (hard skills), competências comportamentais (soft skills), experiências profissionais e certificações.**

O principal objetivo da plataforma é **otimizar a gestão de talentos dentro da organização**, facilitando a identificação de profissionais com habilidades específicas para projetos, demandas internas ou oportunidades estratégicas.

---

## 📖 2.1 Contexto do Cliente

- 🏷️ **Nome do cliente:**  
  ALTAVE  

- 🏭 **Segmento de atuação:**  
  Tecnologia e Defesa — especializada no desenvolvimento e fornecimento de aeróstatos (balões cativos de alta tecnologia) para monitoramento, vigilância aérea e telecomunicações. A empresa atua em projetos estratégicos voltados para segurança pública, defesa, grandes eventos e proteção de infraestruturas críticas.

### 🎯 2.2 Necessidade Identificada
A empresa enfrentava desafios na identificação rápida e estruturada das competências internas disponíveis. As informações sobre habilidades técnicas (hard skills), competências comportamentais (soft skills), certificações e experiências profissionais dos colaboradores estavam dispersas, desatualizadas ou armazenadas de forma não padronizada.

- Dificuldade em alocar os profissionais mais adequados para projetos específicos.

- Dependência de conhecimento informal dos gestores sobre as capacidades das equipes.

- Perda de oportunidades estratégicas por falta de visibilidade sobre talentos internos.

- Baixa eficiência na gestão de desenvolvimento e capacitação profissional.

### 💡 2.3 Solução Proposta pela Equipe

Para resolver os desafios enfrentados pela ALTAVE, a equipe propôs o desenvolvimento de uma **plataforma digital integrada para gestão de competências dos colaboradores**.

A solução consiste em um sistema que permite:

* 📊 **Centralização das informações**
  Reunir em um único ambiente todos os dados relacionados aos colaboradores, como:

  * Hard skills (habilidades técnicas)
  * Soft skills (competências comportamentais)
  * Certificações
  * Experiências profissionais

* 🔍 **Busca inteligente de talentos**
  Implementar filtros e mecanismos de pesquisa que possibilitem identificar rapidamente os profissionais mais adequados para cada projeto, com base nas competências necessárias.

* 👤 **Perfil profissional estruturado**
  Cada colaborador possui um perfil atualizado, facilitando a visualização clara de suas capacidades e histórico.

* 📈 **Apoio à tomada de decisão**
  Fornecer dashboards e relatórios para gestores, permitindo uma visão estratégica sobre:

  * Distribuição de competências
  * Lacunas de conhecimento
  * Potenciais para desenvolvimento

* 🚀 **Melhoria na alocação de equipes**
  Reduzir a dependência de conhecimento informal e tornar o processo de alocação mais ágil, eficiente e assertivo.

* 🎓 **Gestão de desenvolvimento profissional**
  Auxiliar na identificação de necessidades de treinamento e capacitação, promovendo o crescimento contínuo dos colaboradores.

## 🧠 2.4 Tecnologias Utilizadas
 
| Categoria | Tecnologias |
|---|---|
| **Back-end** | Java 21 · Spring Boot · JPA / Hibernate · Maven |
| **Front-end** | Angular |
| **Banco de Dados** | MySQL 8 |
| **Documentação de API** | Swagger (OpenAPI) |
| **Testes** | Postman |
| **Controle de Versão** | Git · GitHub |
| **IDEs** | IntelliJ IDEA · VS Code |

---
## 👨‍💻 3.0 Contribuições Pessoais

* Desenvolvimento da **feature #23 – API de Autoavaliação**, permitindo que colaboradores registrem suas próprias competências.

* Implementação da **API REST**, incluindo definição de rotas, estrutura de requisições e respostas.

* Criação da **lógica de negócio** para processamento e armazenamento das autoavaliações.

* Integração da funcionalidade com o sistema, garantindo consistência com os demais módulos.

* Contribuição na **modelagem da solução**, auxiliando na definição de como os dados de autoavaliação seriam utilizados.

* Participação no **versionamento do projeto**, seguindo boas práticas de commits.

* Colaboração com a equipe no desenvolvimento da solução, alinhando a funcionalidade às necessidades do projeto.

* Apoio na geração de **dados estratégicos**, contribuindo para análise de competências e tomada de decisão.

---
## 🤝 4.0 Soft Skills Desenvolvidas

Durante o desenvolvimento do projeto DataSkill, foi possível aprimorar diversas competências comportamentais essenciais para o trabalho em equipe e desenvolvimento de software:

* 🗣️ **Comunicação**
  Melhoria na troca de informações com a equipe, garantindo alinhamento sobre requisitos, funcionalidades e decisões técnicas.

* 🤝 **Trabalho em equipe**
  Colaboração ativa com outros membros do grupo, contribuindo para a construção conjunta da solução e resolução de problemas.

* 🧠 **Pensamento analítico**
  Capacidade de analisar o problema proposto pela empresa e propor soluções estruturadas, especialmente na modelagem da API de autoavaliação.

* ⏱️ **Gestão de tempo**
  Organização das tarefas e cumprimento de prazos durante o desenvolvimento das funcionalidades.

* 🔄 **Adaptabilidade**
  Facilidade em lidar com mudanças de requisitos e ajustes necessários ao longo do projeto.

* 📌 **Responsabilidade**
  Comprometimento com as entregas, garantindo a qualidade das funcionalidades desenvolvidas.

* 🚀 **Proatividade**
  Iniciativa na busca por soluções, participação ativa nas decisões e contribuição além das tarefas atribuídas.

Essas soft skills foram fundamentais para o sucesso do projeto, contribuindo não apenas para a entrega técnica, mas também para a eficiência e organização da equipe como um todo.

## 🛠️ 4.1 Hard Skills Desenvolvidas

Durante o desenvolvimento do projeto, adquiri e aprofundei conhecimentos técnicos importantes, aplicando na prática diversas tecnologias utilizadas no mercado:

* 💻 **Back-end (Java e Spring Boot)**
  Aprendi a desenvolver APIs REST utilizando Java 21 com Spring Boot, estruturando aplicações de forma organizada, criando controllers, services e aplicando boas práticas de desenvolvimento.

* 🗄️ **Persistência de Dados (JPA / Hibernate)**
  Desenvolvi conhecimentos em mapeamento objeto-relacional (ORM), entendendo como entidades se relacionam com o banco de dados e como realizar operações de forma eficiente.

* 🧱 **Gerenciamento de Dependências (Maven)**
  Aprendi a gerenciar dependências, configurar o projeto e entender o ciclo de build utilizando Maven.

* 🌐 **Integração com Front-end (Angular)**
  Compreendi como funciona a comunicação entre front-end e back-end, trabalhando com requisições HTTP e integração de APIs.

* 🗃️ **Banco de Dados (MySQL)**
  Aprendi a modelar tabelas, estruturar dados e realizar consultas em banco de dados relacional.

* 📄 **Documentação de API (Swagger / OpenAPI)**
  Entendi a importância da documentação de APIs e como utilizá-la para facilitar testes e o uso por outros desenvolvedores.

* 🧪 **Testes de API (Postman)**
  Desenvolvi habilidades para testar endpoints, validar respostas e garantir o correto funcionamento da aplicação.

* 🔧 **Controle de Versão (Git e GitHub)**
  Aprendi a trabalhar com versionamento de código, commits, branches e colaboração em equipe utilizando Git e GitHub.

* 🧑‍💻 **Ambientes de Desenvolvimento (IDEs)**
  Ganhei experiência no uso de ferramentas como IntelliJ IDEA e Visual Studio Code para desenvolvimento, organização e depuração de código.


