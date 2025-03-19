
package dia_22.MVC.Controlador;

import dia_22.MVC.Modelo.*;
import dia_22.MVC.Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener{
    UsuarioDao dao =new UsuarioDao();
    Vista vista =new Vista();
    DefaultTableModel modelo =  new DefaultTableModel();
    Consumer<Boolean> tareaCompletada = tarea -> {
        if (tarea==true) {
            JOptionPane.showMessageDialog(vista,"Tarea completada de manera exitosa");
        }
    };
    Runnable eliminarDatosCuadro= ()->{
        vista.textId.setText("");
        vista.txtNombre.setText("");
        vista.txtEmail.setText("");
    };

    public Controlador(Vista v) {
        vista=v;
        vista.btnListar.addActionListener(this);
        vista.btnAgregar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.btnListar){
           listar(vista.tabla);
       }
       
       if(e.getSource()==vista.btnAgregar){
           AgregarUsuario();
       }
       
       if(e.getSource()==vista.btnEliminar){
           EliminarUsuario();
       }
       
       if(e.getSource()==vista.btnEditar){
           ActualizarUsuario();
       }
    }
    public void listar(JTable tabla){
        modelo= (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        List<Usuario>lista= new ArrayList<>();
        try {
            lista=dao.ObtenerUsuarios();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(vista,"Error al listar usuarios. "+ e.getMessage());
        }
        Object[] object = new Object[3];
        
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getNombre();
            object[2]=lista.get(i).getEmail();
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    }
    
    public void AgregarUsuario(){
        
        String nombre=vista.txtNombre.getText();
        String email=vista.txtEmail.getText();
        try {
            boolean agregado=dao.agregarPersona(nombre, email);
            tareaCompletada.accept(agregado);
            
            eliminarDatosCuadro.run();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista,"Error al agregar usuario. "+ e.getMessage());
        }        
    }
    
    public void EliminarUsuario(){
        int id =Integer.parseInt(vista.textId.getText());
        
        try {
            boolean eliminar = dao.EliminarPersona(id);
            tareaCompletada.accept(eliminar);
            
            eliminarDatosCuadro.run();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista,"Error al eliminar usuario. "+ e.getMessage());
        }
        
    }
    
    public void ActualizarUsuario(){
        int id =Integer.parseInt(vista.textId.getText());
        String nombre=vista.txtNombre.getText();
        String email=vista.txtEmail.getText();
        try {
            boolean agregado=dao.modificarPersona(id, nombre, email);
            tareaCompletada.accept(agregado);
            
            eliminarDatosCuadro.run();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista,"Error al agregar usuario. "+ e.getMessage());
        }
    }
    

    
}
