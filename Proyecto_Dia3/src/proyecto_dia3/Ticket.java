
package proyecto_dia3;

import java.util.Date;


public class Ticket {
   int ID;
   int ID_Cliente;
   int ID_Concierto;
   int ID_Zona;
   int PrecioFinal;
   String FechaCompra;

    public Ticket(int ID, int ID_Cliente, int ID_Concierto, int Zona, String FechaCompra,int PrecioBase,int PrecioAdicional) {
        this.ID = ID;
        this.ID_Cliente = ID_Cliente;
        this.ID_Concierto = ID_Concierto;
        this.ID_Zona = Zona;
        this.PrecioFinal = PrecioBase+PrecioAdicional;
        this.FechaCompra = FechaCompra;
    }

    @Override
    public String toString() {
        return "ID de ticket: " + ID + "\nID de cliente: " + ID_Cliente + "\nID de concierto: " + ID_Concierto + "\nID de zona: " + ID_Zona + "\nPrecio final: " + PrecioFinal + "\nFecha de compra: " + FechaCompra + "\n";
    }
   
   
}
