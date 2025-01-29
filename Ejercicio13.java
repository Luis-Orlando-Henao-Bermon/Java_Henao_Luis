import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de dolares a la que le quieres hacer la conversion");
        int dollar=scanner.nextInt();

        System.out.println("Con que moneda quieres hacer la conversion\n1. Euros\n2. Pesos colombianos\n3. Yenes");

        int opc =scanner.nextInt();

        double conversion;

        switch (opc) {
            case 1:
                conversion=dollar*0.85;
                System.out.println(conversion);
                
                break;
            case 2:
                conversion=dollar*4100;
                System.out.println(conversion);
                
                break;
            case 3:
                conversion=dollar*110;
                System.out.println(conversion);
                break;
        
            default:
            System.out.println("Opcion invalida");
                break;
        }
        
        scanner.close();
    }
}
