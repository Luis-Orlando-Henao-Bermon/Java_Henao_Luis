import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer lado del triangulo");
        int lado1=scanner.nextInt();

        System.out.println("Ingresa el segundo lado del triangulo");
        int lado2=scanner.nextInt();

        System.out.println("Ingresa el tercer lado del triangulo");
        int lado3=scanner.nextInt();

        if ((lado1==lado2) && (lado1==lado3)) {
            System.out.println("El triángulo es Equilátero");
        } 
        else if ((lado1==lado2)||(lado1==lado3)||(lado2==lado3)) {
            System.out.println("El triángulo es isósceles");
        }
        else {
            System.out.println("El triángulo es Escaleno");
        }
        scanner.close();
    }
}
