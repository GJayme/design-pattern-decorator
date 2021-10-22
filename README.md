# Problema:

Uma cafeteria queria implementar um sistema para ter o controle dos preços de suas bebidas.

Entre as bebidas temos: Café, Descafeinado, Espresso e por ai vai. Além disso podemos acrescentar adicionais em nossas bebidas como Creme, chocolate, e outras coisas.

Como você iria implementar esse sistema?

![image](https://user-images.githubusercontent.com/47933829/138320448-759346d5-5475-4b76-8703-420f0ac957aa.png)

É natural que a princípio tentaríamos criar uma classe Abstrata de bebida e a partir dela criar nossas classes concretas, como por exemplo Espresso com creme e chocolate. Porém se fomos por esse caminho acabaríamos criando muitas classes concretas e para dar manutenção em todas elas seria impossível, além de ferir um dos princípios mais importantes dentro da OO, **O princípio do aberto-fechado** (aberto para novas extensões, mas fechado para modificar código existentes).

E foi partindo dessa problemática que surgiu o padrão **Decorator**, um padrão estrutural que anexa responsabilidades adicionais a um objeto dinamicamente. Os **Decoradores** fornecem uma alternativa flexível de subclasse para estender a funcionalidade.

Para tentar ficar um pouco mais claro, pense no Decorator como roupas que vestimos. Sem casaco passamos frio, para resolver isso vista um casaco, se chover use capa de chuva.

![image](https://user-images.githubusercontent.com/47933829/138320827-1d04f845-0f2a-4c91-95b9-b135afc83daf.png)

Em um diagrama de classes nosso problema utilizando Decorator ficaria da seguinte forma:

![image](https://user-images.githubusercontent.com/47933829/138320910-bed0db3f-e532-4caa-887a-33b4274a7bc4.png)

# Fontes:

[https://refactoring.guru/pt-br/design-patterns/decorator](https://refactoring.guru/pt-br/design-patterns/decorator)

PADRÕES DE PROJETO: FREEMAN, Eric & FREEMAN Elisabeth. 2. ed. Alta Books

PADRÕES DE PROJETO: Erich Gamma et al. bookman
