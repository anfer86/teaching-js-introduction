<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Introdução a Javascript

De modo bem geral, programas computacionais transformam `dados de entrada` em `dados de saída` por meio da execução de um conjunto de instruções.

## Entrada e Saída de Dados

Ao construir um programa é necessário decidir qual é a origem dos dados que esse programa vai processar. Para exemplificar, vamos pensar em três diferentes cenários para o programa de `Multiplicação de Dois Números`:
1. Os dados provém de um arquivo chamado `input.txt`
2. Oa dados provém do usuário durante a execução do programa
3. Os dados provém de uma página Web
4. Os dados provém de uma página Web usando um formulário

Embora o problema de multiplicar dois números seja o mesmo, observe que existem diferentes formas de ser implementado de acordo com a necessidade do cliente de quem vai usar o programa: tanto para entrada de dados, quanto para a saída de dados. 

A seguir vamos apresentar diferentes formas de fazer entrada e saída de dados para programas em Javascript.

## 1. Leitura de arquivo

Para realizar a leitura de um arquivo em javascript usa-se `require('fs').readFileSync()`.

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

a variável `input` receberá o valor `'10\n4'`, onde `\n` refere-se a uma quebra (pulo) de linha dentro do arquivo. Isto é, para obter os dados do arquivo separados por linha devemos executar uma instrução adicional que quebra o dados de entrada pelo símbolo `\n`, como segue:

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

> `console.log` é uma maneira simples de mostrar um resultado da execução de um programa em javascript, usando o terminal ou console do interpretador que está sendo usado: em geral, cada *browser* tem um interpretador (Google Chrome, Mozilla Firefox, entre outros) e o Node.js também tem um interpretador.

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

## 2. Leitura de dados pelo terminal

Alguns programas também podem ser executados utilizando terminal, interagindo no formato perguntas e respostas, como demonstra o exemplo abaixo:

```
> node multiplica_dois_numeros_terminal.js
(Sistema) Insira o primeiro número
(Usuário) 10
(Sistema) Insira o segundo número
(Usuário) 4
(Sistema) Resultado
(Sistema) 40
```

Em algumas linguagens como Java e Python a implementação desse tipo de solução é trivial, mas em javascript não é trivial e requer um entendimento mais profundo da linguagem. De qualquer forma, a seguir é apresentada uma solução:

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

> Observe que essa solução não requer de nenhum arquivo de entrada, pois o programa vai solicitar os dados que ele necessita para o usuário durante a execução do programa.

## 3. Por meio de uma página Web

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

Código fonte:
```html
<html>
    <head>
        <title>Multiplicar dois Números</title>
    </head>
    <body>
        <div>
            <button id="buttonMultiplicarDoisNumeros">
                Multiplicar dois números
            </button>    
        </div>
    </body>

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
</html>
```

> Observe que nesta solução a entrada de dados ocorre por meio de janelas lançadas através do *browser*, seja Google Chrome, Mozilla Firefox, ou outro. O mesmo ocorre com o resultado, que é apresentado na forma de uma janela de confirmação.


## 4. Por meio de uma página Web usando um formulário

Neste formato o usuário vai fazer a entrada de dados do programa por meio de uma interface gráfica Web. Cliquei no botão abaixo para verificar o comportamento.

<div>
    <p><input id="inputPrimeiroNumero" placeholder="Primeiro Número"/></p>
    <p><input id="inputSegundoNumero" placeholder="Segundo Número"/></p>
    <p><button id="buttonMultiplicar">Multiplicar</button></p>
    <p><input id="inputResultado" placeholder="Resultado" disabled/></p>
</div>

<script type='text/javascript'>
    document.getElementById('buttonMultiplicar').onclick = function (){
        // 1. Ler os dois números
        var respostaA = document.getElementById('inputPrimeiroNumero').value
        var respostaB = document.getElementById('inputSegundoNumero').value
        var a = Number(respostaA)
        var b = Number(respostaB)
        // 2. Realizar a operação de Multiplicação dos dois números
        var x = a * b
        // 3. Mostrar o resultado da operação  
        var resultado = document.getElementById('inputResultado')
        resultado.value = x
    }
