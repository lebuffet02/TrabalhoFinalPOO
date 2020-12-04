import java.time.LocalDate;

public class FuncionarioManobrista extends Funcionario {

    private String numeroCNH;
    private String categoriaCNH;
    private LocalDate vencimentoCNH;

    
	public FuncionarioManobrista(String nome, LocalDate dataNascimento, String cpf, String numeroCNH, String categoriaCNH, LocalDate vencimentoCNH) {
        super(nome, dataNascimento, cpf);
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.vencimentoCNH = vencimentoCNH;	
	}
    
    public String getNumCNH() {
        return numeroCNH;
    }


    public String getCategoria() {
        return categoriaCNH;
    }

    public LocalDate getVencimentoCNH() {
        return vencimentoCNH;
    }


    @Override
    public String toString() {
        return "FuncionarioManobrista [" + super.toString() + ", NumeroCNH=" + numeroCNH + ", CategoriaCNH=" + categoriaCNH + ", VencimentoCNH=" + vencimentoCNH + "] \n";
    }

}   

