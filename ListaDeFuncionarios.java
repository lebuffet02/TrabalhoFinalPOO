import java.util.ArrayList;
import java.util.List;

public class ListaDeFuncionarios {
    private List<Funcionario> lista;

    public ListaDeFuncionarios() {
        lista = new ArrayList<>();
    }

    public boolean cadastraFuncionario(Funcionario funcionario) {
        lista.add(funcionario);
        return true;
    }

    @Override
    public String toString() {
        return "ListaDeFuncionarios [lista=" + lista + "]";
    }

}
