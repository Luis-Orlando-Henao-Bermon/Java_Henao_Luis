import java.util.Scanner;

public class TransppilacionAJava1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Indique su edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Indique si su sexo es masculino o femenino (M o F): ");
        String sexo = scanner.nextLine();
        

        int hpulsos;
        if (sexo.equals("M")||sexo.equals("m")) {
            hpulsos= (210-age)/10;
        }
        else{
            hpulsos= (220-age)/10;
        }
        System.out.println("El numero de pulsaciones que usted tienes es de: "+hpulsos );

        scanner.close();
    }
}