package loja;

import loja.exceptions.QuantidadeMenorIgualZeroException;

public class Venda implements Comparable<Venda> {
  private final int id;
  private final Produto produto;
  private final int quantidade;

  Venda(int id, Produto produto, int quantidade) throws QuantidadeMenorIgualZeroException {
    if(quantidade <= 0)
      throw new QuantidadeMenorIgualZeroException();
    this.id = id;
    this.produto = produto;
    this.quantidade = quantidade;
    this.produto.adicionaVenda(this);
  }

  public int getId() {
    return id;
  }

  public Produto getProduto() {
    return produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public float getPrecoTotal() {
    return this.getQuantidade()*this.produto.getPreco();
  }

  public int compareTo(Venda venda) {
    if(this.getPrecoTotal() > venda.getPrecoTotal()) {
      return 1;
    } else if (this.getPrecoTotal() < venda.getPrecoTotal()) {
      return -1;
    }
    return 0;
  }
}
