package listener;

import java.util.LinkedHashSet;
import java.util.Set;

// A Conta é o objeto observado: ela não sabe o que os listeners fazem,
// só sabe que precisa avisá-los quando o saldo muda.
public class Conta {
    private final String numero;
    private double saldo;

    // Set: o mesmo listener não é registrado duas vezes.
    // LinkedHashSet: os listeners são avisados na ordem em que foram registrados.
    private final Set<ContaListener> listeners = new LinkedHashSet<>();

    public Conta(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarListener(ContaListener listener) {
        listeners.add(listener);
    }

    public void removerListener(ContaListener listener) {
        listeners.remove(listener);
    }

    public void depositar(double valor) {
        saldo += valor;
        notificarListeners();
    }

    // Neste exemplo o saque pode deixar o saldo negativo (cheque especial).
    public void sacar(double valor) {
        saldo -= valor;
        notificarListeners();
    }

    private void notificarListeners() {
        for (ContaListener listener : listeners) {
            listener.saldoAlterado(this);
        }
    }
}
