import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public List<Funcionario> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "ListaDeFuncionarios [lista=" + lista + "]";
    }

    public boolean motoristasLivres() {
        if(lista == null) {
           
           
            return true;
        }
        return false; 
    }
}
