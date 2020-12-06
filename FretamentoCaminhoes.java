import java.time.LocalDate;

public class FretamentoCaminhoes extends FretamentoVeiculos {
    private boolean cargaPeriogosa;

    public FretamentoCaminhoes(int idUnico, VeiculoTransporteCarga veiculo, FuncionarioAdministrativo condutor,
            LocalDate dataInicio, LocalDate dataTermino, double distanciaPercorrida,boolean cargaPeriogosa) {
        super(idUnico, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida);
        this.cargaPeriogosa = cargaPeriogosa;
        super.setValorCobrado(calculaValorCobrado());
    }

    public boolean isCargaPeriogosa() {
        return cargaPeriogosa;
    }

    public void setCargaPeriogosa(boolean cargaPeriogosa) {
        this.cargaPeriogosa = cargaPeriogosa;
    }

    public double calculaValorCobrado() {
        double valorCobrado;
        if(isCargaPeriogosa()) {
            valorCobrado = super.getVeiculo().getNumEixos() * 1.50 * super.getDistanciaPercorrida();
        } else {
            valorCobrado = super.getVeiculo().getNumEixos() * 1.20 * super.getDistanciaPercorrida();
        }
        return valorCobrado;
    }

    @Override
    public String toString() {
        return "FretamentoCaminhoes [condutor=" + super.getCondutor() + ", dataInicio=" + super.getDataInicio() + ", dataTermino="
        + super.getDataTermino() + ", distanciaPercorrida=" + super.getDistanciaPercorrida() + ", idUnico=" + super.getIdUnico()
        + ", valorCobrado=" + super.getValorCobrado() + ", veiculo=" + super.getVeiculo() + "cargaPeriogosa=" + this.isCargaPeriogosa() + "]";
    }
    
    
}
