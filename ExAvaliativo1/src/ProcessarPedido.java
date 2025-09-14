import Clientes.Cliente;

public class ProcessarPedido {
    public static void helper(Cliente cliente) {
        System.out.println("Pedido enviado...");
        cliente.mostraInfoCliente();
    }
}