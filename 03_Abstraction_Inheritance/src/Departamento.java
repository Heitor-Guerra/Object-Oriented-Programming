import java.util.HashSet;

public class Departamento {
    private String name;
    private HashSet<Funcionario> funcionarios;

    public Departamento(String name) {
        this.funcionarios = new HashSet<>();
        this.name = name;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public void addFuncionario(Funcionario a) {
        if(a == null) {
            return;
        }

        funcionarios.add(a);
    }

    public HashSet<Funcionario> getFuncionarios() {
        return (HashSet<Funcionario>) this.funcionarios.clone();
    }

    public float getMediaSalarial() {
        if(funcionarios.isEmpty()) {
            return 0;
        }

        float total = 0;
        for(Funcionario f : funcionarios) {
            total += f.getSalary();
        }

        return total / funcionarios.size();
    }

    @Override
    public String toString() {
        return "Nome do departamento: "+ this.name;
    }
}

