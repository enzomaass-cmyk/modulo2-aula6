public class Exercicio6 {
    public static void main(String[] args) {
        //TODO: Crie um array
        int[] numeros = {1, 2, 3, 4, 5};

        //TODO: Chame o método somar
        int soma = somar(numeros);
        System.out.println("Soma: " + soma);

        int[] numeros2 = {10, 20, 30};
        int soma2 = somar(numeros2);
        System.out.println("Soma: " + soma2);
    }

    //TODO: Crie o método somar
    public static int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
