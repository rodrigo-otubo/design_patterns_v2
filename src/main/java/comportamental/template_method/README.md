---
Padrão: Comportamental
Título: Template Method
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.


## Wikipedia

Na programação orientada a objetos, o template method é um dos padrões de design comportamental identificados por Gamma et al. no livro Padrões de Projeto. 
O template method é um método em uma superclasse, geralmente uma superclasse abstrata, e define o esqueleto de uma operação em termos de várias etapas de 
alto nível. Essas etapas são implementadas por métodos auxiliares adicionais na mesma classe que o método de modelo.


## Aplicabilidade

> * Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua
>  estrutura.
> * Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores. Como resultado, você pode querer 
> modificar todas as classes quando o algoritmo muda.


## Prós

> * Você pode deixar clientes sobrescrever apenas certas partes de um algoritmo grande, tornando-os menos afetados por mudanças que acontece por outras partes 
> do algoritmo.
> * Você pode elevar o código duplicado para uma superclasse.


## Contras

> * Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo.
> * Você pode violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação através da subclasse.
> * Implementações do padrão Template Method tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem.
