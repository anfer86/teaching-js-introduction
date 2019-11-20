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
