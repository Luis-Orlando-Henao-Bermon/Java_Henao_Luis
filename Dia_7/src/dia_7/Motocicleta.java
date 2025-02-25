
package dia_7;

public class Motocicleta extends Vehiculo{
    private String tipoManubrio;

    public Motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    public Motocicleta() {
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de manubrio: "+tipoManubrio);
        System.out.println();
    }
    
    
    
}
