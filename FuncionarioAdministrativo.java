import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioAdministrativo extends Funcionario {
    public FuncionarioAdministrativo(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    @Override
    public String toString() {
        return "FuncionarioAdministrativo [" + super.toString() + "] \n";
    }
}