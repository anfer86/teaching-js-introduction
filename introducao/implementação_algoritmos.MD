# Implementação de Algoritmos

Para que o computador seja capaz de resolver problemas por meio de algoritmos é necessário utilizar uma linguagem de programação, pois o computador não entende os algoritmos descritos de forma narrativa em linguagem natural, seja em português, inglês, ou outra língua.

Uma linguagem de programação vai oferecer uma sintaxe para que o programador expresse o seu raciocínio algorítmico. Um programa de computador consiste em um conjunto de instruções computacionais que podem ser executadas pelo computador para a execução de uma tarefa.

Vamos considerar o problema da soma de dois números, para exemplificar a implementação do algoritmo em diferentes linguagens de programação. Vamos levar em consideração que os dados de entrada do algoritmo encontram-se em um arquivo chamado `entrada.txt` e a saída do programa será dada no terminal em que é executado o programa.

```
ALGORITMO - SOMAR DOIS NÚMEROS
1. Ler os dois números
2. Realizar a operação de soma dos dois números
3. Mostrar o resultado da operação
```

Implementação do algoritmo usando Javascript:

```javascript
// 1. Ler os dois números
var input = require('fs').readFileSync('entrada.txt', 'utf8');
var lines = input.split('\n');
var a = Number(lines[0]);
var b = Number(lines[1]);
// 2. Realizar a operação de soma dos dois números
var x = a + b;
// 3. Mostrar o resultado da operação
console.log(x);
```

Implementação do algoritmo em Python:

```python
# 1. Ler os dois números
input = open("entrada.txt", "r").read()
lines = input.split('\n')
a = int(lines[0])
b = int(lines[1])
# 2. Realizar a operação de soma dos dois números
x = a + b
# 3. Mostrar o resultado da operação
print(x)
```

Implementação do algoritmo em Java:
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SomaDoisNumeros {	
    public static void main(String[] args) throws FileNotFoundException {
        // 1. Ler os dois números
        File file = new File("entrada.txt");
        Scanner input = new Scanner(file);	    
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());	    
        input.close();
        // 2. Realizar a operação de soma dos dois números
        int x = a + b;
        // 3. Mostrar o resultado da operação
        System.out.println(x);	    		
    }		
}
```

É importante destacar que todas essas implementações resolvem o mesmo problema, mas em cada linguagem de programação deve ser respeitada a sintaxe, uso de palavras chave, estrutura de código, entre outros.

