public class Main {
    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("de Café", 20, "Café");
        BrownieNutella bwNutella = new BrownieNutella("de Nutella", 25, "Nutella");
        BrownieDoceDeLeite bwDoceLeite = new BrownieDoceDeLeite("de Doce de Leite",15, "Doce de leite");

        Comprador comprador = new Comprador("Comprador", 50.0);

        comprador.efetuarCompra(bwCafe);
        comprador.efetuarCompra(bwNutella);
        comprador.efetuarCompra(bwDoceLeite);
    }
}
