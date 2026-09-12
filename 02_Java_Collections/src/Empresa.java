
import java.util.HashSet;

public class Empresa {
    private String name;
    private HashSet<Departamento> deps;

    public Empresa(String name) {
        this.deps = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addDepartamento(Departamento dep) {
        if(dep == null ) {
            return false;
        }
        return this.deps.add(dep);
    }

    public HashSet<Departamento> getDeps() {
        return (HashSet<Departamento>) this.deps.clone();
    }

    public float mediaIdade() {
        float media = 0;
        int total = 0;
        for(Departamento dep : deps) {
            HashSet<Pessoa> pessoas = dep.getFunc();
            total += pessoas.size();
            for(Pessoa p : pessoas) {
                media += p.calculaIdade();
            }
        }

        media /= total;

        return media;
    }
}
