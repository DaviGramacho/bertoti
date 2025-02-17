<h1>Primeiro trecho</h1>
<p>"What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices."</p>

<h2>Comentario: </h2>
<p>O texto discute a diferença entre "engenharia de software" e "programação", destacando que, enquanto programação está mais associada à escrita de código, engenharia de software envolve o uso de conhecimentos teóricos para criar soluções reais e precisas, algo mais próximo das engenharias tradicionais, como mecânica ou civil. A principal diferença é que a engenharia de software ainda não segue as mesmas práticas rigorosas que outras engenharias, como a aeronáutica, onde erros podem ter consequências graves. Com a crescente importância do software em nossas vidas, o autor defende que precisamos adotar métodos mais rigorosos para garantir a confiabilidade do código. Esse ponto de vista da Google, com a experiência acumulada, pode oferecer insights valiosos para a evolução da engenharia de software.</p>

<h1>Segundo trecho</h1>
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

<h2>Comentario: </h2>

<p>"O texto fala sobre como a engenharia de software não se resume apenas a escrever código, mas também envolve todos os processos e ferramentas usados para manter esse código ao longo do tempo. A ideia é pensar em práticas que ajudem a tornar o código mais sustentável e adaptável às mudanças ao longo de sua vida, desde a criação até a descontinuação. O autor sugere que a engenharia de software deve ser vista como um processo contínuo, em que o código precisa ser capaz de se adaptar às mudanças e evoluções da organização. O livro destaca três pontos principais: como o código deve se adaptar ao longo do tempo, como a organização cresce e muda, e como tomar decisões levando em conta os custos e as trocas necessárias. O objetivo é melhorar a forma como a engenharia de software é feita e garantir que o código seja mais sustentável e útil a longo prazo."</p>

<h1>Tradeoff exemplos</h1>

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
