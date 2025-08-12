public class Zumbi {

    private String nome;
    private double vida;

    public Zumbi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public void transfereVida(Zumbi zumbiDestino, double vida) {
        if (vida > 0 && this.vida >= vida) {
            this.vida -= vida;
            zumbiDestino.vida += vida;
            System.out.println(vida + " de vida transferida.");
        } else {
            System.out.println("Vida insuficiente.");
        }
    }

    public void mostraVida() {
        System.out.println("Nome: " + nome + " | Vida: " + vida);
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}