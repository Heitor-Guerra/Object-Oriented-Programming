package listener;

// Outro listener concreto: mostra o novo saldo a cada movimentação.
public class ExtratoListener implements ContaListener {
    @Override
    public void saldoAlterado(Conta conta) {
        System.out.printf("  [extrato] conta %s, novo saldo: %.2f%n", conta.getNumero(), conta.getSaldo());
    }
}
