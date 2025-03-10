/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

// Adapter
// Convierte la interfaz de una clase en otra interfaz esperada por el cliente.
// Permite que clases incompatibles trabajen juntas.

// Contexto
// Supongamos que tenemos un sistema antiguo que usa Volt120
// y queremos adaptarlo a un sistema moderno que usa Volt12.

public class main {
    // Interfaz esperada por el cliente
    interface Volt12 {
        int getVolt12(); // Define el método esperado
    }

    // Clase existente con una interfaz diferente
    static class Volt120 {
        int getVolt120() { // Método que devuelve 120 voltios
            return 120;
        }
    }

    // Adaptador que convierte Volt120 a Volt12
    static class VoltAdapter implements Volt12 {
        private Volt120 volt120; // Instancia de la clase existente

        public VoltAdapter(Volt120 volt120) { // Constructor del adaptador
            this.volt120 = volt120;
        }

        @Override
        public int getVolt12() {
            return volt120.getVolt120() / 10; // Convierte 120V a 12V
        }
    }

    // Uso del adaptador
    public static void main(String[] args) {
        Volt120 oldSystem = new Volt120(); // Clase existente
        Volt12 adaptedSystem = new VoltAdapter(oldSystem); // Adaptador

        System.out.println("Voltaje adaptado: " + adaptedSystem.getVolt12() + "V");
    }

}
