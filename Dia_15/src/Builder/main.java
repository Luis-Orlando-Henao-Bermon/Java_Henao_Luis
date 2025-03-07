/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

// Builder
// Se usa para construir objetos complejos paso a paso.
// Es útil cuando hay muchas configuraciones posibles para un objeto.
public class main {
    static class Computadora {
        private String procesador; // 2 usos
        private int ram; // 2 usos
        private boolean tarjetaGrafica; // 2 usos

        // Constructor privado
        private Computadora(Builder builder) { // 1 uso
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.tarjetaGrafica = builder.tarjetaGrafica;
        }

        public void mostrarConfiguracion() { // 1 uso
            System.out.println("Computadora con " + procesador + ", RAM: " + ram + "GB, Tarjeta gráfica: " + tarjetaGrafica);
        }
        
        // Clase Builder interna
        public static class Builder { // 5 usos
            private String procesador; // 2 usos
            private int ram; // 2 usos
            private boolean tarjetaGrafica; // 2 usos

            public Builder setProcesador(String procesador) { // 1 uso
                this.procesador = procesador;
                return this;
            }

            public Builder setRam(int ram) { // 1 uso
                this.ram = ram;
                return this;
            }

            public Builder setTarjetaGrafica(boolean tarjetaGrafica) { // 1 uso
                this.tarjetaGrafica = tarjetaGrafica;
                return this;
            }
            public Computadora build() { // 1 uso
                return new Computadora(this);
            }
        }

    

        // Uso
        
            public static void main(String[] args) {
                Computadora pc = new Computadora.Builder()
                    .setProcesador("Intel i7")
                    .setTarjetaGrafica(true)
                    .build();

                pc.mostrarConfiguracion();
            }
        
    }
}
         