package dia_23.MVC.Controlador;

import dia_23.MVC.Modelo.Usuario;
import dia_23.MVC.Modelo.UsuarioDao;
import dia_23.MVC.Vista.UsuarioVista;

import java.util.List;
import java.util.Scanner;

public class UsuarioControlador {
    private UsuarioDao usuarioDao;
    private UsuarioVista usuarioVista;
    private Scanner scan;

    public UsuarioControlador(UsuarioDao usuarioDao, UsuarioVista usuarioVista) {
        this.usuarioDao = usuarioDao;
        this.usuarioVista = usuarioVista;
        this.scan = new Scanner(System.in);
    }

    public void iniciar(){
        Usuario NuevoUsuario;

        boolean terminar=true;
        while (terminar){
            System.out.println("Menu principal");
            System.out.println("1. Agrega usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Actualizar Usuario");
            System.out.println("4. Listar Usuarios");
            System.out.println("5. Mostrar usuario por id");
            System.out.println("6. Salir");
            int opcion= scan.nextInt();
            switch (opcion) {
                case 1:
                    NuevoUsuario= usuarioVista.AgregarUsuario();
                    usuarioDao.agregarUsuario(NuevoUsuario);
                    break;
                case 2:
                    NuevoUsuario= usuarioVista.EliminarUsuario();
                    usuarioDao.EliminarUsuario(NuevoUsuario);
                    break;

                case 3:
                    NuevoUsuario= usuarioVista.ActualizarUsuario();
                    usuarioDao.modificarUsuario(NuevoUsuario);
                    break;
                case 4:
                    List<Usuario> usuarioList = usuarioDao.ObtenerUsuarios();
                    usuarioVista.MostrarUsuarios(usuarioList);
                    break;

                case 5:
                    NuevoUsuario=usuarioVista.MostarUsuarioPorid();
                    usuarioDao.bucarUsuarioPorId(NuevoUsuario);

                    break;

                case 6:
                    terminar=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
}
