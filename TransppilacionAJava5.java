import java.util.Scanner;

public class TransppilacionAJava5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Escriba cuantas palabras hay en total: ");
        int P= scanner.nextInt();

        System.out.println("Escriba cuantos cm hay en total: ");
        int C=scanner.nextInt();

        System.out.println("Escriba cuantos colores se han usado en total");
        int R = scanner.nextInt(); 

        int PS=P*20000;
        int CMS=C*15000;
        int CRS=R*25000;
        int precio= PS+CMS+CRS;
        System.out.println("El precio total es de: "+precio+"$");

        scanner.close();
    }
}