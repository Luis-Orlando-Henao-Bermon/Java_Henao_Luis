package dia_22.MVC.Modelo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    //leer select
    public List<Usuario>ObtenerUsuarios(){
        String sql ="select *  from usuarios";
        List<Usuario> listaUsuarios= new ArrayList<>();
        try {
            Connection con = Conect.getConexion();

            PreparedStatement  ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Usuario usuario=new Usuario();
                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setEmail(rs.getString(3));
                listaUsuarios.add(usuario);
                
            }
        }catch (Exception e){
            System.out.println("Error al obtener cliente por id "+e.getMessage());
        }
        return listaUsuarios;
    }
    //leer una persona
    public void bucarPersonaPorId(int id) {
        var sql="select * from usuarios where id = ?";
        try {
            Connection con = Conect.getConexion();

            PreparedStatement  ps=con.prepareCall(sql);
            ps.setInt(1,id);
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
    public boolean agregarPersona(String nombre, String email) {
        var sql = "insert into usuarios(nombre,email) "
                +" values(?, ?)";
        try {
            Connection con = Conect.getConexion();
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1,nombre);
            ps.setString(2,email);
            ps.execute();
            return true;
            
        }catch (Exception e){
            System.out.println("Error al agregar usuario");
        }
        return false;
    }
    //Actualizar
    public boolean modificarPersona(int id,String nombre, String email) {
        var sql = "update usuarios "
                +" set nombre = ?, email = ? "
                +" where id = ?";
        try {
            Connection con = Conect.getConexion();
            PreparedStatement ps= con.prepareStatement(sql);;

            ps.setString(1,nombre);
            ps.setString(2,email);
            ps.setInt(3,id);
            int filas=ps.executeUpdate();

            if (filas>0){
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al modificar un cliente" + e.getMessage());
        }
        return false;
    }
    //Eliminar
    public boolean EliminarPersona(int id) {
        PreparedStatement ps;
        Connection con = Conect.getConexion();
        var sql = "delete from usuarios "
                +" where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar un cliente" + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: "+e.getMessage());
            }
        }
        return false;
    }
}
