# Funções

Uma função é um subprograma ou sub-rotina que tem como objetivo executar uma tarefa específica. Funções são executadas quando algum outro programa ou subprograma chama elas, como por exemplo como chamamos a função `Math.max()` para saber qual é o valor máximo de um array de valores.

```javascript
function nome_da_funcao( [parametros] ){
  instrucoes;
  return instrucao;
}
```

Assim, uma função possui um nome, pode (opcionalmente) receber um conjunto de valores parâmetros e retornar (opcionalmente) alguma informação. Para entender melhor porque as funções que definimos podem ou não receber parâmetros e podem ou não retornar valores vamos ver os seguinte 4 exemplos de funções para dar uma mensagem de boas vindas aos integrantes do curso de programação.

Crie os arquivos dos seguintes programas em uma pasta chamada `modularizacao/`.

**Exemplo 1**: a função `bom_dia` mostra uma mensagem de bom dia. Ela não recebe nenhuma informação e não retorna nenhuma informação.

```javascript
// modularizacao/exemplo_1.js
function bom_dia(){
    console.log('---------------------------------------')
    console.log('Bom Dia!');
    console.log('Seja bem vindo ao curso de Programação!');
    console.log('---------------------------------------')
}
// Agora podemos chamar (invocar) a função
bom_dia();
```

Resultado esperado:

<div style="border: 1px dashed black; padding: 5px; font-family: courier">
---------------------------------------<br>
Bom Dia!<br>
Seja bem vindo ao curso de Programação!<br>
---------------------------------------<br>
</div>


**Exemplo 2**: a função `bom_dia` retorna uma mensagem de bom dia para o programa. Assim o programa decide o que fazer com ela. Ela não recebe nenhuma informação.

```javascript
// modularizacao/exemplo_2.js
function bom_dia(){
    let mensagem = 'Bom dia!';
    return mensagem;    
}

var m = bom_dia();
console.log (m + ' Seja bem vindo ao curso de Programação!' );
```

Resultado esperado:

<div style="border: 1px dashed black; padding: 5px; font-family: courier">
Bom dia! Seja bem vindo ao curso de Programação!<br>
</div>

Note que neste exercício deixamos o programa principal mostrar a mensagem no formato de sua preferência. Por isso não mostramos as linhas de cabeçalho.

**Exemplo 3**: esta versão da função `bom_dia` mostra uma mensagem de bom dia para um nome específico. Esta função recebe uma string, mas não retorna nenhuma informação.

```javascript
// modularizacao/exemplo_3.js
function bom_dia(nome){
    console.log('---------------------------------------')
    console.log('Bom Dia ' + nome +'!');
    console.log('Seja bem vindo ao curso de Programação!');
    console.log('---------------------------------------')
}
// Agora podemos chamar (invocar) a função
bom_dia('Andrés');
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
---------------------------------------<br>
Bom Dia Andrés!<br>
Seja bem vindo ao curso de Programação!<br>
---------------------------------------<br>
</div>

**Exemplo 4**: a função `bom_dia` retorna uma mensagem de bom dia para o programa personalizada com o nome de alguém. Assim o programa decide o que fazer com essa mensagem.

```javascript
// modularizacao/exemplo_4.js
function bom_dia(nome){
    let mensagem = 'Bom Dia ' + nome +'!' ;
    return mensagem;    
}

var m = bom_dia();
console.log (m + ' Seja bem vindo ao curso de Programação!' );
```

Resultado esperado:

<div style="border: 1px dashed black; padding: 5px; font-family: courier">
Bom dia Andrés! Seja bem vindo ao curso de Programação!
</div>

**Exemplo 5**: você foi contratado para implementar algumas funções que serão utilizadas por uma loja online. A loja está oferecendo 25% de desconto no produto de maior valor que a pessoa comprar, mas a pessoa tem que comprar pelo menos cinco produtos.

*Parte 1*: faça uma função que receba um array contendo os preços dos produtos e retorne o total a pagar.

```javascript
// modularizacao/exemplo_5_parte_1.js
function calcular_total(valores){
    let n = valores.length;
    let total = 0;
    for (let i = 0; i < n; i++) {
        total += valores[i];
    }
    return total;
}

/** Testando se a função funciona corretamente */
var precos_produtos = [10, 20, 45, 300, 3];
console.log('Preços dos produtos (R$):', precos_produtos);

var total_sem_desconto = calcular_total(precos_produtos);
console.log('Total a pagar sem desconto (R$):', total_sem_desconto );
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
Preços dos produtos (R$): [ 10, 20, 45, 300, 3 ]<br>
Total a pagar sem desconto: 378<br>
</div>


*Parte 2*: faça uma função que receba um array contendo os preços dos produtos e identifique qual é a posição do array que possui o produto de maior preço.

