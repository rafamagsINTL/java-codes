public class Membro {

    private String nome;
    private String funcao;

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}