import java.util.Scanner;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int numGerado = rand.nextInt(10) + 1;
        int numAdvinhado;

        do {
            System.out.println("Escolha um número:");
            numAdvinhado = entrada.nextInt();

            if (numAdvinhado < numGerado) {
                System.out.println("O número é maior que esse.");
            } else if (numAdvinhado > numGerado) {
                System.out.println("O número é menor que esse.");
            } else {
                System.out.println("Você acertou!");
            }
        } while (numAdvinhado != numGerado);
        entrada.close();
    }
}
