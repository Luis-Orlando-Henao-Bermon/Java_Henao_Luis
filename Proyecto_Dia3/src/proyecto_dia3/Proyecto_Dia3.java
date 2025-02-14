
package proyecto_dia3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Proyecto_Dia3 {
    public static void main(String[] args) {
        
        ArrayList<Concierto> listaConciertos=new ArrayList<>();
        ArrayList<Ticket> listaTickets=new ArrayList<>();
        ArrayList<Zona> listaZonas=new ArrayList<>();
        ArrayList<Cliente> listaClientes=new ArrayList<>();
        
        Concierto.creacionConciertos(listaConciertos);
        
        Zona.creacionZonas(listaZonas);
        
        Cliente cliente1 = new Cliente(1, "Juan", "Pérez", "juan.perez@email.com", "3001234567");
        listaClientes.add(cliente1);
        
        Cliente cliente2 = new Cliente(2, "María", "Gómez", "maria.gomez@email.com", "3017654321");
        listaClientes.add(cliente2);
        
        Cliente cliente3 = new Cliente(3, "Carlos", "Ramírez", "carlos.ramirez@email.com", "3029876543");
        listaClientes.add(cliente3);
        
        Ticket ticket1 = new Ticket(1, 1, 1, 1, "2025-02-01", 150000, 0);
        listaTickets.add(ticket1);
        
        Ticket ticket2 = new Ticket(2, 2, 2, 2, "2025-04-01", 180000, 50000);
        listaTickets.add(ticket2);
        
        Ticket ticket3 = new Ticket(3, 3, 3, 3, "2025-05-15", 120000, 100000);
        listaTickets.add(ticket3);
        
        
        
        
        Boolean boleanito=false;
        while(boleanito==false){
        
            int opcionMenu=Integer.parseInt(JOptionPane.showInputDialog("♪♪♪♪♪♪♪♪♪♪♪ Bienvenido ♪♪♪♪♪♪♪♪♪♪♪\n1. Ver conciertos disponibles.\n2. Registrar cliente.\n3. Comprar ticket.\n4. Ver tickets por cliente.\n5. Cancelar ticket.\n6. Salir"));
            
            switch (opcionMenu) {
                case 1:
                    JOptionPane.showMessageDialog(null, Modulos.ListarConcierto(listaConciertos));
                    
                    break;
                case 2:
                    listaClientes.add(Modulos.CrearCliente(listaClientes));
                    
                    break;
                    
                case 3:
                   listaTickets.add(Modulos.crearTicket(listaTickets, listaClientes, listaConciertos, listaZonas));
                
                   break;
                   
                case 4:
                   Modulos.VerTicketCliente(listaClientes, listaTickets);

                   break;
                   
                case 5:
                   listaTickets=Modulos.CancelarTicket(listaTickets);

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
