# Aula 1 (14/02/2025)

### Atividade 1 - Programming Over Time
<p>"What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices."</p>


**`Comentário:`**
<p>O texto discute a diferença entre "engenharia de software" e "programação", destacando que, enquanto programação está mais associada à escrita de código, engenharia de software envolve o uso de conhecimentos teóricos para criar soluções reais e precisas, algo mais próximo das engenharias tradicionais, como mecânica ou civil. A principal diferença é que a engenharia de software ainda não segue as mesmas práticas rigorosas que outras engenharias, como a aeronáutica, onde erros podem ter consequências graves. Com a crescente importância do software em nossas vidas, o autor defende que precisamos adotar métodos mais rigorosos para garantir a confiabilidade do código. Esse ponto de vista da Google, com a experiência acumulada, pode oferecer insights valiosos para a evolução da engenharia de software.</p>

### Atividade 2
<p>"Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth"</p>

**`Comentário:`**

<p>"O texto fala sobre como a engenharia de software não se resume apenas a escrever código, mas também envolve todos os processos e ferramentas usados para manter esse código ao longo do tempo. A ideia é pensar em práticas que ajudem a tornar o código mais sustentável e adaptável às mudanças ao longo de sua vida, desde a criação até a descontinuação. O autor sugere que a engenharia de software deve ser vista como um processo contínuo, em que o código precisa ser capaz de se adaptar às mudanças e evoluções da organização. O livro destaca três pontos principais: como o código deve se adaptar ao longo do tempo, como a organização cresce e muda, e como tomar decisões levando em conta os custos e as trocas necessárias. O objetivo é melhorar a forma como a engenharia de software é feita e garantir que o código seja mais sustentável e útil a longo prazo."</p>

### Atividade 3 - tradeoff(troca):

<p><strong>1. Linguagem de Programação (Python x C):</strong>
Python é uma linguagem fácil de aprender e escrever, com uma sintaxe simples. No entanto, ela tem a desvantagem de ser mais lenta em termos de execução. O código Python é interpretado em tempo de execução, o que significa que a máquina precisa traduzir as instruções enquanto o programa está rodando.
C, por outro lado, é uma linguagem mais difícil de aprender, mas oferece um desempenho muito mais rápido, pois é compilada diretamente para código de máquina.</p>
 
<p><strong>Trade-off:</strong> Se você precisa de um desenvolvimento rápido e de um código mais simples, Python é a escolha. Mas se o desempenho for crítico (como em jogos ou sistemas embarcados), C é mais adequado.</p>

<p><strong>2. Banco de Dados (SQL x NoSQL):</strong>
SQL (relacional) é ótimo quando você tem dados estruturados e relações complexas entre tabelas. Ele permite realizar consultas poderosas e precisa de menos manutenção em termos de integridade de dados.
NoSQL, como MongoDB, oferece mais flexibilidade com dados não estruturados ou semi-estruturados e é escalável horizontalmente, o que significa que ele pode crescer facilmente. No entanto, ele pode não ser tão eficiente em consultas complexas e não tem o mesmo nível de consistência e integridade que bancos relacionais.</p>

<p><strong>Trade-off:</strong> Se você precisa de dados muito estruturados e consistentes, SQL é ideal. Mas, se a flexibilidade e escalabilidade são mais importantes, NoSQL pode ser a melhor opção.</p>

<p><strong>3. Software (Windows x Linux):</strong>
Windows é um sistema operacional muito popular, fácil de usar, e tem muitos softwares e jogos disponíveis. No entanto, é mais pesado e, em algumas situações, pode ser menos seguro ou personalizável do que o Linux.
Linux, por outro lado, é mais rápido, seguro e altamente customizável. É amplamente usado em servidores e por desenvolvedores. No entanto, pode ser difícil de configurar para quem não tem muita experiência com programação e não oferece tantos softwares prontos para uso quanto o Windows.</p>

<p><strong>Trade-off:</strong> Se você precisa de um sistema fácil de usar com muitos programas disponíveis, o Windows é uma boa escolha. Mas se você busca maior controle, segurança e desempenho, o Linux pode ser a melhor opção.</p>

# 21/02/2025
### Atividade 4 - Classe UML 
***Classe UML - ToDolist***

### ToDoList

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| - **tasks**: List<Task> | Privado  |
| + **addTask(String)**: void | Público |
| + **deleteTask(int)**: void | Público |
| + **getTasks()**: List<Task> | Público |

