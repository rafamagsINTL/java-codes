package Computadores;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[] hardwareBasicos;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasicos = new HardwareBasico[10];
        this.memoriaUSB = null;
    }

    public void mostraPCConfigs() {
        System.out.println("PC " + marca);
        System.out.println("Preço: R$ " + preco);

        for (HardwareBasico hw : hardwareBasicos) {
            if (hw != null) {
                System.out.println(hw.getNome() + ": " + hw.getCapacidade());
            }
        }

        if (sistemaOperacional != null) {
            System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        }

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void addHardwareBasico(HardwareBasico hardware, int posicao) {
        if (posicao >= 0 && posicao < hardwareBasicos.length) {
            hardwareBasicos[posicao] = hardware;
        }
    }

    public float getPreco() {
        return preco;
    }
}