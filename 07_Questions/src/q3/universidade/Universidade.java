package q3.universidade;

import java.util.HashSet;
import java.util.Set;

import q3.universidade.Disciplina;

public class Universidade {
  private String nome;
  private Set<Curso> cursos;

  public Universidade(String nome) {
    this.nome = nome;
    this.cursos = new HashSet<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Curso> getCursos() {
    return new HashSet<>(this.cursos);
  }

  public Curso criaCurso(String nomeCurso) {
    Curso c = new Curso(nomeCurso);
    this.cursos.add(c);
    return c;
  }

  @Override
  public String toString() {
    String str = "Universidade: " + this.getNome() + '\n';
    for(Curso c : this.cursos) {
      str += c.toString() + '\n';
    }
    return str;
  }
}
