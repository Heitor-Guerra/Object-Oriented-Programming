/**
 * Executa exemplos de criação e movimentação de contas bancárias.
 */
public class App {
    /**
     * Cria objetos do domínio e demonstra depósito e tentativa de saque.
     *
     * @param args argumentos de linha de comando, não utilizados
     * @throws Exception caso ocorra uma falha durante a execução
     */
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa("1238787123-23", "Fulano");
        Pessoa p2 = new Pessoa("78178979834-99", "Sicrano");

        System.out.println(p1.getNome());
        System.out.println(p1.getCpf());

        System.out.println(p2.getNome());
        System.out.println(p2.getCpf());
        p2.setNome("Sicrano da Silva");
        System.out.println(p2.getNome());
        System.out.println(p2.getCpf());

        Banco b = new Banco("Banco do Brasil");

        Agencia a = new Agencia(b);

        Conta c1 = new Conta("123", 0.0, p1, a);
        Conta c2 = new Conta("567", 0.0, p1, a);

        c1.deposita(1000.0);
        System.out.println("O saldo da conta c1 é: "+c1.getSaldo());
        System.out.println("O titular da conta c1 é: "+c1.getTitular().getNome());
        boolean saqueComSucesso = c1.saca(10440.0);
        if (saqueComSucesso) System.out.println("Saque bem sucedido na conta c1.");
        else System.out.println("Saque falhou.");
        System.out.println("O saldo da conta c1 é: "+c1.getSaldo());
        System.out.println("O titular da conta c1 é: "+c1.getTitular().getNome());


    }
}
