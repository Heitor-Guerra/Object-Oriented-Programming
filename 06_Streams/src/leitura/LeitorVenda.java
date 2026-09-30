package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import loja.Loja;
import loja.exceptions.ProdutoNaoExistenteException;
import loja.exceptions.QuantidadeMenorIgualZeroException;

public class LeitorVenda {
  private Loja loja;

  public LeitorVenda(Loja loja) {
    this.loja = loja;
  }

  public void leVendasLoja(String filename, Charset charSet) throws QuantidadeMenorIgualZeroException, ProdutoNaoExistenteException  {
    try(BufferedReader br = new BufferedReader(new FileReader(filename, charSet))) {
      br.readLine();
      String linha;

      while((linha = br.readLine()) != null) {
        adicionaVendaLoja(linha);
      }
    } catch(IOException e) {
      System.out.println("Houve um problema na abertura do arquivo " + filename + ". Digite novamente o nome do arquivo:");
      Scanner s = new Scanner(System.in);
      String newFile = s.nextLine();
      while(!newFile.endsWith(".csv")) {
        System.out.println("O arquivo nao possui extensao csv. Digite novamente.");
        newFile = s.nextLine();
      }
      s.close();
      leVendasLoja(newFile, charSet);
    }
  }

  private void adicionaVendaLoja(String linha) throws QuantidadeMenorIgualZeroException, ProdutoNaoExistenteException {
    String[] values = linha.split(",");
    int id = Integer.parseInt(values[0]);
    int idProduct = Integer.parseInt(values[1]);
    int quantidade = Integer.parseInt(values[2]);

    if (quantidade <= 0)
      throw new QuantidadeMenorIgualZeroException();
    else if(this.loja.getProdutoById(idProduct) == null)
      throw new ProdutoNaoExistenteException();


    this.loja.registraVenda(id, idProduct, quantidade);
  }
}
