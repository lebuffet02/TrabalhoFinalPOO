import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        ListaDeFuncionarios listaFuncionarios = new ListaDeFuncionarios();
        ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
        ListaDeFretamentos listaDeFretamentos = new ListaDeFretamentos();
        ArrayList<String> f = new ArrayList<String>();
        ArrayList<String> veic = new ArrayList<String>();

        System.out.println(listaFuncionarios);
        int numero;
        FuncionarioMotorista funcionarioMotorista = null;
        FuncionarioAdministrativo funcionarioAdministrativo = null;
        FuncionarioManobrista funcionarioManobrista = null;

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
            System.out.println("Digite 11 para listar motoristas livres.");
            System.out.println();
            System.out.println("Digite 0 para encerrar o programa.");

            numero = resposta.nextInt();

            switch (numero) {
                case 1: {
                    funcionarioAdministrativo = new FuncionarioAdministrativo("A administrativo", LocalDate.of(1930, 03, 10), "75168965008");
                    funcionarioManobrista = new FuncionarioManobrista("Manobrista",LocalDate.of(1981, 03, 10), "13942506068", "07470296522", "A", LocalDate.of(2022, 05, 10));
                    funcionarioMotorista = new FuncionarioMotorista("Motorista", LocalDate.of(1981, 03, 10),"06766922060", "55615676392", "C", LocalDate.of(2022, 05, 10), true, true);
                    listaFuncionarios.cadastraFuncionario(funcionarioAdministrativo);
                    listaFuncionarios.cadastraFuncionario(funcionarioManobrista);
                    listaFuncionarios.cadastraFuncionario(funcionarioMotorista);
                    System.out.println(listaFuncionarios);
                    break;
                }

                case 2: {

                    f.add("João");
                    f.add("Lucas");
                    f.add("Arthur");
                    f.add("Kafruni");
                    f.add("Zé");

                    Collections.sort(f);
                    System.out.println(f);
                    break;
                }

                case 3: {
                    String cpf = "02900448042";
                    System.out.println(listaFuncionarios.buscaFuncionarioPorCPF(cpf));
                    break;
                }

                case 4: {
                    VeiculoPasseio veiculoPasseio = new VeiculoPasseio("000-XXX", "Ford Fiesta", 2020, 1084);
                    VeiculoTransporteCarga veiculoTransporteCarga = new VeiculoTransporteCarga("111-ZZZ","Mercedes Benz L-1620", 2020, 6540, 23000, 3);
                    VeiculoTransportePassageiro veiculoTransportePassageiro = new VeiculoTransportePassageiro("222-WWW","Volare DW9 Euro V", 2012, 9400, 33);
                    listaDeVeiculos.cadastraVeiculo(veiculoPasseio);
                    listaDeVeiculos.cadastraVeiculo(veiculoTransporteCarga);
                    listaDeVeiculos.cadastraVeiculo(veiculoTransportePassageiro);
                    System.out.println(listaDeVeiculos.getLista());

                    break;
                }

                case 5: {

                    veic.add("Celta");
                    veic.add("Corsa");
                    veic.add("Fusion");
                    veic.add("Z4");

                    Collections.sort(veic);
                    System.out.println(veic);

                    break;
                }

                case 6: {
                    String numPlaca = "222-WWW";
                    System.out.println(listaDeVeiculos.buscaVeiculoPorPlaca(numPlaca));
                    break;
                }

                case 7: {
                    VeiculoTransporteCarga veiculosTrans = new VeiculoTransporteCarga("HXG-6032", "Scania R 440 LA",1991, 10000.0, 3500.0, 6);
                    VeiculoTransportePassageiro veiculosPassag = new VeiculoTransportePassageiro("SGX-1267","B731 Karosa", 1981, 9000.0, 22);
                    VeiculoTransportePassageiro veiculoTransportePassageiro = new VeiculoTransportePassageiro("222-WWW","Volare DW9 Euro V", 2012, 9400, 33);

                    FuncionarioMotorista funcionarioMotoristaCaminhao = new FuncionarioMotorista("Motorista Caminhao", LocalDate.of(1981, 03, 10),"11888792000", "18878759634", "C", LocalDate.of(2022, 05, 10), true, true);
                    FuncionarioMotorista funcionarioMotoristaVeiculo = new FuncionarioMotorista("Motorista Passeio", LocalDate.of(1981, 03, 10),"68846860063", "45936245203", "B", LocalDate.of(2022, 05, 10), true, true);
                    FuncionarioMotorista funcionarioMotoristaOnibus = new FuncionarioMotorista("Motorista Onibus", LocalDate.of(1981, 03, 10),"71073099008", "91648501858", "D", LocalDate.of(2022, 05, 10), true, true);

                    FretamentoCaminhoes fretamentoCaminhoes = new FretamentoCaminhoes(1, veiculosTrans, funcionarioMotoristaCaminhao, LocalDate.of(2020, 12, 7), LocalDate.of(2020, 12, 11), 500.0, true);
                    FretamentoOnibus fretamentoOnibus = new FretamentoOnibus(2, veiculoTransportePassageiro, funcionarioMotoristaOnibus,  LocalDate.of(2020, 12, 8), LocalDate.of(2022, 12, 18), 4000.0);
                    FretamentoVeiculos fretamentoVeiculos = new FretamentoVeiculos(3, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 12, 7),   LocalDate.of(2020, 12, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos2 = new FretamentoVeiculos(4, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 10, 5),  LocalDate.of(2020, 10, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos3 = new FretamentoVeiculos(5, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 10, 6),  LocalDate.of(2020, 10, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos4 = new FretamentoVeiculos(6, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 10, 7),  LocalDate.of(2020, 10, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos5 = new FretamentoVeiculos(7, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 10, 8),  LocalDate.of(2020, 10, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos6 = new FretamentoVeiculos(8, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 10, 9),  LocalDate.of(2020, 10, 11), 200);
                    FretamentoVeiculos fretamentoVeiculos7 = new FretamentoVeiculos(9, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 11, 10), LocalDate.of(2020, 12, 2), 200);
                    FretamentoVeiculos fretamentoVeiculos8 = new FretamentoVeiculos(10, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 11, 11), LocalDate.of(2020, 12, 3), 200);
                    FretamentoVeiculos fretamentoVeiculos9 = new FretamentoVeiculos(11, veiculosPassag, funcionarioMotoristaVeiculo,  LocalDate.of(2020, 11, 12), LocalDate.of(2020, 12, 4), 200);

                    listaDeFretamentos.cadastraFretamentos(fretamentoCaminhoes);
                    listaDeFretamentos.cadastraFretamentos(fretamentoOnibus);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos2);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos3);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos4);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos5);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos6);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos7);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos8);
                    listaDeFretamentos.cadastraFretamentos(fretamentoVeiculos9);

                    System.out.println(listaDeFretamentos.getLista());
                    break;
                }

                case 8: {
                    if(listaDeVeiculos.getLista().size() == 0) {
                        VeiculoPasseio veiculoPasseio = new VeiculoPasseio("000-XXX", "Ford Fiesta", 2020, 1084);
                        VeiculoTransporteCarga veiculoTransporteCarga = new VeiculoTransporteCarga("111-ZZZ","Mercedes Benz L-1620", 2020, 6540, 23000, 3);
                        VeiculoTransportePassageiro veiculoTransportePassageiro = new VeiculoTransportePassageiro("222-WWW","Volare DW9 Euro V", 2012, 9400, 33);
                        listaDeVeiculos.cadastraVeiculo(veiculoPasseio);
                        listaDeVeiculos.cadastraVeiculo(veiculoTransporteCarga);
                        listaDeVeiculos.cadastraVeiculo(veiculoTransportePassageiro);
                    }
                    System.out.println(listaDeFretamentos.listaVeiculosLivres(listaDeVeiculos));
                    break;
                }
                case 9: {
                    System.out.println(listaDeFretamentos.listaHistoricoDeFretamentos());
                    break;
                }

                case 11: {
                    System.out.println(listaDeFretamentos.listaMotoristasLivres(listaFuncionarios));
                    
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
