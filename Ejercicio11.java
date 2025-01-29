import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Que tipo de conversion quieres hacer\nKilómetros a millas \nCelsius a Fahrenheit \nKilogramos a libras");

        String conversion =scanner.nextLine();

        while (conversion.toLowerCase().matches(".*kilometros a millas.*")==false&&conversion.matches(".*celsius a fahrenheit.*")==false&&conversion.matches(".*kilogramos a libras.*")==false) {
        
            System.out.println("Por favor ingresa una conversion valida");
            conversion =scanner.nextLine();
        }

        System.out.println("Ingresa el numero al que le quieres hacer la conversion");
        int numeroC =scanner.nextInt();

        double conversionF=0.00;
        
        if (numeroC>0) {
            switch (conversion.toLowerCase()) {
                case "kilometros a millas":
                    conversionF=numeroC*0.621371;
                    break;
                case "celsius a fahrenheit":
                    conversionF=(numeroC*9/5)+32;
                    break;
                case "kilogramos a libras":
                    conversionF=numeroC*2.2046;
                    break;
            
                default:
                    break;
            }
            System.out.println("El valor de la conversion es: "+conversionF);
        }
        else{
            System.out.println("Error: el numero ingresado es un valor negativo");
        }
        scanner.close();
    }
}
