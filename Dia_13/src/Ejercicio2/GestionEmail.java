package Ejercicio2;

public class GestionEmail {
    private ConexionMail conexionMail;

    public GestionEmail(ConexionMail conexionMail) {
        this.conexionMail = conexionMail;
    }

    public void EnviarEmail(String auditor,String mensaje){
        Mail mail=new Mail().to(auditor).withBody(mensaje);
        conexionMail.enviar(mail);
        conexionMail.cerrar();    }
}
