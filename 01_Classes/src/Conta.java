/**
 * Representa uma conta bancária associada a um titular e a uma agência.
 */
public class Conta {
    private String id;
    private double saldo;
    private Pessoa titular;
    private Agencia agencia;

    /**
     * Cria uma conta com saldo inicial e associações já definidos.
     *
     * @param id identificador da conta
     * @param saldoInicial saldo inicial da conta
     * @param titular pessoa titular da conta
     * @param agencia agência onde a conta está registrada
     */
    public Conta(String id, double saldoInicial, Pessoa titular, Agencia agencia) {
        this.id = id;
        this.saldo = saldoInicial;
        this.titular = titular;
        this.agencia = agencia;
    }

    public String getId() {
        return id;
    }
    public double getSaldo() {
        return saldo;
    }
    public Pessoa getTitular() {
        return titular;
    }

    /**
     * Credita um valor positivo no saldo da conta.
     * Valores nulos ou negativos são ignorados.
     *
     * @param valorDepositado valor a ser depositado
     */
    public void deposita(double valorDepositado)
    {
        if (valorDepositado>0.0)
           this.saldo = this.saldo + valorDepositado;
    }

    /**
     * Debita um valor positivo quando há saldo suficiente.
     *
     * @param valorSacado valor solicitado para saque
     * @return {@code true} se o saldo foi atualizado; {@code false} caso contrário
     */
    public boolean saca(double valorSacado)
    {
        if ((valorSacado>0.0) && (this.saldo>=valorSacado))
        {
           this.saldo = this.saldo - valorSacado;
           return true;
        } else
            return false;
    }



}
