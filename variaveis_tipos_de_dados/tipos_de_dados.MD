<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>
<link rel="stylesheet" type="text/css" href="../style.css">

# Tipos de Dados

Em Javascript existem os seguintes tipos de dados. As variáveis assumem tipos de dados de acordo com o que atribuímos para elas. Exemplos:

| **Tipo de Dado** | **Descricão** | **Exemplo**
| ----- | ------ | ------ |
| string | Sequência de caracteres <br> entra aspas simples ou duplas. | `var msg1 = "Bom dia";`<br> `var msg2 = 'Bom dia';`
| number | Qualquer número que não<br>esteja entre aspas. | `var nota_trabalho = 10;`<br>`var media_final = 9.6;`
| boolean | Valor lógico verdadeiro (*true*)<br> ou falso(*false*). | `var aprovado = true;`<br>`var maior_de_idade = false;`
| object | Um objeto que pode conter<br>outros tipos de dados. Bastante<br>utilizado para descrever/representar<br>objetos do mundo real. | `var pessoa = {`<br>`nome: "Andres",`<br>`profissao: "Professor",`<br>`data_nascimento: "10/02/1986",`<br>`idade: 34,`<br>`maior_de_idade: true`<br>`}`
| function | Bloco de código para realizar uma<br>tarefa específica. Após definida, <br> podemos usá-la quantas vezes <br> desejarmos. | `var media_aritmetica = function (nota1, nota2, nota3){`<br>`var media = (nota1 + nota2 + nota3) / 3.0;`<br>`return media;`<br>`}`<br><br>`media_aritmetica (9.0, 7.0, 10.0);` 
| undefined | Valor inicial de uma variável caso não <br>definamos um valor pra ela. É útil <br> para saber se uma variável tem algum <br> valor ou não.| `var x;`<br>`(x == undefined); // resultado será true`<br> 

Para sabermos qual é o **tipo de dado** associado a uma **variável** usamos a função `typeof(nome_da_variavel)`. Vamos mostrar o tipo de todas as variáveis que forma definidas na tabela acima.

```javascript
// arquivo tipos_de_dados/usando_typeof.js
var msg1 = "Bom dia";
var msg2 = 'Bom dia';

var nota_trabalho = 10;
var media_final = 9.6;

var aprovado = true;
var maior_de_idade = false;

var pessoa = {
    nome: "Andres",
    profissao: "Professor",
    data_nascimento: "10/02/1986",
    idade: 34,
    maior_de_idade: true
}

var media_aritmetica = function (nota1, nota2, nota3){
    var media = (nota1 + nota2 + nota3) / 3.0;
    return media;
}

var x;

// <nome da variável>: <tipos da variável>
console.log("msg1: " + typeof(msg1) );

console.log("media_final: " + typeof(media_final) );

console.log("maior_de_idade: " + typeof(maior_de_idade) );

console.log("pessoa: " + typeof(pessoa) );

console.log("media_aritmetica: " + typeof(media_aritmetica) );

console.log("x: " + typeof(x) );
```

O resultado esperado desse programa será:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
msg1: string<br>
media_final: number<br>
maior_de_idade: boolean<br>
pessoa: object<br>
media_aritmetica: function<br>
x: undefined
</div>

**Exercício**

Considere o programa abaixo, que lê o nome de funcionário e seu salário de um arquivo e calcula o salário. Mostre os tipos de dados de: `nome_funcionario`, `salario_atual`, `novo_salario`, `reajustar_salario`.

```javascript
// arquivo tipos_de_dados/reajuste_funcionario/programa.js

var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var nome_funcionario = lines.shift();
var salario_atual = parseFloat(lines.shift());
var reajuste = parseFloat(lines.shift());

var reajustar_salario = function (salario, reajuste){
    return salario + salario * reajuste;
}

var novo_salario = reajustar_salario (salario_atual, reajuste);

// TODO
// Implementar o código para mostrar os tipos de dados abaixo desta linha.
```

O resultado esperado da execução do seu programa deve ser:
<div style="border: 1px dashed black; padding: 5px; font-family: courier">
nome_funcionario: string<br>
salario_atual: number<br>
novo_salario: number<br>
reajustar_salario: function<br>
</div>

