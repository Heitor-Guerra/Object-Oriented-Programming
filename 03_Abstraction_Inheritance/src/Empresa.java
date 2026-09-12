
import java.util.HashSet;

public class Empresa {
    private String name;
    private HashSet<Departamento> deps;

    public Empresa(String name) {
        this.deps = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    public HashSet<Departamento> getDepartamentos() {
        return (HashSet<Departamento>) this.deps.clone();
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + this.name;
    }
}
