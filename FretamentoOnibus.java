import java.time.LocalDate;

public class FretamentoOnibus extends FretamentoVeiculos {


    public FretamentoOnibus(int idUnico, VeiculoPasseio veiculo, FuncionarioAdministrativo condutor,
            LocalDate dataInicio, LocalDate dataTermino, double distanciaPercorrida, double valorCobrado) {
        super(idUnico, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida, valorCobrado);
    }



}
