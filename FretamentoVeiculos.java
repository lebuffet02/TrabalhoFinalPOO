import java.time.LocalDate;

public class FretamentoVeiculos {
  
    private int idUnico;
    private VeiculoPasseio veiculo;
    private FuncionarioAdministrativo condutor;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double distanciaPercorrida;
    private double valorCobrado;

    public FretamentoVeiculos(int idUnico, VeiculoPasseio veiculo, FuncionarioAdministrativo condutor,
            LocalDate dataInicio, LocalDate dataTermino, double distanciaPercorrida,
            double valorCobrado) {
       
        this.idUnico = idUnico;
        this.veiculo = veiculo;
        this.condutor = condutor;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.distanciaPercorrida = distanciaPercorrida;
        this.valorCobrado = valorCobrado;
    }



    public int getIdUnico() {
        return idUnico;
    }


    public VeiculoPasseio getVeiculo() {
        return veiculo;
    }

    public FuncionarioAdministrativo getCondutor() {
        return condutor;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public  LocalDate getDataTermino() {
        return dataTermino;
    }


    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }


    public double getValorCobrado() {
        return valorCobrado;
    }



}
