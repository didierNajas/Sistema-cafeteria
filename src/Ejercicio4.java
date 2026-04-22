public class Ejercicio4
{
    public static void main(String[] args)
    {
        int cafeMolido = 50;
        int consumoPedido = 3;
        int numeroPedido = 1;

        while (cafeMolido >= 10)
        {
            cafeMolido = cafeMolido - consumoPedido;

            System.out.println("Pedido # " + numeroPedido + " total cafe molido: " + cafeMolido);
            numeroPedido++;

        }
    }
}
