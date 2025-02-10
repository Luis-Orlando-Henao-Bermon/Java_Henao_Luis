import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Indique la edad de la persona: ");
        int edad= scanner.nextInt();
        String clasificacion;

        if (edad>=65) {
            clasificacion="Adulto mayor";
            System.out.println("La persona es un "+clasificacion);
        }
        else if (edad>=18) {
            clasificacion="Adulto";
            System.out.println("La persona es un "+clasificacion);
        }
        else if (edad>=13) {
            clasificacion="Adolecente";
            System.out.println("La persona es un "+clasificacion);
        }
        else if (edad>=3) {
            clasificacion="Niño";
            System.out.println("La persona es un "+clasificacion);
        }
        else if (edad<0) {
            clasificacion="Error: Numero negativo.";
        }
        else{
            clasificacion="Bebé";
            System.out.println("La persona es un "+clasificacion);
        }

        
        scanner.close();
    }
}
