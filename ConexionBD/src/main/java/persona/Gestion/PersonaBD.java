package persona.Gestion;

import persona.Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaBD implements IPersonaDAO{

    @Override
    public List<Persona> listaPersonas(List<Persona> personas) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        var sql="select * from persona order by id";
        try {
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                var persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setEdad(rs.getInt("edad"));
                personas.add(persona);
            }
        }catch (Exception e){
            System.out.println("Error al listar clientes "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: "+e.getMessage());
            }
        }
        return personas;
    }

    @Override
    public boolean bucarPersonaPorId(Persona persona) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        var sql="select * from persona where id = ?";
        try {
            ps=con.prepareCall(sql);
            ps.setInt(1,persona.getId());
            rs=ps.executeQuery();
            if (rs.next()){

                persona.setNombre(rs.getString("nombre"));
                persona.setEdad(rs.getInt("edad"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al obtener cliente por id "+e.getMessage());
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

    @Override
    public boolean agregarPersona(Persona persona) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "insert into persona(nombre,edad) "
                +" values(?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,persona.getNombre());
            ps.setInt(2,persona.getEdad());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al agregar cliente");
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

    @Override
    public boolean modificarPersona(Persona persona, int id) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "update persona "
                +" set nombre = ?, edad = ? "
                +" where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,persona.getNombre());
            ps.setInt(2,persona.getEdad());
            ps.setInt(3,id);
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

    @Override
    public boolean EliminarPersona(int id) {
        PreparedStatement ps;
        Connection con = Conexion.getConexion();
        var sql = "delete from persona "
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

    public static void main(String[] args) {
        PersonaBD metodos =new PersonaBD();
        //listar personas
        /*
        List<Persona> personas=metodos.listaPersonas();
        personas.forEach(System.out::println);

        //Buscar por id
        /*
        Persona persona1 = new Persona(1);
        System.out.println("Persona antes de la busqueda" + persona1);
        var encontrado = metodos.bucarPersonaPorId(persona1);
        if (encontrado){
            System.out.println("Cliente encontrado: "+ persona1);
        }else System.out.println("No se se encontro la persona: "+persona1.getId());*/

        //agregar cliente

        //Persona persona2 = new Persona("Laura",25);
        //var encontrado = metodos.agregarPersona(persona2);
        //if (encontrado){
        //    System.out.println("persona agregada: "+ persona2);
        //}else System.out.println("No se agrego la persona: "+persona2);


        //Modificar persona
        //Persona persona3 = new Persona("Laura",26);
        //metodos.modificarPersona(persona3,3);

        //Eliminar persona
        metodos.EliminarPersona(2);


    }
}
