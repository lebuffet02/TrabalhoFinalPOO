import java.time.LocalDate;
import java.time.Period;

public class FretamentoOnibus extends FretamentoVeiculos {

    public FretamentoOnibus(int idUnico, VeiculoTransportePassageiro veiculo, Funcionario condutor,
            LocalDate dataInicio, LocalDate dataTermino, double distanciaPercorrida) {
        super(idUnico, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida);
        super.setValorCobrado(calculaValorCobrado());
    }

    public double calculaValorCobrado() {
        Period periodo = Period.between(super.getDataInicio(), super.getDataTermino());
        int dias = periodo.getDays();
        double valorDiaria;
        double valorKM;
        if (super.getVeiculo().getLotacaoMaxPassageiros() <= 15) {
            valorDiaria = 410.00;
            valorKM = 2.20;
        } else if (super.getVeiculo().getLotacaoMaxPassageiros() <= 26) {
            valorDiaria = 490.00;
            valorKM = 2.80;
        } else if (super.getVeiculo().getLotacaoMaxPassageiros() <= 46) {
            valorDiaria = 560.00;
            valorKM = 3.00;
        } else {
            valorDiaria = 560.00;
            valorKM = 3.00;
        }

        double valorCobrado = (dias * valorDiaria) + (getDistanciaPercorrida() * valorKM);

        return valorCobrado;
    }

    @Override
    public boolean validaCondutor() {
        if (super.getVeiculo().getLotacaoMaxPassageiros() > 8 && super.getCondutor().getCategoria().equalsIgnoreCase("D")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FretamentoOnibus [condutor=" + super.getCondutor() + ", dataInicio=" + super.getDataInicio()
                + ", dataTermino=" + super.getDataTermino() + ", distanciaPercorrida=" + super.getDistanciaPercorrida()
                + ", idUnico=" + super.getIdUnico() + ", valorCobrado=" + super.getValorCobrado() + ", veiculo="
                + super.getVeiculo() + "]";
    }
}