import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura a la que quiere hacer la convercion");
        double temperatura=scanner.nextInt();

        System.out.println("Escoge el tipo de conversion que quieres hacer\n1. De Celsius a Fahrenheit\n2. Fahrenheit a Celsius");
        int opc=scanner.nextInt();

        double convercion;
        switch (opc) {
            case 1:
                convercion=(temperatura*9/5)+32;
                System.out.println("La convercsion de esta temperatura es: "+convercion);
                break;
                case 2:
                convercion=(temperatura-32)*5/9;
                System.out.println("La convercsion de esta temperatura es: "+convercion);
                
                break;
        
            default:
                System.out.println("Error: La opcion ingresada es incorrecta");
                break;
        }
        scanner.close();
    }
}
