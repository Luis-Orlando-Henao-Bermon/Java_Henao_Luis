import java.time.Year;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el año que quieres saber si es bisiesto");
        int anyo =scanner.nextInt();

        if (Year.isLeap(anyo)) {
            System.out.println("El año "+anyo+" es bisiesto");
        }
        else{
            System.out.println("El año "+anyo+" no es bisiesto");
        }
        scanner.close();
    }
}
