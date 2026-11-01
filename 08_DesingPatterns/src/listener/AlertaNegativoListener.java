package listener;

// Um listener concreto: só reage quando o saldo fica negativo.
public class AlertaNegativoListener implements ContaListener {
    @Override
    public void saldoAlterado(Conta conta) {
        if (conta.getSaldo() < 0) {
            System.out.println("  [alerta] conta " + conta.getNumero() + " está com saldo negativo!");
        }
    }
}
