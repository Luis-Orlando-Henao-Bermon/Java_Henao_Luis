
package proyecto_dia3;

import java.util.ArrayList;

public class Zona {
    int ID;
    String NombreZona;
    int Capacidad;
    int PrecioAdicional;

    public Zona(int ID, String NombreZona, int Capacidad, int PrecioAdicional) {
        this.ID = ID;
        this.NombreZona = NombreZona;
        this.Capacidad = Capacidad;
        this.PrecioAdicional = PrecioAdicional;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nNombre de zona: " + NombreZona + "\nCapacidad: " + Capacidad + "Precio adicional: " + PrecioAdicional +"\n";
    }
    
    public static void creacionZonas(ArrayList<Zona> listaZonas){
        
        Zona zona1 = new Zona(1, "General", 5000, 0);
        listaZonas.add(zona1);
        
        Zona zona2 = new Zona(2, "VIP", 1000, 50000);
        listaZonas.add(zona2);
        
        Zona zona3 = new Zona(3, "Platino", 500, 100000);
        listaZonas.add(zona3);
        
        Zona zona4 = new Zona(4, "Palco", 200, 150000);
        listaZonas.add(zona4);
        
        Zona zona5 = new Zona(5, "Front Stage", 300, 200000);
        listaZonas.add(zona5);
        
        Zona zona6 = new Zona(6, "Preferencial", 1500, 30000);
        listaZonas.add(zona6);
    }
}
