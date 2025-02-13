
package proyecto_dia3;

import java.util.ArrayList;
import java.util.Date;

public class Concierto {
    int ID;
    String Nombre;
    String Artista;
    Date Fecha=new Date();
    String Lugar;
    int PrecioBase;

    public Concierto(int ID, String Nombre, String Artista, Date Fecha, String Lugar, int PrecioBase) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
        this.PrecioBase = PrecioBase;
    }
    
    public static void creacionConciertos(ArrayList<Concierto> listaConciertos){
        Concierto concierto1=new Concierto(1,"Shakira Tour","Shakira",formatter.format( "31/12/1999 "),"Colombia-Bogota",50000);
    }
}
