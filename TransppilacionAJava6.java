import java.util.Scanner;

public class TransppilacionAJava6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingrese la cantidad");
        int years=scanner.nextInt();

        int bn1=100000;

        int bnFinal;
        
        if (years>1) {
            bnFinal=(years-1)*120000+bn1;
        }
        else{
            bnFinal=bn1;
        }

        System.out.println("El bono a pagar es de: "+bnFinal+"$");
        
        scanner.close();
    }
}
