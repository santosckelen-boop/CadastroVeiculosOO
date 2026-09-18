import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String mensagem) {

        while (true) {

            try {
                System.out.print(mensagem);

                String valor = scanner.nextLine();

                return Integer.parseInt(valor);

            } catch (Exception e) {
                System.out.println(
                    "Valor inválido! Digite um número inteiro."
                );
            }
        }
    }

    public static String readString(String mensagem) {

        System.out.print(mensagem);

        return scanner.nextLine();
    }
}