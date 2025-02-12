
package proyecto_dia2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Proyecto_Dia2 {

    public static void main(String[] args) {
        //creacion de campers
        Scanner scan=new Scanner(System.in);

        ArrayList<Camper> listaCampers=new ArrayList<>();
        
        Camper camper1 = new Camper("Luis_01", "luorheber03", 5708, 1093904929, "Luis Jose", "Bemon Henao","Diocesano", "Franklin Henao", 322890392, 3452331, "Cursando", "19-03-2024", "19-03-2025", "M1", "JavaScript", 1, "");
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
        Coordinador coordinador = new Coordinador("stiv1", "stiv12", 12347, 912837128, "Brayan Stiven", "Carvajal romero", "Bucaramanga", 32782938, 1230989);


        //creacion de los moduloas
        
        ArrayList<String> modulos=new ArrayList<>();
        modulos.add("Fundamentos de programacion");
        modulos.add("Programacion web");
        modulos.add("Programacion Formal");
        modulos.add("Bases de datos");
        modulos.add("Backend");
        
        //creacion de materias opcinales en los modulos 3,4,5
        ArrayList<String> materiasM3=new ArrayList<>();
        materiasM3.add("Java");
        materiasM3.add("JavaScript");
        materiasM3.add("C#");
        
        ArrayList<String> materiasM4=new ArrayList<>();
        materiasM4.add("Mysql");
        materiasM4.add("MongoDb");
        materiasM4.add("Postgresql");
        
        ArrayList<String> materiasM5=new ArrayList<>();
        materiasM5.add("Netcore");
        materiasM5.add("Spring Boot");
        materiasM5.add("NodeJs");
        materiasM5.add("Express");

        //creacion de las rutas

        //Ruta 1
        Ruta ruta1=new Ruta("Nodejs");
        ruta1.grupos.add("T1");

        ArrayList<String> modulo=new ArrayList<>(Arrays.asList("Introduccion a la algoritmo","Pseint","Python"));
        ruta1.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("HTML","CSS","Bootstrap"));
        ruta1.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Java","JavaScript"));
        ruta1.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Mysql","Postgresql"));
        ruta1.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("NodeJs", "Express"));
        ruta1.modulos.add(modulo);


        //Ruta 2
        Ruta ruta2=new Ruta("Java");
        ruta2.grupos.add("T2");

        modulo=new ArrayList<>(Arrays.asList("Introduccion a la algoritmo","Pseint","Python"));
        ruta2.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("HTML","CSS","Bootstrap"));
        ruta2.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Java","JavaScript"));
        ruta2.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Mysql","Postgresql"));
        ruta2.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("NodeJs", "Express"));
        ruta2.modulos.add(modulo);


        //Ruta 3
        Ruta ruta3=new Ruta("Netcore");
        ruta3.grupos.add("T2");

        modulo=new ArrayList<>(Arrays.asList("Introduccion a la algoritmo","Pseint","Python"));
        ruta3.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("HTML","CSS","Bootstrap"));
        ruta3.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Java","JavaScript"));
        ruta3.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("Mysql","Postgresql"));
        ruta3.modulos.add(modulo);
        
        modulo = new ArrayList<>(Arrays.asList("NodeJs", "Netcore"));
        ruta3.modulos.add(modulo);

        
        //Creacion de grupos
        ArrayList<String> grupos=new ArrayList<>(Arrays.asList("T1","T2","T3","M1","M2","M3"));

        //Fin de la informacion de ejemplo
        

        System.out.println("Por favor ingresa tu usuario");
        String user=scan.nextLine();

        ArrayList<String> comprovacionLogin=new ArrayList<>();
        comprovacionLogin=Modulos.verificacionLogin(user,listaCampers,listaTrainers,coordinador);

        while (comprovacionLogin.get(0).equals("vacio")) {
            System.out.println("Usuario no encontrado por favor vuelva a intentarlo");
            user=scan.nextLine();
            comprovacionLogin=Modulos.verificacionLogin(user,listaCampers,listaTrainers,coordinador);
        }

        System.out.println("Por favor ingresa tu contraseña");
        String pass=scan.nextLine();

        String comprovacionPassword =Modulos.verificacionContrasena(user, pass, listaCampers, listaTrainers, coordinador);

        while (comprovacionPassword.equals("incorrecta")) {
            System.out.println("Contraseña incorrecta por favor vuelva a intentarlo");
            pass=scan.nextLine();
            comprovacionPassword =Modulos.verificacionContrasena(user, pass, listaCampers, listaTrainers, coordinador);
        }
        switch (comprovacionLogin.get(0)) {
            case "camper":
                Menus.menuCamper(listaCampers.get(Integer.parseInt(comprovacionLogin.get(1))).nombres);    

                break;
            case "trainer":
                Menus.menuTrainer(listaTrainers.get(Integer.parseInt(comprovacionLogin.get(1))).nombres);    


                break;
            case "coordinador":
                Boolean booleanito=false;
            
                while (booleanito==false) {
                    
                    Menus.menuCoordinador(coordinador.nombres);
                    System.out.println("Selecciona una opcion");
                    int opcion1Cd=scan.nextInt();
                    
                    switch (opcion1Cd) {
                        case 1:
                        
                            ModulosCoordinador.cambiarUserPassword(listaCampers, listaTrainers, coordinador);
                            System.out.println(listaTrainers);

                            Menus.menuCoordinador(coordinador.nombres);
                            break;
    
                        case 2:
                            
                            ModulosCoordinador.cambiarInfo(listaCampers, listaTrainers, coordinador,grupos);
                            System.out.println(listaCampers);

                            break;
    
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
    
                        case 5:
                            
                            break;
    
                        case 6:
                            
                            break;
    
                        case 7:
                            
                            break;
    
                        case 8:
                            
                            break;
    
                        case 9:

                            booleanito=true;
                            
                            break;
                    
                        default:

                            System.out.println("Opcion invalida");
                            
                            break;
                    }
                }
                
                
                break;
        
            default:
                break;
        }
        // System.out.println(listaTrainers.get(Integer.parseInt(comprovacionLogin.get(1))).nombres);

    }
    
}
