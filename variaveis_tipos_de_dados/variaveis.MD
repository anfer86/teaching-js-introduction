<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>

# Variáveis

Durante a execução de algoritmos torna-se necessário armazenar os resultados parciais ou finais, decorrentes das instruções que são executadas, em algum lugar. Esse lugar é a memória RAM (*Random Access Memory*) do computador. Para isso, durante a criação do nosso programa vamos definir e criar variáveis, as quais identificam as áreas de memória que serão utilizadas durante a execução do programa. 

Suponha um programa de **cálculo de reajuste de salário**, em que o usuário tem que providenciar o **salário atual** e o **percentual de reajuste**, e o sistema calcula o novo salário. Nesse programa, as informações providenciadas pelo usuário, o *valor do salário atual* e o *percentual de reajuste*, devem ser armazenadas na **memória** do computador, de forma que possam ser usadas para realizar o cálculo do novo salário. Além disso, o *valor do novo salário* precisa também ser armazenado em algum lugar da *memória*.

> Você vai usar o programa relatado acima para simular o reajuste de um salário de programador de computadores, de R$ 3500,00 em 15%. No momento que você entra com essas informações no programa, essas são armazenadas pelo programa em variáveis, a saber, ```salario_atual: 3500.00``` e ```reajuste: 0.15```. O programa vai realizar o cálculo do novo salário, a saber ```novo_salario = salario_atual + salario_atual * reajuste```, que para este exemplo o resultado será ```3500.00 + 3500.00 * 0.15 = 4025.00```. Assim, após realizado o cálculo o valor do novo salário será armazenado em outra variável, ```novo_salario: 4025.00 ```. Uma outra forma de visualizar isso é:

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

var salario_atual = parseFloat(lines[0]);
var reajuste = parseFloat(lines[1]);

var novo_salario = salario_atual + salario_atual * reajuste;

console.log('Salário atual (lido do arquivo): R$ ' + salario_atual);
console.log('Reajuste (lido do arquivo): ' + reajuste);
console.log('Novo salário: R$ ' + novo_salario)
```

Ao executar o nosso programa a saída esperada é:

<div style="border: 1px dashed black; padding: 5px;">
> node reajuste_de_salario.js <br>
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

Exemplos de nomes de variáveis permitidas são: `nome_cliente`, `salario_atual`, `cidade`, `nota1`, `nota2`.

Exemplos de nomes de variáveis **não permitidas** são:
- `nome cliente`, pois possui espaço entre `nome` e `cliente`
- `1ra_nota`, pois inicia com número
- `nota#1`, pois contém o caractere especial `#`
- `function`, pois é uma palavra reservada do javascript
> **Nota**: ao tentar criar variáveis com esses nomes o interpretador da linguagem vai emitir um erro, não sendo possível executar o restante do programa

## Uso de Maiúsculas e Minúsculas

Javascript é uma linguagem *case-sensitive*, o que significa que é sensível ao uso de maiúsculas e minúsculas ao definido variáveis. Assim, se criarmos uma variável chamada `salario`, não podemos nos referir a essa variável usando `Salario` ou `SALARIO`. Se a variável foi definida em minúsculo deve ser sempre usada dessa forma.

Ainda vale ressaltar que se definirmos uma variável `salario` e outra `SALARIO` estaríamos nos referindo a duas variáveis diferentes que usam endereços de memória diferentes para armazenamento.

## Nome de Variáveis com Palavras Compostas

Em muitas ocasiões precisamos definir nomes de variáveis com mais do que uma palavra. Para isso existem dois padrões comumente aceitos:

### CamelCase

Neste padrão cada palavra é iniciada com maiúsculas e unidas sem espaços. Por exemplo, uma variável que se refere ao *salário inicial* de alguém, o nome da variável seria `SalarioInicial` ou `salarioInicial`.

Um outro exemplo, ao criar uma variável para armazenar o valor de *salário com bônus* de vendas, o nome da variável seria `SalarioComBonus` ou `salarioComBonus`.

