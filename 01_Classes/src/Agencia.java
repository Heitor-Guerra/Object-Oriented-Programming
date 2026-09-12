/**
 * Representa uma agência vinculada a um banco.
 */
public class Agencia {
    private Banco banco;
    private String nome;

    /**
     * Cria uma agência para o banco informado.
     *
     * @param banco banco ao qual a agência pertence
     */
    public Agencia(Banco banco)
    {
        this.banco=banco;
    }
    
    public Banco getBanco() {
        return banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
