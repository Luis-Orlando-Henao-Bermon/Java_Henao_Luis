
package dia_7;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;

    public EmpleadoPorHoras(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        super.setTipoEmpleado("Empleado por horas");
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularBonificacion() {
        double bonificacion=0;
        if(horasTrabajadas>48){
           bonificacion=(super.getSalario()*15)/100;
           System.out.println("La bonificacion del empleado es de: "+bonificacion);
        }
        else{
            super.calcularBonificacion();
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas trabajadas: "+horasTrabajadas);
    }
    
    
    
}
