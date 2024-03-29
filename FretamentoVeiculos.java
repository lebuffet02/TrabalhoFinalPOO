import java.time.LocalDate;

public class FretamentoVeiculos {

    private int idUnico;
    private Veiculo veiculo;
    private Funcionario condutor;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double distanciaPercorrida;
    private double valorCobrado;

    public FretamentoVeiculos(int idUnico, Veiculo veiculo, Funcionario condutor, LocalDate dataInicio,
            LocalDate dataTermino, double distanciaPercorrida) {
        this.idUnico = idUnico;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.distanciaPercorrida = distanciaPercorrida;
        if(validaCondutor(condutor)) {
            this.condutor = condutor;
        }
    }

   
    public int getIdUnico() {
        return idUnico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getCondutor() {
        return condutor;
    }

    public void setCondutor(Funcionario condutor) {
        this.condutor = condutor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public boolean validaCondutor(Funcionario condutor) {
        if(getVeiculo().getPesoVeiculo() < 3500 && condutor.getCategoria().equalsIgnoreCase("B")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FretamentoVeiculos [condutor=" + condutor + ", dataInicio=" + dataInicio + ", dataTermino="
                + dataTermino + ", distanciaPercorrida=" + distanciaPercorrida + ", idUnico=" + idUnico
                + ", valorCobrado=" + valorCobrado + ", veiculo=" + veiculo + "] \n";
    }

}
