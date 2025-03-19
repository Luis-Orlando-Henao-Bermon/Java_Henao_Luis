package dia_23.MVC.Vista;

import dia_23.MVC.Modelo.Usuario;
import dia_23.MVC.Modelo.UsuarioDao;

import java.util.List;
import java.util.Scanner;

public class UsuarioVista {
    Scanner scan = new Scanner(System.in);
    UsuarioDao user =new UsuarioDao();
    public void MostrarUsuarios(List<Usuario> usuarioList){
        System.out.println("Lista de usuarios");
        for (Usuario u: usuarioList){
            System.out.println(u);
        }
    }
    public Usuario AgregarUsuario(){
        System.out.println("Datos del nuevo usuario");
        System.out.println("Ingres el nombre");
        String nombre=scan.nextLine();
        System.out.println("Ingrese el email");
        String email= scan.nextLine();

        Usuario usuario= new Usuario();
        usuario.setEmail(email);
        usuario.setNombre(nombre);

        return usuario;
    }
    public Usuario EliminarUsuario(){
        System.out.println("Ingresa el id del usuario que quieres eliminar");
        int id=scan.nextInt();

        Usuario usuario= new Usuario();
        usuario.setId(id);
        return usuario;
    }

    public Usuario ActualizarUsuario(){
        Usuario usuario= new Usuario();

        System.out.println("Ingresa el id del usuario que quieres actualizar");
        int id= scan.nextInt();
        scan.nextLine();

        System.out.println("Ingresa el nuevo nombre");
        String nombre= scan.nextLine();

        System.out.println("Ingrea el nuevo email");
        String email=scan.nextLine();

        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setEmail(email);

        return usuario;
    }

    public Usuario MostarUsuarioPorid(){
        Usuario usuario= new Usuario();

        System.out.println("Ingresa el id del usuario que quieres ver");
        int id = scan.nextInt();
        scan.nextLine();

        usuario.setId(id);

        return usuario;

    }
}
