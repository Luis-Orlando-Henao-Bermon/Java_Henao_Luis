
package proyecto_dia2;

import java.util.ArrayList;
import java.util.Arrays;

public class Modulos {

    public static ArrayList verificacionLogin(String user, ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers, Coordinador coordinador){
        
        
        String Cargo="vacio";
        String indice="-10";
            
        for (int i = 0; i < listaCampers.size(); i++) {
            if (listaCampers.get(i).user.get("login").equals(user)) {
                Cargo="camper";
                indice=String.valueOf(i);
            }
        }
        
        for (int i = 0; i < listaTrainers.size(); i++) {
            if (listaTrainers.get(i).user.get("login").equals(user)) {
                Cargo="trainer";
                indice=String.valueOf(i);
            }
        }
        
        if (coordinador.user.get("login").equals(user)) {
            Cargo="coordinador";                
        }

        ArrayList<String> respuesta=new ArrayList<>(Arrays.asList(Cargo,indice));
        
        return respuesta;
    
    };

    public static String verificacionContrasena(String user,String contrasena, ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers, Coordinador coordinador){

        String Verificacion="incorrecta";
            
        for (int i = 0; i < listaCampers.size(); i++) {
            if (listaCampers.get(i).user.get("login").equals(user) && listaCampers.get(i).user.get("contrasena").equals(contrasena))  {
                Verificacion="correcta";
            }
        }
        
        for (int i = 0; i < listaTrainers.size(); i++) {
            if (listaTrainers.get(i).user.get("login").equals(user) && listaTrainers.get(i).user.get("contrasena").equals(contrasena)) {
                Verificacion="correcta";
            }
        }
        
        if (coordinador.user.get("login").equals(user) && coordinador.user.get("contrasena").equals(contrasena)) {
            Verificacion="correcta";                
        }
        return Verificacion;
    };

    
    public static void mostrarCampers(ArrayList<Camper> listaCampers) {
        for (int i = 0; i < listaCampers.size(); i++) {
            System.out.println("Id: "+listaCampers.get(i).id+"\nNombre: "+listaCampers.get(i).nombres+" "+listaCampers.get(i).apellidos);
            System.out.println("\n");
        }   
    }

    public static void mostrarTrainers(ArrayList<Trainer> listaTrainers) {
        for (int i = 0; i < listaTrainers.size(); i++) {
            System.out.println("Id: "+listaTrainers.get(i).id+"\nNombre: "+listaTrainers.get(i).nombres+" "+listaTrainers.get(i).apellidos);
            System.out.println("\n");
        }   
    }

}
