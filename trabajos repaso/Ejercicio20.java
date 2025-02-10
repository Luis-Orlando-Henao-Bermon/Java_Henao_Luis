
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el numero del mes al que quiere saber a que mes pertenece");
        int mes = scanner.nextInt();

        if (mes>=10 && mes <=12) {
            System.out.println("Se encuentra en cuarto trimestre");
        }
        else if (mes>=7 &&mes<=9) {
            System.out.println("Se encuentra en tercer trimestre");
        }
        else if (mes>=4 && mes<=6) {
            System.out.println("Se encuentra en segundo trimestre");
        }
        else if (mes>=1 && mes<=3) {
            System.out.println("Se encuentra en primer trimestre");
        }
        else{
            System.out.println("Error: Mes ingresado invalido");
        }
        
        scanner.close();

    }
}
