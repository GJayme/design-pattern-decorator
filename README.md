# Problema:

Imaginemos que uma cafeteria queria implementar um sistema para ter o controle dos preços de suas bebidas.

Entre as bebidas temos: Café, Descafeinado, Espresso e por ai vai. Além disso podemos acrescentar adicionais em nossas bebidas como Creme, chocolate, e outras coisas.

Como você iria implementar esse sistema?

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d7394761-8870-4800-abe3-4bb8b11f8ac1/Untitled.png)

É natural que a princípio tentaríamos criar uma classe Abstrata de bebida e a partir dela criar nossas classes concretas, como por exemplo Espresso com creme e chocolate. Porém se fomos por esse caminho acabaríamos criando muitas classes concretas e para dar manutenção em todas elas seria impossível, além de ferir um dos princípios mais importantes dentro da OO, **O princípio do aberto-fechado** (aberto para novas extensões, mas fechado para modificar código existentes).

E foi partindo dessa problemática que surgiu o padrão **Decorator**, ele anexa responsabilidades adicionais a um objeto dinamicamente. Os **Decoradores** fornecem uma alternativa flexível de subclasse para estender a funcionalidade.

Para tentar ficar um pouco mais claro, image o Decorator como roupas que vestimos. Sem casaco passamos frio, para resolver isso vista um casaco, se chover use capa de chuva.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d6c3aa5e-e31f-401c-b025-85ee617e28ca/Untitled.png)

Em um diagrama de classes nosso problema utilizando Decorator ficaria da seguinte forma:

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/66f1c1e3-8e61-463a-a078-ab778a93dd29/Untitled.png)

# Fontes:

[https://refactoring.guru/pt-br/design-patterns/decorator](https://refactoring.guru/pt-br/design-patterns/decorator)

PADRÕES DE PROJETO: FREEMAN, Eric & FREEMAN Elisabeth. 2. ed. Alta Books

PADRÕES DE PROJETO: Erich Gamma et al. bookman