</script>

Código fonte:

```html
<html>
    <head>
        <title>Multiplicar dois Números</title>
    </head>
    <body>
        <div>
            <p><input id="inputPrimeiroNumero" placeholder="Primeiro Número"/></p>
            <p><input id="inputSegundoNumero" placeholder="Segundo Número"/></p>
            <p><button id="buttonMultiplicar">Multiplicar</button></p>
            <p><input id="inputResultado" placeholder="Resultado" disabled/></p>
        </div>
    </body>

    <script type='text/javascript'>
    document.getElementById('buttonMultiplicar').onclick = function (){
        // 1. Ler os dois números
        var respostaA = document.getElementById('inputPrimeiroNumero').value
        var respostaB = document.getElementById('inputSegundoNumero').value
        var a = Number(respostaA)
        var b = Number(respostaB)
        // 2. Realizar a operação de Multiplicação dos dois números
        var x = a * b
        // 3. Mostrar o resultado da operação  
        var resultado = document.getElementById('inputResultado')
        resultado.value = x
    }
    </script>

</html>
```

> Observe que neste exemplo os dados de entrada provém dos campos de um formulário e o resultado também é apresentado em um campo de resultado. Ao clicar no botão de multiplicar a implementação do algoritmo busca nos devidos campos os dados para efetuar a operação matemática.

## Resumo e considerações finais

Como vocês devem ter observado para um determinado problema a ser resolvido a entrada de dados e a saída de dados podem variar de acordo com as necessidades do cliente que irá utilizar o programa. Em geral, neste curso estaremos utilizando:
- Entrada de dados: função `readFileSync` para leitura de dados do arquivo
- Saída de Dados: função `console.log` para mostrar resultados no console do interpretador

Assim, a referência para desenvolver a maior parte dos nossos programas é o exemplo `multiplica_dois_numeros.js` junto com o arquivo `input.txt`.

Segue abaixo um resumo das principais funções que foram utilizadas nesta introdução e de outras funções também muito úteis para desenvolver algoritmos em javascript.

| Função ou Símbolo | Descrição | Exemplo de uso | 
| ------------ | ------------------ | -------- |
| [`readFileSync`](https://nodejs.org/api/fs.html#fsreadfilesyncpath-options) | Leitura de dados de arquivo | `> var input = require('fs').readFileSync('input.txt', 'utf8');`<br>`> input`<br>`'10\n4`  |
| [`console.log`](https://developer.mozilla.org/pt-BR/docs/Web/API/console/log) | Escreve no console do interpretador | `> console.log('Programar é bom demais!');`<br>`'Programar é bom demais!` |
| [`split`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/String/split) | Separa um texto em partes, usando um separador | `> var lines = input.split('\n');`<br>`> lines`<br>`['10','4']` |
| [`Number`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Number) | Transforma um texto em um número (inteiro ou real)| `> var a = Number(lines[0]);`<br>`> a`<br>`10` |
| [`parseInt`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt) | Transforma um texto em um número inteiro (int)| `> var idade = parseInt('25');`<br>`> idade`<br>`25` |
| [`parseFloat`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseFloat) | Transforma um texto em um número real (*floating point* ou ponto flutuante)| `> var troco = parseFloat('9.28');`<br>`> troco + 1`<br>`10.28` |
| [`toFixed`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed) | Transformar um número para texto, arrendando considerando um número de casas decimais | `console.log(troco.toFixed(1));`<br>`> 9.3` |
| [`[i] colchetes`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array) | Retorna o i-ésimo elemento de uma lista, sem removê-lo | `> var x = lines[0];`<br>`> x`<br>`'10'`<br>`> lines`<br>`['10','4']` |
| [`shift`](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/shift) | Remove e retorna o primeiro elemento da lista | `> var x = lines.shift();`<br>`> x`<br>`'10'`<br>`> lines`<br>`['4']` |

