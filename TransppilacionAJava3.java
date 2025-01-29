
import java.util.Scanner;

public class TransppilacionAJava3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingrese el saldo inicial del ahorrador:");
        int saldoInicial = scanner.nextInt();

        System.out.println("Ingrese el numero de meses: ");
        int numberMounths=scanner.nextInt();

        double monto= 0.015*saldoInicial*numberMounths;

        double saldoFinal =saldoInicial+monto;
        
        System.out.println("El saldo final equivale a: "+saldoFinal);

        scanner.close();
    }
}
