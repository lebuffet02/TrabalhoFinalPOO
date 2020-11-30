import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioAdministrativo {

    private String nome;
    private LocalDate dataNascimento; 
    private String cpf;
    private ArrayList<String> funcs;


    public FuncionarioAdministrativo(String nome, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.funcs = new ArrayList<String>();
    }


    public boolean addFunc (String func) {
        funcs.add(func);
        return true;
    }



    public String getNome() {
        return nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public String toLineFile(){
		return this.getNome()+","+
            this.getDataNascimento()+","+
            this.getCpf();
	}


}