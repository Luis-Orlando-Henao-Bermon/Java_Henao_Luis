
package dia_8;

public class PartidoDeLiga extends Partido{
    private int numeroJornada;

    public PartidoDeLiga(int numeroJornada, String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEquipoLocal, cestasEquipoVisitante, fechaPartido);
        this.numeroJornada = numeroJornada;
    }

    
    
    public PartidoDeLiga(int numeroJornada, String equipoLocal, String equipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.numeroJornada = numeroJornada;
    }

    public PartidoDeLiga() {
    }

    public int getNumeroJornada() {
        return numeroJornada;
    }

    public void setNumeroJornada(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Numero de jornada: "+numeroJornada);
    }
    
}
