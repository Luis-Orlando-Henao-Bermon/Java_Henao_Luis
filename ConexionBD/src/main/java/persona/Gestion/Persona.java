package persona.Gestion;

public class    Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id) {
        this.id = id;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int id, String nombre, int edad) {
        this(nombre,edad);
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + edad;
    }

    public static Persona fromString(String data) {
        String[] parts = data.split(",");
        return new Persona(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
    }
}
