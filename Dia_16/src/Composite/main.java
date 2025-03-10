
package Composite;


/*
Composite (Compuesto)
Permite tratar objetos individuales en composicione de objetos de manera uniforme

Ejemplo
Jerarquia de empleados

*/
import java.util.*;
public class main {
    // Componente
    static abstract class Employee { // Clase abstracta base
        protected String name;
        protected String position;

        public Employee(String name, String position) { // Constructor
            this.name = name;
            this.position = position;
        }

        abstract void showDetails(); // Método abstracto a implementar
    }

    // Hoja
    static class Developer extends Employee { // Clase concreta Developer
        public Developer(String name) {
            super(name, "Desarrollador"); // Define el rol como "Desarrollador"
        }

        @Override
        void showDetails() { // Implementación del método abstracto
            System.out.println(position + ": " + name); // Muestra detalles
        }
    }
    
    // Compuesto
    static class Manager extends Employee {
        private List<Employee> subordinates = new ArrayList<>();

        public Manager(String name) {
            super(name, "Gerente");
        }

        public void addEmployee(Employee emp) {
            subordinates.add(emp);
        }

        @Override
        void showDetails() {
            System.out.println(position + ": " + name);
            for (Employee e : subordinates) {
                e.showDetails();
            }
        }
    }

    // Uso del patrón Composite
    public static void main(String[] args) {
        Manager manager = new Manager("Carlos");
        manager.addEmployee(new Developer("Ana"));
        manager.addEmployee(new Developer("Juan"));

        manager.showDetails();
    }

}
