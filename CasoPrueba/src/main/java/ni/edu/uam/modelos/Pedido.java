package ni.edu.uam.modelos;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public StringBuilder mostrarPedido() {
        StringBuilder sb = new StringBuilder();
        for (Producto p : productos) {
            sb.append(p.mostrarInfo()).append("\n");
        }
        sb.append("Total: $").append(calcularTotal());
        return sb;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}