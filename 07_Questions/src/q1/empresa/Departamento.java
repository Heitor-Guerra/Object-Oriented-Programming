package q1.empresa;


import java.util.HashSet;
import java.util.Set;


public class Departamento extends UnidadeOrganizacional {
  private final Set<Setor> setores;

	Departamento(String nome) {
	  super(nome);
		this.setores = new HashSet<>();
	}

	public Setor addSetor(String nome) {
	  Setor s = new Setor(nome);
	  this.setores.add(s);
		return s;
	}

	public Set<Setor> getSetores() {
	  return new HashSet<>(this.setores);
	}

	public Set<Funcionario> getFuncionarios() {
		Set<Funcionario> funcs =  new HashSet<>();
		for(Setor s : this.setores) {
		  funcs.addAll(s.getFuncionarios());
		}
		return funcs;
	}

	public double getSalarioMedio() {
	  double total = 0;
		Set<Funcionario> funcs = this.getFuncionarios();
		for(Funcionario f : funcs) {
		  total += f.getSalario();
		}
		return total / funcs.size();
	}

	@Override
	public String toString() {
	  return "Departamento: " + this.getNome() +
			" Setores: " + this.setores;
	}
}
