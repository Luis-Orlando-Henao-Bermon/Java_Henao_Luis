
package dia5;

public class Persona {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String direccion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2 + "\nDireccion: " + direccion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
