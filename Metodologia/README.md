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

Neste primeiro projeto, participei do desenvolvimento da calculadora desde o planejamento das sprints até a entrega final, atuando tanto na programação quanto na organização do código e da documentação.

* Desenvolvimento da **operação de multiplicação**, criando o procedimento responsável pelo cálculo e integrando-o ao menu de operações básicas da calculadora.

* Implementação da **concatenação de strings**, funcionalidade que recebe duas partes de texto, valida se ambas foram preenchidas e exibe o resultado ao usuário.

* Inclusão das novas opções no **menu principal**, garantindo que as operações já existentes continuassem funcionando normalmente.

* **Organização e indentação dos procedimentos** do algoritmo, deixando o código mais legível e facilitando o trabalho dos demais integrantes.

* **Reestruturação da documentação (README)** do repositório, com backlog, sprints, requisitos e tecnologias utilizadas.

* Participação nas **cerimônias do Scrum** (planejamento, review e retrospectiva) e na validação das funcionalidades desenvolvidas.

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – primeira experiência dividindo tarefas e integrando o código de vários membros em um único projeto.

* 🗣️ **Comunicação** – alinhamento com a equipe durante as sprints e nas reuniões de review.

* ⏱️ **Organização e gestão de tempo** – cumprimento das entregas dentro do prazo de cada sprint.

* 📚 **Aprendizado contínuo** – adaptação rápida a uma nova forma de trabalho (Scrum) e a novas ferramentas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

* 🧩 **Lógica de programação** – criei procedimentos com entrada, processamento e saída de dados e os integrei a um menu com estruturas condicionais.

* ✅ **Validação de dados** – tratei entradas incompletas na concatenação, exibindo mensagens de erro ao usuário.

* 🧹 **Organização de código** – separei as operações em procedimentos e padronizei a indentação do algoritmo.

* 🔧 **Git e GitHub** – realizei commits em um repositório compartilhado, seguindo um padrão de mensagens.

* 📋 **Scrum** – entreguei itens do backlog do produto dentro das sprints planejadas.

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

No segundo semestre, atuei como desenvolvedor na equipe SINAPSE, contribuindo nas telas da aplicação, na comunicação com o banco de dados e na organização do repositório.

* Desenvolvimento da **tela de login** em JavaFX, com campos de e-mail e senha e a opção de mostrar ou ocultar a senha digitada.

* Criação do botão **"Esqueci minha senha"**, com o direcionamento para a tela de recuperação de senha.

* Desenvolvimento do **módulo de cadastro de cursos**: tela, controller, classe de domínio e estilização.

* Implementação do **CRUD de cursos** integrado ao MySQL, com cadastro, listagem e exclusão lógica dos registros.

* Criação dos **popups de cadastro e de filtro por coordenador**, além da seleção e exclusão de vários cursos de uma só vez, com confirmação do usuário.

* Atualização da **modelagem do banco de dados**, com a inclusão da coluna de período na tabela de cursos.

* **Correção de um problema de versionamento**, revertendo as alterações afetadas e reaplicando o código sem perder o trabalho da equipe.

* Integração da branch de cursos à `main` e participação nas reuniões e entregas de cada sprint.

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – colaboração em um time maior, com papéis definidos de Product Owner, Scrum Master e Developers.

* 🗣️ **Comunicação** – uso de canais como Slack e reuniões semanais para alinhar tarefas e reportar impedimentos.

* 📌 **Responsabilidade e comprometimento** – cumprimento dos termos de permanência da equipe e dos prazos de cada sprint.

* 🧩 **Resolução de problemas** – identificação e correção de erros de versionamento sem comprometer o trabalho do restante do time.

## 🛠️ 4.1 Hard Skills Desenvolvidas

* ☕ **Java e Orientação a Objetos** – modelei a classe de cursos com encapsulamento e propriedades ligadas à interface.

* 🖥️ **JavaFX** – construí telas em código e em FXML, com tabelas, janelas modais e alertas.

* 🗃️ **SQL e JDBC** – escrevi consultas parametrizadas com `PreparedStatement` e implementei a exclusão lógica.

