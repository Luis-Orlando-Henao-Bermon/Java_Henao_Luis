/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.LSP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    static class Persona {
 
        private String dni;
        private String nombre;
        private String apellidos;
        private String tarjeta;

        public String getDni() {
            return dni;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellidos() {
            return apellidos;
        }
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        public String getTarjeta() {
            return tarjeta;
        }
        public void setTarjeta(String tarjeta) {
            this.tarjeta = tarjeta;
        }
        public Persona(String dni, String nombre, String apellidos, String tarjeta) {
            super();
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.tarjeta = tarjeta;
        }

        public void pagar() {
            System.out.println("Pago realizado");
        }

    }
    static class Niño  extends Persona{
 
        public Niño(String nombre, String apellidos) {
            super(null, nombre, apellidos, null);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void pagar() {
            // TODO Auto-generated method stub
            throw new RuntimeException("El niño no puede pagar");
        }
    }
}
