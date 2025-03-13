package persona.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private static final String baseDatos="Dia_19";
    private static final String urlBase ="jdbc:mysql://localhost:3306/";
    private static final String urlComplet ="jdbc:mysql://localhost:3306/"+baseDatos;
    private static final String usuario="root";
    private static final String password="admin";

    public static void crearBaseDatos() {
        try (Connection con = DriverManager.getConnection(urlBase, usuario, password);
             Statement stmt = con.createStatement()) {

            String sql = "create database if not exists " + baseDatos;
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Error al crear la base de datos: " + e.getMessage());
        }
    }
    public static Connection getConexion(){
        crearBaseDatos();
        Connection conexion=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion =  DriverManager.getConnection(urlComplet,usuario,password);
        }catch (Exception e){
            System.out.println("Error al conectarse a la base de datos " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        var conexion=Conexion.getConexion();
        if (conexion!=null){
            System.out.println("Conexion exitosa" + conexion);
        }else {
            System.out.println("Error al conextarse");
        }
    }
}


