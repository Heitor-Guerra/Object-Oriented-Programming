package br.ufes.heitor.universidade;

import java.util.HashMap;
import java.util.Map;

public class Universidade {
   private String nome;
   private final Map<String, Curso> cursos;

   public Universidade(String nome) {
      this.nome = nome;
      this.cursos = new HashMap<>();
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Map<String, Curso> getCursos() {
      return new HashMap<>(this.cursos);
   }

   public void addCurso(Curso curso) {
      this.cursos.put(curso.getId(), curso);
   }

   public int getNumCursos() {
      return this.cursos.size();
   }

   public Curso getCurso(String id) {
      return (Curso)this.cursos.get(id);
   }

   public String toString() {
      String uni = "Universidade " + this.getNome() + "\n";

      for(Curso c : this.cursos.values()) {
        uni = uni + c.toString() + "\n";
      }

      return uni;
   }
}
