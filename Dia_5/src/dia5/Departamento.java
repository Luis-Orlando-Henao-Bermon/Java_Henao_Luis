
package dia5;

public class Departamento {
    int id;
    private String nombre;
    private String tipo_personal;

    public Departamento(int id,String nombre, String tipo_personal) {
        this.id=id;
        this.nombre = nombre;
        this.tipo_personal = tipo_personal;
    }

    @Override
    public String toString() {
        return "ID: "+id+ "\nNombre de departamento: " + nombre + "\nTipo de personal: " + tipo_personal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_personal() {
        return tipo_personal;
    }

    public void setTipo_personal(String tipo_personal) {
        this.tipo_personal = tipo_personal;
    }
    
    
}
