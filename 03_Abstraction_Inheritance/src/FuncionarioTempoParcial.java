public class FuncionarioTempoParcial extends Funcionario{
    private int weeklyHours;


    public FuncionarioTempoParcial(String name, float salary) {
        super(name, salary);
    }

    public FuncionarioTempoParcial(String name, float salary, int weeklyHours) {
        super(name, salary);
        this.weeklyHours = weeklyHours;
    }

    @Override
    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setNumeroHorasSemanais(int hours) {
        this.weeklyHours = hours;
    }
}
