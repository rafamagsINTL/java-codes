import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matriz;
        matriz = new int[2][2];

        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int x = rand.nextInt(2);
                matriz[i][j] = x;
            }
        }

        System.out.println("Escolha dois numeros: ");

        Scanner entrada = new Scanner(System.in);

        int digitado1 = entrada.nextInt();
        int digitado2 = entrada.nextInt();

        if(matriz[digitado1][digitado2] == 1){
            System.out.println("voce pisou em uma bomba em " + digitado1 + ";" + digitado2 + "!");
        }

        entrada.close();
    }
}

