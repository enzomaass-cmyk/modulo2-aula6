public class Exercicio7 {
    public static void main(String[] args) {
        //TODO: Chame os métodos somar
        System.out.println(somar(5, 3));           // int
        System.out.println(somar(5.5, 3.2));       // double
        System.out.println(somar(5, 3, 2));        // 3 ints
    }

    //TODO: Crie os métodos somar
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}
