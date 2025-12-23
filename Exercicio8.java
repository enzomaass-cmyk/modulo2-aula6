public class Exercicio8 {
    public static void main(String[] args) {
        //TODO: Chame os métodos
        System.out.println("Soma: " + somar(10, 5));
        System.out.println("Subtração: " + subtrair(10, 5));
        System.out.println("Multiplicação: " + multiplicar(10, 5));
        System.out.println("Divisão: " + dividir(10, 5));
    }

    //TODO: Crie os métodos
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
}