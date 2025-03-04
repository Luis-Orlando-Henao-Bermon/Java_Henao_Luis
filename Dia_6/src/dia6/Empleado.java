
package dia6;

public class Empleado {
    
    private String nombre;
    private int id ;
    private double salario;

    public Empleado() {
    }
    
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>0) {
            this.salario = salario;
            System.out.println("Salario agregado con exito");
        }
        else{
            System.out.println("Error: Ingresaste un saraio negativo");
        }
    }
    
    public void MostrarInformacion(){
        System.out.println("ID: "+id+"\nNombre: "+nombre+"\nSalario: "+salario);
    }
    
}
