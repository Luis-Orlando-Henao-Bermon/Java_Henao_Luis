import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        
System.out.println("Cuantos sensores hay activados");
        int sensores = scanner.nextInt();

        if (sensores>=6) {
            System.out.println("Alerta alta");
        }
        else if (sensores>=3) {
            System.out.println("Alerta media");
        }
        else if (sensores>=1) {
            System.out.println("Alerta baja");
        }
        else{
            System.out.println("Error: Numero ingresado negativo");
        }
        
        scanner.close();
    }
}
