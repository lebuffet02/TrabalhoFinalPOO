import java.time.LocalDate;

public class FretamentoCaminhoes extends FretamentoVeiculos {


    public FretamentoCaminhoes(int idUnico, VeiculoPasseio veiculo, FuncionarioAdministrativo condutor,
            LocalDate dataInicio, LocalDate dataTermino, double distanciaPercorrida, double valorCobrado) {
        super(idUnico, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida, valorCobrado);
    }
  
    

    public boolean cargaPerigosa(double peso) {
        if(peso > 3600.0) {
            return true;
        }
        else {
            return false;
        }

    }


}
