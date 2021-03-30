<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>

# Estruturas de Repetição

As estruturas de repetição, chamadas também de laços, são uma forma simples de executar uma instrução repetidas vezes. Essas estruturas podem ser usada para objetivos como:
- Repetir uma mensagem o número de vezes que a gente quiser.
- Calcular a média de notas baseado em um número qualquer de notas, não sendo necessário limitar apenas para 4 notas.
- Dada idade de um grupo de pessoas qualquer saber quantas são maiores de idade.
- Aplicar o mesmo processamento a vários textos, como tweets.
- Ao integrar Javascript com HTML podemos também mostar vários elementos, como produtos, em HTMl.

Vamos criar uma exemplo simples para ver como funciona esta estrutura. 

Crie uma pasta para armazenar os arquivos de estruturas de repetição chamada `estruturas_de_repeticao`, dentro dela criaremos as pastas dos nosso exercícios. Dentro dessa pasta implemente o seguinte exemplo.

```javascript
// passo_a_frente/passo_a_frente.js
for (let i = 0; i < 5; i++) {  
  console.log('Ande um passo para frente');
}
```

A saída esperada é:
<div style="border: 1px dashed black; padding: 5px;">
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
</div>

Em javascript temos várias formas de trabalhar com estruturas de repetição. Embora todas tenham como objetivo repetir um conjunto de instruções as diferentes formas permitem que o programador escolha a mais simples em cada ocasião.

Vamos focar nas seguintes estruturas:
- `for`
- `for..of  ` 
- `while..do`
- `do...while`

## `for`

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

Arquivo de entrdada:
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


## `for..of`

Usamos esse tipo de laço quando temos vários elementos dentro de um array, ou outra estrutura que armazena vários elementos dentro dela. O `for..of` tem a seguinte estrutura:

```js
for (variavel of array) {
  instruções
}
```

Suponha um array contendo os seguintes dados `arr = ["Andres", "Fabiano","Laura","Mari", "João"]` e tenho interesse em mostrar uma mensagem de bom dia para todos os elementos do array. Por exemplo, `Bom dia Andres`, `Bom dia Fabiano` e assim por diante.

```js
// bom_dia/bom_dia.js
var arr = ["Andres", "Fabiano","Laura","Mari", "João"];

for (let nome of arr) {
  console.log('Bom Dia ' + nome + "!")
}
```

Neste programa acontece o seguinte:
1. Armazenamos os nomes em um array chamado `arr`
2. Inicia-se o `for` atribuíndo a uma variável chamada `nome` o primeiro nome do array, no caso, `nome` recebe `"Andres"`
3. Mostra a mensagem de `"Bom Dia Andres!"`
4. A variável `nome` recebe o segundo valor do array `"Fabiano"`
5. Mostra a mensagem de `"Bom Dia Fabiano!"`
6. A variável `nome` recebe o terceiro valor do array `"Laura"`
7. Mostra a mensagem de `"Bom Dia Laura!"`
8. A variável `nome` recebe o quarto valor do array `"Mari"`
9. Mostra a mensagem de `"Bom Dia Mari!"`
10. A variável `nome` recebe o quinto valor do array `"João"`
11. Mostra a mensagem de `"Bom Dia João!"`
12. Como não tem mais elementos no array `arr` então conclui o `for..of`
13. Termina o programa.

A saída esperada para esse programa será:
<div style="border: 1px dashed black; padding: 5px;">
Bom Dia Andres!<br>
Bom Dia Fabiano!<br>
Bom Dia Laura!<br>
Bom Dia Mari!<br>
Bom Dia João!
</div>

Vamos praticar essa estrutura para resolver alguns problemas.

**Problema 1**

Faça um programa que leia um nome completo e mostre qual é a primeira letra de cada nome. O arquivo de entrada conterá vários nomes separados por espaço.

Arquivo de entrdada:
```js
// iniciais_do_nome/input.txt
Carlos Andres Ferrero
```

Programa:
```js
// iniciais_do_nome/iniciais_do_nome.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var nomes = lines[0].split(' ');

for (let nome of nomes){
    let primeira_letra = nome[0];
    console.log(primeira_letra);
}
```

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
C<br>
A<br>
F<br>
</div>


**Problema 2**

O comprimento dos textos em Tweets é comumente próximo a 33 caracteres, mas o limite permitido é de 280 caracteres. Você quer fazer uma aplicação que, se o tweet tiver mais do que 33 caracteres então vai adicionar após os 33 caracteres os três pontos `...`.

No arquivo de entrada você receberá vários tweets.

```
// tweets/input.txt
@homem100medo:Lembrando que Tetris é na verdade uma metáfora da vida, pois nele seus erros se acumulam e os acertos desaparecem, jogo muito educativo.
@julhapema:Gente é sério, já tamo em 2015. Quando é que a gente vai decidir que o futuro já chegou e começar a usar roupa prateada?
@a4038789:Bom vou nessa a gente se fala outra hora minha bateria vai acabar ta em 78%
@sinfo:a gente nunca parou pra pensar nos sentimentos da árvore se ela gosta de ser transformada no caderno do luan santana
@luansgo:vamo marca um dia pra marca um dia
```

Programa:
```js
// tweets/tweets.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var posts = lines;
var limite = 33;

for (let post of posts){
    let post_dados = post.split(':');
    let usuario = post_dados[0];
    let tweet = post_dados[1];

    if (tweet.length > limite)
        tweet = tweet.substring(0,limite) + '...'
    
    console.log(usuario + ':' + tweet)
}
```

Saída esperada:
<div style="border: 1px dashed black; padding: 5px;">
@homem100medo:Lembrando que Tetris é na verdade...<br>
@julhapema:Gente é sério, já tamo em 2015. Q...<br>
@a4038789:Bom vou nessa a gente se fala out...<br>
@sinfo:a gente nunca parou pra pensar no...<br>
@luansgo:vamo marca um dia pra marca um di...<br>
</div>

## Integrando Javascript com HTML

Um exemplo do que pode ser produzido integrando Javascript com HTML é apresentado no exemplo abaixo.

```html
<!-- tabuada/tabuada.html -->
<html>
    <head>
        <title>Tabuada</title>
    </head>

    <body>
        <table border=1>
            <thead>
                <th>Operação</th>
                <th>Resultado</th>
            </thead>
            <tbody id="tabuada">
            </tbody>
        </table>
    </body>

    <script>    
    var valor = 7;
    var tabuada = document.getElementById('tabuada');
    for (let i=0; i < 10; i++){
        let tr = document.createElement("tr");
        tr.innerHTML = "<td>" + valor + " x " + i + "</td>" +
                       "<td>" + (valor * i) + "</td>";
        tabuada.appendChild(tr);
    }
    </script>
</html>
```

O resultado esperado será uma tabela com a tabuada do número 7.

### Exercícios

Resolver a lista de exercícios proposta no URI sobre Estruturas de Repetição.