package factura;
import java.util.ArrayList;
public class Factura {
    private String nombreCliente;
    private ArrayList<String> productos;
    private ArrayList<Double> precios;
    public Factura(String nombreCliente, ArrayList<String> productos, ArrayList<Double> precios) {
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.precios = precios;
    }
    public void imprimirFactura() {
        // Crear encabezado de la factura
        String encabezado = "Factura de " + this.nombreCliente + "\n\n";

        // Crear la lista de productos comprados
        String listaProductos = "Productos:\n";
        for (int i = 0; i < this.productos.size(); i++) {
            String producto = this.productos.get(i);
            Double precio = this.precios.get(i);
            listaProductos += producto + ": $" + precio + "\n";
        }
        // Calcular el total de la factura
        double total = 0;
        for (Double precio : this.precios) {
            total += precio;
        }
        // Crear la cadena final de la factura
        String factura = encabezado + listaProductos + "\nTotal: $" + total;

        // Imprimir la factura en la consola
        System.out.println(factura);
    }
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<String>();
        productos.add("Arroz");
        productos.add("Frijoles");
        productos.add("Azucar");
        ArrayList<Double> precios = new ArrayList<Double>();
        precios.add(2.50);
        precios.add(1.50);
        precios.add(1.00);
        Factura factura = new Factura("Juan Perez", productos, precios);
        factura.imprimirFactura();
    }
}