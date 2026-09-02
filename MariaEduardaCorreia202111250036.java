public class MariaEduardaCorreia202111250036 {

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }

        return a / b;
    }
    public static void main(String[] args) {
        MariaEduardaCorreia202111250036 calculadora = new MariaEduardaCorreia202111250036();

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + calculadora.soma(a, b));
        System.out.println("Subtração: " + calculadora.subtracao(a, b));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(a, b));
        System.out.println("Divisão: " + calculadora.divisao(a, b));
    }
}