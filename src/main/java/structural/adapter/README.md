---
Padrão: Structural
Título: Adapter
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite objetos com interfaces incompatíveis colaborarem entre si.


## Wikipedia

De forma exemplificável por um adaptadores de cabos, o padrão Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar,
"traduzindo" solicitações do formato requerido pelo usuário para o formato compatível com o a classe adaptee e as redirecionando. Dessa forma, o Adaptador
permite que classes com interfaces incompatíveis trabalhem juntas


## Aplicabilidade

> * Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.
> * Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade comum que não pode ser adicionada
> a superclasse.


## Prós

> * Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do negócio do programa.
> * Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem 
> com os adaptadores através da interface cliente.


## Contras

> * A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a 
> classe serviço para que ela se adeque com o resto do seu código.
