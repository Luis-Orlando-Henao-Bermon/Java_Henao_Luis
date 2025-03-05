/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.LSP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Good {
    /*
    Si S es una subclase de T, entonces los objetos de tipo T pueden ser reemplazados
    por objetos de tipo S sin alterar el comportamiento correcto del programa.
    */
    static class Persona {
 
        private String nombre;
        private String apellidos;
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
        public Persona( String nombre, String apellidos) {
            super();

            this.nombre = nombre;
            this.apellidos = apellidos;

        }
 
    }
    
    static class Adulto extends Persona {
 
        public Adulto(String nombre, String apellidos, String dni, String tarjeta) {
            super(nombre, apellidos);
            this.dni = dni;
            this.tarjeta = tarjeta;
        }

        private String dni;
        private String tarjeta;

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getTarjeta() {
            return tarjeta;
        }

        public void setTarjeta(String tarjeta) {
            this.tarjeta = tarjeta;
        }

        public void pagar() {

            System.out.println("Pagado");
        }
    }
    static class Niño  extends Persona{
 
        private Adulto tutor;

        public Niño(String nombre, String apellidos,Adulto tutor) {
            super( nombre, apellidos);
            this.tutor=tutor;
        }

        public Adulto getTutor() {
            return tutor;
        }

        public void setTutor(Adulto tutor) {
            this.tutor = tutor;
        }

    }
     public static void main(String[] args) {
        Adulto adulto = new Adulto("pedro", "perez", "12345678A", "4050-5090...");
        Niño niño = new Niño("ana", "sanchez", adulto);
        niño.getTutor().pagar();
    }
    
}
