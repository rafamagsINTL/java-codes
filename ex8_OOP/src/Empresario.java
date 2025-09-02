public class Empresario {

    private String nome;
    private long cnpj;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Empresario(String nome, long cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }
}
