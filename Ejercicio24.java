import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el índice de calidad del aire");
        int ica = scanner.nextInt();

        if (ica>300) {
            System.out.println("El ICA es: Peligroso");
        }
        else if (ica>200) {
            System.out.println("El ICA es: Muy no saludable");
        }
        else if (ica>150) {
            System.out.println("El ICA es: No saludable");
        }
        else if (ica>100) {
            System.out.println("El ICA es: No saludable para grupos sensibles ");
        }
        else if (ica>50) {
            System.out.println("El ICA es: Moderado");
        }
        else if (ica>=0) {
            System.out.println("El ICA es: Bueno");
        }
        else{
            System.out.println("Error: Has ingresado numeros negativos");
        }
        
        scanner.close(); 
    }
}
