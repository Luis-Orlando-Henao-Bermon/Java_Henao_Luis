/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.PID;

/**
 *
 * @author COMPUMAX
 */
public class Good {
    
    /*
    "Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones."
    "Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones."
    */
    
    // Creamos una abstracción
    interface IMotor {
        void encender();
    }

    // Implementaciones concretas
    static class MotorCombustion implements IMotor {
        @Override
        public void encender() {
            System.out.println("Motor de combustión encendido.");
        }
    }

    static class MotorElectrico implements IMotor {
        @Override
        public void encender() {
            System.out.println("Motor eléctrico encendido.");
        }
    }

    // Coche depende de la abstracción, no de la implementación concreta
    static class Coche {
        private IMotor motor;

        public Coche(IMotor motor) { // Se inyecta la dependencia
            this.motor = motor;
        }

        void arrancar() {
            motor.encender();
        }
    }
    public static void main(String[] args) {
        Coche coche1 = new Coche(new MotorCombustion());
        coche1.arrancar(); // Motor de combustión encendido.

        Coche coche2 = new Coche(new MotorElectrico());
        coche2.arrancar(); // Motor eléctrico encendido.
    }
}
