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

    public List<FretamentoVeiculos> listaMotoristasLivres() {
        for (FretamentoVeiculos fretamentoVeiculos : lista) {
            fretamentoVeiculos.getCondutor()
        }
        return null;
    }
}
