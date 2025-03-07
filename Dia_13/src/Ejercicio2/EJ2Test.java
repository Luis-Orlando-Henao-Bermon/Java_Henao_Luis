/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;



public class EJ2Test {

    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(100000);
        AuditTransfMonet auditTransfMonet = new AuditTransfMonet();

        auditTransfMonet.transferenciaRealizada(transferencia);

        Mail expectedMail = ConexionMail.getInstance().getQueue().get(0);
    }
}
