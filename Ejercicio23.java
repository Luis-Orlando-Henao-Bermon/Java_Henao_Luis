import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa la edad de tu perro");
        int edad= scanner.nextInt();

        double edadH=0.0;

        if (edad==1||edad==2) {
            edadH=edad*10.5;
        } else {
            edadH=edad-2;
            edadH=(edadH*4)+21;
        }
        
        System.out.println("La edad de tu perro es: "+edadH);
        scanner.close();
    }
}
