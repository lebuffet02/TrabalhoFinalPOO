import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class FuncionarioAdministrativo {

    private String nome;
    private LocalDate dataNascimento; 
    private String cpf;
    private List<String> funcs;


    public FuncionarioAdministrativo(String nome, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.funcs = new ArrayList<String>();
    }


    public boolean cadastrarFunc (String func) {
       return funcs.add(func);
    }


    public String getNome() {
        return nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void cpf(String cpf) {
        this.cpf = cpf;
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