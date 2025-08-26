public class Cantina {

    String nome;

    Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                System.out.println("Adicionado novo salgado: " + novoSalgado.nome);
                break;
            }
        }
    }
    public void mostraInfo() {
        for(int i = 0; i < salgados.length; i++) {
            System.out.println("Nome do Salgado: " + salgados[i].nome);
        }
    }
}
