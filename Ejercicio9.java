import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingrese el numero del mes (1 - 12)");
        int mes=scanner.nextInt();

        if (mes>=3 && mes<=5) {
            System.out.println("La estacion es primavera");
        } 
        else if (mes>=6 && mes<= 8) {
            System.out.println("La estacion es verano");
        }    
        else if (mes>=9 && mes<=11) {
            System.out.println("La estacion es otoño");
        }    
        else if (mes==1|| mes == 2 ||mes==12) {
            System.out.println("La estacion es invierno");
        }    
        else {
            System.out.println("Error: El mes ingresado es incorrecto");
        }
        scanner.close();
    }
}
