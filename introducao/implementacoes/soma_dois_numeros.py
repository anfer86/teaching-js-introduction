# 1. Ler os dois números
input = open("entrada.txt", "r").read()
lines = input.split('\n')
a = int(lines[0])
b = int(lines[1])
# 2. Realizar a operação de soma dos dois números
x = a + b
# 3. Mostrar o resultado da operação
print(x)