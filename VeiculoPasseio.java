import java.util.ArrayList;
import java.util.List;


public class VeiculoPasseio {
   
    private String numPlaca;
    private String modeloVeiculo;
    private int anoFabricacao; 
    private double pesoVeiculo;
    private List<String> veiculos;


    public VeiculoPasseio(String numPlaca,String modeloVeiculo, int anoFabricacao,double pesoVeiculo ) {
        this.numPlaca = numPlaca;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.pesoVeiculo = pesoVeiculo;
        this.veiculos = new ArrayList<String>();
    }

	public boolean cadastrarVeiculo(String veiculo) {
        return veiculos.add(veiculo);
    }

    public void numPlaca(String placa) {
        this.numPlaca = placa;
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
