package loja.exceptions;

public class QuantidadeMenorIgualZeroException extends  RuntimeException {
  public QuantidadeMenorIgualZeroException() {
    super("A quantidade nao pode ser menor ou igual a zero.");
  }
}
