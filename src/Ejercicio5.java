public class Ejercicio5
{
    public static void main(String[] args)
    {
        int montoCaja = -200;

        System.out.println("Ejercicio 5: cajero");
        do
        {
            if (montoCaja <= 0)
            {
                System.out.println("El valor ingresado por el cajero no es valido");
                montoCaja = 10000;
            }
        }
        while (montoCaja <= 0);
        System.out.println("Caja abierta correctamente, con el valor inicial: " + montoCaja );
    }
}
