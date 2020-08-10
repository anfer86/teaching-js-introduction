<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Operadores de Comparação (ou Lógicos)

Estes operadores são utilizados para comparar dois dados: valores de variáveis ou literais (valores fixos).

## Operadores de Igualdade

| Símbolo | Significado 
| ------------- |:-----------------|
| == | Igual. Retorna verdadeiro (true) se os dois dados possuem o mesmo conteúdo e falso (false), caso contrário. Ignora o tipo de dado. Exemplos: <br>`> 10 == 10;`<br>`true`<br>`> 10 == '10';`<br>`true`<br>`> var x = 25;`<br>`> x == 27;`<br>`false`<br>`> y = 'Gato';`<br>`y == 'Gato';`<br>`true`<br>`> (y == 'Cachorro');`<br>`false`
| === | Exatamente Igual. Retorna verdadeiro (true) se os dois dados possuem o mesmo conteúdo. **Considera o tipo de dado**. Exemplos: <br>`> 10 == 10;`<br>`true`<br>`> 10 == '10';`<br>`false`
| != | Diferente. Retorna verdadeiro (true) se os dois dados possuem o **conteúdo diferente**. Ignora o tipo de dado. Exemplos: <br>`> 10 != 10;`<br>`false`<br>`> 10 != '10';`<br>`false`<br>`> var x = 25;`<br>`> x != 27`<br>`true`<br>`> y = 'Gato'`<br>`y != 'Gato'`<br>`false`<br>`> (y != 'Cachorro')`<br>`true`
| !== | Exatamente Diferente. Retorna verdadeiro (true) se os dois dados possuem o conteúdo diferente. **Considera o tipo de dado**. Exemplos: <br>`> 10 !== 10;`<br>`false`<br>`> 10 !== '10';`<br>`true`

## Operadores Relacionais

| Símbolo | Significado 
| ------------- |:-----------------|
| > e >= | Maior e maior ou igual. Retorna verdadeiro (true) se o primeiro dado é maior (>) do que o segundo e falso (false) caso contrário. Exemplos: <br>`> (10 > 5);`<br>`true`<br>`> (5 > 10);`<br>`false`<br>`> var x = 25;`<br>`> (x >= 25);`<br>`true`<br>`> (x >= 20);`<br>`true`<br>`> (x >= 35);`<br>`false`
| < e <= | Menor e menor ou igual. Retorna verdadeiro (true) se o primeiro dado é maior (<>) do que o segundo e falso (false) caso contrário. Exemplos: <br>`> (10 < 5);`<br>`false`<br>`> (5 < 10);`<br>`true`<br>`> var x = 25;`<br>`> (x <= 25);`<br>`true`<br>`> (x <= 20);`<br>`false`<br>`> (x <= 35);`<br>`true`

## Operadores Lógicos

Os operadores lógicos são utilizados para comparar dados lógicos, sejam provenientes de variáveis, literais (valores fixos) ou resultado de expressões.

| Símbolo | Significado 
| ------------- |:-----------------|
| ! | Negação (Not). Retorna verdadeiro (true) se o dado é `false` e falso (false) caso contrário. Exemplos: <br>`> !(false);`<br>`true`<br>`> !(10 > 5);`<br>`false`<br>`> !(5 > 10);`<br>`true`<br>`> var x = 25;`<br>`> !(x > 20);`<br>`false`
| && | Conjunção (e, and). Retorna verdadeiro (true) se dois dados são **ambos verdadeiros (true)** e falso (false) caso contrário. Exemplos: <br>`> true && true;`<br>`true`<br>`> true && false;`<br>`false`<br>`> (10 > 5) && (5 > 10);`<br>`false`<br>`> var media = 7;`<br>`> var faltas = 5;`<br>`> (media >= 6) && (faltas <= 10); \\ Condição de aprovação`<br>`true`
| `||` | Disjunção (ou, or). Retorna verdadeiro (true) se em dois valores **pelo menos um é verdadeiro** e falso (false) caso contrário. Exemplos: <br>`> true || true;`<br>`true`<br>`> true || false;`<br>`true`<br>`> false || false;`<br>`false`<br>`> (10 > 5) || (5 > 10);`<br>`true`<br>`> var preco_produto = 50;`<br>`> var faltas = 5;`<br>`> (media < 6) || (faltas > 10); // Condicão de reprovação`<br>`true`



