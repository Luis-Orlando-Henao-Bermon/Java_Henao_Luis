
package dia5;

public class Ingresos {
    private int id;
    private String fecha_ingreso;
    private int id_paciente;
    private int id_pabellon;
    private int id_hospital;

    public Ingresos(int id,String fecha_ingreso, int id_paciente, int id_pabellon, int id_hospital) {
        this.id = id;
        this.fecha_ingreso = fecha_ingreso;
        this.id_paciente = id_paciente;
        this.id_pabellon = id_pabellon;
        this.id_hospital = id_hospital;
    }

    @Override
    public String toString() {
        return "ID de ingreso: "+id+ "\nFecha de ingreso: " + fecha_ingreso + "\nID del paciente: " + id_paciente + "\nID del pabellon: " + id_pabellon + "\nID del hospital: " + id_hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_pabellon() {
        return id_pabellon;
    }

    public void setId_pabellon(int id_pabellon) {
        this.id_pabellon = id_pabellon;
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }
    
    
}
 