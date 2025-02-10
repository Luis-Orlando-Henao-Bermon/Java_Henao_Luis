import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos lados tiene la figura");
        int lados = scanner.nextInt();

        if (lados==3) {
            System.out.println("La figura es un triángulo");
        }
        else if (lados==4) {
            System.out.println("La figura es un cuadrado o rectángulo");
        }
        else if (lados==5) {
            System.out.println("La figura es un pentágono");
        }
        else if (lados==6) {
            System.out.println("La figura es un hexágono");
        }
        else{
            System.out.println("Figura no soportada");
        }

        scanner.close();
    }
}
