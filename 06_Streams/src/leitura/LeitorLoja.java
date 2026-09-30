package leitura;

import java.nio.charset.Charset;

import loja.Loja;

public class LeitorLoja {

  public static Loja leLoja(String nomeArquivoProdutos, String nomeArquivoVendas, String charset) {
    Loja loja = new Loja();
    LeitorProduto leitorProdutos = new LeitorProduto(loja);
    Charset cs = Charset.forName(charset);
    LeitorVenda leitorVendas = new LeitorVenda(loja);


    leitorProdutos.leProdutosLoja(nomeArquivoProdutos, cs);
    leitorVendas.leVendasLoja(nomeArquivoVendas, cs);

    return loja;
  }

}
