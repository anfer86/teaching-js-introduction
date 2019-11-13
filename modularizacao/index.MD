# Modularização de Programas

Na computação um conceito importante é o de modularização de programas, que tem dois principais objetivos:
- Resolver problemas complexos dividindo o problema em problemas simples;
- Reutilizar códigos que se repetem várias vezes em um programa ou em vários programas.
- Evitar replicar código muito parecido em várias partes do programa, o que dificulta a manutenção do código.

Veja alguns exemplos:
- Se não tivéssemos a função `Math.max()` para calcular o valor máximo de um array de valores, teríamos que implementar essa funcionalidade. Isso requer um certo esforço. Como este é uma função muito utilizada por muitos programadores foi disponibilizada para todo mundo usar.
- Imagine que você tem que calcular um programa que, para cada aluno tem que calcular a média das notas de trabalho, a média das notas de prova, e a média das faltas por aula. Para cada aluno você estará calculando a média para três objetivos diferentes, no entanto, o objetivo é sempre o mesmo calcular a média. Você poderia criar uma função chamada `calcular_media()` com o objetivo de calcular a média de um array de valores.


Nesta parte do curso vamos estudar os seguintes conteúdos:
- Funções ou sub-rotinas
- Escopo de variáveis
- Arquivos com funções