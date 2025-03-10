
package Decorator;
/*
Decorator (Decorador)
Añade funcionalidades a un objeto sin modificar su estructura

Ejemplo
Agrga caracteristicas extras a un cafe
*/
public class main {
    // Componente base
    interface Coffee { // Define la interfaz básica para los tipos de café
        String getDescription(); // Método para la descripción
        double cost(); // Método para el costo
    }

    // Implementación base
    static class SimpleCoffee implements Coffee { // Implementación concreta
        public String getDescription() {
            return "Café simple"; // Devuelve la descripción del café
        }

        public double cost() {
            return 5.0; // Devuelve el costo del café
        }
    }
    
    static abstract class CoffeeDecorator implements Coffee {
        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public String getDescription() {
            return coffee.getDescription();
        }
        public double cost(){
            return coffee.cost();
        }

    }
    
    static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) { super(coffee); }

        public String getDescription() { return coffee.getDescription() + ", con leche"; }

        public double cost() { return coffee.cost() + 1.5; }
    }

    // Uso del patrón Decorador
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }

}
