
package proyecto_dia2;

import java.util.HashMap;


public class Coordinador {
    int id;
    HashMap<String, Object> user =new HashMap<>();
    int numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    int telefonoCelular;
    int telefonoFijo;

    public Coordinador(String login,String contrasena,int id, int numeroIdentificacion, String nombres, String apellidos, String direccion, int telefonoCelular, int telefonoFijo) {
        this.id = id;
        this.user.put("login",login);
        this.user.put("contrasena",contrasena);
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "id=" + id + ", user=" + user + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + '}';
    }
    
    
}
