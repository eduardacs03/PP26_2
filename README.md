# PP26_2

# PP26_2

## Descrição

Calculadora desenvolvida em Java, possuindo as quatro operações matemáticas básicas:

- Soma
- Subtração
- Multiplicação
- Divisão

A classe da calculadora possui o nome **MariaEduardaCorreia202111250036**, seguindo o formato pedido pelo professor.

## Métodos

Cada operação recebe dois parâmetros do tipo `double`. Um tipo de dado primitivo de 64 bits usado para armazenar números com casas decimais de precisão dupla

| Método | Parâmetros | Retorno | Funcionamento |
|---|---:|---|---|
| `soma(double a, double b)` | 2 | `double` | Soma `a + b` |
| `subtracao(double a, double b)` | 2 | `double` | Subtrai `a - b` |
| `multiplicacao(double a, double b)` | 2 | `double` | Multiplica `a * b` |
| `divisao(double a, double b)` | 2 | `double` | Divide `a / b` |

## Divisão por zero

O método `divisao` verifica se o segundo parâmetro é zero. Caso seja, o programa lança uma `ArithmeticException` com a mensagem:

`Não é possível dividir por zero.`

## Executar o arquivo JAR

```bash
java -jar MariaEduardaCorreia202111250036.jar
```

## Como os métodos podem ser utilizados

Exemplo:

```java
MariaEduardaCorreia202111250036 calculadora = new MariaEduardaCorreia202111250036();

double resultadoSoma = calculadora.soma(10, 5);
double resultadoSubtracao = calculadora.subtracao(10, 5);
double resultadoMultiplicacao = calculadora.multiplicacao(10, 5);
double resultadoDivisao = calculadora.divisao(10, 5);
```

Cada operação recebe dois números e retorna o resultado correspondente.
