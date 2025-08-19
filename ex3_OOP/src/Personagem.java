public class Personagem {

    String nome;
    int vida;
    Arma arma;

    void usarArma() {
        if (arma != null) {
            System.out.println("Usou a arma " + arma.nome + " e deu " + arma.poder + " de dano");
            arma.resistencia -= 2;
        } else {
            System.out.println("Nenhuma arma equipada.");
        }
    }

    void tomarDano(int dano) {
        if (arma != null) {
            vida = vida - dano;
            System.out.println("O personagem " + nome + " tem " + vida + " de vida restante");
        } else {
            System.out.println("Nenhuma arma equipada.");
        }
    }
}