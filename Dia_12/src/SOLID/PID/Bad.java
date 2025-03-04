/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.PID;

/**
 *
 * @author COMPUMAX
 */
public class Bad {
    class Motor {
        void encender() {
            System.out.println("Motor encendido.");
        }
    }

    class Coche {
        private Motor motor;

        public Coche() {
            this.motor = new Motor(); // Dependencia directa
        }

        void arrancar() {
            motor.encender();
        }
    }
}
