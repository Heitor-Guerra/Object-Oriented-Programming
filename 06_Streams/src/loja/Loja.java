package loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import loja.exceptions.ProdutoNaoExistenteException;

public class Loja {
  private Map<Integer, Produto> produtos;
  private Map<Integer, Venda> vendas;

  public Loja() {
    this.produtos = new HashMap<>();
    this.vendas = new HashMap<>();
  }

  public void registraProduto(int id, String nome, float preco) {
    this.produtos.put(id, new Produto(id, nome, preco));
  }

  public void registraVenda(int id, int idProd, int quantidade) throws ProdutoNaoExistenteException{
    if(!this.produtos.containsKey(idProd))
      throw new ProdutoNaoExistenteException();
    this.vendas.put(id, new Venda(id, this.produtos.get(idProd), quantidade));
  }

  public Produto getProdutoById(int idP) {
    return this.produtos.get(idP);
  }

  public Map<Integer, Produto> getProdutos(){
    return new HashMap<>(this.produtos);
  }

  public Map<Integer, Venda> getVendas() {
    return new HashMap<>(this.vendas);
  }

  public List<Venda> getVendasPrecoCrescente() {
    List<Venda> vendas = new ArrayList<>(this.vendas.values());
    Collections.sort(vendas);
    return vendas;
  }

  public float getTotalVendido() {
    float total = 0;
    for(Venda v : this.vendas.values()) {
      total += v.getPrecoTotal();
    }
    return total;
  }
}
