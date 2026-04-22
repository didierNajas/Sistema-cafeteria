public class Ejercicio6
{
    public static void main(String[] args)
    {
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double sumaProductos = 0;

        System.out.println("Ejercicio 6: Menu del dia");
        for (int i = 0; i < productos.length; i++)
        {
            System.out.println("Producto: " + productos[i] + " precio: " + precios[i]);
            sumaProductos += precios[i];
        }

        double promedio = sumaProductos / productos.length;
        System.out.println("Promedio: " + promedio);
    }
}
