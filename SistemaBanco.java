public class SistemaBanco {
    static double saldo = 1000.0;

    public static void main(String[] args) {
        //TODO: Teste os métodos
        exibirSaldo();

        depositar(500);
        exibirSaldo();

        sacar(200);
        exibirSaldo();

        sacar(2000);  // Erro: saldo insuficiente
        exibirSaldo();
    }

    //TODO: Crie os métodos
    public static void exibirSaldo() {
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    public static void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado!");
        } else {
            System.out.println("Erro: valor inválido!");
        }
    }

    public static void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado!");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente!");
        } else {
            System.out.println("Erro: valor inválido!");
        }
    }
}