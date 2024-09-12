package propuestos;
import java.util.Scanner;
public class Ejercicio3 {
 public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 6: ");
        int numero = lectura.nextInt();

        String numeroEnIngles;

        switch (numero) {
            case 1:
                numeroEnIngles = "one";
                break;
            case 2:
                numeroEnIngles = "two";
                break;
            case 3:
                numeroEnIngles = "three";
                break;
            case 4:
                numeroEnIngles = "four";
                break;
            case 5:
                numeroEnIngles = "five";
                break;
            case 6:
                numeroEnIngles = "six";
                break;
            default:
                numeroEnIngles = "Invalid number";
        }

        System.out.println("El numero en Ingles es: " + numeroEnIngles);
    }
}
