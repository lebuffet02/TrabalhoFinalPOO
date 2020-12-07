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

    @Override
    public String toString() {
        return "ListaDeFuncionarios [lista=" + lista + "]";
    }

	public Object compareTo(Funcionario funcionario) {
        return ((ListaDeFuncionarios) this.lista).compareTo(funcionario);
    }

    public boolean motoristasLivres() {
        if(lista == null) {
           
           
            return true;
        }
        return false; 
    }

	public ArrayList<Funcionario> sort() {
        for (Funcionario funcionario : lista) {
            Collections.sort((List<Funcionario>) lista);
        }
        return null;   
    }
    
    public static Comparator<Funcionario> ordenacaoFunc = new Comparator<Funcionario>() {

        public int compare(Funcionario s1, Funcionario s2) {
    
         return s1.getNome().compareTo(s2.getNome());      
       }};
}
