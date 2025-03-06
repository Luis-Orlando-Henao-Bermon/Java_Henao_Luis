package Ejercicio4;

public class ProcesadorDeOrdenes {
    //Violacion Open/Closed Principle (OCP) - Principio abierto/cerrado
    //Ya que si quiere agregar un tipo de mensaje diferendte debe modificar la clase de procesadoDeOrdenes
    public void procesar(Orden orden,Notificacion notificacion) {
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            notificacion.enviarMensajeDeConfirmacion(orden);
        }
    }

}
