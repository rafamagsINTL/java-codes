package Clientes;
import Computadores.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
        this.qtdComputadores = 0;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void setQtdComputadores(int qtd) {
        this.qtdComputadores = qtd;
    }

    public void mostraInfoCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (int i = 0; i < qtdComputadores; i++) {
            computadores[i].mostraPCConfigs();
            System.out.println();
        }
        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
