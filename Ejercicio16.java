import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("ingrese el numero que quieres saber si es divisible entre 2 y 3");
        int numero=scanner.nextInt();

        if (numero%2==0 &&numero%3==0) {
            System.out.println("Es divisible por 2 y por 3.");
        }
        else if (numero%2==0 && numero%3!=0) {
            System.out.println("Es divisible solo por 2.");
        }
        else if (numero%2!=0 && numero%3==0) {
            System.out.println("Es divisible solo por 3.");
        }
        else if (numero<0) {
            System.out.println("Error: Numero negativo");
        }
        else {
            System.out.println("No es divisible por ninguno de los dos.");
            
        }

        
        scanner.close();
    }
}
