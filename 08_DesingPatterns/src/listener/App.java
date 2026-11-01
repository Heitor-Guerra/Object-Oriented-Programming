package listener;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta("123-4");

        // Registra dois listeners na mesma conta.
        ContaListener alerta = new AlertaNegativoListener();
        conta.adicionarListener(alerta);
        conta.adicionarListener(new ExtratoListener());

        System.out.println("Depósito de 100:");
        conta.depositar(100);

        System.out.println("Saque de 150:");
        conta.sacar(150);

        // Depois de removido, o alerta não é mais avisado.
        conta.removerListener(alerta);

        System.out.println("Saque de 10 (alerta removido):");
        conta.sacar(10);
    }
}
