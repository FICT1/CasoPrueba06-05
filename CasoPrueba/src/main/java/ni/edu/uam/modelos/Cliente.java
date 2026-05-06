package ni.edu.uam.modelos;
public class Cliente {
    private String nombre;
    public Cliente() {

    }
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Pedido realizarPedido() {
        System.out.println(nombre + " está realizando un pedido...");
        return new Pedido();
    }
}