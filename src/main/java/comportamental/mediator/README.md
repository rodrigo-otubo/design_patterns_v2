---
Padrão: Comportamental
Título: Mediator
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do
objeto mediador.
Define um objeto que encapsula como um conjunto de objetos iterados. O Mediator promove o acoplamento fraco, evitando que os objetos se refiram explicitamente
uns aos outros e permite que você varie sua interação de forma independente.


## Wikipedia

Na engenharia de software, o padrão mediator define um objeto que encapsula como um conjunto de objetos iterados. Esse padrão é considerado um padrão
comportamental devido à forma como pode alterar o comportamento de execução do programa. Na programação orientada a objetos, os programas geralmente consistem 
em muitas classes. A lógica de negócios e a computação são distribuídas entre essas classes. No entanto, à medida que mais classes são adicionadas a um programa,
especialmente durante a manutenção e/ou refatoração, o problema de comunicação entre essas classes pode se tornar mais complexo. Isso torna o programa mais
difícil de ler e manter. Além disso, pode se tornar difícil alterar o programa, pois qualquer alteração pode afetar o código em várias outras classes. Com o
padrão mediador, a comunicação entre objetos é encapsulada em um objeto mediador. Os objetos não se comunicam mais diretamente uns com os outros, mas se
comunicam por meio do mediador. Isso reduz as dependências entre objetos de comunicação, reduzindo assim o acoplamento.


## Aplicabilidade

> * Utilize o padrão Mediator quando é difícil mudar algumas das classes porque elas estão firmemente acopladas a várias outras classes.
> * Utilize o padrão quando você não pode reutilizar um componente em um programa diferente porque ele é muito dependente de outros componentes.
> * Utilize o Mediator quando você se encontrar criando um monte de subclasses para componentes apenas para reutilizar algum comportamento básico em vários
>  contextos.


## Prós
> * Princípio de responsabilidade única. Você pode extrair as comunicações entre vários componentes para um único lugar, tornando as de mais fácil entendimento 
> e manutenção.
> * Princípio aberto/fechado. Você pode introduzir novos mediadores sem ter que mudar os próprios componentes.
> * Você pode reduzir o acoplamento entre os vários componentes de um programa.
> * Você pode reutilizar componentes individuais mais facilmente.


## Contras
> * Com o tempo um mediador pode evoluir para um Objeto Deus.
