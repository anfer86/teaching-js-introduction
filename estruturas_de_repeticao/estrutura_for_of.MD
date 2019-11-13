# Estrutura `for..of`

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


### Exercícios

Resolver a lista de exercícios proposta no URI sobre Estruturas de Repetição.