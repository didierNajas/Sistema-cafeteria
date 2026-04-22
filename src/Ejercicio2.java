public class Ejercicio2
{
    public static void main(String args[])
    {
        double limiteDescuento = 30000;
        double subtotal = 42500;
        double descuento = 0.15;
        double totalPagar;
        double valorDescuento;
        boolean resultado;

        if (limiteDescuento <= subtotal)
        {
            resultado = true;
            valorDescuento = subtotal * descuento;
        }
        else
        {
            resultado = false;
            valorDescuento = 0;
        }

        totalPagar = subtotal - valorDescuento;

        System.out.println("Ejercicio 2 OPERADORES");
        System.out.printf("Subtotal: $%,.0f%n", subtotal);
        System.out.printf("Resultado: %b", resultado);
        System.out.printf("Valor del descuento $%,.0f%n",  valorDescuento);
        System.out.printf("Total a pagar: $%,.0f%n", totalPagar);
    }
}
