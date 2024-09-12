
package propuestos;
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 10: ");
        int numero = lectura.nextInt();

        String numeroRomano = "";

        switch (numero) {
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default:
                numeroRomano = "Número inválido";
        }

        System.out.println("El número en romano es: " + numeroRomano);
    }
}
