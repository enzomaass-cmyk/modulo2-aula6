public class Exercicio10 {
    public static void main(String[] args) {
        //TODO: Crie um array
        int[] notas = {7, 8, 9, 10, 6};

        //TODO: Chame os métodos
        System.out.println("Soma: " + somar(notas));
        System.out.println("Média: " + media(notas));
        System.out.println("Máximo: " + maximo(notas));
        System.out.println("Mínimo: " + minimo(notas));
    }

    //TODO: Crie os métodos
    public static int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static double media(int[] numeros) {
        if (numeros.length == 0) return 0;
        return somar(numeros) / (double) numeros.length;
    }

    public static int maximo(int[] numeros) {
        int max = numeros[0];
        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }
        return max;
    }

    public static int minimo(int[] numeros) {
        int min = numeros[0];
        for (int numero : numeros) {
            if (numero < min) {
                min = numero;
            }
        }
        return min;
    }
}