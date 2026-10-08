package q1.empresa;

import java.util.Set;

public abstract class UnidadeOrganizacional {
  private String nome;

	UnidadeOrganizacional(String nome) {
	  this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double getSalarioMedio();

	public abstract Set<Funcionario> getFuncionarios();
}
