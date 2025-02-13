
package proyecto_dia3;

import java.util.Date;


public class Ticket {
   int ID;
   int ID_Cliente;
   int ID_Concierto;
   String Zona;
   int PrecioFinal;
   Date FechaCompra;

    public Ticket(int ID, int ID_Cliente, int ID_Concierto, String Zona, Date FechaCompra,int PrecioBase,int PrecioAdicional) {
        this.ID = ID;
        this.ID_Cliente = ID_Cliente;
        this.ID_Concierto = ID_Concierto;
        this.Zona = Zona;
        this.PrecioFinal = PrecioBase+PrecioAdicional;
        this.FechaCompra = FechaCompra;
    }
   
   
}
