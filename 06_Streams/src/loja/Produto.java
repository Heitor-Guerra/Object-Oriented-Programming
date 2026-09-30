package loja;

import java.util.HashSet;
import java.util.Set;

import loja.exceptions.PrecoNegativoException;

public class Produto {
  private final int id;
  private String nome;
  private float preco;
  private final Set<Venda> vendas;

  Produto(int id, String nome, float preco) throws PrecoNegativoException {
    if(preco < 0)
      throw new PrecoNegativoException();
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.vendas = new HashSet<>();
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public Set<Venda> getVendas() {
    return new HashSet<>(vendas);
  }

  public void adicionaVenda(Venda venda) {
    this.vendas.add(venda);
  }
}
