var readline = require('readline');

var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Insira o primeiro número\n', function (textoA) {
  rl.question('Insira o segundo número\n', function (textoB) {
    var a = Number(textoA)
    var b = Number(textoB)
    var x = a + b
    console.log('Resultado')
    console.log(x)
    rl.close();
  });
});