
package proyecto_dia2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Proyecto_Dia2 {

    public static void main(String[] args) {
        //creacion de campers
        Scanner scan=new Scanner(System.in);

        ArrayList<Camper> listaCampers=new ArrayList<>();
        
        Camper camper1 = new Camper("Luis_01", "luorheber03", 5708, 1093904929, "Luis Jose", "Bermon Henao","Diocesano", "Franklin Henao", 322890392, 3452331, "Cursando", "19-03-2024", "19-03-2025", "M1", "JavaScript", 1, "");
        listaCampers.add(camper1);
        
        Camper camper2 = new Camper("zu123", "fer123", 123, 1093626535, "Zully Fernanda", "Ortiz Avendaño","pinos", "Zully Fabiola Avendaño", 153513513, 513135135, "Aprobado","15-02-2024", "15-02-2025", "M1", "JavaScript", 1, "");
        listaCampers.add(camper2);
        
        Camper camper3 = new Camper("jhoan37", "jhoan372", 333, 1502065, "jhoan stiven", "Bermon Garay","Camilo torres", "Blanca Smith Bermon Garay", 56523506, 846846541, "Aprobado","14-02-2024", "14-12-2024", "T3", "Netcore", 1, "Laura Sofia");
        listaCampers.add(camper3);
        
        //creacion de trainers
        
        ArrayList<Trainer> listaTrainers=new ArrayList<>();
        Trainer trainer1 = new Trainer("Pedro_10", "Pedrito", 75458546, 88563265, "Pedro jose", "Perez Sanchez","Bogota", 3266598, 98626565, "Nodejs");
        listaTrainers.add(trainer1);
        
        Trainer trainer2 = new Trainer("Michael_03", "Michael_010", 1523, 102588453, "Michael Andres", "Garzon Ramirez","Bogota", 342100456, 58416543, "Java");
        listaTrainers.add(trainer2);
        
        Trainer trainer3 = new Trainer( "laura03", "laura031", 1222, 8458821, "Laura Sofia", "Salamanca Zuleta","Tibu", 5641651, 854165156, "Netcore");
        listaTrainers.add(trainer3);
    
        //Creacion del coordinador
        ArrayList<Coordinador> listaCoordinador=new ArrayList<>();
        
        Coordinador coordinador1 = new Coordinador("stiv1", "stiv12", 12347, 912837128, "Brayan Stiven", "Carvajal romero", "Bucaramanga", 32782938, 1230989);
        listaCoordinador.add(coordinador1);

        //creacion de los moduloas
        
        ArrayList<String> modulos=new ArrayList<>();
        modulos.add("Fundamentos de programacion");
        modulos.add("Programacion web");
        modulos.add("Programacion Formal");
        modulos.add("Bases de datos");
        modulos.add("Backend");

        
        //Creacion de grupos
        ArrayList<String> grupos=new ArrayList<>(Arrays.asList("T1","T2","T3","M1","M2","M3"));

        //Fin de la informacion de ejemplo
        

        

        
        
        Boolean booleanito=false;

        while (booleanito==false) {

            Menus.menuCoordinador();
            System.out.println("Selecciona una opcion");
            int opcion1Cd=scan.nextInt();

            switch (opcion1Cd) {
                case 1:
                    ModulosCoordinador.cambiarInfo(listaCampers, listaTrainers, listaCoordinador,grupos);                    
                    break;

                case 2:
                    
                    System.out.println("-----Tipos de usuarios-----\n1. Campers\n2. Trainers\n3. Coordinadores");
                    System.out.println("Ingrese el numero del tipo de usuario que quiere ver\n");
                    int opcVerInfo=scan.nextInt();
                    scan.nextLine();
                    
                    switch (opcVerInfo) {
                        case 1:
                            Modulos.mostrarCampers(listaCampers);
                            break;
                            
                        case 2:
                            Modulos.mostrarTrainers(listaTrainers);
                            break;
                            
                        case 3:
                            Modulos.mostrarCoordinadores(listaCoordinador);
                            break;
                        default: 
                        System.out.println("Opcion invalida\n");
                            break;
                    }

                    break;

                case 3:
                    ModulosCoordinador.CrearUsuarios(listaCampers, listaTrainers, listaCoordinador, grupos);
                    break;
                case 4:
                    
                    System.out.println("-----Tipos de usuarios-----\n1. Campers\n2. Trainers\n3. Coordinadores");
                    System.out.println("Ingrese el numero del tipo de usuario que quiere eliminar\n");
                    int opcEliminarUser=scan.nextInt();
                    scan.nextLine();
                    
                    switch (opcEliminarUser) {
                        case 1:
                            listaCampers=ModulosCoordinador.EliminarCamper(listaCampers);
                            break;
                            
                        case 2:
                            listaTrainers=ModulosCoordinador.EliminarTrainer(listaTrainers);
                            break;
                            
                        case 3:
                            listaCoordinador=ModulosCoordinador.EliminarCoordinador(listaCoordinador);
                            break;
                        default:
                        System.out.println("Opcion invalida");
                            break;
                    }

                    break;

                case 5:

                    booleanito=true;

                    break;

                default:

                    System.out.println("Opcion invalida");

                    break;
            }
        }
    }
    
}
