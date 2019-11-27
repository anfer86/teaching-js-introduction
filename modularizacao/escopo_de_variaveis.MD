# Escopo de Variáveis

O escopo é a acessibilidade de variáveis em diferentes partes do código. Não se aplica apenas a variáveis, mas também a objetos e a funções.

## Escopo em Bloco de Comandos

Por exemplo, se você tem uma variável `var i = 25;` em um programa principal. E usa uma variável $i$ em um $for$ da seguinte forma `for (i = ; i < 100; i++)` então essas duas variáveis $i$ não deveriam ser a mesma variável, já que você só quer usar a variável $i$ para iterar dentro de um `for`.

Vamos ver três exemplos de criação das variáveis:

**Usando var**

```javascript
// escopo/intro1.js
var i = 25;
console.log(i);
for (var i = 0; i < 5; i++){
    console.log('Dentro do for ' + i);
}
console.log(i);
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
25<br>
Dentro do for 0<br>
Dentro do for 1<br>
Dentro do for 2<br>
Dentro do for 3<br>
Dentro do for 4<br>
5<br>
</div>

**Sem usar var**

```javascript
// escopo/intro2.js
var i = 25;
console.log(i);
for (i = 0; i < 5; i++){
    console.log('Dentro do for ' + i);
}
console.log(i);
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
25<br>
Dentro do for 0<br>
Dentro do for 1<br>
Dentro do for 2<br>
Dentro do for 3<br>
Dentro do for 4<br>
5<br>
</div>

**Usando let**

```javascript
// escopo/intro3.js
var i = 25;
console.log(i);
for (let i = 0; i < 5; i++){
    console.log('Dentro do for ' + i);
}
console.log(i);
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
25<br>
Dentro do for 0<br>
Dentro do for 1<br>
Dentro do for 2<br>
Dentro do for 3<br>
Dentro do for 4<br>
25<br>
</div>

Observe como o valor da variável global `i` não foi alterado, mas existiu uma variável interna dentro do `for` chamada `i` que iterou nesse bloco de comandos. Essa variável interna deixou de existir quando o `for` terminou. Ainda assim, a variável global `i` ainda existe.

Assim, qualquer variável criada dentro de um bloco de comando terá escopo esse bloco de comando.

## Escopo em Funções

Essa regra também vale para a criação de variáveis dentro de funções. Se declaramos uma variável dentro de uma função com `var` essa variável vai ganhar escopo global.




