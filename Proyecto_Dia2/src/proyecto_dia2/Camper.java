
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
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.grupo = grupo;
        this.ruta = ruta;
        this.moduloActual = moduloActual;
        this.trainer = trainer;
    }
    
    
}

/*{
            "id": 5708,
            "user": {
                "login": "Luis_01",
                "contrase\u00f1a": "luorheber03"
            },
            "numeroIdentificacion": 10939352265,
            "nombres": "Luis Jose",
            "apellidos": "Bemon Henao",
            "direccion": "Diocesano",
            "acudiente": "Franklin Henao",
            "telefonoCelular": 322890392,
            "telefonoFijo": 3452331,
            "tiposDeEstados": [
                "En proceso",
                "Inscrito",
                "Aprobado",
                "Cursando",
                "Graduado",
                "Expulsado",
                "Retirado"
            ],
            "estado": "Cursando",
            "fechaInicio": "19-03-2024",
            "fechaCierre": "19-03-2025",
            "grupo": "M1",
            "ruta": "JavaScript",
            "moduloActual": 1,
            "trainer": "",
            "riesgo": [
                "Bajo",
                "Alto",
                "Bajo",
                "Alto",
                "Bajo"
            ],
            "notaFiltro": [
                75.0,
                43.0,
                71.5,
                49.5,
                68.5
            ]
        }*/