---

### Task

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| - **id**: int           | Privado  |
| - **name**: String      | Privado  |
| + **Task(int, String)** | Público  |
| + **getId()**: int      | Público  |
| + **getName()**: String | Público  |
| + **toString()**: String | Público |

---

### Database

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| - **URL**: String       | Privado  |
| - **connection**: Connection | Privado |
| + **createTable()**: void | Público |
| + **getConnection()**: Connection | Público |

---

### TaskDAO

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| + **addTask(String)**: void | Público |
| + **deleteTask(int)**: void | Público |
| + **getTasks()**: List<Task> | Público |

---

### Main

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| + **main(String[])**: void | Público |

---

### TaskDAOTest

| Atributos/Métodos      | Tipo     |
|------------------------|----------|
| + **testTaskOperations()**: void | Público |

# 1. Database.java
```java
import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:tasks.db";
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL);
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS tasks (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL);";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
```

# 2. Task.java
```java
public class Task {
    private int id;
    private String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ". " + name;
    }
}
```

# 3. TaskDAO.java
```java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    public void addTask(String name) {
        String sql = "INSERT INTO tasks(name) VALUES(?);";
        try (PreparedStatement pstmt = Database.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?;";
        try (PreparedStatement pstmt = Database.getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks;";
        try (Statement stmt = Database.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tasks.add(new Task(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
```

# 4. Main.java
```java
public class Main {
    public static void main(String[] args) {
        TaskDAO taskDAO = new TaskDAO();

        // Adicionar tarefas
        taskDAO.addTask("Estudar Java");
        taskDAO.addTask("Fazer exercícios de algoritmos");

        // Listar tarefas
        System.out.println("Lista de tarefas:");
        for (Task task : taskDAO.getTasks()) {
            System.out.println(task);
        }

        // Remover uma tarefa
        taskDAO.deleteTask(1);

        // Listar tarefas após remoção
        System.out.println("Lista após deletar a tarefa 1:");
        for (Task task : taskDAO.getTasks()) {
            System.out.println(task);
        }
    }
}
```

#### 5. Teste
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class TaskDAOTest {

    @Test
    void testAddTask() {
        TaskDAO taskDAO = new TaskDAO();

        // Adicionar uma tarefa
        taskDAO.addTask("Tarefa de Teste 1");

        // Verificar se a tarefa foi adicionada
        List<Task> tasks = taskDAO.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Tarefa de Teste 1", tasks.get(0).getName());
    }

    @Test
    void testDeleteTask() {
        TaskDAO taskDAO = new TaskDAO();

        // Adicionar duas tarefas
        taskDAO.addTask("Tarefa de Teste 1");
        taskDAO.addTask("Tarefa de Teste 2");

        // Verificar se as tarefas foram adicionadas
        List<Task> tasks = taskDAO.getTasks();
        assertEquals(2, tasks.size());

        // Remover a primeira tarefa
        taskDAO.deleteTask(tasks.get(0).getId());

        // Verificar se a tarefa foi removida
        List<Task> updatedTasks = taskDAO.getTasks();
        assertEquals(1, updatedTasks.size());
        assertEquals("Tarefa de Teste 2", updatedTasks.get(0).getName());
    }

    @Test
    void testGetTasks() {
        TaskDAO taskDAO = new TaskDAO();

        // Adicionar duas tarefas
        taskDAO.addTask("Tarefa de Teste 1");
        taskDAO.addTask("Tarefa de Teste 2");

        // Verificar se as tarefas foram listadas corretamente
        List<Task> tasks = taskDAO.getTasks();
        assertEquals(2, tasks.size());
        assertEquals("Tarefa de Teste 1", tasks.get(0).getName());
        assertEquals("Tarefa de Teste 2", tasks.get(1).getName());
    }
}
```

# POM.XML

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- Informações básicas do projeto -->
    <groupId>com.example</groupId>
    <artifactId>todo-list</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <junit.version>5.10.0</junit.version>
        <sqlite.version>3.42.0.0</sqlite.version>
    </properties>

    <dependencies>
        <!-- Dependência do SQLite -->
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>${sqlite.version}</version>
        </dependency>

        <!-- Dependência do JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Plugin para compilar o projeto com Java 11 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                </configuration>
            </plugin>

            <!-- Plugin para executar testes com JUnit 5 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
                <configuration>
                    <includes>
                        <include>**/*Test.java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```
