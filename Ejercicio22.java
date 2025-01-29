import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el mes para determinar el signo zodiacal");
        int mes = scanner.nextInt();

        while (mes>12 || mes<1) {
            System.out.println("Por favor ingresa un mes valido");
            mes = scanner.nextInt();
        }
        
        System.out.println("Ingresa el dia para determinar el signo zodiacal");
        int dia = scanner.nextInt();

        while (dia>31 || dia<1) {
            System.out.println("Por favor ingresa un dia valido");
            dia = scanner.nextInt();
        }

        String zodiaco="";

        if (mes==1) {
            if (dia>=20) {
                zodiaco="Acuario";
            } else {
                zodiaco="Capricornio";                
            }
        }
        else if (mes==2) {
            if (dia>=19) {
                zodiaco="Piscis";
            } else {
                zodiaco="Acuario";                
            }
        }
        else if (mes==3) {
            if (dia>=21) {
                zodiaco="Aries";
            } else {
                zodiaco="Piscis";                
            }
        }
        else if (mes==4) {
            if (dia>=20) {
                zodiaco="Tauro";
            } else {
                zodiaco="Aries";                
            }
        }
        else if (mes==5) {
            if (dia>=21) {
                zodiaco="Géminis";
            } else {
                zodiaco="Tauro";                
            }
        }
        else if (mes==6) {
            if (dia>=21) {
                zodiaco="Cáncer";
            } else {
                zodiaco="Géminis";                
            }
        }
        else if (mes==7) {
            if (dia>=23) {
                zodiaco="Leo";
            } else {
                zodiaco="Cáncer";                
            }
        }
        else if (mes==8) {
            if (dia>=23) {
                zodiaco="Virgo";
            } else {
                zodiaco="Leo";                
            }
        }
        else if (mes==9) {
            if (dia>=23) {
                zodiaco="Libra";
            } else {
                zodiaco="Virgo";                
            }
        }
        else if (mes==10) {
            if (dia>=23) {
                zodiaco="Escorpio";
            } else {
                zodiaco="Libra";                
            }
        }
        else if (mes==11) {
            if (dia>=22) {
                zodiaco="Sagitario";
            } else {
                zodiaco="Escorpi";                
            }
        }
        else if (mes==12) {
            if (dia>=22) {
                zodiaco="Capricornio";
            } else {
                zodiaco="Sagitario";                
            }
        }
        
        System.out.println("Tu signo zodiacal es: "+zodiaco);
        scanner.close();
    }
}
