import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingresa la calificacion: ");
        int calificacion = scanner.nextInt();

        String resultado;
        if (calificacion>=90) {
            resultado="A";
        } 
        else  if (calificacion>=80) {
            resultado="B";
        }
        else  if (calificacion>=70) {
            resultado="C";
        }
        else  if (calificacion>=60) {
            resultado="D";
        }
        else {
            resultado="F";
        }
        
        System.out.println("El resultado es: "+resultado);
        
        scanner.close();

    }
}
