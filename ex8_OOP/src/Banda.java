import java.util.Arrays;

public class Banda {

    private String nome;
    private String genero;
    private Musica[] musicas;
    private Membro[] membros;
    private Empresario empresario;

    public void addMusicaNova(Musica musica){
            for(int i = 0; i < musicas.length; i++){
                if(musicas[i] == null){
                    musicas[i] = musica;
                    break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
            for(int i = 0; i < membros.length; i++){
                if(membros[i] == null){
                    membros[i] = membro;
                    break;
            }
        }
    }

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
        this.musicas = new Musica[5];
        this.membros = new Membro[5];
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome + " | " + " Genero: " + this.genero);

        System.out.print("Musicas: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.print(musicas[i].getNome() + " (" + musicas[i].getDuracao() + " min)");
            }
        }
        System.out.println();

        System.out.print("Membros: ");
        for(int i = 0; i < membros.length; i++){
            if(membros[i] != null){
                System.out.print(membros[i].getNome() + " (" + membros[i].getFuncao() + ") ");
            }
        }
        System.out.println();

        if(empresario != null){
            System.out.println("Empresario: " + empresario.getNome() + " (CNPJ: " + empresario.getCnpj() + ")");
        } else {
            System.out.println("Empresario: Nenhum empresario definido");
        }
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public Membro[] getMembros() {
        return membros;
    }

    public Empresario getEmpresarios() {
        return empresario;
    }
}
