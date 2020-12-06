import java.util.ArrayList;
import java.util.List;

public class ListaDeFuncionarios {
    private List<Funcionario> lista;

    public ListaDeFuncionarios() {
        lista = new ArrayList<>();
    }

    public void cadastraFuncionario(Funcionario funcionario) {
        lista.add(funcionario);
    }

    public Funcionario buscaFuncionarioPorCPF(String cpf) {
        for (Funcionario funcionario : lista) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ListaDeFuncionarios [lista=" + lista + "]";
    }

}
