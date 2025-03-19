package dia_22.MVC.Modelo;

import java.sql.*;

public class Conect {
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
}