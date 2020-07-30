<link rel="stylesheet" type="text/css" href="../style.css">

# Estrutura `for`

Usamos esse tipo de laço quando sabemos quantas vezes queremos executar uma determinada instrução. O `for` tem a seguinte estrutura:

```js
for ([expressaoInicial]; [condicao]; [incremento]){
  instruções
}
```

Quando executamos esse for ocorre o seguinte:

Quando um for é executado, ocorre o seguinte:
- `expressaoInicial` essa expressão inicializa um ou mais variáveis contadoras.
- `condicao` é avaliada. Se o valor de condição é falso, então o laço terminará. Se a expressão condicão é verdadeira o laço continua.
- `incremento` é incrementada a variável contadora após ter executado as instruções.

Voltando ao exemplo apresentado anteriormente.

```javascript
// passo_a_frente/passo_a_frente.js
for (let i = 0; i < 5; i++) {  
  console.log('Ande um passo para frente');
}
```

Seguem todos os passos que ocorreram neste programa:
1. Cria uma variável chamada `i` e inicia ela com valor `i = 1`. Essa variável somente vai existir dentro do `for` (por isso o `let` ao invés de `var`) .
2. Verifica se `i < 5`. Como é verdadeiro executa a instrução.
3. Mostra no console "Ande um passo para frente"
4. Incrementa o valor de `i` em uma unidade usando `i++`. O `i++` é igual que fazer `i = i+1` ou `i += 1`. O novo valor de `i` passou de `0` para `1`.
5. Verifica se `i < 5`. Como é verdadeiro executa a instrução.
6. Mostra no console "Ande um passo para frente"
7. Incrementa o valor de `i` em uma unidade. O novo valor de `i` é `2`.
8. Verifica se `i < 5`. Como é verdadeiro executa a instrução.
9. Mostra no console "Ande um passo para frente"
10. Incrementa o valor de `i` em uma unidade. O novo valor de `i` é `3`.
11. Verifica se `i < 5`. Como é verdadeiro executa a instrução.
12. Mostra no console "Ande um passo para frente"
13. Incrementa o valor de `i` em uma unidade. O novo valor de `i` é `4`.
14. Verifica se `i < 5`. Como é verdadeiro executa a instrução.
15. Mostra no console "Ande um passo para frente"
16. Incrementa o valor de `i` em uma unidade. O novo valor de `i` é `5`.
17. Verifica se `i < 5`. Como é **falso** termina a execução do `for`.
18. Termina o programa.

A seguir vamos criar programas para resolver alguns problemas.

**Problema 1**

Crie um programa que mostre os números de 1 a 50, um por linha. Este programa não possui entrada de dados, apenas saída.

Solução 1:
```javascript
// numeros/numeros_solucao_1.js
for (let i = 0; i < 50; i++) {  
  console.log(i+1);
}
```

Solução 2:
```javascript
// numeros/numeros_solucao_2.js
for (let i = 1; i <= 50; i++) {  
  console.log(i);
}
```

Saída de ambas as soluções:
<div style="border: 1px dashed black; padding: 5px;">
1<br>
2<br>
3<br>
4<br>
...<br>
49<br>
50<br>
</div>

**Problema 2**

Faça um programa que mostre a soma dos primeiros 100 números inteiros. Este programa não tem entrada de dados, apenas saída.

Solução:
```javascript
// soma100/soma100.js
var soma = 0
for (let i = 1; i <= 100; i++) {  
    soma = soma + i
}
console.log(soma);
```

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
5050<br>
</div>

**Problema 3**

Faça um programa que calcule e mostre a média de notas. Na primeira linha do arquivo de entrada tem o número de notas a serem lidas e nas linhas posteriores são apresentadas as notas. 

Arquivo de entrdada:
```js
// media_notas/input.txt
5
9.0
8.8
8.3
9.1
9.2
```

Solução:
```javascript
// media_notas/media_notas.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var n = Number(lines[0]);
var soma = 0;

for (let i = 1; i <= n; i++){
    let nota = Number(lines[i]);
    soma += nota;
}

var media = soma / n;
console.log('Média: ' + media.toFixed(1));
```

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
Média: 8.9<br>
</div>

### Exercícios

**1. Soma de Quadrados**

Faça um programa que calcule e mostre a soma dos quadrados dos números de 1 a 10. O quadrado de um número $x$ é $x^2$ ou $x*x$. Este exercício não contém dados de entrada, apenas saída. Crie uma pasta chamada `soma_de_quadrados` para armazenar a solução deste exercício.

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
Soma de quadrados de 1 a 10: 385<br>
</div>

**2. Maiores de Idade**

Faça um programa que conte e mostre quantas pessoas são maiores de idade. Considere maior de idade maior ou igual a 18 anos. No arquivo de entrada a primeira linha indica quantas idades devem ser lidas nas linhas posteriores. Crie uma pasta chamada `maiores_de_idade` para armazenar a solução deste exercício.

Exemplo de arquivo de entrada:

Arquivo de entrada:
```js
// maiores_de_idade/input.txt
7
18
19
20
17
19
14
15
```

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
Maiores de idade: 4<br>
</div>