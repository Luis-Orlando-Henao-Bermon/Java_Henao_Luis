
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
            System.out.println("Numero de identiifcacion:"+listaCampers.get(i).numeroIdentificacion);
            System.out.println("Acudiente:"+listaCampers.get(i).acudiente);
            System.out.println("Direccion:"+listaCampers.get(i).direccion);
            System.out.println("Estado:"+listaCampers.get(i).estado);
            System.out.println("Fecha de inicio:"+listaCampers.get(i).fechaInicio);
            System.out.println("Fecha de cierre:"+listaCampers.get(i).fechaCierre);
            System.out.println("Grupo:"+listaCampers.get(i).grupo);
            System.out.println("Modulo actual:"+listaCampers.get(i).moduloActual);
            System.out.println("Ruta:"+listaCampers.get(i).ruta);
            System.out.println("Telefono celular:"+listaCampers.get(i).telefonoCelular);
            System.out.println("Telefono fijo:"+listaCampers.get(i).telefonoFijo);
            System.out.println("\n");
        }   
    }

    public static void mostrarTrainers(ArrayList<Trainer> listaTrainers) {
        for (int i = 0; i < listaTrainers.size(); i++) {
            System.out.println("Id: "+listaTrainers.get(i).id+"\nNombre: "+listaTrainers.get(i).nombres+" "+listaTrainers.get(i).apellidos);
            System.out.println("Numero de identiifcacion:"+listaTrainers.get(i).numeroIdentificacion);
            System.out.println("Direccion:"+listaTrainers.get(i).direccion);
            System.out.println("Telefono celular:"+listaTrainers.get(i).telefonoCelular);
            System.out.println("Telefono fijo:"+listaTrainers.get(i).telefonoFijo);
            System.out.println("Grupo:"+listaTrainers.get(i).grupo);
            System.out.println("Ruta:"+listaTrainers.get(i).ruta);
            System.out.println("\n");
            
        }   
    }
    
    public static void mostrarCoordinadores(ArrayList<Coordinador> listaCoordinador) {
        for (int i = 0; i < listaCoordinador.size(); i++) {
            System.out.println("Id: "+listaCoordinador.get(i).id+"\nNombre: "+listaCoordinador.get(i).nombres+" "+listaCoordinador.get(i).apellidos);
            System.out.println("Numero de identiifcacion:"+listaCoordinador.get(i).numeroIdentificacion);
            System.out.println("Direccion:"+listaCoordinador.get(i).direccion);
            System.out.println("Telefono celular:"+listaCoordinador.get(i).telefonoCelular);
            System.out.println("Telefono fijo:"+listaCoordinador.get(i).telefonoFijo);
            System.out.println("\n");
            
        }   
    }

}
