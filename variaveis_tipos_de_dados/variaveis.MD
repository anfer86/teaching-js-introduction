# Variáveis

Durante a criação de algoritmos torna-se necessário armazenar dados e informações com resultados parciais ou finais, resultado das instruções que são executadas. 

Suponha um programa de **cálculo de salário**, em que o usuário tem que providenciar o **salário atual** e o **percentual de reajuste**, e o sistema calcula o novo salário. Nesse programa, as informações providenciadas pelo usuário, o *valor do salário atual* e o *percentual de reajuste*, devem ser armazenadas na **memória** do computador, de forma que possam ser usadas para realizar o cálculo do novo salário. Além disso, o *valor do novo salário* precisa também ser armazenado na *memória*.

>**Exemplo:** Você vai usar o programa relatado acima, para realizar o reajuste de um salário de programador de computadores, de R$ 3500,00 em 15%. No momento que você entra com essas informações no programa, essas são armazenadas pelo programa em variáveis, a saber, ```salario_atual: 3500.00``` e ```reajuste: 0.15```. O programa vai realizar o cálculo do novo salário, a saber ```novo_salario = salario_atual + salario_atual * reajuste```, que para este exemplo o resultado será ```3500.00 + 3500.00 * 0.15 = 4025.00```. Assim, após realizado o cálculo o valor do novo salário será armazenado na variável, ou seja, ```novo_salario: 4025.00 ```. Uma outra forma de visualizar isso é:

| Endereço de <br> Memória  | Nome da<br>Variável | Valor
| ------------- | ------------- | ------------- |
| 0 | ```salario_atual```  | ```3500.00```
| 1 | ```reajuste```  | ```0.15```
| 2 | ```novo_salario```  | ```4025.00```
| ... | ... | ...

**Implementação:** vamos criar um programa, chamado `reajuste_de_salario` (crie uma pasta dentro da pasta de disciplina com esse nome). O nosso programa vai ler de um arquivo, chamado `input.txt` que contém as informações de salário e reajuste, um por linha,  por exemplo.

```js
// reajuste_de_salario/input.txt
3500.00
0.15
```

O programa tem o seguinte código:

```javascript
// reajuste_de_salario/reajuste_de_salario.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var salario_atual = parseFloat(lines.shift());
var reajuste = parseFloat(lines.shift());

var novo_salario = salario_atual + salario_atual * reajuste;

console.log('Salário atual (lido do arquivo): R$ ' + salario_atual);
console.log('Reajuste (lido do arquivo): ' + reajuste);
console.log('Novo salário: R$ ' + novo_salario)
```

Ao executar o nosso programa a saída esperada é:

<div style="border: 1px dashed black; padding: 5px;">
Salário atual (lido do arquivo): R$ 3500 <br>
Reajuste (lido do arquivo): 0.15 <br>
Novo salário: R$ 4025 <br>
</div>

## Nomes de Variáveis

O programador é quem define o nome que quer dar a cada variável. Preferencialmente as variáveis devem ter nomes de fácil compreensão, para que qualquer programador consiga entender o programa. Apesar dessa liberdade para nomear variáveis, existe algumas regras simples que devem ser respeitadas para criar nomes de variáveis.

Os nomes de variáveis **não podem**:
- Conter espaços.
- Começar com número.
- Conter caracteres especiais: +,-,*,/,%,(,),{,},!,@,#.
- Usar nomes reservados para outras funcionalidades. Em javascript alguns exemplos são: *function*, *var*, *new*, *for*, *return*.

> Exemplos de nomes de variáveis permitidas são: ```nome_cliente```, ```salario_atual```, ```cidade```, ```nota1```, ```nota2```.

> Exemplos de nomes de variáveis **não permitidas** são: ```nome cliente```, ```1ra_nota```, ```nota#1```, ```function```. Ao tentar criar variáveis com esses nomes o interpretador da linguagem vai emitir um erro, não sendo possível executar o restante do programa.

## Reutilizando Áreas de Memória
 
Observando o programa ```reajuste_salario```, verificamos que criamos três variáveis para armazenar os dados e resultados parciais. As variáveis são assim chamadas, pois são áreas de memória que podem *variar* o seu valor o longo do desenvolvimento do programa. Assim, podemos reutilizar as áreas der memória para atribuir resultados dos cálculo.

Vamos reescrever o programa anterior, criando uma variável chamada `salario` para armazenar inicialmente o salario atual mas posteriormente o salário reajustados. Vejamos:

```javascript
// reajuste_de_salario/reajuste_de_salario_versao_2.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var salario = parseFloat(lines.shift()); // *** alteração aqui
var reajuste = parseFloat(lines.shift());

console.log('Salário atual (lido do arquivo): R$ ' + salario_atual); // ** alteração aqui 
console.log('Reajuste (lido do arquivo): ' + reajuste);

salario = salario + salario * reajuste; // *** alteração aqui

console.log('Novo salário: R$ ' + salario); // alteração aqui
```

A saída do programa será a mesma que do programa anterior, mas tendo declarado uma variável a menos. Isso indica também que nosso programa consome menos **memória** do que a primeira versão (mais especificamente 64 bits ou 8 bytes a menos). Note também que não usamos a palavra `var` na linha em que substituímos o valor da variável `salario`, pois a palavra `var` é usada apenas para definir (criar) uma nova variável.

Os dados na memória ficaram conforme tabela abaixo. O valor ```3500.00``` riscado indica que a variável ```salario_atual``` continha esse valor inicialmente, mas o mesmo foi substituído pelo resultado da operações, ```4025.00```.

| Endereço de <br> Memória  | Nome da<br>Variável | Valor
| ------------- | ------------- | ------------- |
| 0 | ```salario_atual```  | <strike>3500.00</strike> 4025.00
| 1 | ```reajuste```  | ```0.15```
| ... | ... | ...


## Constantes


