import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese su altura en cm");
        double altura=scanner.nextInt();
        altura=altura/100;
        altura=altura*altura;

        System.out.println("Ingrese su peso en kg");
        int peso = scanner.nextInt();

        double imc=peso/altura;

        if (imc>=30.00) {
            System.out.println("Su indice de masa corporal esta en: obesidad");
        }
        else if (imc>=25.00) {
            System.out.println("Su indice de masa corporal esta en: sobrepeso");
        }
        else if (imc>=18.5) {
            System.out.println("Su indice de masa corporal esta en: peso normal");
        }
        else {
            System.out.println("Su indice de masa corporal esta en: bajo peso");
            
        }
        scanner.close();
    }
}
