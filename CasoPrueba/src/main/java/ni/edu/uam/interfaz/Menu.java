package ni.edu.uam.interfaz;

import ni.edu.uam.modelos.*;
import javax.swing.JOptionPane;

public class Menu {
    public void iniciar() {

        try {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
            if (nombreCliente == null) return;

            Cliente cliente = new Cliente(nombreCliente);
            Cajero cajero = new Cajero("Ana");
            Cocina cocina = new Cocina();

            Pedido pedido = cliente.realizarPedido();

            int opcion = 0;

            do {
                try {
                    String input = JOptionPane.showInputDialog(
                            "1. Agregar Hamburguesa ($5)\n" +
                                    "2. Agregar Papas ($2.5)\n" +
                                    "3. Agregar Refresco ($1.5)\n" +
                                    "4. Ver Pedido\n" +
                                    "5. Finalizar Pedido"
                    );

                    if (input == null) return;

                    opcion = Integer.parseInt(input);

                    switch (opcion) {
                        case 1:
                            pedido.agregarProducto(new Producto("Hamburguesa", 5));
                            JOptionPane.showMessageDialog(null, "Hamburguesa agregada");
                            break;

                        case 2:
                            pedido.agregarProducto(new Producto("Papas", 2.5));
                            JOptionPane.showMessageDialog(null, "Papas agregadas");
                            break;

                        case 3:
                            pedido.agregarProducto(new Producto("Refresco", 1.5));
                            JOptionPane.showMessageDialog(null, "Refresco agregado");
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, pedido.mostrarPedido().toString());
                            break;

                        case 5:
                            JOptionPane.showMessageDialog(null, "Finalizando pedido...");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido");
                }

            } while (opcion != 5);

            JOptionPane.showMessageDialog(null, "Cajero registrando pedido...");
            JOptionPane.showMessageDialog(null, pedido.mostrarPedido().toString());

            JOptionPane.showMessageDialog(null, "Enviando pedido a cocina...");
            cocina.procesarPedido(pedido);

            JOptionPane.showMessageDialog(null, "Pedido listo para " + cliente.getNombre());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema");
        }
    }
}