import java.time.LocalDate;

public class FuncionarioMotorista extends FuncionarioAdministrativo {

	
	public FuncionarioMotorista(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        
    }

   
    public boolean cargasPerigosas(double peso) {
        if(peso > 3500.0) {
            return true;
        } 
        return false;    
    }


    public boolean transportePassageiros(int passageiros) {
        if(passageiros > 20) {
            return true;
        }
        return false;
    }




}


