public class Main {
    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Pedro";
        p2.nome = "Maria";

        p1.vilao = true;
        p2.vilao = false;

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome = "gtr";
        k2.nome = "911";

        k1.piloto = p1;
        k2.piloto = p2;

        k1.motor.cilindradas = "50";
        k2.motor.cilindradas = "100";

        k1.motor.velocidadeMaxima = 500;
        k2.motor.velocidadeMaxima = 250;

        p1.soltaSuperPoder();
        p2.soltaSuperPoder();

        k1.pular();
        k2.pular();

        k1.soltarTurbo();
        k2.soltarTurbo();

        k1.fazerDrift();
        k2.fazerDrift();

        k1.motor.mostraInfo(k1.nome);
        k2.motor.mostraInfo(k2.nome);
    }
}
