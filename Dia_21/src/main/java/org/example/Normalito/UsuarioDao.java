package org.example.Normalito;

import org.example.Normalito.Conexion.Conect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    //leer select
    public List<String>ObtenerUsuarios(){
        String sql ="select *  from usuarios";
        List<String> listaUsuarios= new ArrayList<>();
        try {
            Connection con = Conect.getConexion();

            PreparedStatement  ps=con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();;
            while (rs.next()){

                listaUsuarios.add(rs.getInt("id")+" - "+rs.getString("nombre")+" - "+rs.getString("email"));
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
    public void agregarPersona(String nombre, String email) {
        var sql = "insert into usuarios(nombre,email) "
                +" values(?, ?)";
        try {
            Connection con = Conect.getConexion();
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1,nombre);
            ps.setString(2,email);
            ps.execute();
            System.out.println("Usuario ingresado de manera exitosa");
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: "+e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Error al agregar cliente");
        }
    }
    //Actualizar
    public void modificarPersona(int id,String nombre, String email) {
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
                System.out.println("Usuario actualizado exitosamente");
            }else{
                System.out.println("No se pudo actalizar el usuario con id: "+id);
            }
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: "+e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Error al modificar un cliente" + e.getMessage());
        }
    }
    //Eliminar
    public void EliminarPersona(int id) {
        PreparedStatement ps;
        Connection con = Conect.getConexion();
        var sql = "delete from usuarios "
                +" where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
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
    }
}
