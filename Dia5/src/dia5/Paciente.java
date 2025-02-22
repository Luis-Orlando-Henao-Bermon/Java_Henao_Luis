
package dia5;

public class Paciente extends Persona{
    private long id;
    private String fecha_nacimiento;
    private int cedula;

    public Paciente(long id,String fecha_nacimiento, int cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, direccion);
        this.id=id;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n"+super.toString() + "\nFecha de nacimiento: " + fecha_nacimiento + "\nCedula: " + cedula;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
