public class Exercicio9 {
    public static void main(String[] args) {
        //TODO: Teste os métodos
        System.out.println("Maior de idade (25): " + ehMaiorDeIdade(25));
        System.out.println("Maior de idade (15): " + ehMaiorDeIdade(15));

        System.out.println("Email válido: " + ehEmail("joao@email.com"));
        System.out.println("Email inválido: " + ehEmail("joao"));

        System.out.println("Senha forte: " + ehSenha("senha123"));
        System.out.println("Senha fraca: " + ehSenha("123"));
    }

    //TODO: Crie os métodos
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static boolean ehEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean ehSenha(String senha) {
        return senha.length() >= 8;
    }
}