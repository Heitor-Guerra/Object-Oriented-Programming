import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String name;
    private LocalDate birthDate;

    public Pessoa(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long calculaIdade() {
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}
