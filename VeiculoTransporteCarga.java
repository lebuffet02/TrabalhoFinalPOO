public class VeiculoTransporteCarga extends VeiculoPasseio{


    private double capacidadeCarga;
    private int numEixos;
   



	public VeiculoTransporteCarga(String numPlaca, String modeloVeiculo, int anoFabricacao, double pesoVeiculo,  double capacidadeCarga, int numEixos) {
		super(numPlaca, modeloVeiculo, anoFabricacao, pesoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
        this.numEixos = numEixos;
       
	}


    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }


    public int getNumEixos() {
        return numEixos;
    }


    public boolean unidadeAcoplada(int unidadeAcoplada) {
        if(unidadeAcoplada > 0) {
            return true;
        }
        else {
            return false;
        }

    }

}
