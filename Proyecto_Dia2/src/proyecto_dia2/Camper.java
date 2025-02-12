
package proyecto_dia2;
import java.util.ArrayList;
import java.util.HashMap;

public class Camper {
    int id;
    HashMap<String, Object> user =new HashMap<>();
    int numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    String acudiente;
    int telefonoCelular;
    int telefonoFijo;
    ArrayList<String> tiposDeEstados =new ArrayList<>();
    String estado;
    String fechaInicio;
    String fechaCierre;
    String grupo;
    String ruta;
    int moduloActual;
    String trainer;
    ArrayList<String> riesgo =new ArrayList<>();
    ArrayList<String> notaFiltro =new ArrayList<>();

    
    //Constructor
    public Camper(String login,String contrasena,int id, int numeroIdentificacion, String nombres, String apellidos, String direccion, String acudiente, int telefonoCelular, int telefonoFijo, String estado, String fechaInicio, String fechaCierre, String grupo, String ruta, int moduloActual, String trainer) {
        this.id = id;
        this.user.put("login",login);
        this.user.put("contrasena",contrasena);
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.tiposDeEstados.add("En proceso");
        this.tiposDeEstados.add("Inscrito");
        this.tiposDeEstados.add("Aprobado");
        this.tiposDeEstados.add("Cursando");
        this.tiposDeEstados.add("Graduado");
        this.tiposDeEstados.add("Expulsado");
        this.tiposDeEstados.add("Retirado");
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.grupo = grupo;
        this.ruta = ruta;
        this.moduloActual = moduloActual;
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Camper{" + "id=" + id + ", user=" + user + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + ", tiposDeEstados=" + tiposDeEstados + ", estado=" + estado + ", fechaInicio=" + fechaInicio + ", fechaCierre=" + fechaCierre + ", grupo=" + grupo + ", ruta=" + ruta + ", moduloActual=" + moduloActual + ", trainer=" + trainer + ", riesgo=" + riesgo + ", notaFiltro=" + notaFiltro + '}';
    }
    
    
}