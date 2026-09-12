import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome da empresa");
        String nome = scan.nextLine();
        Empresa emp = new Empresa(nome);

        System.out.println("Insira o numero de departamentos");

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome do departamento");
            scan.next();
            String depName = scan.nextLine();
            Departamento dep = new Departamento(depName);

            System.out.println("Insira o numero de pessoas do departamento");
            int m = scan.nextInt();

            System.out.println("Insira o nome e a data de nascimento");
            for (int j = 0; j < m; j++) {
                scan.next();
                String name = scan.nextLine();

                int day, month, year;
                day = scan.nextInt();
                month = scan.nextInt();
                year = scan.nextInt();
                LocalDate birth = LocalDate.of(year, month, day);

                dep.addFunc(new Pessoa(name, birth));
            }
            emp.addDepartamento(dep);
        }


        System.out.println("Media das Idades da empresa");
        System.out.println(emp.getName() + ": " + emp.mediaIdade());

    }
}