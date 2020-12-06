public abstract class Veiculo {
    private String numPlaca;
    private String modeloVeiculo;
    private int anoFabricacao;
    private double pesoVeiculo;

    public Veiculo(String numPlaca, String modeloVeiculo, int anoFabricacao, double pesoVeiculo) {
        this.numPlaca = numPlaca;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.pesoVeiculo = pesoVeiculo;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPesoVeiculo() {
        return pesoVeiculo;
    }

    public void setPesoVeiculo(double pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo [anoFabricacao=" + anoFabricacao + ", modeloVeiculo=" + modeloVeiculo + ", numPlaca=" + numPlaca
                + ", pesoVeiculo=" + pesoVeiculo + "]";
    }

	public int getLotacaoMaxPassageiros() {
		return 0;
    }
    
    public int getNumEixos() {
        return 0;
    }
}