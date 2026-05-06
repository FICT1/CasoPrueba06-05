package ni.edu.uam.modelos;

public class Cocina {

    public void procesarPedido(Pedido p) {
        System.out.println("Cocina está preparando el pedido...");
        System.out.println(p.mostrarPedido());
    }
}
