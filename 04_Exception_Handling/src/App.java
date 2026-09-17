import loja.Loja;
import loja.Produto;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Loja loja = new Loja();

        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("===== LOJA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos (preço crescente)");
            System.out.println("3 - Listar produtos (preço decrescente)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = lerInteiro(entrada);

            switch (opcao) {
                case 1 -> cadastrarProduto(loja, entrada);
                case 2 -> imprimirProdutos(loja.getProdutosPorPrecoCrescente(), "Ordem crescente");
                case 3 -> imprimirProdutos(loja.getProdutosPorPrecoDecrescente(), "Ordem decrescente");
                case 0 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    private static void cadastrarProduto(Loja loja, Scanner entrada) {
        System.out.print("Código: ");
        int codigo = lerInteiro(entrada);

        System.out.print("Nome do produto: ");
        String nome = entrada.nextLine().trim();

        System.out.print("Preço: ");
        double preco = lerDouble(entrada);

        try {
            Produto produto = loja.criarProduto(codigo, nome, preco);
            System.out.println("Produto cadastrado: " + produto);
        } catch (CodigoDuplicadoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void imprimirProdutos(List<Produto> produtos, String titulo) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("--- " + titulo + " ---");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    private static int lerInteiro(Scanner entrada) {
        while (!entrada.hasNextInt()) {
            entrada.nextLine(); // descarta a linha inválida
            System.out.print("Digite um número inteiro: ");
        }
        int valor = entrada.nextInt();
        entrada.nextLine(); // consome o resto da linha (o "enter")
        return valor;
    }

    private static double lerDouble(Scanner entrada) {
        while (!entrada.hasNextDouble()) {
            entrada.nextLine();
            System.out.print("Digite um preço válido: ");
        }
        double valor = entrada.nextDouble();
        entrada.nextLine(); // consome o resto da linha (o "enter")
        return valor;
    }
}
