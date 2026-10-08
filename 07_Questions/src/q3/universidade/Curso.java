package q3.universidade;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class Curso {
  private String nome;
  private Map<String, Disciplina> disciplinas;
  private Map<Disciplina, Set<Disciplina>> preReqs;

  Curso(String nome) {
    this.nome = nome;
    this.disciplinas = new LinkedHashMap<>();
    this.preReqs = new HashMap<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Map<String, Disciplina> getDisciplinas() {
    return new HashMap<>(this.disciplinas);
  }

  public Disciplina criaDisciplina(String idDisc, String nomeDisc) {
    Disciplina d = new Disciplina(idDisc, nomeDisc);
    this.disciplinas.put(idDisc, d);
    return d;
  }

  public Set<Disciplina> getPreReqsDisc(String discId) {
    return preReqs.get(discId);
  }

  public boolean estabelecePreReq(Disciplina disc, String idPreReq) {
    if(!this.disciplinas.containsKey(idPreReq) || !this.disciplinas.containsValue(disc)) {
      return false;
    }

    Disciplina d = this.disciplinas.get(idPreReq);

    if(this.preReqs.containsKey(disc)) {
      this.preReqs.get(disc).add(d);
    } else {
      Set<Disciplina> pres = new HashSet<>();
      pres.add(d);
      this.preReqs.put(disc, pres);
    }
    return true;
  }


  @Override
  public String toString() {
    String str = "Curso: " + this.getNome() + "\nDisciplinas:\n";
    for(Disciplina d : this.disciplinas.values()) {
      str += d.toString() + ", ";
      Set<Disciplina> pres = this.preReqs.get(d);
      if(pres != null) {
        str += "pré-requisitos: ";
        for(Disciplina d2 : pres) {
          str += d2.toString() + ", ";
        }
        str += '\n';
      } else {
        str += "sem pré-requisitos\n";
      }

    }
    return str;
  }

}
