/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.ISP;

interface Trabajador {
    void trabajar();
}

interface Comedor {
    void comer();
}
public class Good {
    // Las interfaces deben ser específicas y no forzar a una clase a
    // implementar métodos que no necesita. 
    class Desarrollador implements Trabajador, Comedor {
        @Override
        public void trabajar() {
            System.out.println("Escribiendo código...");
        }

        @Override
        public void comer() {
            System.out.println("Comiendo almuerzo...");
        }
    }   

    class Robot implements Trabajador {
        @Override
        public void trabajar() {
            System.out.println("Construyendo piezas...");
        }
    }
}
