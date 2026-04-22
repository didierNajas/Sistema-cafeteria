//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1
{
    public static void main(String[] args)
    {
        String nombreProducto = "Café Americano";
        double precioUnitario = 3.50;
        int cantidadInventario = 20;
        boolean disponibleHoy = true;
        char codigoProducto = 'B';

        System.out.println("PRODUCTOS CAFETERIA");
        System.out.println(String.format("Nombre del productoes: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: %.2f", precioUnitario));
        System.out.println(String.format("Cantidad inventario: %d", cantidadInventario));
        System.out.println(String.format("Disponible hoy: %b", disponibleHoy));
        System.out.println(String.format("Codigo producto: %c", codigoProducto));

    }
}
