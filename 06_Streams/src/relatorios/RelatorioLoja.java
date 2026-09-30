package relatorios;

import java.util.List;
import java.util.Locale;

import loja.Loja;
import loja.Venda;

public class RelatorioLoja {
  public static void imprimeRelatorioLoja(Loja loja) {
    RelatorioLoja.imprimeVendas(loja.getVendasPrecoCrescente());
    System.out.println(String.format(Locale.US, "Total geral: R$ %,.2f", loja.getTotalVendido()));
  }

  private static void imprimeVendas(List<Venda> vendas) {
    for(Venda v : vendas) {
      System.out.println(String.format(Locale.US, "Venda %d: %dx %s - Total: R$ %,.2f%n", v.getId(), v.getQuantidade(), v.getProduto().getNome(), v.getPrecoTotal()));
    }
  }
}
