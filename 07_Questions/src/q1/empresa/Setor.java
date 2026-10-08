package q1.empresa;

import java.util.HashSet;
import java.util.Set;

public class Setor extends UnidadeOrganizacional {
  private final Set<Funcionario> funcionarios;

	Setor(String nome) {
	  super(nome);
		this.funcionarios = new HashSet<>();
	}

	public Set<Funcionario> getFuncionarios() {
		return new HashSet<>(this.funcionarios);
	}

	public boolean transfereFuncionario(Setor novoSetor, Funcionario funcionario) {
	  if(this.funcionarios.remove(funcionario)) {
			novoSetor.addFuncionario(funcionario);
			return true;
		} else {
		  return false;
		}
	}

	public Funcionario addFuncionario(String nome, double salario) {
	  Funcionario f = new Funcionario(nome, this, salario);
	  this.funcionarios.add(f);
		return f;
	}

	public double getSalarioMedio() {
	  double total = 0;
		for(Funcionario f : this.funcionarios) {
		  total += f.getSalario();
		}
		return total / this.funcionarios.size();
	}

	private void addFuncionario(Funcionario funcionario) {
	  this.funcionarios.add(funcionario);
	}

	@Override
	public String toString() {
	  return "Setor: " + this.getNome() +
			" Funcionarios: " + this.funcionarios;
	}
}
