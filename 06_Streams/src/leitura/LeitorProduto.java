package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import loja.Loja;
import loja.exceptions.PrecoNegativoException;

public class LeitorProduto {
  private Loja loja;

  public LeitorProduto(Loja loja) {
    this.loja = loja;
  }

  public void leProdutosLoja(String filename, Charset chatSet) throws PrecoNegativoException {
    try(BufferedReader br = new BufferedReader(new FileReader(filename, chatSet))) {

      br.readLine();
      String linha;

      while((linha = br.readLine()) != null) {
        adicionaProdutoLoja(linha);
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
      leProdutosLoja(newFile, chatSet);
    }
  }

  private void adicionaProdutoLoja(String linha) throws PrecoNegativoException {
    String[] values = linha.split(",");
    int id = Integer.parseInt(values[0]);
    String nome = values[1];
    float preco = Float.parseFloat(values[2]);
    if (preco < 0)
      throw new PrecoNegativoException();


    this.loja.registraProduto(id, nome, preco);
  }
}
