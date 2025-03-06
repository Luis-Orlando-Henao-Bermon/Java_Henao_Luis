package Ejercicio6;

public class Contacto {
    //Violacion de ISP (Interface Segregation Principle - Segregación de Interfaces)
    public String Nombre;
    // public String CuentaBancaria; se elimina la cuenta bancaria ya que no es algo importante al momento de enviar\
    //un email
    public String Email;
}
