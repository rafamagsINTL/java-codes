import Clientes.Cliente;
import Computadores.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matricula = 2180;

        Computador promocao1 = new Computador("Apple", matricula, new SistemaOperacional("macOS Sequoia", 64));
        promocao1.addHardwareBasico(new HardwareBasico("Pentium Core i3", 2200), 0);
        promocao1.addHardwareBasico(new HardwareBasico("Memória RAM", 8), 1);
        promocao1.addHardwareBasico(new HardwareBasico("HD", 500), 2);
        promocao1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador promocao2 = new Computador("Samsung", matricula + 1234, new SistemaOperacional("Windows 8", 64));
        promocao2.addHardwareBasico(new HardwareBasico("Pentium Core i5", 3370), 0);
        promocao2.addHardwareBasico(new HardwareBasico("Memória RAM", 16), 1);
        promocao2.addHardwareBasico(new HardwareBasico("HD", 1000), 2);
        promocao2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador promocao3 = new Computador("Dell", matricula + 5678, new SistemaOperacional("Windows 10", 64));
        promocao3.addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500), 0);
        promocao3.addHardwareBasico(new HardwareBasico("Memória RAM", 32), 1);
        promocao3.addHardwareBasico(new HardwareBasico("HD", 2000), 2);
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        Cliente cliente = new Cliente("Rafael", "12345678901");
        Computador[] carrinho = cliente.getComputadores();
        int qtdCompras = 0;
        int opcao;

        do {
            System.out.println("Escolha uma promoção:");
            System.out.println("1 - Promoção 1 (Apple) - R$ " + promocao1.getPreco());
            System.out.println("2 - Promoção 2 (Samsung) - R$ " + promocao2.getPreco());
            System.out.println("3 - Promoção 3 (Dell) - R$ " + promocao3.getPreco());
            System.out.println("0 - Finalizar compra");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carrinho[qtdCompras] = promocao1;
                    qtdCompras++;
                    System.out.println("Computador Apple adicionado ao carrinho!");
                    break;
                case 2:
                    carrinho[qtdCompras] = promocao2;
                    qtdCompras++;
                    System.out.println("Computador Samsung adicionado ao carrinho!");
                    break;
                case 3:
                    carrinho[qtdCompras] = promocao3;
                    qtdCompras++;
                    System.out.println("Computador Dell adicionado ao carrinho!");
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        cliente.setQtdComputadores(qtdCompras);
        ProcessarPedido.helper(cliente);
        sc.close();
    }
}
