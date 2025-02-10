import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el numero de horas que estuvo en el estacionamiento: ");
        int horas =scanner.nextInt();

        if (horas==0||horas==1) {
            System.out.println("El valor de la tarifa es: 5$");
        }
        else if (horas==2||horas==3) {
            System.out.println("El valor de la tarifa es: 10$");
        }
        else if (horas>=4) {
            System.out.println("El valor de la tarifa es: 15$");
        }
        else{
            System.out.println("Error: El numero de horas ingresado no es valido");
        }
        

        scanner.close(); 
    }
}
