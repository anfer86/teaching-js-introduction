<script src="../jquery-3.4.1.min.js"></script>
<script src="../jquery_preventDefault.js"></script>

# Exemplo do uso do For com HTML

O seguinte código HTML mostra a tabuada do número 7.

```html
<!-- tabuada/tabuada_fixa.html -->
<html>
    <head>
        <title>Tabuada</title>
    </head>

    <body>
        <table border=1>
            <thead>
                <tr>
                    <th>Operação</th>
                    <th>Resultado</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>7 x 0</td>
                    <td>0</td>
                </tr>
                <tr>
                    <td>7 x 1</td>
                    <td>7</td>
                </tr>
                <tr>
                    <td>...</td>
                    <td>...</td>
                </tr>
                <tr>
                    <td>7 x 9.</td>
                    <td>63</td>
                </tr>
            </tbody>
        </table>
    </body>    
</html>
```

Resultado esperado:

<div style="border: 1px dashed black; padding: 5px;">
        <table border=1>
            <thead>
                <tr>
                    <th>Operação</th>
                    <th>Resultado</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>7 x 0</td>
                    <td>0</td>
                </tr>
                <tr>
                    <td>7 x 1</td>
                    <td>7</td>
                </tr>
                <tr>
                    <td>7 x 2</td>
                    <td>14</td>
                </tr>
                <tr>
                    <td>...</td>
                    <td>...</td>
                </tr>
                <tr>
                    <td>7 x 9.</td>
                    <td>63</td>
                </tr>
            </tbody>
        </table>
</div>

Criar essa tabela na mão dá bastante trabalho, ainda mais se precisássemos criar uma tabuada para outros números, pois teríamos que fazer cada uma dessas tabelas em páginas HTML diferentes.

Esse conteúdo pode ser produzido integrando Javascript com HTML e é apresentado no exemplo abaixo, utilizando a estrutura `for`.

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
