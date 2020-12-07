import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaDeVeiculos {
    private List<Veiculo> lista;

    public ListaDeVeiculos() {
        this.lista = new ArrayList<>();
    }

    public void cadastraVeiculo(Veiculo veiculo) {
        lista.add(veiculo);
    }

    public Veiculo buscaVeiculoPorPlaca(String numPlaca) {
        for (Veiculo veiculo : lista) {
            if (veiculo.getNumPlaca().equals(numPlaca)) {
                return veiculo;
            }
        }
        return null;
    }
 
    public boolean veiculosLivres(List<Veiculo> lista) {
        if(lista == null) {
            lista.
            return true;
        }
        return false; 
    }  
    
    public FretamentoVeiculos topLucrativos(List<FretamentoVeiculos> list) {
        FretamentoVeiculos aux;
            for(int i = 0; i<list.size(); i++) {
                list.compareTo(list.get(i), list.get(i)); {
                    if(((Comparable<String>) list.get(i)).compareTo(list.get(i + 1))) {
                        aux = list.get(i);
                    }
                }   
    }
        public static Comparator<FretamentoVeiculos> topLucrativos = new Comparator<FretamentoVeiculos>() {

            public int compare(Funcionario s1, Funcionario s2) {
        
             return s1.getNome().compareTo(s2.getNome());      
           }};
    }



}
