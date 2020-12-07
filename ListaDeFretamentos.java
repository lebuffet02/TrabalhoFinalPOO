import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaDeFretamentos {
    private List<FretamentoVeiculos> lista;

    public ListaDeFretamentos() {
        lista = new ArrayList<>();
    }

    public void cadastraFretamentos(FretamentoVeiculos fretamentoVeiculos) {
        lista.add(fretamentoVeiculos);
    }

    public List<Funcionario> listaMotoristasLivres(ListaDeFuncionarios listaDeFuncionarios) {
        ArrayList<Funcionario> retorno = new ArrayList<>();
        for (FretamentoVeiculos fretamento : lista) {
            if(!listaDeFuncionarios.getLista().contains(fretamento.getCondutor())) {
                retorno.add(fretamento.getCondutor());
            }
        }
        return retorno;
    }

    public List<Veiculo> listaVeiculosLivres(ListaDeVeiculos listaDeVeiculos) {
        ArrayList<Veiculo> retorno = new ArrayList<>();
        for (FretamentoVeiculos fretamento : lista) {
            if(!listaDeVeiculos.getLista().contains(fretamento.getVeiculo())) {
                retorno.add(fretamento.getVeiculo());
            }
        }
        return retorno;
    }

    public List<FretamentoVeiculos> listaHistoricoDeFretamentos() {
        ArrayList<FretamentoVeiculos> retorno = new ArrayList<>();
        int i = 0;
        for (FretamentoVeiculos fretamentoVeiculos : lista) {
            if(fretamentoVeiculos.getDataTermino().isBefore(LocalDate.now())) {
                retorno.add(lista.get(i));
            }
        }
        return retorno;
    }
    
}
