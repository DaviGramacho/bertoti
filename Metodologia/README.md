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

Neste primeiro projeto, fui responsável por duas operações da calculadora, pela organização do código e pela documentação do repositório. Foi meu primeiro contato com o desenvolvimento em equipe, e as entregas abaixo mostram como apliquei na prática a lógica de programação aprendida no semestre.

Cada entrega pode ser conferida no commit indicado:

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

Para cada habilidade, explico o que construí e por que fiz daquela forma, com o link do commit como evidência.

#### 🧩 Lógica de programação e modularização

**Por que sei usar:** Implementei os procedimentos `multiplicar()` e `concatenacaoString()`, cada um com entrada de dados (`leia`), processamento e saída (`escreval`). Para integrá-los, precisei entender o fluxo do menu principal, construído com estruturas `se/senao` aninhadas, e encaixar as novas opções (03 e 07) sem quebrar as operações que já existiam.

**Onde comprovar:** [`be9bf68`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/be9bf689e9c6a0ae83788ebc58c4237ab308d274) · [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef)

#### ✅ Validação de entrada

**Por que sei usar:** Na concatenação, não me limitei a juntar os textos: verifiquei se as duas partes foram digitadas e, se alguma estivesse vazia, exibi uma mensagem de erro em vez de um resultado incorreto. Isso mostra preocupação com o uso real do programa, e não só com o caso em que tudo dá certo.

**Onde comprovar:** [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef)

#### 🧹 Organização e legibilidade do código

**Por que sei usar:** Reorganizei e indentei os procedimentos no final do algoritmo. Com o código separado por operação, os outros integrantes conseguiam localizar e adicionar novas funções sem conflitos.

**Onde comprovar:** [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef)

#### 🔧 Git e GitHub

**Por que sei usar:** Fiz meus commits em um repositório compartilhado seguindo, desde o início, um padrão de mensagens (`:sparkles: feat`, `📚 docs`) que mantive em todos os projetos seguintes. Também reestruturei o README do repositório com backlog, sprints e requisitos.

**Onde comprovar:** [`be9bf68`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/be9bf689e9c6a0ae83788ebc58c4237ab308d274) · [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef) · [`f37b8db`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/f37b8db197dde73e39ecd0786cc00a07bc39a0c4)

#### 📋 Scrum

**Por que sei usar:** Minhas entregas correspondem a itens do backlog do produto (ID 2 na Sprint 1 e ID 11 na Sprint 3), planejados com a equipe e apresentados nas sprint reviews.

