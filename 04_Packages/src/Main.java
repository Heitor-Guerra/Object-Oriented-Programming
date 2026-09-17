import br.ufes.heitor.universidade.Curso;
import br.ufes.heitor.universidade.Disciplina;
import br.ufes.heitor.universidade.Universidade;
import java.util.HashSet;
import java.util.Set;

public class Main {
   public static void main(String[] args) {
      Universidade uni = new Universidade("UFES");

      Curso curso1 = new Curso("Eng. Comp.", "Engenharia da Computacao");
      uni.addCurso(curso1);
      curso1.addDisciplina(new Disciplina("POO", "Programacao Orientada a Objetos", new HashSet<>()));
      curso1.addDisciplina(new Disciplina("Calc1", "Calculo 1", new HashSet<>()));

      Set<String> preReqs1 = new HashSet<>();
      preReqs1.add("Calc1");
      curso1.addDisciplina(new Disciplina("Calc2", "Calculo 2", preReqs1));

      Curso curso2 = new Curso("Eng. Mec.", "Engenharia Mecanica");
      uni.addCurso(curso2);
      curso2.addDisciplina(new Disciplina("Mat", "Tecnologia dos Materiais", new HashSet<>()));
      curso2.addDisciplina(new Disciplina("CEle", "Circuitos Eletricos", new HashSet<>()));

      Set<String> preReqs2 = new HashSet<>();
      preReqs2.add("CEle");
      curso2.addDisciplina(new Disciplina("CEle2", "Circuitos Eletricos 2", preReqs2));

      System.out.println(uni);
   }
}
