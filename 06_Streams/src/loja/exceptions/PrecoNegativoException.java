package loja.exceptions;

public class PrecoNegativoException extends  RuntimeException {
  public PrecoNegativoException() {
    super("O preco nao pode ser negativo");
  }
}
