import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;

public class App {
  
    public static void main(String[] args) {

        // List<VeiculoPasseio> veic = new ArrayList<VeiculoPasseio>();
        // List<FuncionarioAdministrativo> func = new ArrayList<FuncionarioAdministrativo>();
        // List<FretamentoVeiculos> fretVeic = new ArrayList<FretamentoVeiculos>();

        // Scanner resposta = new Scanner(System.in);
        // int numero;

        
        // DateFormat dateFormat = new SimpleDateFormat();

        // VeiculoPasseio v = new VeiculoPasseio("k6POG", "Fusion", 2019, 1000.0);
        // LocalDate date = LocalDate.of(1981, 03, 10);
        // FuncionarioAdministrativo funcs = new FuncionarioAdministrativo("Zé", date, "00000000");

        // v.cadastrarVeiculo("ford");
        // v.cadastrarVeiculo("palio");
        // v.numPlaca("G4BFR");

        ListaDeFuncionarios listaFuncionarios = new ListaDeFuncionarios();
        
        FuncionarioAdministrativo funcionarioAdministrativo = new FuncionarioAdministrativo("Administrativo1",  LocalDate.of(1930, 03, 10), "45236987412");
        FuncionarioManobrista funcionarioManobrista = new FuncionarioManobrista("Manobrista1", LocalDate.of(1981, 03, 10), "02900448042", "CNH", "A", LocalDate.of(2022, 05, 10));
        FuncionarioMotorista funcionarioMotorista  = new FuncionarioMotorista("Manobrista1", LocalDate.of(1981, 03, 10), "02900448042", "CNH", "A", LocalDate.of(2022, 05, 10), true, true);

        listaFuncionarios.cadastraFuncionario(funcionarioAdministrativo);
        listaFuncionarios.cadastraFuncionario(funcionarioManobrista);
        listaFuncionarios.cadastraFuncionario(funcionarioMotorista);
        
        System.out.println(listaFuncionarios);

	// do {
    //         System.out.println("Digite somente valores válidos.");
    //         System.out.println();           
    //         System.out.println("Digite 1 para cadastrar um funcionário. ");
    //         System.out.println("Digite 2 para listar os funcionários em ordem alfabética.");
    //         System.out.println("Digite 3 para buscar funcionário por CPF.");
    //         System.out.println("Digite 4 para cadastrar um veículo.");
    //         System.out.println("Digite 5 para listar os veículos em ordem de ano de fabricação.");
    //         System.out.println("Digite 6 para buscar veículo por placa.");
    //         System.out.println("Digite 7 para cadastrar fretamento do veículo.");
    //         System.out.println("Digite 8 para listar motoristas livres.");
    //         System.out.println("Digite 9 para listar o histórico dos fretamentos.");
    //         System.out.println("Digite 10 para listar os top 5 veículos mais lucrativos.");
    //         System.out.println();
    //         System.out.println("Digite 0 para encerrar o programa.");


    //          numero = resposta.nextInt();

    //             switch(numero) {

    //                 case 1: {
                        
    //                     do {
    //                         Scanner resposta2 = new Scanner(System.in);
    //                         String digitar;
 
    //                         System.out.println("Digite o nome de um funcionário para cadastrá-lo.");
    //                         digitar = resposta2.nextLine();
    //                         System.out.println("Digite um CPF para o funcionário.");
    //                         digitar = resposta2.nextLine();
                            
    //                         if(digitar.equals(funcs)) {
    //                             return false;
    //                         }
    //                         else {
    //                         funcs.cadastrarFunc(digitar);
    //                         }
    //                     } while(numero != 0);
    //                     break;
    //                 }

    //                 case 2: {
    //                     Collections.sort();
    //                     break;
    //                 }

    //                 case 3: {

    //                     break;
    //                 }
 
    //                 case 4: {

    //                     do {
    //                         Scanner resposta3 = new Scanner(System.in);
    //                         String digitar;

    //                         System.out.println("Digite o modelo de um veículo para cadastrá-lo.");
    //                         digitar = resposta3.nextLine();
    //                         if(digitar.equals()) {
    //                             return false;
    //                         }
    //                         else {
    //                             v.cadastrarVeiculo(digitar);
    //                         }


    //                     } while();


    //                     break;
    //                 }

    //                 case 5: {

    //                     break;
    //                 }

    //                 case 6: {

    //                     break;
    //                 }

    //                 case 7: {

    //                     break;
    //                 }

    //                 case 8: {

    //                     break;
    //                 }

    //                 case 9: {

    //                     break;
    //                 }

    //                 case 10: {

    //                     break;
    //                 }

    //                 case 0: {
    //                     System.out.println("Programa Encerrado!");
    //                 }

    //                 default: {                       
    //                     System.out.println("Erro. Valor inválido.");
    //                 }

    //             }


    //     }while(numero != 0);




















        










    }   
}
