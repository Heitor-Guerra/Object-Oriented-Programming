package q1.empresa;

public class Funcionario {
  private String nome;
  private Setor setor;
  private double salario;

  Funcionario(String nome, Setor setor, double salario) {
    this.nome = nome;
    this.setor = setor;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

 	@Override
	public String toString() {
	  return this.getNome();
	}
}
