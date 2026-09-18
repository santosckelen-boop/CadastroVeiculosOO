import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {

    static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println();
            System.out.println(
                "======= Cadastro de Veículos OO ======="
            );
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Listar Veículos");
            System.out.println("3 - Consultar Veículo");
            System.out.println("0 - Sair");
            System.out.println();

            opcao = Input.readInt(
                "Escolha uma opção: "
            );

            switch (opcao) {

                case 1:
                    cadastrarVeiculo();
                    break;

                case 2:
                    listarVeiculos();
                    break;

                case 3:
                    consultarVeiculo();
                    break;

                case 0:
                    System.out.println(
                        "Sistema encerrado."
                    );
                    break;

                default:
                    System.out.println(
                        "Opção inválida!"
                    );
            }

        } while (opcao != 0);
    }


    public static void cadastrarVeiculo() {

        System.out.println();
        System.out.println(
            "======= Cadastro de Veículo ======="
        );

        String marca = Input.readString(
            "Marca: "
        );

        String modelo = Input.readString(
            "Modelo: "
        );

        int anoAtual =
            LocalDate.now().getYear();

        int ano = Input.readInt(
            "Ano: "
        );

        while (
            ano < 1900 ||
            ano > anoAtual + 1
        ) {

            System.out.println(
                "Ano inválido!"
            );

            System.out.println(
                "O ano deve estar entre 1900 e "
                + (anoAtual + 1) + "."
            );

            ano = Input.readInt(
                "Digite novamente o ano: "
            );
        }


        String placa = Input.readString(
            "Placa: "
        );

        placa = placa.trim();


        while (placaDuplicada(placa)) {

            System.out.println(
                "Já existe um veículo cadastrado "
                + "com essa placa."
            );

            placa = Input.readString(
                "Digite outra placa: "
            );

            placa = placa.trim();
        }


        Veiculo novoVeiculo =
            new Veiculo(
                marca,
                modelo,
                ano,
                placa
            );

        veiculos.add(novoVeiculo);

        System.out.println();
        System.out.println(
            "Veículo cadastrado com sucesso!"
        );
    }


    public static void listarVeiculos() {

        System.out.println();
        System.out.println(
            "======= Veículos Cadastrados ======="
        );

        if (veiculos.size() == 0) {

            System.out.println(
                "Nenhum veículo cadastrado."
            );

        } else {

            for (
                int i = 0;
                i < veiculos.size();
                i++
            ) {

                Veiculo veiculo =
                    veiculos.get(i);

                System.out.println();
                System.out.println(
                    "Veículo " + (i + 1)
                );

                System.out.println(
                    "Marca: "
                    + veiculo.getMarca()
                );

                System.out.println(
                    "Modelo: "
                    + veiculo.getModelo()
                );

                System.out.println(
                    "Ano: "
                    + veiculo.getAno()
                );

                System.out.println(
                    "Placa: "
                    + veiculo.getPlaca()
                );
            }
        }
    }


    public static void consultarVeiculo() {

        System.out.println();
        System.out.println(
            "======= Consulta de Veículo ======="
        );

        String placa =
            Input.readString(
                "Digite a placa do veículo: "
            );

        placa = placa.trim();

        Veiculo veiculoEncontrado = null;


        for (
            int i = 0;
            i < veiculos.size();
            i++
        ) {

            Veiculo veiculo =
                veiculos.get(i);

            if (
                veiculo
                    .getPlaca()
                    .equalsIgnoreCase(placa)
            ) {

                veiculoEncontrado =
                    veiculo;
            }
        }


        if (veiculoEncontrado != null) {

            System.out.println();
            System.out.println(
                "Veículo encontrado:"
            );

            System.out.println(
                "Marca: "
                + veiculoEncontrado
                    .getMarca()
            );

            System.out.println(
                "Modelo: "
                + veiculoEncontrado
                    .getModelo()
            );

            System.out.println(
                "Ano: "
                + veiculoEncontrado
                    .getAno()
            );

            System.out.println(
                "Placa: "
                + veiculoEncontrado
                    .getPlaca()
            );

        } else {

            System.out.println(
                "Nenhum veículo encontrado "
                + "com essa placa."
            );
        }
    }


    public static boolean placaDuplicada(
        String placa
    ) {

        boolean duplicada = false;


        for (
            int i = 0;
            i < veiculos.size();
            i++
        ) {

            Veiculo veiculo =
                veiculos.get(i);

            if (
                veiculo
                    .getPlaca()
                    .equalsIgnoreCase(placa)
            ) {

                duplicada = true;
            }
        }

        return duplicada;
    }
}