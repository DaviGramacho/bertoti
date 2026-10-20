# 📂 Portfólio – Projetos Integradores (API)

Este portfólio reúne os Projetos Integradores (API) desenvolvidos ao longo do curso na Fatec, utilizando a metodologia ágil **Scrum**, com entregas divididas em sprints e acompanhamento de backlog. Em cada projeto são apresentados o contexto, a solução desenvolvida, as tecnologias utilizadas, minhas contribuições pessoais e as competências desenvolvidas.

## 📑 Índice

| Semestre | Projeto | Repositório |
|---|---|---|
| 1º | Calculadora em VisualG | [Aplicacao_Projeto_Integragor_Fatec](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec) |
| 2º | Gerenciador de Horários de Aula | [gerenciador-horario-aula](https://github.com/vp-p/gerenciador-horario-aula) |
| 3º | DataSkill | [DataSkill](https://github.com/DataTechApi/DataSkill) |
| 4º | DataAgenda | [DataAgenda](https://github.com/DataTechApi/DataAgenda) |

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

Todas as entregas abaixo podem ser conferidas no histórico de commits do repositório:

| Entrega | O que eu fiz | Evidência |
|---|---|---|
| **Multiplicação** (backlog ID 2 – Sprint 1) | Criei o procedimento `multiplicar()` e o liguei à opção 03 do menu de operações básicas, reaproveitando a leitura dos números feita pelo procedimento `lerOperacoesBasicas()`. | [`be9bf68`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/be9bf689e9c6a0ae83788ebc58c4237ab308d274) |
| **Concatenação de strings** (backlog ID 11 – Sprint 3) | Criei o procedimento `concatenacaoString()`, que lê duas partes de texto, **valida se as duas foram preenchidas** (exibindo uma mensagem de erro caso contrário) e mostra o resultado. Também incluí a opção 07 no menu principal. | [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef) |
| **Organização do código** | Reorganizei e indentei os procedimentos no final do algoritmo, deixando o menu principal mais limpo e o código mais fácil de manter por toda a equipe. | [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef) |
| **Documentação** | Reestruturei o README do repositório, organizando backlog, sprints, requisitos e tecnologias. | [`f37b8db`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/f37b8db197dde73e39ecd0786cc00a07bc39a0c4) |

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – primeira experiência dividindo tarefas e integrando o código de vários membros em um único projeto.

* 🗣️ **Comunicação** – alinhamento com a equipe durante as sprints e nas reuniões de review.

* ⏱️ **Organização e gestão de tempo** – cumprimento das entregas dentro do prazo de cada sprint.

* 📚 **Aprendizado contínuo** – adaptação rápida a uma nova forma de trabalho (Scrum) e a novas ferramentas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

| Habilidade | Por que posso afirmar que sei |
|---|---|
| 🧩 **Lógica de programação e modularização** | Escrevi procedimentos completos em Portugol, com entrada (`leia`), processamento e saída (`escreval`), e os integrei ao menu usando estruturas condicionais `se/senao` aninhadas. |
| ✅ **Validação de entrada** | Na concatenação, tratei o caso em que o usuário deixa uma das partes vazia, impedindo um resultado incorreto e orientando o usuário com uma mensagem de erro. |
| 🧹 **Código limpo e manutenível** | Separei cada operação em seu próprio procedimento e reorganizei a indentação do arquivo, o que facilitou que outros integrantes adicionassem novas operações. |
| 🔧 **Git e GitHub** | Fiz meus primeiros commits em um repositório compartilhado, já seguindo o padrão de mensagens com tipo e emoji (`:sparkles: feat`, `📚 docs`). |
| 📋 **Scrum** | Minhas entregas correspondem a itens do backlog do produto (IDs 2 e 11), entregues dentro das sprints planejadas. |

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

Todas as entregas abaixo podem ser conferidas no histórico de commits do repositório:

| Entrega | O que eu fiz | Evidência |
|---|---|---|
| **Tela de login** | Construí a tela `TelaLogin` em JavaFX, com layout em `VBox`, campos de e-mail e senha e um botão para **mostrar/ocultar a senha**, alternando entre `PasswordField` e `TextField` e mantendo o texto digitado sincronizado entre os dois. | [`0c67a91`](https://github.com/vp-p/gerenciador-horario-aula/commit/0c67a9141df64c307d4bfb09f165c17cffabc8fb) |
| **Recuperação de senha** | Adicionei o botão "Esqueci minha senha", que abre a tela `RecuperarSenha` em uma nova janela (`Stage`). | [`de5e526`](https://github.com/vp-p/gerenciador-horario-aula/commit/de5e5268216ae06e18f9d6dbe8a12d710650fc4e) |
| **Tela de cadastro de cursos** | Criei a classe `Curso`, o `CadastroCursoController` e o `cadastroCurso.fxml`, com a tabela de cursos e o alinhamento das colunas no `style.css`. | [`ecb7267`](https://github.com/vp-p/gerenciador-horario-aula/commit/ecb726787b3aea75bdb3549d6ed916c599905229) |
| **CRUD de cursos com banco de dados** | Implementei o `CursoDAO` com JDBC e `PreparedStatement`: `INSERT` para cadastrar, `SELECT` para listar e **exclusão lógica** (`UPDATE curso SET deletado = 1`), que remove o curso da tela sem apagar o histórico do banco. | [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac) |
| **Filtro e exclusão em lote** | Criei o popup de cadastro (`PopupCursoController`) e o popup de **filtro por coordenador** (`PopupFiltroController`, com `ComboBox`), além da seleção de vários cursos por checkbox e da exclusão com alerta de confirmação. | [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac) |
| **Modelagem do banco** | Adicionei a coluna `periodo` à tabela `curso` no modelo do MySQL Workbench (`bancoApi2.mwb`). | [`c3146e1`](https://github.com/vp-p/gerenciador-horario-aula/commit/c3146e1fffdb7589f3fbb247a297d9fdca8a9fd1) |
| **Recuperação do versionamento** | Quando um erro de versionamento deixou a branch inconsistente, reverti os commits problemáticos e reapliquei as alterações completas e funcionando, sem perder o trabalho da equipe. | [`055d054`](https://github.com/vp-p/gerenciador-horario-aula/commit/055d0541b52c807e844c77e5c184390747105f09) · [`661ad37`](https://github.com/vp-p/gerenciador-horario-aula/commit/661ad370bb8454279d9fc2a494614028cff716c4) · [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac) |

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – colaboração em um time maior, com papéis definidos de Product Owner, Scrum Master e Developers.

* 🗣️ **Comunicação** – uso de canais como Slack e reuniões semanais para alinhar tarefas e reportar impedimentos.

* 📌 **Responsabilidade e comprometimento** – cumprimento dos termos de permanência da equipe e dos prazos de cada sprint.

* 🧩 **Resolução de problemas** – identificação e correção de erros de versionamento sem comprometer o trabalho do restante do time.

## 🛠️ 4.1 Hard Skills Desenvolvidas

| Habilidade | Por que posso afirmar que sei |
|---|---|
| ☕ **Java e Orientação a Objetos** | Modelei a classe `Curso` com encapsulamento (atributos privados, getters e setters) e *properties* do JavaFX (`StringProperty`, `BooleanProperty`), que ligam os dados diretamente à tabela da tela. |
| 🖥️ **JavaFX** | Criei telas em FXML e em código, controllers com `@FXML`, `TableView` com `setCellValueFactory`, janelas modais (`Modality.APPLICATION_MODAL`) e alertas (`Alert`) de aviso, erro e confirmação. |
| 🗃️ **SQL e JDBC** | Escrevi as consultas do CRUD de cursos com `PreparedStatement` (consultas parametrizadas, que evitam SQL Injection) e implementei a exclusão lógica com uma coluna `deletado`. |
| 🧱 **Padrão DAO e separação de responsabilidades** | Isolei o acesso ao banco no `CursoDAO`, deixando o `CadastroCursoController` responsável apenas pela interação com a tela. |
| 🔁 **Streams e coleções do Java** | Usei `stream().filter(...).collect(...)` e `anyMatch` para a exclusão em lote, e `FilteredList` com `setPredicate` para o filtro por coordenador. |
| 📐 **Modelagem de dados** | Alterei o modelo relacional no MySQL Workbench, adicionando a coluna `periodo` à tabela `curso`. |
| 🔧 **Git (branches, merge e revert)** | Trabalhei na branch `CrudCursos`, fiz o merge na `main` e corrigi um erro de versionamento revertendo commits e reaplicando as alterações. |
| 📋 **Scrum com Jira** | Minhas tarefas correspondem às histórias de usuário do backlog (SIN-9 – cadastro de cursos e SIN-14 – login), acompanhadas no Jira durante as sprints. |

---

# 📊 Projeto 3 – DataSkill (3° Semestre)

## 📌 1. Introdução

O Projeto DataSkill é uma plataforma interna inspirada no modelo do LinkedIn, desenvolvida para permitir que os colaboradores da empresa **registrem suas competências técnicas (hard skills), competências comportamentais (soft skills), experiências profissionais e certificações.**

O principal objetivo da plataforma é **otimizar a gestão de talentos dentro da organização**, facilitando a identificação de profissionais com habilidades específicas para projetos, demandas internas ou oportunidades estratégicas.

O projeto foi desenvolvido pela equipe **DataTech**, utilizando Scrum com entregas divididas em sprints.

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

---

# 🛠️ Projeto 4 – DataAgenda (4° Semestre)

## 📌 1. Introdução

O DataAgenda é uma **aplicação web para gerenciamento de manutenções preventivas e corretivas** dos sistemas que compõem o ecossistema da empresa parceira. A plataforma permite agendar manutenções, abrir e acompanhar chamados, alocar técnicos responsáveis e gerar relatórios sobre o histórico de atendimentos.

O projeto foi desenvolvido pela equipe **DataTech**, utilizando Scrum com 3 sprints e critérios de **DoR (Definition of Ready)** e **DoD (Definition of Done)** para garantir a qualidade das entregas.

## 📖 2.1 Contexto do Cliente

- 🏷️ **Nome do cliente:**
  ALTAVE

- 🏭 **Segmento de atuação:**
  Tecnologia e Defesa — desenvolvimento e operação de aeróstatos e sistemas de monitoramento, que exigem manutenção constante para garantir disponibilidade e segurança.

### 🎯 2.2 Necessidade Identificada

A empresa não possuía um sistema que centralizasse a alocação, visualização e extração de dados sobre as manutenções dos sistemas de seus clientes, o que gerava:

- Dificuldade em acompanhar **manutenções pendentes** e planejar as preventivas.
- Falta de controle sobre **qual técnico** estava responsável por cada chamado.
- Ausência de **histórico e rastreabilidade** das manutenções realizadas.
- Pouca visibilidade para gestores sobre **indicadores e relatórios** de atendimento.

### 💡 2.3 Solução Proposta pela Equipe

* 🖥️ **Gestão de ativos** – cadastro, listagem, edição e remoção dos ativos e sistemas que passam por manutenção.

* 📅 **Gestão de chamados** – agendamento de manutenções preventivas, abertura de chamados corretivos e atribuição de técnicos.

* 👷 **Área do técnico** – visualização dos chamados atribuídos, atualização de status e registro de observações.

* 📊 **Relatórios e monitoramento** – painel de chamados, histórico por ativo, estatísticas, agenda e visualização em mapa.

* 🔐 **Usuários e permissões** – perfis de acesso para administrador, gestor e técnico.

## 🧠 2.4 Tecnologias Utilizadas

| Categoria | Tecnologias |
|---|---|
| **Back-end** | Java 21 · Spring Boot · JPA · Maven |
| **Front-end** | Vue · TypeScript |
| **Banco de Dados** | OracleDB |
| **Documentação de API** | Swagger (OpenAPI) |
| **Testes** | Postman |
| **Ambiente de Desenvolvimento** | DevContainer |
| **Controle de Versão** | Git · GitHub |
| **IDEs** | IntelliJ IDEA · VS Code |

---
## 👨‍💻 3.0 Contribuições Pessoais

* Correção da **responsividade das telas** para diferentes tamanhos de monitor (issue #21).

* Desenvolvimento da **tela de login** seguindo o layout padrão do sistema (issue #30).

* Implementação do **modo claro/escuro (dark/light mode)** em todas as telas da aplicação (issue #67).

* Correção do bug em que **cancelar a edição de um cliente apagava todos os dados** do formulário (issue #75).

* Integração das alterações nas branches de cada sprint, mantendo o código sincronizado com a equipe.

---
## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – desenvolvimento colaborativo em branches por sprint, integrando o trabalho de vários membros.

* 🗣️ **Comunicação** – alinhamento das tarefas por meio de issues e do quadro do projeto no GitHub.

* 🎯 **Foco na experiência do usuário** – atenção a detalhes de usabilidade, como responsividade e tema claro/escuro.

* 🧩 **Resolução de problemas** – investigação e correção de bugs reportados durante as sprints.

* 📌 **Responsabilidade** – cumprimento dos critérios de DoR e DoD nas entregas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

* 🌐 **Front-end com Vue e TypeScript** – criação de telas, componentes reutilizáveis e consumo da API REST.

* 🎨 **CSS e responsividade** – adaptação de layouts para diferentes resoluções e implementação de temas (dark/light mode).

* 💻 **Back-end (Java e Spring Boot)** – entendimento da arquitetura em camadas e da comunicação entre front-end e back-end.

* 🗄️ **Banco de Dados (OracleDB)** – contato com um novo SGBD relacional e persistência de dados com JPA.

* 🐳 **DevContainer** – padronização do ambiente de desenvolvimento da equipe.

* 🔧 **Git e GitHub** – uso de branches por sprint, issues vinculadas aos commits e GitHub Projects.

---
