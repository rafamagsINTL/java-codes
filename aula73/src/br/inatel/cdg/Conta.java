package br.inatel.cdg;

public class Conta {

    private Cliente clientes[];

    public Conta() {
        clientes = new Cliente[10];
    }

    private int numero;
    private float saldo;
    private float limite;

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){
        if(this.saldo >= quantia)
            this.saldo -= quantia;
        System.out.println("voce nao tem saldo suficiente");
    }

    public void deposita(float quantia){
        this.saldo += quantia;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
}
