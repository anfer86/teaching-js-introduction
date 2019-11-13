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
// modularizacao/exemplo_2.js
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