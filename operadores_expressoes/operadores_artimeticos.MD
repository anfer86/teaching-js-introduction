<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar cálculos. A maior parte dos operadores são funcionalidades que estão presentes em qualquer calculadora.

| Operador<br>artimético | Descrição | Exemplo | 
| ------------ | ------------------ | -------- |
| + | Adição | `> 5 + 7`<br>`12` |
| - | Subtração | `> 7 - 5`<br>`2` | 
| * | Multiplicação | `> 5 * 3`<br>`15` | 
| / | Divisão | `> 15 / 3`<br>`5`<br>`> 5 / 2`<br>`2.5` | 
| % | Resto da divisão | `> 9 % 6`<br>`3`<br>`> 4 % 2`<br>`0` | 
| ++ | Incremento (1 unidade) | `> var x = 5;`<br>`> x++; `<br>`6` |
| -- | Decremento (1 unidade) | `> var x = 5;`<br>`> x--; `<br>`4` |

## Problema Resolvidos

**Divisão da Pizza (Divisão e Resto, lógica modular)**

Um grupo de amigos/as querem pedir uma pizza. A ideia deles é que todos comam o mesmo número de fatias.

Mostre um programa que receba como entrada:
- O número de porções da pizza
- O número de amigos para dividir

E mostre como saída:
- O número de porções por pessoa
- O número de porções que sobraram

Exemplos de entrada/saída:

| # | Exemplo de Entrada | Exemplo de Saída
| -- | ----- | ----- |
| 1 | 8<br>3 | 2<br>2 |
| 2 | 12<br>4 | 3<br>0 |
| 3 | 16<br>5 | 3<br>1 |

O exemplo #1 recebe como entrada 8 porções de pizza para dividir em 3 amigos. O programa mostra que cada pessoa vai comer 2 porções e que irão sobrar 2 porções.

Vamos implementar o programa usando as operações de *divisão* e de *resto da divisão*. Crie uma pasta chamada `divisao_da_pizza` e dentro da psta crie um arquivo `input.txt` contendo algum dos exemplos de entrada (casos de teste) e o arquivo `divisao_da_pizza.js` com a seguinte implementação.

```javascript
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var porcoes = parseInt(lines[0]);
var pessoas = parseInt(lines[1]);

var porcoes_por_pessoa = parseInt( porcoes / pessoas );
var resto = porcoes % pessoas;

console.log(porcoes_por_pessoa);
console.log(resto);
```


