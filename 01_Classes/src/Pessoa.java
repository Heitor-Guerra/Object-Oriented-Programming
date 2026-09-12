/**
 * Representa uma pessoa que pode ser titular de uma conta.
 */
public class Pessoa {
    private int idade;
    private String nome;
    private String cpf;

    /**
     * Cria uma pessoa identificada pelo CPF e pelo nome.
     *
     * @param cpf identificador da pessoa
     * @param nome nome da pessoa
     */
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
