package q1.empresa;


import java.util.HashSet;
import java.util.Set;


public class Empresa{
  private String nome;
  private final Set<Departamento> departamentos;

	public Empresa(String nome) {
	  this.nome = nome;
	  this.departamentos = new HashSet<>();
	}

	public Departamento addDepartamento(String nome) {
	  Departamento d = new Departamento(nome);
	  this.departamentos.add(d);
		return d;
	}

	public Set<Departamento> getDepartamentos() {
	  return new HashSet<>(this.departamentos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
	  return "Empresa: " + this.getNome() +
			"\nDepartamentos: " + this.departamentos;
	}
}
