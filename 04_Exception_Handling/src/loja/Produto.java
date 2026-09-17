package loja;

public class Produto implements Comparable<Produto> {
  private int codigo;
  private String nome;
  private double preco;

  public Produto(int codigo, String nome, double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  public int getCodigo() {
     return this.codigo;
  }

  public void setCodigo(int cod) {
     this.codigo = cod;
  }

  public String getNome() {
     return this.nome;
  }

  public void setNome(String nome) {
     this.nome = nome;
  }

  public double getPreco() {
     return this.preco;
  }

  public void setPreco(double preco) {
     this.preco = preco;
  }

  public int compareTo(Produto produto) {
    if(this.preco > produto.getPreco()) {
      return 1;
    } else if (this.preco == produto.getPreco()) {
      return 0;
    }
    return -1;
  }
}
