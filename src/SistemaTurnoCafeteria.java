public class SistemaTurnoCafeteria
{
    public static void main(String args[])
    {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        int unideadesDisponiblesBrownie = 10;

        for (int i = 0; i < pedidoProducto.length; i++)
        {
            int numeroPedido = pedidoProducto[i];
            String nombreProducto = nombres [pedidoProducto [i]];
            int cantidad = pedidoCantidad [i];
            double subtotal = precios [pedidoProducto[i]] * cantidad;
            char categoria = categorias [pedidoProducto [i]];
            String descripcion;

            switch (categoria)
            {
                case 'B':
                    descripcion = "Bebidas calientes";
                    break;
                case 'F':
                    descripcion = "Bebidas frías";
                    break;
                case 'C':
                    descripcion = "Comida";
                    break;
                case 'P':
                    descripcion = "Postres";
                    break;
                default:
                    descripcion = "Codigo no reconocido";
                    break;
            }

            System.out.println("Numero pedido: " + (i+1));
            System.out.println("Nombre producto: " + nombreProducto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Categoria: " + categoria);
            System.out.println("Descripcion: " + descripcion);
            System.out.println("El subtotal es: " + subtotal);

            if (pedidoProducto[i] == 4 && unideadesDisponiblesBrownie < cantidad)
            {
                System.out.println("El producto se encuentra agotado");
            }
            else if (pedidoProducto[i] == 4 && unideadesDisponiblesBrownie > cantidad)
            {
                unideadesDisponiblesBrownie -= cantidad;
                System.out.println("Invetario disponible del brownie: " + unideadesDisponiblesBrownie);
            }

            double valorFinal = subtotal;
            if (subtotal >= 12000)
            {
                double descuento = subtotal * 0.10;
                valorFinal = subtotal - descuento;
                System.out.println("Descuento: " + descuento);
            }
            else
            {
                System.out.println("No aplica el descuento");
            }

            System.out.println("Valor total: " + valorFinal);
            System.out.println();
        }
    }
}