* 🧱 **Padrão DAO** – separei o acesso ao banco de dados da lógica das telas.

* 🔁 **Streams e coleções** – usei Streams e `FilteredList` nos filtros e na exclusão em lote.

* 📐 **Modelagem de dados** – alterei o modelo relacional no MySQL Workbench.

* 🔧 **Git** – trabalhei com branches, merge e reversão de alterações.

* 📋 **Scrum com Jira** – acompanhei minhas tarefas no backlog e nas sprints.

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

No DataSkill, assumi uma **funcionalidade inteira do back-end**, a API de Autoavaliação (issue #23), e a desenvolvi em todas as camadas: entidade e banco de dados, regras de negócio, endpoints REST e documentação.

Cada entrega pode ser conferida no commit indicado:

| Entrega | O que eu fiz | Evidência |
|---|---|---|
| **Entidade `AutoAvaliacao`** | Mapeei a entidade com JPA (`@Entity`, `@Id`, `@GeneratedValue(strategy = GenerationType.IDENTITY)`) e usei Lombok (`@Data`, `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor`) para eliminar código repetitivo. | [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6) |
| **Repositório** | Criei o `AutoAvaliacaoRepository` estendendo `JpaRepository`, que fornece as operações de banco (`save`, `findAll`, `findById`, `deleteById`) sem a necessidade de escrever SQL manualmente. | [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6) |
| **Camada de serviço** | Implementei o `AutoAvaliacaoService` com as regras de cadastro, listagem, busca por ID e exclusão, recebendo o repositório por **injeção de dependência via construtor**. | [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6) |
| **Controller REST** | Criei o `AutoAvaliacaoController` em `/autoAvaliacao`, com os endpoints `POST` (retorna **201 Created**), `GET`, `GET /{id}` e `DELETE` (retorna **204 No Content**), usando `ResponseEntity` para controlar o status HTTP de cada resposta. | [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6) |
| **Documentação da API** | Documentei cada endpoint no Swagger com `@Tag`, `@Operation` e `@ApiResponses`, descrevendo o objetivo e os códigos de resposta. | [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6) |
| **Estrutura inicial da feature** | Criei a estrutura de pacotes da funcionalidade (controller, entity, repository e service), seguindo a arquitetura definida pela equipe. | [`c39c893`](https://github.com/DataTechApi/DataSkill/commit/c39c8931cff560c4b88eb5419fb3c6bab09b5be3) |

Além do código, participei das definições de modelagem da solução com a equipe, discutindo como os dados de autoavaliação seriam usados na análise de competências.

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

Para cada habilidade, explico o que construí e por que fiz daquela forma, com o link do commit como evidência.

#### 💻 Spring Boot (API REST)

**Por que sei usar:** Criei o `AutoAvaliacaoController` com `@RestController`, `@RequestMapping("/autoAvaliacao")` e os endpoints `@PostMapping`, `@GetMapping`, `@GetMapping("/{id}")` e `@DeleteMapping`. Usei `ResponseEntity` para devolver o status HTTP correto de cada operação: **201 Created** no cadastro, **200 OK** nas consultas e **204 No Content** na exclusão.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 🏛️ Arquitetura em camadas e injeção de dependência

**Por que sei usar:** Separei a funcionalidade em controller (recebe a requisição), service (regras de negócio) e repository (acesso ao banco). As dependências são recebidas pelo construtor, prática recomendada pelo Spring porque deixa explícito do que cada classe depende e facilita os testes.

**Onde comprovar:** [`c39c893`](https://github.com/DataTechApi/DataSkill/commit/c39c8931cff560c4b88eb5419fb3c6bab09b5be3) · [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 🗄️ JPA / Hibernate (ORM)

**Por que sei usar:** Mapeei a entidade `AutoAvaliacao` com `@Entity`, `@Id` e `@GeneratedValue(strategy = GenerationType.IDENTITY)`, deixando o banco gerar a chave. Com o `JpaRepository`, usei `save`, `findAll`, `findById` e `deleteById` sem precisar escrever SQL.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### ✂️ Lombok

**Por que sei usar:** Usei `@Data`, `@Builder`, `@NoArgsConstructor` e `@AllArgsConstructor` para gerar getters, setters e construtores automaticamente, deixando a entidade com poucas linhas e foco nos atributos.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 📄 Swagger / OpenAPI

**Por que sei usar:** Documentei cada endpoint com `@Tag`, `@Operation` e `@ApiResponses`, informando o objetivo e os códigos de resposta. Com isso, qualquer integrante podia testar a API pela interface do Swagger sem precisar ler o código.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 🗃️ MySQL

**Por que sei usar:** Configurei a conexão com o banco MySQL no IntelliJ (Data Sources) para conferir a tabela gerada a partir da entidade e os dados gravados pelos endpoints.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 🧪 Testes de API (Postman)

**Por que sei usar:** Testei o cadastro, a listagem, a busca por ID e a exclusão, validando o corpo e o código de status de cada resposta antes de integrar a funcionalidade.

**Onde comprovar:** [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

#### 🔧 Git e GitHub

**Por que sei usar:** Desenvolvi a funcionalidade vinculada à issue #23, com commits padronizados e integrados às branches das sprints.

**Onde comprovar:** [`c39c893`](https://github.com/DataTechApi/DataSkill/commit/c39c8931cff560c4b88eb5419fb3c6bab09b5be3) · [`2d07ce7`](https://github.com/DataTechApi/DataSkill/commit/2d07ce745c8676293a32019bd889bf975574eca6)

> O front-end do DataSkill (Angular) foi desenvolvido por outros integrantes; meu foco neste projeto foi o back-end.

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

No DataAgenda, atuei no **front-end** e fiquei responsável por partes que todos os usuários utilizam: a tela de login, a proteção das páginas internas, o tema claro/escuro do sistema inteiro e a correção de um bug que fazia o usuário perder dados.

Cada entrega pode ser conferida no commit indicado:

| Entrega | O que eu fiz | Evidência |
|---|---|---|
| **Responsividade** (issue #21) | Refiz o layout da tela de técnicos com Flexbox (`display: flex`, `flex-wrap`, `min-width` e `max-width`), para que ela se adaptasse a monitores de tamanhos diferentes. | [`8938ce2`](https://github.com/DataTechApi/DataAgenda/commit/8938ce2fee90535ec512f6d4a7263b14cc5c3c1b) |
| **Tela de login** (issue #30) | Criei a `LoginView.vue` com componentes do PrimeVue (`InputText`, `Password` e `Button`), estado reativo com `ref`, indicador de carregamento e mensagem de erro para credenciais inválidas, seguindo o layout padrão do sistema. | [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) |
| **Proteção de rotas** (issue #30) | Adicionei a rota `/login` e um *navigation guard* (`router.beforeEach`) no Vue Router: sem token na sessão, o usuário é redirecionado para o login; já autenticado, ele vai direto para o dashboard. | [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) |
| **Modo claro/escuro** (issue #67) | Criei a store `theme.ts` com **Pinia**, que guarda a preferência do usuário no `localStorage`; substituí as cores fixas por **variáveis CSS** (`--bg-app`, `--text-main` etc.) no `custom-theme.css` e configurei o `darkModeSelector` do PrimeVue. A mudança foi aplicada em **23 telas**, além do cabeçalho e do layout principal. | [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665) |
| **Correção de bug** (issue #75) | Identifiquei que, ao cancelar a edição de um cliente, os dados do formulário eram perdidos. Corrigi guardando uma cópia do estado original (`clienteOriginal.value = { ...response.data }`) assim que os dados chegam da API, para restaurá-los no cancelamento. | [`608eb59`](https://github.com/DataTechApi/DataAgenda/commit/608eb59558d2c0ae2683f38d412491b64eb6aa56) |

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – desenvolvimento colaborativo em branches por sprint, integrando o trabalho de vários membros.

* 🗣️ **Comunicação** – alinhamento das tarefas por meio de issues e do quadro do projeto no GitHub.

* 🎯 **Foco na experiência do usuário** – atenção a detalhes de usabilidade, como responsividade e tema claro/escuro.

* 🧩 **Resolução de problemas** – investigação e correção de bugs reportados durante as sprints.

* 📌 **Responsabilidade** – cumprimento dos critérios de DoR e DoD nas entregas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

Para cada habilidade, explico o que construí e por que fiz daquela forma, com o link do commit como evidência.

#### 🌐 Vue 3 (Composition API)

**Por que sei usar:** Desenvolvi a `LoginView.vue` com `<script setup>` e estado reativo (`ref`) para as credenciais, o indicador de carregamento e as mensagens de erro. No `App.vue`, usei `onMounted` para aplicar o tema escolhido assim que o sistema abre.

**Onde comprovar:** [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 🧭 Vue Router (controle de acesso)

**Por que sei usar:** Criei a rota `/login` e um *navigation guard* global (`router.beforeEach`) que verifica se há token na sessão: sem token, o usuário é levado ao login; com token, ele não volta para a tela de login e segue para o dashboard. Esse controle impede o acesso direto às páginas internas pela URL.

**Onde comprovar:** [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4)

#### 🗂️ Pinia (gerenciamento de estado)

**Por que sei usar:** Criei a store `useThemeStore`, com o estado `isDark` e as funções `toggle` e `apply`. Por ser uma store global, qualquer componente consegue ler ou trocar o tema, e a mudança vale para o sistema inteiro.

**Onde comprovar:** [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 🎨 CSS (variáveis, temas e Flexbox)

**Por que sei usar:** Troquei as cores fixas das telas por variáveis CSS (`--bg-app`, `--bg-card`, `--text-main` etc.) no `custom-theme.css`, de modo que os temas claro e escuro apenas redefinem essas variáveis. Apliquei isso em **23 telas**, no cabeçalho e no layout principal, com transições suaves. Na issue #21, refiz a tela de técnicos com Flexbox (`flex-wrap`, `min-width`, `max-width`) para que funcionasse em monitores diferentes.

**Onde comprovar:** [`8938ce2`](https://github.com/DataTechApi/DataAgenda/commit/8938ce2fee90535ec512f6d4a7263b14cc5c3c1b) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 🧱 PrimeVue

**Por que sei usar:** Usei os componentes `InputText`, `Password` e `Button` na tela de login e configurei o `darkModeSelector` do tema Aura para que os componentes da biblioteca acompanhassem o tema escolhido pelo usuário.

**Onde comprovar:** [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 💾 Web Storage

**Por que sei usar:** Usei o `localStorage` para a preferência de tema, que deve continuar valendo depois de fechar o navegador, e o `sessionStorage` para o token, que deve expirar quando a aba é fechada. Escolhi cada um de acordo com o tempo de vida que o dado precisava ter.

**Onde comprovar:** [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 🟦 TypeScript

**Por que sei usar:** Escrevi a store de tema (`theme.ts`) e as alterações do router (`router/index.ts`) em TypeScript.

**Onde comprovar:** [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665)

#### 🐞 Depuração

**Por que sei usar:** Na issue #75, descobri que o formulário de edição não guardava o estado original do cliente, por isso os dados se perdiam ao cancelar. Passei a salvar uma cópia (`{ ...response.data }`) assim que os dados chegam da API, o que permite restaurá-los. A correção tem uma linha, mas exigiu entender o fluxo de dados da tela.

**Onde comprovar:** [`608eb59`](https://github.com/DataTechApi/DataAgenda/commit/608eb59558d2c0ae2683f38d412491b64eb6aa56)

#### 🔧 Git e GitHub

**Por que sei usar:** Cada entrega está ligada a uma issue (#21, #30, #67 e #75) e foi integrada às branches das sprints.

**Onde comprovar:** [`8938ce2`](https://github.com/DataTechApi/DataAgenda/commit/8938ce2fee90535ec512f6d4a7263b14cc5c3c1b) · [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) · [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665) · [`608eb59`](https://github.com/DataTechApi/DataAgenda/commit/608eb59558d2c0ae2683f38d412491b64eb6aa56)

> A autenticação no back-end (Spring Security com JWT) foi implementada por outro integrante da equipe; minha parte no login foi a interface e o controle de acesso às rotas no front-end.

---
