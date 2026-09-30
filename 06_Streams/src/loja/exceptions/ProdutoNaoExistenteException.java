package loja.exceptions;

public class ProdutoNaoExistenteException extends RuntimeException {
  public ProdutoNaoExistenteException() {
    super("A produto nao esta registrado na loja");
  }

}
