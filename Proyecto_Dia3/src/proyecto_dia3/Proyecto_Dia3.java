
package proyecto_dia3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Proyecto_Dia3 {
    public static void main(String[] args) {
        
        ArrayList<Concierto> listaConciertos=new ArrayList<>();
        ArrayList<Ticket> listaTickets=new ArrayList<>();
        ArrayList<Zona> listaZonas=new ArrayList<>();
        ArrayList<Cliente> listaClientes=new ArrayList<>();
        
        
        
        Boolean boleanito=false;
        while(boleanito==false){
        
            int opcionMenu=Integer.parseInt(JOptionPane.showInputDialog("♪♪♪♪♪♪♪♪♪♪♪ Bienvenido ♪♪♪♪♪♪♪♪♪♪♪\n1. Ver conciertos disponibles.\n2. Registrar cliente.\n3. Comprar ticket.\n4. Ver tickets por cliente.\n5. Cancelar ticket.\n6. Salir"));
            
            switch (opcionMenu) {
                case 1:
                    
                    break;
                    
                case 6:
                    boleanito=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
                    
            }
        }
        
    }
    
}
