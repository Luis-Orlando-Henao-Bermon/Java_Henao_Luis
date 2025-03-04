
package SOLID.PSI;

public class Bad {
    interface Trabajador {
        void trabajar();
        void comer();
    }
    
    class Desarrollador implements Trabajador {
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

        @Override
        public void comer() {
            // Se ocaciona un error ya que los robots no comen
            throw new UnsupportedOperationException("Los robots no comen.");
        }
    }
}
