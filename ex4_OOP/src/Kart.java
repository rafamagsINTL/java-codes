public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    public void pular(){
        System.out.println(nome + " pulou");
    }

    public void soltarTurbo(){
        System.out.println(nome + " usou turbo");
    }

    public void fazerDrift(){
        System.out.println(nome + " fez drift");
    }
}
