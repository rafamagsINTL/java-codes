public class Motor {

    String cilindradas;
    double velocidadeMaxima;

    public void mostraInfo(String nome){
        System.out.println(nome + " tem: " + cilindradas + " cilindradas");
        System.out.println(nome + " velocidade maxima: " + velocidadeMaxima);
    }
}
