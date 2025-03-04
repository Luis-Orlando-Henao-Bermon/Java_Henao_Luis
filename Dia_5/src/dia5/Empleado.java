package dia5;

import java.util.ArrayList;

public class Empleado extends Persona{
    private int id;
    private ArrayList<Integer> id_hospitales = new ArrayList<>();
    private String titulo;
    private String fecha_vinculacion;
    private int salario;
    private int id_departamento;

    public Empleado(int id,int id_hospital,String titulo, String fecha_vinculacion, int salario, int id_departamento, String nombre1, String nombre2, String apellido1, String apellido2, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, direccion);
        this.id=id;
        this.id_hospitales.add(id_hospital);
        this.titulo = titulo;
        this.fecha_vinculacion = fecha_vinculacion;
        this.salario = salario;
        this.id_departamento = id_departamento;
    }

    @Override
    public String toString() {
        StringBuilder hospitales=new StringBuilder();
        for (Integer hospital : id_hospitales) {
            hospitales.append(hospital+" ");
        }
        return "ID: " + id + "\n"+super.toString()+"\nID de hospitales: " + hospitales + "\nTitulo: " + titulo + "\nFecha de vinculacion: " + fecha_vinculacion + "\nSalario: " + salario + "\nID de departamento: " + id_departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void Agrgar_hospital(int id_hospital){
        this.id_hospitales.add(id_hospital);
    }
    
    public ArrayList<Integer> getId_hospitales() {
        return id_hospitales;
    }

    public void setId_hospitales(ArrayList<Integer> id_hospitales) {
        this.id_hospitales = id_hospitales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_vinculacion() {
        return fecha_vinculacion;
    }

    public void setFecha_vinculacion(String fecha_vinculacion) {
        this.fecha_vinculacion = fecha_vinculacion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    
    
    
}
