package listener;


// Interface do listener (observador): quem quiser ser avisado
// das mudanças de saldo de uma Conta implementa este método.
public interface ContaListener {
    void saldoAlterado(Conta conta);
}
