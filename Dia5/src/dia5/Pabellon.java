package dia5;


public class Pabellon {
    private int id;
    private String nombre;
    private int cantidad_disponible;

    public Pabellon(int id, String nombre, int cantidad_disponible) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad_disponible = cantidad_disponible;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nCapacidad disponible: " + cantidad_disponible;
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

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }
    
    
    
    
    
}
