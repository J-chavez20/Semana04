
package propuestos;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 5: ");
        int numero = lectura.nextInt();

        String numeroEnPalabra;

        switch (numero) {
            case 1:
                numeroEnPalabra = "uno";
                break;
            case 2:
                numeroEnPalabra = "dos";
                break;
            case 3:
                numeroEnPalabra = "tres";
                break;
            case 4:
                numeroEnPalabra = "cuatro";
                break;
            case 5:
                numeroEnPalabra = "cinco";
                break;
            default:
                numeroEnPalabra = "Número inválido";
        }

        System.out.println("El número ingresado en palabras es: " + numeroEnPalabra);
    }
}
