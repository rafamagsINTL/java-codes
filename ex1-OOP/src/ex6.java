import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.println("Escolha um numero:");
            numAdivinhado = entrada.nextInt();

            if (numAdvinhado != numGerado) {
                System.out.println("Errou, tente novamente");
            } else if (numAdvinhado < numGerado) {
                System.out.println("o numero é menor que esse");
            } else {
                System.out.println("o número é maior que esse");
            }
        } while (numAdvinhado != numGerado);
        System.out.println("Voce acertou!");

        Scanner.close();
    }
}
