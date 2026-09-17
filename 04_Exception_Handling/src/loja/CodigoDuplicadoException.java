package loja;

public class CodigoDuplicadoException extends RuntimeException {

  public CodigoDuplicadoException(int codigo) {
    super("O codigo " + codigo + " já está registrado na loja");
  }
}
