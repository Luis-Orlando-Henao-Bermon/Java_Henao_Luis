
package Factory;
/*
Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir qué clase concreta instanciar.
     Se usa para evitar la creación directa de objetos con new.
*/

// Interfaz Producto
interface Producto { 
    void usar();
}

// Implementaciones concretas
class ProductoA implements Producto {
    public void usar() {
        System.out.println("Usando Producto A");
    }
}

class ProductoB implements Producto {
    public void usar() {
        System.out.println("Usando Producto B");
    }
}

public class Main {
    // Fábrica con el método Factory
    class Factory {
        public static Producto crearProducto(String tipo) {
           
            try {
                if (tipo.equalsIgnoreCase("A")) {
                    return new ProductoA();
                } else if (tipo.equalsIgnoreCase("B")) {
                    return new ProductoB();
                }
                throw new IllegalArgumentException("Tipo desconocido");
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
            return new Producto() {
                @Override
                public void usar() {
                    System.out.println("Producto es null");
                }
            };
        }
    }
    public static void main(String[] args) {
        
    
        Producto p1 = Factory.crearProducto("A");
        p1.usar();

        Producto p2 = Factory.crearProducto("C");
        p2.usar();
        
        
    }

}
