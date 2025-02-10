import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indique la edad de la persona: ");
        int edad= scanner.nextInt();
        String clasificacion;

        if (edad>=60) {
            clasificacion="Adulto mayor";
        }
        else if (edad>=18) {
            clasificacion="Adulto";
        }
        else if (edad>=13) {
            clasificacion="Adolecente";
        }
        else{
            clasificacion="Niño";
        }

        System.out.println("La persona es un "+clasificacion);
        scanner.close();
    }
}
