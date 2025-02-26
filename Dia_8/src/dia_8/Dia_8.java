
package dia_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Dia_8 {
    // Etructura de datos 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*int[] arreglo1;
        int [] arreglo2=new int[5];
        
        arreglo2[0]=8;
        System.out.println(arreglo2[0]);
        System.out.println(arreglo2.length);
        
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
        
        int [][] matriz= new int[4][4];
        
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[0][3]=4;
        
        matriz[1][0]=5;
        matriz[1][1]=6;
        matriz[1][2]=7;
        matriz[1][3]=8;
        
        matriz[2][0]=9;
        matriz[2][1]=10;
        matriz[2][2]=11;
        matriz[2][3]=12;
        
        matriz[3][0]=13;
        matriz[3][1]=14;
        matriz[3][2]=15;
        matriz[3][3]=16;
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|"+matriz[i][j]+ "|");
            }
            System.out.println("\n------------");
            
        }
        */
        ArrayList<Partido> listaPartidos=new ArrayList<>();
        PartidoDeLiga partido1 = new PartidoDeLiga(1, "Los Angeles Lakers", "Boston Celtics", "2025-02-26");
        PartidoDeLiga partido2 = new PartidoDeLiga(2, "Golden State Warriors", "Miami Heat", "2025-03-01");
        PartidoDeLiga partido3 = new PartidoDeLiga(3, "Chicago Bulls", "Brooklyn Nets", "2025-03-05");
        
        PartidoPlayOffs partido4 = new PartidoPlayOffs("Octavos", "Los Angeles Lakers", "Golden State Warriors", "2025-04-15");
        PartidoPlayOffs partido5 = new PartidoPlayOffs("Cuartos", "Milwaukee Bucks", "Boston Celtics", "2025-04-20");
        PartidoPlayOffs partido6 = new PartidoPlayOffs("Final", "Miami Heat", "Denver Nuggets", "2025-06-01");
        
        listaPartidos.add(partido1);
        listaPartidos.add(partido2);
        listaPartidos.add(partido3);
        listaPartidos.add(partido4);
        listaPartidos.add(partido5);
        listaPartidos.add(partido6);
        
        boolean boleanito=true;
        
        while (boleanito==true) {            
            System.out.println("----------Menu----------\n1. Registrar un partido\n2. Agregar cesta a un equipo\n3. Finalizar un partido\n4. Mostrar ganador de un partido\n5. Mostrar informacion de un partido\n6. Salir");
            int opcion=scan.nextInt();
            scan.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("1. Registrar n partido de liga\n2. Registrar un partido playOff");
                    int opcRegistrar=scan.nextInt();
                    
                    break;
                case 6:
                    
                    break;
                default:
                    
                    System.out.println("Error: Opcion invalida");
                    
                    break;
            }
            
        }
    }
    
}
