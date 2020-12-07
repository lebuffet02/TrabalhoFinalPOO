import java.time.LocalDate;
import java.util.List;

public class FuncionarioMotorista extends FuncionarioManobrista {
    private boolean cursoCargasPerigosas;
    private boolean cursoTransportePassageiros;

    public FuncionarioMotorista(String nome, LocalDate dataNascimento, String cpf, String numeroCNH,
            String categoriaCNH, LocalDate vencimentoCNH, boolean cursoCargasPerigosas,
            boolean cursoTransportePassageiros) {
        super(nome, dataNascimento, cpf, numeroCNH, categoriaCNH, vencimentoCNH);
        this.setCursoCargasPerigosas(cursoCargasPerigosas);
        this.setCursoTransportePassageiros(cursoTransportePassageiros);
    }

    public boolean isCursoTransportePassageiros() {
        return cursoTransportePassageiros;
    }

    public void setCursoTransportePassageiros(boolean cursoTransportePassageiros) {
        this.cursoTransportePassageiros = cursoTransportePassageiros;
    }

    public boolean isCursoCargasPerigosas() {
        return cursoCargasPerigosas;
    }
    
    public void setCursoCargasPerigosas(boolean cursoCargasPerigosas) {
        this.cursoCargasPerigosas = cursoCargasPerigosas;
    }

    @Override
    public String toString() {
        return "FuncionarioMotorista [numeroCNH=" + super.getNumCNH() + ", categoriaCNH=" + super.getCategoria() + ", vencimentoCNH=" + super.getVencimentoCNH() + " cursoCargasPerigosas=" + cursoCargasPerigosas + ", cursoTransportePassageiros="
                + cursoTransportePassageiros + "] \n";
    }
}