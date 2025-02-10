import java.util.Scanner;

public class TransppilacionAJava2{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.err.println("Ingrese la cantidad a invertir de la primera persona");
        int inv1=scanner.nextInt();


        System.err.println("Ingrese la cantidad a invertir de la segunda persona");
        int inv2=scanner.nextInt();


        System.err.println("Ingrese la cantidad a invertir de la tercera persona");
        int inv3=scanner.nextInt();

        System.err.println("");
        
        int invTotal=inv1+inv2+inv3;

        int p1 = inv1 *100/invTotal;
        int p2 = inv2 *100/invTotal;
        int p3 = inv3 *100/invTotal;

        System.err.println("El porcentaje que invierte la 1ra persona es de: "+p1+"%");    
        System.err.println("El porcentaje que invierte la 2da persona es de: "+p2+"%");    
        System.err.println("El porcentaje que invierte la 3ra persona es de: "+p3+"%");        

        scanner.close();
    }   
}