**Onde comprovar:** [`be9bf68`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/be9bf689e9c6a0ae83788ebc58c4237ab308d274) · [`0e2eee8`](https://github.com/IsaacOliveiraSouza/Aplicacao_Projeto_Integragor_Fatec/commit/0e2eee8316257dc75f151b6b7ac5ad60b6a9dcef)

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

No segundo semestre, fiquei responsável pela entrada do sistema (tela de login e recuperação de senha) e por **todo o módulo de cursos, da tela ao banco de dados**. Também resolvi um problema de versionamento que poderia ter feito a equipe perder trabalho.

Cada entrega pode ser conferida no commit indicado:

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

Para cada habilidade, explico o que construí e por que fiz daquela forma, com o link do commit como evidência.

#### ☕ Java e Orientação a Objetos

**Por que sei usar:** Modelei a classe `Curso` com atributos privados, getters e setters e dois construtores: um para os dados que vêm do banco e outro para um novo cadastro. Usei as *properties* do JavaFX (`StringProperty`, `BooleanProperty`) para que a tabela se atualizasse automaticamente quando os dados mudassem.

**Onde comprovar:** [`ecb7267`](https://github.com/vp-p/gerenciador-horario-aula/commit/ecb726787b3aea75bdb3549d6ed916c599905229) · [`661ad37`](https://github.com/vp-p/gerenciador-horario-aula/commit/661ad370bb8454279d9fc2a494614028cff716c4)

#### 🖥️ JavaFX

**Por que sei usar:** Construí a tela de login inteira em código (`VBox`, `TextField`, `PasswordField`, `Stage`) e a tela de cursos em FXML com controller (`@FXML`). Implementei recursos de interação como mostrar/ocultar a senha, tabela com checkbox de seleção (`setCellValueFactory`), janelas modais (`Modality.APPLICATION_MODAL`) e alertas de aviso, erro e confirmação antes de excluir.

**Onde comprovar:** [`0c67a91`](https://github.com/vp-p/gerenciador-horario-aula/commit/0c67a9141df64c307d4bfb09f165c17cffabc8fb) · [`de5e526`](https://github.com/vp-p/gerenciador-horario-aula/commit/de5e5268216ae06e18f9d6dbe8a12d710650fc4e) · [`ecb7267`](https://github.com/vp-p/gerenciador-horario-aula/commit/ecb726787b3aea75bdb3549d6ed916c599905229) · [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 🗃️ SQL e JDBC

**Por que sei usar:** Escrevi as operações do CRUD de cursos com `PreparedStatement`, usando parâmetros (`?`) em vez de concatenar strings, o que protege contra SQL Injection. Implementei a **exclusão lógica** (`UPDATE curso SET deletado = 1`) e a listagem apenas dos registros ativos (`WHERE deletado = 0`), mantendo o histórico no banco.

**Onde comprovar:** [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 🧱 Padrão DAO

**Por que sei usar:** Isolei todo o acesso ao banco no `CursoDAO`. O controller só chama `criar`, `listarTodos` e `delete`, sem conhecer o SQL; assim, uma mudança no banco não afeta a tela.

**Onde comprovar:** [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 🔁 Streams e coleções do Java

**Por que sei usar:** Na exclusão em lote, usei `anyMatch` para verificar se havia algum curso selecionado e `stream().filter(...).collect(...)` para montar a lista a excluir. No filtro por coordenador, usei `FilteredList` com `setPredicate`, filtrando a tabela sem precisar de uma nova consulta ao banco.

**Onde comprovar:** [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 📐 Modelagem de dados

**Por que sei usar:** Alterei o modelo relacional no MySQL Workbench, adicionando a coluna `periodo` à tabela `curso`, e ajustei a classe, o DAO e a tela para trabalhar com o novo campo.

**Onde comprovar:** [`c3146e1`](https://github.com/vp-p/gerenciador-horario-aula/commit/c3146e1fffdb7589f3fbb247a297d9fdca8a9fd1) · [`661ad37`](https://github.com/vp-p/gerenciador-horario-aula/commit/661ad370bb8454279d9fc2a494614028cff716c4) · [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 🔧 Git (branches, merge e revert)

**Por que sei usar:** Trabalhei na branch `CrudCursos` e fiz o merge na `main`. Quando um erro de versionamento deixou o código inconsistente, reverti os commits afetados e reapliquei as alterações completas, sem perder o trabalho de ninguém. Saber desfazer e refazer alterações com segurança é essencial no trabalho em equipe.

**Onde comprovar:** [`055d054`](https://github.com/vp-p/gerenciador-horario-aula/commit/055d0541b52c807e844c77e5c184390747105f09) · [`661ad37`](https://github.com/vp-p/gerenciador-horario-aula/commit/661ad370bb8454279d9fc2a494614028cff716c4) · [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

#### 📋 Scrum com Jira

**Por que sei usar:** Minhas entregas correspondem às histórias de usuário SIN-9 (cadastro de cursos) e SIN-14 (login), acompanhadas no Jira durante as sprints.

**Onde comprovar:** [`0c67a91`](https://github.com/vp-p/gerenciador-horario-aula/commit/0c67a9141df64c307d4bfb09f165c17cffabc8fb) · [`9d3bfed`](https://github.com/vp-p/gerenciador-horario-aula/commit/9d3bfed79ddd117bb2410f98c23b398dcb21f7ac)

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

Fui responsável pela **feature #23 – API de Autoavaliação**, desenvolvida por completo, em todas as camadas do back-end. As entregas podem ser conferidas no histórico de commits do repositório:

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

| Habilidade | Por que posso afirmar que sei |
|---|---|
| 💻 **Spring Boot (API REST)** | Criei um controller completo com `@RestController`, `@RequestMapping`, `@PostMapping`, `@GetMapping`, `@DeleteMapping`, `@PathVariable` e `@RequestBody`, retornando os status HTTP adequados (201, 200 e 204). |
| 🏛️ **Arquitetura em camadas** | Separei a feature em controller → service → repository, com cada camada tendo uma única responsabilidade e as dependências injetadas pelo construtor. |
| 🗄️ **JPA / Hibernate (ORM)** | Mapeei a entidade `AutoAvaliacao` com geração automática de ID e usei o `JpaRepository` para persistir e consultar os dados sem SQL manual. |
| ✂️ **Lombok** | Usei `@Data`, `@Builder` e os construtores gerados automaticamente para manter a entidade enxuta. |
| 📄 **Swagger / OpenAPI** | Documentei todos os endpoints da autoavaliação com anotações do OpenAPI, deixando-os testáveis pela interface do Swagger. |
| 🗃️ **MySQL** | Configurei a conexão com o banco MySQL no IntelliJ (Data Sources) para acompanhar a tabela gerada a partir da entidade. |
| 🧪 **Testes de API (Postman)** | Testei os endpoints da autoavaliação (cadastro, listagem, busca por ID e exclusão), validando as respostas e os códigos de status. |
| 🔧 **Git e GitHub** | Desenvolvi a feature vinculada à issue #23, com commits padronizados e integrados às branches das sprints. |

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

Atuei principalmente no **front-end**, em tarefas ligadas a issues do projeto. Todas as entregas podem ser conferidas no histórico de commits do repositório:

| Entrega | O que eu fiz | Evidência |
|---|---|---|
| **Responsividade** (issue #21) | Refiz o layout da tela de técnicos com Flexbox (`display: flex`, `flex-wrap`, `min-width` e `max-width`), para que ela se adaptasse a monitores de tamanhos diferentes. | [`8938ce2`](https://github.com/DataTechApi/DataAgenda/commit/8938ce2fee90535ec512f6d4a7263b14cc5c3c1b) |
| **Tela de login** (issue #30) | Criei a `LoginView.vue` com componentes do PrimeVue (`InputText`, `Password` e `Button`), estado reativo com `ref`, indicador de carregamento e mensagem de erro para credenciais inválidas, seguindo o layout padrão do sistema. | [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) |
| **Proteção de rotas** (issue #30) | Adicionei a rota `/login` e um *navigation guard* (`router.beforeEach`) no Vue Router: sem token na sessão, o usuário é redirecionado para o login; já autenticado, ele vai direto para o dashboard. | [`c829854`](https://github.com/DataTechApi/DataAgenda/commit/c829854ad3a4af3822d521cb312fa2417ac51dd4) |
| **Modo claro/escuro** (issue #67) | Criei a store `theme.ts` com **Pinia**, que guarda a preferência do usuário no `localStorage`; substituí as cores fixas por **variáveis CSS** (`--bg-app`, `--text-main` etc.) no `custom-theme.css` e configurei o `darkModeSelector` do PrimeVue. A mudança foi aplicada em **23 telas**, além do cabeçalho e do layout principal. | [`ac58691`](https://github.com/DataTechApi/DataAgenda/commit/ac586916ee2ed6a5955bb919dc1188a0c267d665) |
| **Correção de bug** (issue #75) | Identifiquei que, ao cancelar a edição de um cliente, os dados do formulário eram perdidos. Corrigi guardando uma cópia do estado original (`clienteOriginal.value = { ...response.data }`) assim que os dados chegam da API, para restaurá-los no cancelamento. | [`608eb59`](https://github.com/DataTechApi/DataAgenda/commit/608eb59558d2c0ae2683f38d412491b64eb6aa56) |

> A autenticação no back-end (Spring Security com JWT) foi implementada por outro integrante da equipe; minha parte no login foi a interface e o controle de acesso às rotas no front-end.

---

## 🤝 4.0 Soft Skills Desenvolvidas

* 🤝 **Trabalho em equipe** – desenvolvimento colaborativo em branches por sprint, integrando o trabalho de vários membros.

* 🗣️ **Comunicação** – alinhamento das tarefas por meio de issues e do quadro do projeto no GitHub.

* 🎯 **Foco na experiência do usuário** – atenção a detalhes de usabilidade, como responsividade e tema claro/escuro.

* 🧩 **Resolução de problemas** – investigação e correção de bugs reportados durante as sprints.

* 📌 **Responsabilidade** – cumprimento dos critérios de DoR e DoD nas entregas.

## 🛠️ 4.1 Hard Skills Desenvolvidas

| Habilidade | Por que posso afirmar que sei |
|---|---|
| 🌐 **Vue 3 (Composition API)** | Desenvolvi telas com `<script setup>`, estado reativo (`ref`) e ciclo de vida (`onMounted`), como a `LoginView.vue` e a aplicação do tema no `App.vue`. |
| 🧭 **Vue Router** | Criei a rota de login e um *navigation guard* global com `router.beforeEach`, que controla o acesso às páginas conforme a autenticação. |
| 🗂️ **Pinia (gerenciamento de estado)** | Implementei a store de tema (`useThemeStore`), compartilhada por toda a aplicação, com as funções `toggle` e `apply`. |
| 🎨 **CSS (variáveis, Flexbox e temas)** | Construí o sistema de temas com variáveis CSS e transições, e resolvi a responsividade da tela de técnicos com Flexbox. |
| 🧱 **PrimeVue** | Usei os componentes de formulário (`InputText`, `Password`, `Button`) e configurei o tema Aura com `darkModeSelector`. |
| 💾 **Web Storage** | Usei o `localStorage` para persistir a preferência de tema entre acessos e o `sessionStorage` para guardar o token da sessão. |
| 🟦 **TypeScript** | Escrevi a store de tema e as alterações do router em arquivos `.ts`. |
| 🐞 **Depuração** | Encontrei e corrigi a causa da perda de dados ao cancelar a edição de cliente (issue #75), um problema de gerenciamento de estado. |
| 🔧 **Git e GitHub** | Cada entrega está ligada a uma issue (#21, #30, #67 e #75) e foi integrada às branches das sprints. |

---
