import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int num1= scanner.nextInt();

        System.out.println("Ingresa el operador: ");
        char operador= scanner.next().charAt(0);

        System.out.println("Ingresa el segundo numero");
        int num2= scanner.nextInt();

        float resultado;
        
        switch (operador) {
            case '+':
                resultado= num1+num2;
                System.out.println(resultado);
                break;
                
                case '-':
                resultado=num1-num2;
                System.out.println(resultado);
                break;
                
                case '*':
                resultado=num1*num2;
                System.out.println(resultado);
                break;
                
                case '/':
                if (num2!=0) {
                    resultado=num1/num2;
                    System.out.println(resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre cero");
                }
                break;
        
            default:
                System.out.println("Operador no valido");
                break;
        }
        System.out.println(9/12);
        scanner.close();
    }
}
