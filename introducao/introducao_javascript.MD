# Introdução a Javascript

De modo bem geral, programas computacionais transformam `dados de entrada` em `dados de saída` por meio da execução de um conjunto de instruções.

## Entrada de Dados

Ao construir um programa é necessário decidir qual é a origem dos dados que esse programa vai processar. Para exemplificar, vamos pensar em três diferentes cenários para o programa de `Multiplicação de Dois Números`:
1. Os dados provém de um arquivo chamado `input.txt`
2. Oa dados provém do usuário durante a execução do programa
3. Os dados provém de uma página Web
4. Os dados provém de uma página Web usando um formulário

Embora o problema de dividir dois números seja o mesmo, observe que existem diferentes formas de ser implementado de acordo com a necessidade do cliente de quem vai usar o programa.

A seguir vamos apresentar diferentes formas de fazer entrada de dados para programas em Javascript.

## 1. Leitura de arquivo

Para realizar a leitura de um arquivo em javascript devemos usa-se `require('fs').readFileSync()`.

```javascript
var input = require('fs').readFileSync('input.txt', 'utf8');
```

> `fs` refere-se ao módulo [*file system*](https://nodejs.dev/learn/the-nodejs-fs-module)

> `readFileSync` é uma função dentro desse módulo que permite fazer a leitura de arquivos.

> `var` indica a criação de uma variável, basicamente a definição de uma pequena área na memória (RAM) para armazenar dados.

O arquivo será lido de maneira bruta, sem considerar as quebras de linhas contidas no arquivo, por ex. se um arquivo contiver o seguinte conteúdo:

```
10
4
```

a variável `input` receberá o valor `'10\n4'`, onde `\n` refere-se a uma quabra (pulo) de linha dentro do arquivo. Isto é, para obter os dados do arquivo separados por linha devemos executar uma instrução adicional que quebra o dados de entrada pelo símbolo `\n`, como segue:

```javascript
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n')
```

> `split` (separar, em português) é uma [função](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/String/split) que permite quebrar um texto em partes, retornando uma lista com as partes.

Dessa forma, a variável `lines` vai receber uma lista com os dados separados por linha, a saber `['10','4']`. 

> Em javascript utilizamos colchetes [ ] indicar uma lista de valores (comumente chamada de vetor ou [array]([https://](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)).

A seguir, a implementação completa do programa `multiplica_dois_numeros.js` em javascript:

```javascript
// 1. Ler os dois números
var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');
var a = Number(lines[0]);
var b = Number(lines[1]);
// 2. Realizar a operação de Multiplicação dos dois números
var x = a * b;
// 3. Mostrar o resultado da operação
console.log(x);
```

Dado que o arquivo `input.txt` contém:
```
10
4
```

A execução do programa retorna o resultado:
```
40
```

> **Importante**: para executar o programa, é necessário salvar os arquivos `multiplica_dois_numeros.js` e `input.txt` na mesma pasta, abrir o terminal nessa pasta e, por fim, executar o comando `node multiplica_dois_numeros` para rodar o programa.

2. Leitura de dados pelo terminal

Alguns programas também podem ser executados utilizando terminal, interagindo no formato perguntas e respostas, como demonstra o exemplo abaixo:

```
>node entrada_terminal.js
Insira o primeiro número
10
Insira o segundo número
4
Resultado
40
```

Em algumas linguagens como Java e Python a implementação desse tipo de solução é trivial, mas em javascript não é trivial e requer um entendimento mais profundo da linguagem. De qualquer forma, a seguir é apresentada uma solução a seguir:

```javascript
var readline = require('readline');

var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 1. Ler os dois números
rl.question('Insira o primeiro número\n', function (respostaA) {
  rl.question('Insira o segundo número\n', function (respostaB) {
    var a = Number(respostaA)
    var b = Number(respostaB)
    // 2. Realizar a operação de Multiplicação dos dois números
    var x = a * b
    // 3. Mostrar o resultado da operação
    console.log('Resultado')
    console.log(x)
    rl.close();
  });
});
```

Observe que essa solução não requer de nenhum arquivo de entrada, pois o programa vai solicitar os dados que ele necessita para o usuário durante a execução do programa.

## 3. Por meio de uma página web

Neste formato o usuário vai fazer a entrada de dados do programa por meio de uma interface gráfica Web. Cliquei no botão abaixo para verificar o comportamento.

<div>
    <button id="buttonMultiplicarDoisNumeros">Multiplicar dois números</button>    
</div>

<script type='text/javascript'>
    document.getElementById('buttonMultiplicarDoisNumeros').onclick = function (){
        // 1. Ler os dois números
        var respostaA = window.prompt("Insira o primeiro número")
        var respostaB = window.prompt("Insira o segundo número")
        var a = Number(respostaA)
        var b = Number(respostaB)
        // 2. Realizar a operação de Multiplicação dos dois números
        var x = a * b
        // 3. Mostrar o resultado da operação            
        window.confirm('Resultado ' + x)
    }
</script>

```html
<div>
    <button id="buttonMultiplicarDoisNumeros">
        Multiplicar dois números
    </button>    
</div>

<script type='text/javascript'>
    document.getElementById('buttonMultiplicarDoisNumeros').onclick = function (){
        // 1. Ler os dois números
        var respostaA = window.prompt("Insira o primeiro número")
        var respostaB = window.prompt("Insira o segundo número")
        var a = Number(respostaA)
        var b = Number(respostaB)
        // 2. Realizar a operação de Multiplicação dos dois números
        var x = a * b
        // 3. Mostrar o resultado da operação            
        window.confirm('Resultado ' + x)
    }
</script>
```