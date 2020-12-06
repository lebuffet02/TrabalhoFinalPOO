public class VeiculoTransportePassageiro extends Veiculo {

    private int lotacaoMaxPassageiros;

    public VeiculoTransportePassageiro(String numPlaca, String modeloVeiculo, int anoFabricacao, double pesoVeiculo,
            int lotacaoMaxPassageiros) {
        super(numPlaca, modeloVeiculo, anoFabricacao, pesoVeiculo);
        this.lotacaoMaxPassageiros = lotacaoMaxPassageiros;
    }

    @Override
    public int getLotacaoMaxPassageiros() {
        return this.lotacaoMaxPassageiros;
    }

    public void setLotacaoMaxPassageiros(int lotacaoMaxPassageiros) {
        this.lotacaoMaxPassageiros = lotacaoMaxPassageiros;
    }

    @Override
    public String toString() {
        return "VeiculoTransportePassageiro [anoFabricacao=" + super.getAnoFabricacao() + ", modeloVeiculo=" + super.getModeloVeiculo() + ", numPlaca=" + super.getNumPlaca()
        + ", pesoVeiculo=" + super.getPesoVeiculo() + "lotacaoMaxPassageiros=" + getLotacaoMaxPassageiros() + "]";
    }
    
}
