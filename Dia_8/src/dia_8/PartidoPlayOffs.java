
package dia_8;

public class PartidoPlayOffs extends Partido{
    private String ronda;

    public PartidoPlayOffs(String ronda, String equipoLocal, String equipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.ronda = ronda;
    }

    public PartidoPlayOffs() {
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Ronda del partido: "+ronda);
    }
    
}
