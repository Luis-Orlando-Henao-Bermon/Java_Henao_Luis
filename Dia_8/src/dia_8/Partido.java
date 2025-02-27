
package dia_8;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestasEquipoVisitante;
    private boolean finalizado;
    private String fechaPartido;

    public Partido(String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal = cestasEquipoLocal;
        this.cestasEquipoVisitante = cestasEquipoVisitante;
        finalizado=false;
        this.fechaPartido = fechaPartido;
    }
        
    public Partido(String equipoLocal, String equipoVisitante, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal = 0;
        this.cestasEquipoVisitante = 0;
        this.finalizado = false;
        this.fechaPartido = fechaPartido;
    }

    public Partido() {
    }
    
    public void obtenerInformacion(){
        System.out.println("Equipo local: "+equipoLocal+"\nEquipo visitante: "+equipoVisitante+"\nCestas del equipo local: "+cestasEquipoLocal);
        System.out.println("Cestas del equipo visitante: "+cestasEquipoVisitante);
        if (finalizado==true) {
            System.out.println("Estado del partido: Finalizado");
        }else System.out.println("Estado del partido: En juego");
        System.out.println("Fecha del partido: "+fechaPartido);
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasEquipoLocal() {
        return cestasEquipoLocal;
    }

    public void setCestasEquipoLocal(int cestasEquipoLocal) {
        this.cestasEquipoLocal = cestasEquipoLocal;
    }

    public int getCestasEqupoVisitante() {
        return cestasEquipoVisitante;
    }

    public void setCestasEqupoVisitante(int cestasEqupoVisitante) {
        this.cestasEquipoVisitante = cestasEqupoVisitante;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
    public void MostrarGanador(){
        
        if (cestasEquipoLocal>cestasEquipoVisitante && finalizado==true) {
            System.out.println("El equipo ganador es: "+equipoLocal);
        }
        else if(cestasEquipoLocal==cestasEquipoVisitante|| finalizado==false){
            System.out.println("El partido no a terminado ya que ambos equipos estan empatados");
        }
        else System.out.println("El equipo ganador es: "+equipoVisitante);
        
    }
    public void SumarPuntoEquipoLocal(){
        cestasEquipoLocal+=1;
    }
    
    public void SumarPuntoEquipoVisitante(){
        cestasEquipoVisitante+=1;
    }
    
    public void FinalizarPartido(){
        if (cestasEquipoLocal==cestasEquipoVisitante) {
            System.out.println("El pertido no puede finalizar ya que no hay un ganador");
        }else finalizado=true;
    }
}
