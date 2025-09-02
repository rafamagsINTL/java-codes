public class Main {
    public static void main(String[] args) {

       Empresario emp = new Empresario("Danny Goldberg" , 4225252642L);
       Banda banda1 = new Banda("Nirvana", "Rock alternativo");
       Musica mus1 = new Musica("In Bloom", 3.59);
       Membro memb1 = new Membro("Kurt Cobain", "Vocalista/guitarrista");
       Membro memb2 = new Membro("Dave Grohl", "Baterista");
       Membro memb3 = new Membro("Krist Novoselic", "Baixista");
       
       banda1.setEmpresario(emp);
       banda1.addMusicaNova(mus1);
       banda1.addMembroNovo(memb1);
       banda1.addMembroNovo(memb2);
       banda1.addMembroNovo(memb3);

       banda1.mostraInfo();

    }
}
