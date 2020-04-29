<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Estrutura IF-ELSE Aninhados

A estrutura IF-ELSE convencional permite executar comandos caso a condição seja True ou False. No entanto, existem situações em que precisamos de mais do que dois caminhos.

**Problema situação do aluno**: em uma determinada instituição um aluno pode estar em três situações de acordo com a média de suas notas: Aprovado (`media >= 6`), de Recuperação (`6 > media >= 4`), Reprovado (`media < 4`). Então neste problema temos 3 (três) possíveis caminhos. Supondo que uma variável chamada `media` possui o valor da média de um aluno, usamos IF-ELSE da seguinte forma.

```javascript
if (media >= 6){
    situacao = 'Aprovado'
} else if (media >= 4){
    situacao = 'de Recuperação'    
} else {
    situação = 'Reprovado'
}
// Mostramos a situação do aluno
console.log(situacao);
```

Dessa forma, lêmos a estrutura da seguinte forma: **SE** a media é maior ou igual a 6 **ENTÃO** a situação do aluno é Aprovado, **SENÃO** **SE** a média é maior ou igual a 4 **ENTÃO** a situação do aluno é de Recuperação, **SENÃO** a situação do aluno é Reprovado. 

Obs.: o termo **SENÃO** pode ser substituído por **CASO CONTRÁRIO** na leitura e interpretação do código.

Essa estrutura é conhecida como IF-ELSE aninhados e sua estrutura geral é:

```javascript
if (condição_1){
    // Bloco de comandos caso a condição_1 seja True (verdadeira)
} else if (condição_2){
    // Bloco de comandos caso a condição 1 seja False (falsa)
    // e a condição_2 seja True (verdadeira)
} else if (condição_3){
    // Bloco de comandos caso as condições 1 e 2 sejam False (falsas)
    // e a condição_3 True (verdadeira)
} else {
    // Bloco de comandos caso Todas condições anteriores sejam False(falsas)
}
```

**Problema exemplo**: uma empresa necessita atualizar o salário de seus funcionários con o critério, quem ganha mais terá um aumento de salário menor, conforme a tabela:

| Salário  | Reajuste (aumento de salário)
| ------------- | :-------------: |
| Até R$ 1000 | `25%` 
| Acima de R$ 1000 até R$ 2000  | `10%`
| Acima de R$ 2000 até R$ 4000  | `5%`
| Acima de R$ 4000 | `2%`

Seguem abaixo alguns exemplos de entrada e saída para o programa:

| Exemplos<br>de Entrada  | Exemplos<br>de Saída
| ------------- | ------------- |
| 600 | Novo salário: R$ 750,00
| 1000 | Novo salário: R$ 1250,00
| 1500 | Novo salário: R$ 1750,00
| 2500 | Novo salário: R$ 2625,00
| 5000 | Novo salário: R$ 5100,00

Vamos receber o valor do salário atual do funcionário em um arquivo de entrada chamado `input.txt`

```javascript
// arquivo estruturas_condicionais/reajuste_salario_2/reajuste_salario_2.js

var input = require('fs').readFileSync('input.txt', 'utf8');
var lines = input.split('\n');

var salario = parseFloat(lines[0]);

// se o salário é menor ou igual a R$ 1000
if (salario <= 1000){
    
    // reajuste de 25%
    novo_salario = salario + salario * 0.25;

} else if (salario <= 2000){ // SENAO, se o salário for menor ou igual a R$ 2000

    // reajuste de 10%
    novo_salario = salario + salario * 0.10;

} else if (salario <= 4000){ // SENAO, se o salário for menor ou igual a R$ 4000

    // reajuste de 5%
    novo_salario = salario + salario * 0.05;

} else { // SENÃO, significa que o salário é maior que R$ 4000

    novo_salario = salario + salario * 0.02;
}

console.log('Novo salário R$ ' + novo_salario.toFixed(2) )
```