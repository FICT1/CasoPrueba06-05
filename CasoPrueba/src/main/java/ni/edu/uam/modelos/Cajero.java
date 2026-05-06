package ni.edu.uam.modelos;
public class Cajero {
    private String nombre;

    public Cajero() {}

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public void registrarPedido(Pedido p) {
        System.out.println("Cajero " + nombre + " registró el pedido");
        System.out.println(p.mostrarPedido());
    }


    public void enviarACocina(Pedido p, Cocina cocina) {
        System.out.println("Cajero envía pedido a cocina...");
        cocina.procesarPedido(p);
    }

    public void notificarCliente(Cliente c) {
        System.out.println("Pedido listo, notificando a " + c.getNombre());
    }
}