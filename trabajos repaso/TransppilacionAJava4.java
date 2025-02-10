import java.util.Scanner;

public class TransppilacionAJava4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el sueldo base del trabajador: ");
        int baseSueldo= scanner.nextInt();
        
        double leyPolitica=baseSueldo*0.01;
        double segSocial=baseSueldo*0.04;
        double segForzoso=baseSueldo*0.005;
        double box_ahorro=baseSueldo*0.05;

        double amount_total=baseSueldo-leyPolitica-segSocial-segForzoso-box_ahorro;

        
        System.out.println("El monto a descontar en caja de ahorro es: "+box_ahorro);
        System.out.println("El monto a descontar en la ley de politica es: "+leyPolitica);
        System.out.println("El valor a descontar del seguro forzoso es de: "+segForzoso);
        System.out.println("Valor de seguro social: "+segSocial);
        System.out.println("El valor a pagar al trabajador es de: "+amount_total);
        
        scanner.close();
    }
}
