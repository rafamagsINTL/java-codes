import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("nome e vida do primeiro zumbi");
        String nome1 = input.nextLine();
        double vida1 = input.nextDouble();
        input.nextLine(); // Limpa o buffer

        System.out.println("nome e vida do segundo zumbi");
        String nome2 = input.nextLine();
        double vida2 = input.nextDouble();
        input.nextLine(); // Limpa o buffer

        zumbi z1 = new zumbi(nome1, vida1);
        zumbi z2 = new zumbi(nome2, vida2);

        System.out.println("Qual zumbi vai receber vida? (1 ou 2)");
        int escolha = input.nextInt();
        System.out.println("Quantidade de vida a transferir:");
        double vidaEscolhida = input.nextDouble();

        if (escolha == 1) {
            z2.transfereVida(z1, vidaEscolhida);
        } else if (escolha == 2) {
            z1.transfereVida(z2, vidaEscolhida);
        } else {
            System.out.println("Escolha inválida.");
        }

        System.out.println("vida atual de ambos:");
        z1.mostraVida();
        z2.mostraVida();

        input.close();
    }
}