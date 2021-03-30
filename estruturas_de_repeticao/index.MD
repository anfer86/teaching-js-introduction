<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>

# Estruturas de Repetição

As estruturas de repetição, chamadas também de laços, são uma forma simples de executar uma instrução repetidas vezes. Essas estruturas podem ser usada para objetivos como:
- Repetir uma mensagem o número de vezes que a gente quiser.
- Calcular a média de notas baseado em um número qualquer de notas, não sendo necessário limitar apenas para 4 notas.
- Dada idade de um grupo de pessoas qualquer saber quantas são maiores de idade.
- Aplicar o mesmo processamento a vários textos, como *tweets*.
- Ao integrar Javascript com HTML podemos também mostrar vários elementos, como produtos, em HTMl.

Vamos criar uma exemplo simples para ver como funciona esta estrutura. 

Crie uma pasta para armazenar os arquivos de estruturas de repetição chamada `estruturas_de_repeticao`, dentro dela criaremos as pastas dos nosso exercícios. Dentro dessa pasta implemente o seguinte exemplo.

```javascript
// passo_a_frente/passo_a_frente.js
for (let i = 0; i < 5; i++) {  
  console.log('Ande um passo para frente');
}
```

A saída esperada é:
<div style="border: 1px dashed black; padding: 5px;">
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
Ande um passo para frente<br>
</div>

Em javascript temos várias formas de trabalhar com estruturas de repetição. Embora todas tenham como objetivo repetir um conjunto de instruções as diferentes formas permitem que o programador escolha a mais simples em cada ocasião.

Vamos focar nas seguintes estruturas:
- `for`
- `for..of  ` 
- `while..do`
- `do...while`