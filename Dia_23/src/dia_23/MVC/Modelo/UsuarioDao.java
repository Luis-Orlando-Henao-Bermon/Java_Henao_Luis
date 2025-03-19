package dia_23.MVC.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class UsuarioDao {
    private static final String baseDatos="bss5umlnfiytxryua0kg";
    private static final String urlComplet ="jdbc:mysql://bss5umlnfiytxryua0kg-mysql.services.clever-cloud.com:3306/"+baseDatos;
    private static final String usuario="u2meznk1yptlfgj4";
    private static final String password="0CcDjRoEfqTKeX2cHY2G";

    /*
    //Método para conectarnos a la BBDD
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
     */

    public static Connection getConexion(){
        Connection conexion=null;
        try {
            conexion =  DriverManager.getConnection(urlComplet,usuario,password);
        }catch (Exception e){
            System.out.println("Error al conectarse a la base de datos " + e.getMessage());
        }
        return conexion;
    }
    //leer select
    public List<Usuario> ObtenerUsuarios(){
        String sql ="select *  from usuarios";
        List<Usuario> listaUsuarios= new ArrayList<>();
        try(Connection con = getConexion();
            PreparedStatement ps=con.prepareCall(sql);) {

            ResultSet rs = ps.executeQuery();;
            while (rs.next()){
                Usuario usuario=new Usuario(rs.getInt("id"),rs.getString("nombre"),rs.getString("email"));
                listaUsuarios.add(usuario);
            }
        }catch (Exception e){
            System.out.println("Error al obtener cliente por id "+e.getMessage());
        }
        return listaUsuarios;
    }
    //leer una persona
    public void bucarUsuarioPorId(Usuario usuario) {
        var sql="select * from usuarios where id = ?";
        try(Connection con = getConexion();
            PreparedStatement  ps=con.prepareCall(sql);) {

            ps.setInt(1,usuario.getId());
            ResultSet rs = ps.executeQuery();;
            if (rs.next()){

                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("email: "+rs.getString("email"));

            }
        }catch (Exception e){
            System.out.println("Error al obtener cliente por id "+e.getMessage());
        }
    }
    //agregar
    public void agregarUsuario(Usuario usuario) {
        var sql = "insert into usuarios(nombre,email) "
                +" values(?, ?)";
        try(Connection con =getConexion();
            PreparedStatement ps= con.prepareStatement(sql);) {


            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getEmail());
            ps.execute();
            System.out.println("Usuario ingresado de manera exitosa");

        }catch (Exception e){
            System.out.println("Error al agregar cliente");
        }
    }
    //Actualizar
    public void modificarUsuario(Usuario usuario) {
        var sql = "update usuarios "
                +" set nombre = ?, email = ? "
                +" where id = ?";
        try(Connection con = getConexion();
            PreparedStatement ps= con.prepareStatement(sql);) {

            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getEmail());
            ps.setInt(3,usuario.getId());
            int filas=ps.executeUpdate();

            if (filas>0){
                System.out.println("Usuario actualizado exitosamente");
            }else{
                System.out.println("No se pudo actalizar el usuario con id: "+usuario.getId());
            }
            
        }catch (Exception e){
            System.out.println("Error al modificar un cliente" + e.getMessage());
        }
    }
    //Eliminar
    public void EliminarUsuario(Usuario usuario) {

        var sql = "delete from usuarios "
                +" where id = ?";
        try(Connection con = getConexion();
            PreparedStatement ps= con.prepareStatement(sql);) {
            ps.setInt(1,usuario.getId());
            ps.execute();
            System.out.println("Usuario eliminado de manera exitosa");
        }catch (Exception e){
            System.out.println("Error al modificar un cliente" + e.getMessage());
        }

    }
}
