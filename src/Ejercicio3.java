import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la categoria: B= bebidas calientes, F = bebidas frías, C = Comida y P = postres" );

        char categoria = scanner.next().toUpperCase().charAt(0);
        String descripcion;
        int iva = -1;
        switch (categoria)
        {
            case 'B':
                descripcion = "Bebidas calientes";
                iva = 0;
                break;
            case 'F':
                descripcion = "Bebidas frías";
                iva = 5;
                break;
            case 'C':
                descripcion = "Comida";
                iva = 8;
                break;
            case 'P':
                descripcion = "Postres";
                iva = 8;
                break;
            default:
                descripcion = "Codigo no reconocido";
                break;
        }
        System.out.println("Codigo ingresado: " + categoria);
        System.out.println("Descripcion: " + descripcion);
        if (iva >= 0)
        {
            System.out.println("El iva es de: " + iva + '%');
        }
        else
        {
            System.out.println("No cuenta con iva");
        }
    }
}
