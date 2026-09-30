import leitura.LeitorLoja;
import loja.Loja;
import relatorios.RelatorioLoja;

public class App {

    public static void main(String[] args) {

        String nomeArquivoProdutos, nomeArquivoVendas;

        if (args.length != 2) {
            nomeArquivoProdutos = "produtos.csv";
            nomeArquivoVendas = "vendas.csv";
        } else {
            nomeArquivoProdutos = args[0];
            nomeArquivoVendas = args[1];
        }

        // coloque seu código a partir daqui
        Loja loja = LeitorLoja.leLoja(nomeArquivoProdutos, nomeArquivoVendas, "windows-1252");
        RelatorioLoja.imprimeRelatorioLoja(loja);
    }
}
