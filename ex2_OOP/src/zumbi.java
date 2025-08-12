public class zumbi {

    private String nome;
    private double vida;

    public zumbi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public void transfereVida(zumbi zumbiDestino, double vida) {
        if (vida > 0 && this.vida >= vida) {
            this.vida -= vida;
            zumbiDestino.vida += vida;
            System.out.println("Depósito " + vida + " realizado com sucesso.");
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