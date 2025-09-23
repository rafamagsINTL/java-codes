public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaDoceDeLeite() {
        System.out.println(super.nome +" adicionando mais doce de leite!!");

    }
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de doce de leite sendo adicionado");
    }

}
