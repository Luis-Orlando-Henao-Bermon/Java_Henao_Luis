package dia_20;

public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "P,"+id + "," + nombre + "," + edad;
    }

    public static Persona fromString(String data) {
        String[] parts = data.split(",");
        return new Persona(Integer.parseInt(parts[1]), parts[2], Integer.parseInt(parts[3]));
    }
}
