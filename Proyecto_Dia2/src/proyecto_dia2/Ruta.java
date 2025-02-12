
package proyecto_dia2;

import java.util.ArrayList;


public class Ruta {
    String nombre;
    ArrayList<String> grupos= new ArrayList<>();
    ArrayList<ArrayList<String>> modulos=new ArrayList<>();

    public Ruta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ruta{" + "nombre=" + nombre + ", grupos=" + grupos + ", modulos=" + modulos + '}';
    }
    
    
}