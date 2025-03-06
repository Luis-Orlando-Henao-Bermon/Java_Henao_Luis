/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class AuditTransfMonet {
    /*
        Falta de SRP: Single Responsibility Principle ya que la clase AuditTransfMonet hace muchas cosas
        como realizar la auditoria y enviar el email de notificacion
     */
    private GestionEmail gestionEmail;

    public AuditTransfMonet(GestionEmail gestionEmail) {
        this.gestionEmail = gestionEmail;
    }

    public void transferenciaRealizada(Transferencia transferencia) {
        if(this.esTransferenciaImportante(transferencia)) {
            String auditor=this.obtenerDireccionMailAuditor();
            String mensaje=this.componerMensajeAviso(transferencia);

            gestionEmail.EnviarEmail(auditor,mensaje);
        }
    }
    private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
    private String obtenerDireccionMailAuditor() {
       return "mail-auditor";
    }
    private String componerMensajeAviso(Transferencia transferencia) {
       return "aviso-transferencia-importante";    
    }
}
