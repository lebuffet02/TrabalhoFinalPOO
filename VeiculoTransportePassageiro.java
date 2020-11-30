public class VeiculoTransportePassageiro extends VeiculoPasseio{

    private int lotacaoMaxPass;




    public VeiculoTransportePassageiro(String numPlaca, String modeloVeiculo, int anoFabricacao, double pesoVeiculo, int lotacaoMaxPass) {
        super(numPlaca, modeloVeiculo, anoFabricacao, pesoVeiculo);
        this.lotacaoMaxPass = lotacaoMaxPass;
    }
   
    
    public int getLotacaoMaxPass() {
        return lotacaoMaxPass;
    }




}
