import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Por favor escribe como esta el dia ( soleado , lluvioso , frio )");
        String dia = scanner.nextLine();
        
        boolean conf=false;

        while (conf==false) {
            if (!dia.toLowerCase().equals("soleado")&&!dia.toLowerCase().equals("lluvioso")&&!dia.toLowerCase().equals("frio")) {
                System.out.println("Por favor ingresa un dia valido");
                dia = scanner.nextLine();
            }
            else{
                conf=true;
            }
        }
        
        System.out.println("Por favor escribe como la hora del dia ( amanecer , tarde , noche )");
        String hora = scanner.nextLine();

        
        conf=false;
        while (conf==false) {
            if (!hora.toLowerCase().equals("amanecer")&&!hora.toLowerCase().equals("tarde")&&!hora.toLowerCase().equals("noche")) {
                System.out.println("Por favor ingresa una hora valida");
                hora = scanner.nextLine();
            }
            else{
                conf=true;
            }
        }

        switch (dia) {
            case "soleado":
                if (hora.equals("amanecer")) {
                    System.out.println("Recomendacion: Jugo de naranja y una ensalada de frutas");
                }
                else if (hora.equals("tarde")) {
                    System.out.println("Recomendacion: Ensalada fresca con pollo a la plancha");
                    
                }
                else if (hora.equals("noche")) {
                    System.out.println("Recomendacion: Pescado a la parrilla con vegetales");
                    
                }
                break;
                
                case "lluvioso":
                if (hora.equals("amanecer")) {
                    System.out.println("Recomendacion: Chocolate caliente y pan con queso");
                }
                else if (hora.equals("tarde")) {
                    System.out.println("Recomendacion: Sopa de maiz");
                    
                }
                else if (hora.equals("noche")) {
                    System.out.println("Recomendacion: Guiso de carne con puré de papa");
                    
                }
                break;
                
                case "frio":
                if (hora.equals("amanecer")) {
                    System.out.println("Recomendacion: Café con leche y croissants");
                }
                else if (hora.equals("tarde")) {
                    System.out.println("Recomendacion: Chocolate caliente y pan con queso");
                    
                }
                else if (hora.equals("noche")) {
                    System.out.println("Recomendacion: Caldo de res");
                    
                }
                
                break;
        
            default:
                break;
        }

        scanner.close();
    }
}
