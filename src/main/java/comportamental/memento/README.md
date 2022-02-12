---
Padrão: Comportamental
Título: Memento
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.
Sem violar o encapsulamento, capture e exteriorize o estado interno de um objeto para que o objeto possa ser restaurado a esse estado posteriormente.


## Wikipedia

O padrão memento é um padrão de design de software que fornece a capacidade de restaurar um objeto ao seu estado anterior (desfazer via rollback).


## Aplicabilidade

> * Utilize o padrão Memento quando você quer produzir retratos do estado de um objeto para ser capaz de restaurar um estado anterior do objeto.
> * Utilize o padrão quando o acesso direto para os campos/getters/setters de um objeto viola seu encapsulamento.


## Prós
> * Você pode produzir retratos do estado de um objeto sem violar seu encapsulamento.
> * Você pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora.


## Contras
> * A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.
> * Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.
> * A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto.
