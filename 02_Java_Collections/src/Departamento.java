import java.util.HashSet;

public class Departamento {
    private String name;
    private HashSet<Pessoa> funcionarios;

    public Departamento(String name) {
        this.funcionarios = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addFunc(Pessoa a) {
        if(a == null) {
            return false;
        }

        return funcionarios.add(a);
    }

    public HashSet<Pessoa> getFunc() {
        return (HashSet<Pessoa>) this.funcionarios.clone();
    }
}

