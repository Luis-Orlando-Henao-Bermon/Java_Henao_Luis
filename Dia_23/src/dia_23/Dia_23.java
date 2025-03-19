
package dia_23;


import dia_23.MVC.Controlador.UsuarioControlador;
import dia_23.MVC.Modelo.UsuarioDao;
import dia_23.MVC.Vista.UsuarioVista;

public class Dia_23 {

    public static void main(String[] args) {
        UsuarioVista usuarioVista= new UsuarioVista();
        UsuarioDao usuarioDao= new UsuarioDao();

        UsuarioControlador usuarioControlador= new UsuarioControlador(usuarioDao,usuarioVista);

        usuarioControlador.iniciar();
    }
    
}
