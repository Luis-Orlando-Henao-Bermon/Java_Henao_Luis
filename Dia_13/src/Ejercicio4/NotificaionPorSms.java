/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;


public class NotificaionPorSms implements Notificacion{
    public static NotificaionPorSms instance=null;

    public NotificaionPorSms() {
    }
    
    @Override
    public void enviarMensajeDeConfirmacion(Orden orden) {
        ordenes.add(orden);
        System.out.println("SMS enviado");
    }
}
