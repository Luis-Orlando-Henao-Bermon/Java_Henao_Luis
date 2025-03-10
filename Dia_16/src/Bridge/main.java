/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/*
Bridge
Separa una abstraccion de su implementacion para que ambas puedan evolucionar independientemente

Ejemplo
Diferentes formas geometricas que pueden ser dibujadas de distintas maneras (rojo o azul)
*/
public class main {
    // Interfaz para la implementación
    interface Color {  // 5 usages  2 implementations
        void applyColor();  // 1 usage  2 implementations
    }

    // Implementaciones concretas
    static class RedColor implements Color {  // 1 usage
        public void applyColor() {  // 1 usage
            System.out.println("Aplicando color rojo.");
        }
    }

    static class BlueColor implements Color {  // 1 usage
        public void applyColor() {  // 1 usage
            System.out.println("Aplicando color azul.");
        }
    }

    // Clase base que usa una implementación
    static abstract class Shape {  // 3 usages  1 inheritor
        protected Color color;  // 2 usages

        public Shape(Color color) {  // 1 usage
            this.color = color;
        }

        abstract void draw();  // 2 usages  1 implementation
    }
    
    // Subclase con una implementación diferente
    static class Circle extends Shape {
        public Circle(Color color) { super(color); }

        public void draw() {
            System.out.print("Dibujando círculo ");
            color.applyColor();
        }
    }

    // Uso del patrón Bridge

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueCircle = new Circle(new BlueColor());

        redCircle.draw();
        blueCircle.draw();
    }
    

    
}
