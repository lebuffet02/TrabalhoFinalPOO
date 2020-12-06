public class VeiculoTransporteCarga extends Veiculo {

    private double capacidadeCarga;
    private int numEixos;

    public VeiculoTransporteCarga(String numPlaca, String modeloVeiculo, int anoFabricacao, double pesoVeiculo,
            double capacidadeCarga, int numEixos) {
        super(numPlaca, modeloVeiculo, anoFabricacao, pesoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
        this.numEixos = numEixos;

    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    @Override
    public String toString() {
        return "VeiculoTransporteCarga [anoFabricacao=" + super.getAnoFabricacao() + ", modeloVeiculo=" + super.getModeloVeiculo() + ", numPlaca=" + super.getNumPlaca()
        + ", pesoVeiculo=" + super.getPesoVeiculo() + "capacidadeCarga=" + getCapacidadeCarga() + ", numEixos= + " + getNumEixos() + "]";
    }
    
}
