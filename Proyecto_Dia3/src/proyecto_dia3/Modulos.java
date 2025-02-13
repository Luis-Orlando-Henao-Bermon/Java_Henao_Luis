
package proyecto_dia3;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Modulos {
    
    public static void Menu(){
        System.out.println("1. Ver conciertos disponibles");
        System.out.println("2. Registrar cliente.");
        System.out.println("3. Comprar ticket.");
        System.out.println("4. Ver tickets por cliente.");
        System.out.println("5. Cancelar ticket.");
    }
    
    public static Cliente CrearCliente(ArrayList<Cliente> listaClientes){
        
        int ID=listaClientes.get(listaClientes.size()-1).ID+1;
        String Nombre=JOptionPane.showInputDialog("Ingresa el nombre del nuevo cliente");
        String Apellido=JOptionPane.showInputDialog("Ingresa el apellido del nuevo cliente");
        String Correo=JOptionPane.showInputDialog("Ingresa el correo del nuevo cliente");
        String Telefono=JOptionPane.showInputDialog("Ingresa el numero de telefono del nuevo cliente");
        
        Cliente cliente1 = new Cliente(ID, Nombre, Apellido, Correo, Telefono);
        
        return cliente1;
    }
    
    public static StringBuilder ListarConcierto(ArrayList<Concierto> listaConciertos){
        StringBuilder mensajeC = new StringBuilder("Lista de conciertos:\n");
        for (Object i : listaConciertos) {
            mensajeC.append(i);
        }
        return mensajeC;
    }
    
    public static StringBuilder ListarZonas(ArrayList<Zona> listaZonas){
        StringBuilder mensajeZ = new StringBuilder("Lista de zonas:\n");
        for (Object i : listaZonas) {
            mensajeZ.append(i);
        }
        return mensajeZ;
    }
    
    public static StringBuilder ListarClientes(ArrayList<Cliente> listaClientes){
        StringBuilder mensajeC = new StringBuilder("Lista de clientes:\n");
        for (Object i : listaClientes) {
            mensajeC.append(i);
        }
        return mensajeC;
    }
    
    public static StringBuilder ListarTickets(ArrayList<Ticket> listaTickets){
        StringBuilder mensajeT = new StringBuilder("Lista de Tickets:\n");
        for (Object i : listaTickets) {
            mensajeT.append(i);
        }
        return mensajeT;
    }
    
    public static Ticket crearTicket(ArrayList<Ticket> listaTickets, ArrayList<Cliente> listaClientes,ArrayList<Concierto> listaConciertos,ArrayList<Zona> listaZonas ){
    
        int id_ticket = listaTickets.get(listaTickets.size()-1).ID+1;
        
        
        int ID_Cliente=Integer.parseInt(JOptionPane.showInputDialog(ListarClientes(listaClientes).append("\nIngresa el id del cliente que va a comprar el ticket")));
        
        int ID_Concierto=Integer.parseInt(JOptionPane.showInputDialog(ListarConcierto(listaConciertos).append("\nIngresa el id del concierto")));
      
        int ID_Zona=Integer.parseInt(JOptionPane.showInputDialog(ListarZonas(listaZonas).append("\nIngresa el id de la zona")));
        
        int precioBase=0;
        for(int i=0; i<listaConciertos.size();i++){
            if(listaConciertos.get(i).ID==ID_Concierto){
                precioBase=listaConciertos.get(i).PrecioBase;
            }
        }
        
        
        int precioAdicional=0;
        for(int i=0; i<listaZonas.size();i++){
            if(listaZonas.get(i).ID==ID_Zona){
                precioAdicional=listaZonas.get(i).PrecioAdicional;
            }
        }
        
        Ticket ticket1 = new Ticket(id_ticket,ID_Cliente, ID_Concierto, ID_Zona, String.valueOf(LocalDate.now()), precioBase, precioAdicional);
        
        return ticket1;
    }
    
    public static void VerTicketCliente(ArrayList<Cliente> listaClientes,ArrayList<Ticket> listaTickets){
        
        int ID_Cliente=Integer.parseInt(JOptionPane.showInputDialog(ListarClientes(listaClientes).append("\nIngresa el id del cliente que quiere ver sus tickets")));
        
        StringBuilder ticketsCliente=new StringBuilder("Lista de tickets del cliente\n");
        
        for(int i=0;i < listaTickets.size();i++){
            if(listaTickets.get(i).ID_Cliente==ID_Cliente){
                ticketsCliente.append(listaTickets.get(i)+"--------------------\n");
            }
        }
        JOptionPane.showMessageDialog(null, ticketsCliente);
    }
    
    public static ArrayList<Ticket> CancelarTicket(ArrayList<Ticket> listaTickets){
        
        ArrayList<Ticket> listaNueva=new ArrayList<>();
        
        int idTicketEliminar=Integer.parseInt(JOptionPane.showInputDialog(ListarTickets(listaTickets).append("Ingresa el id del ticket que deseas cancelar")));
                
        for (int  i = 0;  i < listaTickets.size();  i++) {
            if (listaTickets.get(i).ID!=idTicketEliminar){
                listaNueva.add(listaTickets.get(i));
            }
        }
        
        return listaNueva;
        
    }
}