> **Nota**: você deve ter observado que demos duas opções em cada exemplo. A primeira opção inicia com letra maiúscula e é chamada **UpperCamelCase**. A segunda opção inicial com letra minúscula e é chamada **lowerCamelCase**. Para variáveis e funções é *mais comum* utilizar *lowerCamelCase*.

### Under_score

Neste padrão as palavras são unidas por underscore (_) no lugar de espaço. Por exemplo, a variável de *salário inicial* seria nomeada como `salario_inicial`. Geralmente usam-se as palavras em minúsculo para variáveis e funções.

## Reutilizando Áreas de Memória
 
Observando o programa ```reajuste_salario```, verificamos que criamos três variáveis para armazenar os dados e resultados parciais. As variáveis são assim chamadas, pois são áreas de memória que podem *variar* o seu valor o longo do desenvolvimento do programa. Assim, podemos reutilizar as áreas der memória para atribuir resultados dos cálculo.

Vamos reescrever o programa anterior, criando uma variável chamada `salario` para armazenar inicialmente o salario atual mas posteriormente o salário reajustados. Vejamos:

```javascript
// reajuste_de_salario/reajuste_de_salario_versao_2.js
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var salario = parseFloat(lines[0]); // *** alteração aqui
var reajuste = parseFloat(lines[1]);

console.log('Salário atual (lido do arquivo): R$ ' + salario); // ** alteração aqui 
console.log('Reajuste (lido do arquivo): ' + reajuste);

/**
 * A variável 'salario' vai receber (símbolo de =)
 * o valor de 'salario' acrescido (símbolo de +) do
 * 'salário' multiplicado pelo 'reajuste'
 */
salario = salario + salario * reajuste; // *** alteração aqui

console.log('Novo salário: R$ ' + salario); // alteração aqui
```

A saída do programa será a mesma que do programa anterior, mas tendo declarado uma variável a menos. Isso indica também que nosso programa consome menos **memória** do que a primeira versão (mais especificamente 64 bits ou 8 bytes a menos). Note também que não usamos a palavra `var` na linha em que substituímos o valor da variável `salario`, pois a palavra `var` é usada apenas para definir (criar) uma nova variável.

Os dados na memória ficaram conforme tabela abaixo. O valor ```3500.00``` riscado indica que a variável ```salario``` continha esse valor inicialmente, mas o mesmo foi substituído pelo resultado da operações, ```4025.00```.

| Endereço de <br> Memória  | Nome da<br>Variável | Valor
| ------------- | ------------- | ------------- |
| 0 | ```salario```  | <strike>3500.00</strike> 4025.00
| 1 | ```reajuste```  | ```0.15```
| ... | ... | ...


## Constantes

Assim como as variáveis, consistem em áreas de memória para armazenar dados. Mas, diferente das variáveis, as constantes não podem ter seus dados alterados. 

Uma constante é definida com um valor inicial e não é possível alterar o seu valor no decorrer do programa.

Veja o seguinte exemplo. Vamos criar uma constante com um valor inicial, por exemplo, 3500, e vamos tentar realizar o reajuste do salario em 15%:

```javascript
// constantes/uso_incorreto.js
const salario = 3500.00;
salario = salario + salario * 0.15
```

Ao tentar executar esse programa, o *node* vai mostrar o erro **TypeError: Assignment to constant variable.** Esse erro significa que estamos tentar atribuir (*assign*) um valor para uma constante (*constant*). E por definição isso não é permitido.

Além desse erro, o exemplo também mostra uma prática incomum ao definir constantes. As constantes são geralmente nomeadas em maiúsculo, por exemplo, `PI`, `NUMERO_MAXIMO_DE_ALUNOS`, `NUMERO_MINIMO_DE_ALUNOS`. Declaramos essas constantes da seguinte forma:

```javascript
// constantes/uso_correto.js
const PI = 3.14159;
const NUMERO_MAXIMO_DE_ALUNOS = 40;
const NUMERO_MINIMO_DE_ALUNOS = 6;
...
```

