package br.ufes.heitor.universidade;

import java.util.HashMap;
import java.util.Map;

public class Curso {
   private final String id;
   private String nome;
   private final Map<String, Disciplina> disciplinas;

   public Curso(String id, String nome) {
      this.id = id;
      this.nome = nome;
      this.disciplinas = new HashMap<>();
   }

   public String getId() {
      return this.id;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void addDisciplina(Disciplina disciplina) {
      this.disciplinas.put(disciplina.getId(), disciplina);
   }

   public Disciplina getDisc(String id) {
      return this.disciplinas.get(id);
   }

   public HashMap<String, Disciplina> getDisciplinas() {
      return new HashMap<>(this.disciplinas);
   }

   public String toString() {
      return this.getId() + ": " + this.getNome() + ", Disciplinas: " + this.disciplinas;
   }
}
