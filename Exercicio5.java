public class Exercicio5 {
    public static void main(String[] args) {
        //TODO: Chame o método ehMaiorDeIdade
        if (ehMaiorDeIdade(25)) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

        if (ehMaiorDeIdade(15)) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }

    //TODO: Crie o método ehMaiorDeIdade
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
}