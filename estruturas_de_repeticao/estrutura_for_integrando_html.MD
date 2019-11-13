# Exemplo do uso do For com HTML

Um exemplo do que pode ser produzido integrando Javascript com HTML é apresentado no exemplo abaixo.

Neste exemplo, apresentamos uma tabuada de um número, construindo uma tabela dinamicamente usando `for`.

```html
<!-- tabuada/tabuada.html -->
<html>
    <head>
        <title>Tabuada</title>
    </head>

    <body>
        <table border=1>
            <thead>
                <th>Operação</th>
                <th>Resultado</th>
            </thead>
            <tbody id="tabuada">
            </tbody>
        </table>
    </body>

    <script>    
    var valor = 7;
    var tabuada = document.getElementById('tabuada');
    for (let i=0; i < 10; i++){
        let tr = document.createElement("tr");
        tr.innerHTML = "<td>" + valor + " x " + i + "</td>" +
                       "<td>" + (valor * i) + "</td>";
        tabuada.appendChild(tr);
    }
    </script>
</html>
```

Neste exemplo o resultado esperado será uma tabela com a tabuada do número 7. Você pode tentar trocar a linha `var valor = 7` por outro valor para que mostre a tabuada de um valor diferente. 
