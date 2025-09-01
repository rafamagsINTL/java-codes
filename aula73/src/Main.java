import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();

        Cliente client1 = new Cliente();
        client1.setCpf(123);
        client1.setNome("CHris");
        Cliente clientes[] = new Cliente[10];
        clientes[0] = client1;

        conta.setClientes(clientes);

        System.out.println(conta.getClientes()[0].getNome());
        conta.getClientes()[0].getCpf();

    }
}