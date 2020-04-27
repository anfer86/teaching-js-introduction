<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Estrutura IF-ELSE

As estruturas de seleção ou condicionais servem para desviar o fluxo de execução de instruções. O fato de um programa decidir executar um certo conjunto de instruções (ou outro) geralmente depende do estado (valor) de uma ou mais variáveis. Por esse motivo, deve-se analisar o valor dela(s) para saber que rumo a execução do programa deve tomar.

**Problema exemplo**: uma empresa necessita atualizar o salário de seus funcionários. Você precisa desenvolver um programa que dado um valor de salário faça o reajuste do valor conforme a tabela abaixo:

| Salário  | Reajuste (aumento de salário)
| ------------- | :-------------: |
| De 0 a R$ 1000 | `25%` 
| Acima de R$ 1000  | `10%`

Assim, se um funcionário recebe `R$ 600` o reajuste será de `25%`, isto é o seu novo salário será `600 * (1 + 0,25) = R$ 750`. Já um outro que recebe `R$ 2.000`, o reajuste será de `10%`. 

Para calcular os valores de reajuste de acordo com o salário atual do funcionário precisamos verificar **se ele é menor ou igual a R$ 1000**. Se for, nós calculamos o reajuste com `25%`, senão calculamos o reajuste com `10%`. Vejamos alguns exemplos entrada e saída para este programa.

| Exemplos<br>de Entrada  | Exemplos<br>de Saída
| ------------- | ------------- |
| 100 | Novo salário: R$ 125,00
| 1000 | Novo salário: R$ 1250,00
| 600 | Novo salário: R$ 750,00
| 1500 | Novo salário: R$ 1650,00
| 2000 | Novo salário: R$ 2200,00

Vamos receber o valor do salário atual do funcionário em um arquivo de entrada chamado `input.txt`

```javascript
// arquivo estruturas_condicionais/reajuste_salario/reajuste_salario.js

var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var salario = parseFloat(lines[0]);

// se o salário é menor ou igual a R$ 1000
if (salario <= 1000){
    
    // reajuste de 25%
    novo_salario = salario + salario * 0.25;

} else { // caso contrário

    // reajuste de 10%
    novo_salario = salario + salario * 0.10;

}

console.log('Novo salário R$ ' + novo_salario.toFixed(2) )
```


### Estrutura Simples e Composta

Dependendo do tipo de problema que precisamos resolver podemos usar IF e ELSE ou podemos usar apenas o IF. No exemplo anterior mostramos como usamos IF-ELSE, na situação em que temos que executar alguma instrução quando a condição (`salário <= 1000`), e também temos que executar alguma instrução quando a condição é falsa (`else`).

**Problema Valor Absoluto**: o valor absoluto de um número consiste em 'tirar o seu sinal'. O valor absoluto de um número positivo, ex. `9` é o próprio número. O valor de um número negativo, ex. `-9` é o número com seu sinal trocado, o que podemos alcançar multiplicando o valor por (-1), resultando em `9`.
Neste problema tem que ler um número e mostrar o valor absoluto desse número. Exemplos de entrada e saída

| Exemplos<br>de Entrada  | Exemplos<br>de Saída
| ------------- | ------------- |
| 9 | 9 |
| -9 | 9 |
| -25 | 25 |
| 50 | 50 |
| 0 | 0 |

```javascript
// arquivo estruturas_condicionais/valor_absoluto/valor_absoluto.js

var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var valor = parseInt(lines[0]);

// se o valor é negativo
if (valor < 0){
        
    // trocamos o sinal
    valor = valor * (-1);

}

console.log(valor)
```

Note que neste programa apenas vamos alterar o `valor` em caso de que esse valor seja negativo, caso contrário não precisamos mudar o seu valor.

