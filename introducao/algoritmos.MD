<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>  

# Algoritmos

> Você sabe o que são algoritmos? Cuidado para não confundir com algarismos, que são símbolos numéricos.

Um **algoritmo** pode ser entendido como uma SEQUÊNCIA DE INSTRUÇÕES (ações executáveis) para obtenção de UMA SOLUÇÃO para determinado PROBLEMA. Pode parecer estranho que uma palavra que talvez você ainda não conheça já fazia parte do seu dia-a-dia.

Mas, o que seriam essas sequência de instruções, uma solução e um problema? Um dos exemplos mais comuns de algoritmos são receitas culinárias. Suponha que o teu PROBLEMA é fazer um **bolo**. Existem diferentes receitas OU SOLUÇÕES para fazer um **bolo**, e observe que algumas receitas podem demorar mais tempo do que outras e resultar em um produto de melhor qualidade. A SEQUÊNCIA DE INSTRUÇÕES de uma receita ou SOLUÇÃO é um **algoritmo**. Como segue:

```
ALGORITMO - RECEITA BOLOS SIMPLES
1. Bata as claras em neve e reserve.
2. Misture as gemas, a margarina e o açúcar até obter uma massa homogênea.
3. Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater.
4. Por último, adicione as claras em neve e o fermento.
5. Despeje a massa em uma forma grande de furo central untada e enfarinhada.
6. Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.
```

Uma das características mais importantes é que qualquer um que decidir que seguir essa receita irá obter um bolo ao final do processo.

Seguindo essa linha, podemos também entender um **algoritmo** como um padrão de comportamento expresso como uma sequência finita de ações. Essa definição foi realizada por Dijkstra (1971). [Dijkstra](https://pt.wikipedia.org/wiki/Edsger_Dijkstra) foi um cientista da computação holandês, conhecido por suas contribuições nas áreas de desenvolvimento de algoritmos e programas.

O raciocínio algorítmico tem por objetivo resolver problemas utilizando uma sequência de instruções. Lamentavelmente, o computador não entende algoritmos descritos em linguagem natural (por enquanto), como a receita de bolo mencionada anteriormente.

A seguir são apresentados alguns exemplos de algoritmos básicos, no formato de descrição narrativa, para resolver problemas específicos.

## Somar dois números
```
ALGORITMO - SOMAR DOIS NÚMEROS
1. Ler os dois números
2. Realizar a operação de soma dos dois números
3. Mostrar o resultado da operação
```
Para os valores de entrada $13$ e $17$ a execução do algoritmo retorna o valor $30$.

## Dividir dois números
```
ALGORITMO - DIVIDIR DOIS NÚMEROS
1. Ler os dois números
2. Se o denominador é igual a zero
    2.1 Mostrar a mensagem 'Divisão impossível'
3. Senão
    3.1 Realizar a operação de divisão dos dois números
    3.2 Mostrar o resultado da operação
```
Para os valores de entrada $10$ e $2$ a execução do algoritmo retorna o valor $5$. Ja para os valores de entrada $4$ e $0$, o algoritmo retorna 'Divisão impossível'.


## Iniciais de nome completo

```
ALGORITMO - INICIAIS DE NOME COMPLETO
1. Ler o nome completo de uma pessoa
2. Separar os nomes da pessoa (procurando por espaço) e colocá-los em uma 'lista de nomes' 
3. Criar uma lista de iniciais, vazia
4. Para cada 'nome' na 'lista de nomes':
    4.1 Extrair a primeira letra de 'nome'
    4.2 Adicionar essa letra na 'lista de iniciais' 
5. Mostrar a lista de iniciais com um ponto entre cada letra
```

Para o nome completo 'João Paulo Silva' a execução do algoritmo retorna 'J.P.S'. Já para o nome 'Maria Eugênia Silveira Gomes' o algoritmo retorna 'M.E.S.G'.

##  Ordenar produtos por preço (ordem crescente)
```
ALGORITMO - ORDENAR PRODUTOS POR PREÇO (CRESCENTE)
1. Ler uma lista de produtos no formato (nome, preco)
2. Verificar se a lista de produtos está ordenada
3. Se não está ordenada
    3.1 Procurar um par de produtos em sequencia não ordenados (decrescente)
    3.2 Trocar o par de produtos de posição
    3.3 Voltar ao passo 2
4. Mostrar a lista de produtos ordenada
```

Para a seguinte lista de produtos [('Milho para Pipoca', 6.99), ('Açucar Refinado', 5.99), ('Amido de Milho', 10.19), ('Óleo de Soja', 9.99)]
a execução do algoritmo como resultado [('Açucar Refinado', 5.99),('Milho para Pipoca', 6.99),('Óleo de Soja', 9.99), ('Amido de Milho', 10.19)].

Podemos ir um pouco mais a fundo para entender como o algoritmo realizou essa trocas, como segue:
- Ler uma lista de produtos no formato (nome, preco): **[('Milho para Pipoca', 6.99), ('Açucar Refinado', 5.99), ('Amido de Milho', 10.19), ('Óleo de Soja', 9.99)]**
- Verificar se a lista de produtos está ordenada
- Se não está ordenada: **não está**
- Procurar um par de produtos em sequencia não ordenados: **('Milho para Pipoca', 6.99) e ('Açucar Refinado', 5.99)**
- Trocar o par de produtos de posição: **[('Açucar Refinado', 5.99), ('Milho para Pipoca', 6.99), ('Amido de Milho', 10.19), ('Óleo de Soja', 9.99)]**
- Voltar ao passo 2
- Verificar se a lista de produtos está ordenada
- Se não está ordenada: **não está**
- Procurar um par de produtos em sequencia não ordenados: **('Amido de Milho', 10.19), ('Óleo de Soja', 9.99)**.
- Trocar o par de produtos de posição: **[('Açucar Refinado', 5.99), ('Milho para Pipoca', 6.99), ('Óleo de Soja', 9.99), ('Amido de Milho', 10.19)]**
- Voltar ao passo 2
- Verificar se a lista de produtos está ordenada
- Se não está ordenada: **está**
- Mostrar a lista de produtos ordenada

Seguindo a sequência de passos do algoritmo mencionado você poderá ordenar qualquer lista de produtos em ordem crescente, independentemente do número de produtos que contenha a lista.