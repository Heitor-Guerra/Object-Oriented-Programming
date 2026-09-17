package br.ufes.heitor.universidade;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
   private final String id;
   private String nome;
   private final Set<String> preReqs;

   public Disciplina(String id, String nome, Set<String> preReqs) {
      this.id = id;
      this.nome = nome;
      this.preReqs = preReqs;
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

   public Set<String> getPreReqs() {
      return new HashSet<>(this.preReqs);
   }

   public String toString() {
      String disc = this.getNome() + " PreReq:";
      if (this.preReqs.isEmpty()) {
         disc += "Nenhuma";
         return disc;
      } else {
         for(String pR : preReqs) {
           disc += " " + pR;
         }

         return disc;
      }
   }
}