```javascript
// modularizacao/exemplo_5_parte_2.js
function produto_maior_preco(valores){
    let n = valores.length;
    let pos_maior = 0;
    for (let i = 0; i < n; i++){
        if (valores[i] > valores[pos_maior] ){
            pos_maior = i;
        }
    }    
    return pos_maior;    
}

/** Testando se a função funciona corretamente */
var precos_produtos = [10, 20, 45, 300, 3];
console.log('Preços dos produtos (R$):', precos_produtos);

var pos_maior = produto_maior_preco(precos_produtos);
console.log('Posição do produto de maior preço:', pos_maior );
console.log('Valor do produto de maior preço (R$):', precos_produtos[pos_maior] );
```

Resultado esperado:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
Preços dos produtos (R$): [ 10, 20, 45, 300, 3 ]<br>
Posição do produto de maior preço: 3<br>
Valor do produto de maior preço: 300<br>
</div>

*Parte 3*: faça uma função que receba um array contendo os preços dos produtos e um valor de desconto e retorne o valor total a pagar com desconto.

```javascript
// modularizacao/exemplo_5_parte_3.js
function calcular_total(valores){
    let n = valores.length;
    let total = 0;
    for (let i = 0; i < n; i++) {
        total += valores[i];
    }
    return total;
}

function produto_maior_preco(valores){
    let n = valores.length;
    let pos_maior = 0;
    for (let i = 0; i < n; i++){
        if (valores[i] > valores[pos_maior] ){
            pos_maior = i;
        }
    }    
    return pos_maior;    
}

function calcular_total_com_desconto(valores, desconto){
    let pos_maior = produto_maior_preco(valores);
    valores[pos_maior] = valores[pos_maior] * (1 - desconto); // desconto de 25%
    let total_com_desconto = calcular_total(valores);
    return total_com_desconto;
}

/** Testando se a função funciona corretamente */
var precos_produtos = [10, 20, 45, 300, 3];
console.log('Preços dos produtos (R$):', precos_produtos);

var total_sem_desconto = calcular_total(precos_produtos);
console.log('Total a pagar sem desconto (R$):', total_sem_desconto );

var pos_maior = produto_maior_preco(precos_produtos);
console.log('Posição do produto de maior preço:', pos_maior );
console.log('Valor do produto de maior preço (R$):', precos_produtos[pos_maior] );

var total_com_desconto = calcular_total_com_desconto(precos_produtos, 0.25);
console.log('Total a pagar com desconto (R$):', total_com_desconto );
```

Resultado esperado:

<div style="border: 1px dashed black; padding: 5px; font-family: courier">
Preços dos produtos (R$): [ 10, 20, 45, 300, 3 ]<br>
Total a pagar sem desconto (R$): 378<br>
Posição do produto de maior preço: 3<br>
Valor do produto de maior preço (R$): 300<br>
Total a pagar com desconto (R$): 303<br>
</div>

*Parte 4*: como mencionado, a loja gostaria de aplicar esse desconto de 25% no maior produto se o número de produtos for pelo menos 5. Altere a função `calcular_total_com_desconto` para que aceite também o limite mínimo de produtos como parâmetro. Caso não haja 5 produtos na lista então você deve mostrar o valor sem desconto.

*Parte 5*: em um próximo evento a loja gostaria de fazer desconto progressivo sob o produto de maior valor. Se o usuário levar pelo menos 5 produtos o desconto sob o maior produto será de 25%, se levar pelo menos 7 produtos, será de 35% e se levar pelo menos 10 produtos o desconto será de 50%. Implemente uma nova função chamada `calcular_total_com_desconto_progressivo` para essa nova funcionalidade.


## Exercícios

**Exercício 1**

Implemente uma função que mostre a tabuada de um número. Chame a função de `tabuada` e ela deve funcionar assim. Se executar (invocar) a função `tabuada(3)` deverá mostrar a tabuada do número 3. Use essa função para mostrar as tabuadas dos números 3, 5 e 7.

Resultado esperado:
```
Tabuada do número: 3
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
Tabuada do número: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
Tabuada do número: 7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

**Exercício 2**

Implemente uma função que mostre as tabuadas dos números contidos em um array. Por exemplo, se eu executar a função `tabuada_array([3,5,7])` o programa deve mostrar a tabuada do exemplos anterior. Se executar `tabuada_array([1,2,3,4])` será mostrada a tabuada dos números de 1 a 4. Na implementação dessa nova função você pode usar a função `tabuada` do anterior.

**Exercício 3**

Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Para isso, crie uma função chamada `analisar_ordem` que receba dois valores `X` e `Y` e retorne se eles estão em ordem crescente ou decrescente e, se eles forem iguais, retorne iguais. Posteriormente, faça um programa principal que leia as entradas do arquivo e mostre os resultados até que os valores de entrada sejam iguais.

| Exemplos de Entrada | Exemplos de Saída |
|---|---|
|5 4 | Decrescente
|7 2 | Decrescente
|3 8 | Crescente
|2 2 | 