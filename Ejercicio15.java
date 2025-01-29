import java.util.Scanner;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        
        String[] arrayJuegoPc={"piedra","papel","tijera"};
        
        int indiceAl= random.nextInt(arrayJuegoPc.length);

        String juegoPc= arrayJuegoPc[indiceAl];
        
        System.out.println("Escoge tu juego\n1. Piedra\n2. Papel\n3. Tijera");
        int juegoPlayer=scanner.nextInt();

        System.out.println("Juego del pc: "+juegoPc);

        if (juegoPlayer==1 &&juegoPc=="tijera") {
            System.out.println("Tu ganas");
        }
        else if (juegoPlayer==2 &&juegoPc=="piedra") {
            System.out.println("Tu ganas");
        }
        else if (juegoPlayer==3 &&juegoPc=="papel") {
            System.out.println("Tu ganas");
        }
        else if (juegoPlayer==indiceAl+1) {
            System.out.println("Empate");
        }
        else {
            System.out.println("Tu pierdes");
        }
        scanner.close();
    }
}