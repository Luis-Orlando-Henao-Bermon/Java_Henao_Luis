
package proyecto_dia2;
import java.util.ArrayList;
import java.util.HashMap;

public class Trainer {
    int id;
    HashMap<String, Object> user =new HashMap<>();
    int numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    int telefonoCelular;
    int telefonoFijo;
    ArrayList<String> grupo=new ArrayList<>();
    String ruta;

    public Trainer(String login,String contrasena,int id, int numeroIdentificacion, String nombres, String apellidos, String direccion, int telefonoCelular, int telefonoFijo, String ruta) {
        this.id = id;
        this.user.put("login", login);
        this.user.put("contrasena", contrasena);
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Trainer{" + "id=" + id + ", user=" + user + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + ", grupo=" + grupo + ", ruta=" + ruta + '}';
    }
    
    
}
