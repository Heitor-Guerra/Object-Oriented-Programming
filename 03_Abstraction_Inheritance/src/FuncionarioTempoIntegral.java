public class FuncionarioTempoIntegral extends Funcionario {

    public FuncionarioTempoIntegral(String name, float salary) {
        super(name, salary);
    }

    @Override
    int getWeeklyHours() {
        return 40;
    }


}
