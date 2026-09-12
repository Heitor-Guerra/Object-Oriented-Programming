public abstract class Funcionario {
    private String name;
    private float salary;

    public Funcionario(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    abstract int getWeeklyHours();

    @Override
    public String toString() {
        return "Funcionario: " + getName() + " recebe " + getSalary() + "R$ trabalhando " + getWeeklyHours() + " horas semanais";
    }

}
