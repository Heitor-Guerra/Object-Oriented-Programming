/**
 * Representa uma instituição bancária identificada pelo nome.
 */
public class Banco {
    public String nome;

    /**
     * Cria um banco com o nome informado.
     *
     * @param nome nome do banco
     */
    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
