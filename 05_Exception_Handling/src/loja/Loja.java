package loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loja {
  private Map<Integer, Produto> produtos;

  public Loja() {
    this.produtos = new HashMap<>();
  }

  public Produto criarProduto(int codigo, String nome, double preco) throws CodigoDuplicadoException {
    if(this.produtos.containsKey(codigo)) {
      throw new CodigoDuplicadoException(codigo);
    }
    Produto produto = new Produto(codigo, nome, preco);
    this.produtos.put(codigo, produto);
    return produto;
  }

  public List<Produto> getProdutosPorPrecoCrescente() {
    List<Produto> produtos = new ArrayList<>(this.produtos.values());
    Collections.sort(produtos);
    return produtos;
  }

  public List<Produto> getProdutosPorPrecoDecrescente() {
    List<Produto> produtos = new ArrayList<>(this.produtos.values());
    Collections.sort(produtos, Collections.reverseOrder());
    return produtos;
  }
}
