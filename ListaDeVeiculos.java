import java.util.ArrayList;
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
    
}
