---
Padrão: Comportamental
Título: Chain of responsibility
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite que o objeto passe por uma cadeia de handlers, ao receber a requisição cada handler decide se processa ou passa para outro handler da cadeia.
Ajuda a construir uma cadeia de objetos. Uma solicitação entra de um lado e continua indo de um objeto para outro até encontrar um manipulador adequado.

## Wikipedia

No projeto orientado a objetos, o padrão de cadeia de responsabilidade é um padrão de projeto que consiste em uma fonte de objetos de comando e uma série 
de objetos de processamento. Cada objeto de processamento contém uma lógica que define os tipos de objetos de comando que ele pode manipular; o restante é
passado para o próximo objeto de processamento na cadeia.


## Aplicabilidade

> * Utilize o padrão Chain of Responsability quando você espera que seu programa processe diferentes tipos de pedidos em várias maneiras, 
> não obrigatoriamente todos passando por todos os handlers.
> * Utilize quando for necessário executar diversos handlers em uma ordem específica.

![Captura de Tela 2022-01-18 às 23 10 07](https://user-images.githubusercontent.com/24915267/150050378-c06f1323-8eaf-48b4-a436-934cf16c8aa2.png)


## Prós
> * Pode controlar os handlers na ordem que quiser
> * Princípio de responsabilidade única, podendo desacoplar classes que invocam operações de classes que realizam operações.
> * Princípio aberto/fechado, podendo adicionar ou remover um handle em qualquer momento sem quebrar o código.

## Contras
> * Alguns pedidos podem acabar sem tratamento
