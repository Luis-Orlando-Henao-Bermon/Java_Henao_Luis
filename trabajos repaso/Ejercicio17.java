import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Indique la velocidad del vehiculo en km/h");
        int velocidad=scanner.nextInt();

        if (velocidad>120) {
            System.out.println("La velocidad del vehiculo es: Muy rápido");
        } 
        else if (velocidad>60) {
            System.out.println("La velocidad del vehiculo es: Rápido");
        }
        else if (velocidad>20) {
            System.out.println("La velocidad del vehiculo es: Moderado");
        }
        else if (velocidad<0) {
            System.out.println("Error: Numero negativo");
        }
        else {
            System.out.println("La velocidad del vehiculo es: Muy lento");
            
        }
        scanner.close();
    }
}
