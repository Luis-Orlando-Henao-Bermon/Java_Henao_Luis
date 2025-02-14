
package proyecto_dia4;

//Herencia
public class Estudiante extends Persona{
    
    private int grado;

    public Estudiante(int grado, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{"+ "nombre="+super.getNombre()+" apellido="+super.getApellido()+"edad="+super.getEdad()+ " grado=" + grado + '}';
    }
    
    
    
}
