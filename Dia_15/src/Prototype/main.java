    
package Prototype;

//Prototype
//Se usa para clonar objetos sin acoplar el código a sus clases concretas.
//Java proporciona Cloneable para esto.

public class main {
    static class Persona implements Cloneable {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Persona: " + nombre + ", Edad: " + edad);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    // Uso
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Juan", 25);
            Persona p2 = (Persona) p1.clone(); // Clonando el objeto

            p1.mostrarInfo();
            p2.mostrarInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


/*interface Prototype extends Cloneable {
        Prototype clone();
}

public class main {
    
    El Patrón de Diseño Creacional Prototype es un patrón que permite copiar objetos existentes sin depender de sus
    clases. En lugar de crear un nuevo objeto desde cero, el patrón Prototype utiliza un objeto prototipo que sirve
    como base para crear nuevos objetos. Esto es útil cuando se quiere evitar la creación de nuevos objetos en tiempo
    de ejecución a través de un proceso complejo.
     
    // Interfaz Prototype que define el método de clonación
    

    // Clase concreta que implementa Prototype
    static class ConcretePrototypeA implements Prototype {
        private String name;

        public ConcretePrototypeA(String name) {
            this.name = name;
        }

        @Override
        public Prototype clone() {
            try {
                return (ConcretePrototypeA) super.clone(); // Clonación superficial
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Error al clonar", e);
            }
        }

        @Override
        public String toString() {
            return "ConcretePrototypeA: " + name;
        }
    }

    // Otra clase concreta que implementa Prototype
    static class ConcretePrototypeB implements Prototype {
        private int age;

        public ConcretePrototypeB(int age) {
            this.age = age;
        }

        @Override
        public Prototype clone() {
            try {
                return (ConcretePrototypeB) super.clone(); // Clonación superficial
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Error al clonar", e);
            }
        }

        @Override
        public String toString() {
            return "ConcretePrototypeB: " + age;
        }
    }

    // Prueba del patrón Prototype

    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("Luis");
        ConcretePrototypeB prototypeB = new ConcretePrototypeB(25);

        // Clonamos los objetos
        ConcretePrototypeA cloneA = (ConcretePrototypeA) prototypeA.clone();
        ConcretePrototypeB cloneB = (ConcretePrototypeB) prototypeB.clone();

        System.out.println(cloneA);
        System.out.println(cloneB);
    }
    


}
*/
