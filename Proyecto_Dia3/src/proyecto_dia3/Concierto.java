
package proyecto_dia3;

import java.util.ArrayList;

public class Concierto {
    int ID;
    String Nombre;
    String Artista;
    String Fecha;
    String Lugar;
    int PrecioBase;

    public Concierto(int ID, String Nombre, String Artista, String Fecha, String Lugar, int PrecioBase) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
        this.PrecioBase = PrecioBase;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nNombre: " + Nombre + "\nArtista: " + Artista + "\nFecha: " + Fecha + "\nLugar: " + Lugar + "\nPrecio base: " + PrecioBase+"\n";
    }
    
    
    public static void creacionConciertos(ArrayList<Concierto> listaConciertos){
        
        Concierto concierto1=new Concierto(1,"Shakira Tour","Shakira","2025-07-03","Colombia-Bogota",150000);
        listaConciertos.add(concierto1);
        
        Concierto concierto2 = new Concierto(2, "Reggaeton Party", "Bad Bunny", "2025-05-10", "Coliseo Med", 180000);
        listaConciertos.add(concierto2);
        
        Concierto concierto3 = new Concierto(3, "Jazz Night", "Norah Jones", "2025-06-20", "Teatro Municipal", 120000);
        listaConciertos.add(concierto3);
        
        Concierto concierto4 = new Concierto(4, "Pop Explosion", "Dua Lipa", "2025-07-05", "Arena Bogotá", 200000);
        listaConciertos.add(concierto4);
        
        Concierto concierto5 = new Concierto(5, "Metal Legends", "Metallica", "2025-08-12", "Estadio Atanasio", 250000);
        listaConciertos.add(concierto5);
        
        Concierto concierto6 = new Concierto(6, "Indie Dreams", "Tame Impala", "2025-09-25", "Parque Simón Bolívar", 130000);
        listaConciertos.add(concierto6);
    }
}
