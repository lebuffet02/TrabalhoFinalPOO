import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        ListaDeFuncionarios listaFuncionarios = new ListaDeFuncionarios();
        ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
        List <FuncionarioMotorista> func = new ArrayList<>();

        System.out.println(listaFuncionarios);
        int numero;

        do {
            System.out.println("Digite somente valores válidos.");
            System.out.println();
            System.out.println("Digite 1 para cadastrar funcionários. ");
            System.out.println("Digite 2 para listar os funcionários em ordem alfabética.");
            System.out.println("Digite 3 para buscar funcionário por CPF.");
            System.out.println("Digite 4 para cadastrar veículos.");
            System.out.println("Digite 5 para listar os veículos em ordem de ano de fabricação.");
            System.out.println("Digite 6 para buscar veículo por placa.");
            System.out.println("Digite 7 para cadastrar fretamento do veículo.");
            System.out.println("Digite 8 para listar motoristas livres.");
            System.out.println("Digite 9 para listar o histórico dos fretamentos.");
            System.out.println("Digite 10 para listar os top 5 veículos mais lucrativos.");
            System.out.println();
            System.out.println("Digite 0 para encerrar o programa.");

            numero = resposta.nextInt();

            switch (numero) {
                case 1: {
                    FuncionarioAdministrativo funcionarioAdministrativo = new FuncionarioAdministrativo(
                            "A administrativo", LocalDate.of(1930, 03, 10), "45236987412");
                    FuncionarioManobrista funcionarioManobrista = new FuncionarioManobrista("C Manobrista",
                            LocalDate.of(1981, 03, 10), "02900448042", "CNH", "A", LocalDate.of(2022, 05, 10));
                    FuncionarioMotorista funcionarioMotorista = new FuncionarioMotorista("B Motorista",
                            LocalDate.of(1981, 03, 10), "02900448042", "CNH", "A", LocalDate.of(2022, 05, 10), true,
                            true);
                    listaFuncionarios.cadastraFuncionario(funcionarioAdministrativo);
                    listaFuncionarios.cadastraFuncionario(funcionarioManobrista);
                    listaFuncionarios.cadastraFuncionario(funcionarioMotorista);
                    System.out.println(listaFuncionarios);
                    break;
                }

                case 2: {
                    Collections.sort();
                   


                    break;
                }

                case 3: {
                    String cpf = "02900448042";
                    System.out.println(listaFuncionarios.buscaFuncionarioPorCPF(cpf));
                    break;
                }

                case 4: {
                    VeiculoPasseio veiculoPasseio = new VeiculoPasseio("000-XXX", "Ford Fiesta", 2020, 1084);
                    VeiculoTransporteCarga veiculoTransporteCarga = new VeiculoTransporteCarga("111-ZZZ",
                            "Mercedes Benz L-1620", 2020, 6540, 23000, 3);
                    VeiculoTransportePassageiro veiculoTransportePassageiro = new VeiculoTransportePassageiro("222-WWW",
                            "Volare DW9 Euro V", 2012, 9400, 33);
                    listaDeVeiculos.cadastraVeiculo(veiculoPasseio);
                    listaDeVeiculos.cadastraVeiculo(veiculoTransporteCarga);
                    listaDeVeiculos.cadastraVeiculo(veiculoTransportePassageiro);
                    System.out.println(listaDeVeiculos);

                    break;
                }

                case 5: {

                    break;
                }

                case 6: {
                    String numPlaca = "222-WWW";
                    System.out.println(listaDeVeiculos.buscaVeiculoPorPlaca(numPlaca));
                    break;
                }

                case 7: {
                    FretamentoCaminhoes fretamentoCaminhoes = new FretamentoCaminhoes(1, listaDeVeiculos.buscaVeiculoPorPlaca("111-ZZZ"), listaDe Fu, dataInicio, dataTermino, distanciaPercorrida, cargaPeriogosa);
                    break;
                }

                case 8: {
                    FuncionarioMotorista motorista = new FuncionarioMotorista("B Motorista", LocalDate.of(1981, 03, 10), "02900448042", "CNH", "A", LocalDate.of(2022, 05, 10), true, true);
                    motorista.motoristasLivres();
                    break;
                }

                case 9: {

                    break;
                }

                case 10: {

                    break;
                }

                case 0: {
                    System.out.println("Programa Encerrado!");
                    System.exit(1);
                }

                default: {
                    System.out.println("Erro. Valor inválido.");
                }

            }
        } while (numero != 0);
    }
}
