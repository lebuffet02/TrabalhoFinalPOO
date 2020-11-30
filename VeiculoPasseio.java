public class VeiculoPasseio {
   
    private String numPlaca;
    private String modeloVeiculo;
    private int anoFabricacao; 
    private double pesoVeiculo;


    public VeiculoPasseio(String numPlaca,String modeloVeiculo, int anoFabricacao,double pesoVeiculo ) {
        this.numPlaca = numPlaca;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.pesoVeiculo = pesoVeiculo;

    }

    public String getNumPlaca() {
        return numPlaca;
    }


    public String getModeloVeiculo() {
        return modeloVeiculo;
    }


    public int getAnoFabricacao() {
        return anoFabricacao;
    }


    public double getPesoVeiculo() {
        return pesoVeiculo;
    }


    public String toLineFile(){
		return this.getNumPlaca()+","+
            this.getModeloVeiculo()+","+
            this.getAnoFabricacao()+","+
            this.getPesoVeiculo();
	}


}
