import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criando as armas
        Arma arma1 = new Arma();
        arma1.nome = "raygun";
        arma1.poder = 50;
        arma1.resistencia = 4;
        arma1.descricao = "Arma laser poderosa";

        Arma arma2 = new Arma();
        arma2.nome = "mjolnir";
        arma2.poder = 30;
        arma2.resistencia = 4;
        arma2.descricao = "Martelo de um deus nordico";

        Arma arma3 = new Arma();
        arma3.nome = "guinsoo";
        arma3.poder = 10;
        arma3.resistencia = 10;
        arma3.descricao = "Lamina furiosa";

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem2.nome = "Tulio";
        personagem2.vida = 100;
        personagem2.arma = arma3;

        System.out.println("crie um personagem (nome e quantidade de vida): ");

        String nome = input.nextLine();
        int vida = input.nextInt();
        input.nextLine();

        personagem1.nome = nome;
        personagem1.vida = vida;

        //interface para escolher a arma
        System.out.println("escolha uma arma: (numero de 1 a 4)");
        System.out.println("1 - " + arma1.nome + ": dano = " + arma1.poder + " | resistencia = " + arma1.resistencia);
        System.out.println("2 - " + arma2.nome + ": dano = " + arma2.poder + " | resistencia = " + arma2.resistencia);
        System.out.println("3 - " + arma3.nome + ": dano = " + arma3.poder + " | resistencia = " + arma3.resistencia);
        System.out.println("4 - sem arma");

        int escolha1 = input.nextInt();
        input.nextLine();

        if (escolha1 == 1) {
            personagem1.arma = arma1;
        } else if (escolha1 == 2) {
            personagem1.arma = arma2;
        } else if (escolha1 == 3) {
            personagem1.arma = arma3;
        } else {
            personagem1.arma = null;
        }

        personagem1.usarArma();
        personagem2.tomarDano(personagem1.arma.poder);
    }
}

